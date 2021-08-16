//=============================================================================
//===	Copyright (C) 2001-2007 Food and Agriculture Organization of the
//===	United Nations (FAO-UN), United Nations World Food Programme (WFP)
//===	and United Nations Environment Programme (UNEP)
//===
//===	This program is free software; you can redistribute it and/or modify
//===	it under the terms of the GNU General Public License as published by
//===	the Free Software Foundation; either version 2 of the License, or (at
//===	your option) any later version.
//===
//===	This program is distributed in the hope that it will be useful, but
//===	WITHOUT ANY WARRANTY; without even the implied warranty of
//===	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
//===	General Public License for more details.
//===
//===	You should have received a copy of the GNU General Public License
//===	along with this program; if not, write to the Free Software
//===	Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
//===
//===	Contact: Jeroen Ticheler - FAO - Viale delle Terme di Caracalla 2,
//===	Rome - Italy. email: geonetwork@osgeo.org
//==============================================================================

package org.fao.geonet.services.group;

import jeeves.server.ServiceConfig;
import jeeves.server.context.ServiceContext;

import org.fao.geonet.Util;
import org.fao.geonet.constants.Params;
import org.fao.geonet.domain.Group;
import org.fao.geonet.repository.GroupRepository;
import org.fao.geonet.repository.Updater;
import org.fao.geonet.services.NotInReadOnlyModeService;
import org.jdom.Element;

import java.nio.file.Path;

import javax.annotation.Nonnull;

@Deprecated
public class XmlUpdate extends NotInReadOnlyModeService {
    public void init(final Path appPath, final ServiceConfig params) throws Exception {
    }

    //--------------------------------------------------------------------------
    //---
    //--- Service
    //---
    //--------------------------------------------------------------------------

    public Element serviceSpecificExec(final Element params, final ServiceContext context) throws Exception {

        final GroupRepository groupRepository = context.getBean(GroupRepository.class);
        for (Object g : params.getChildren("group")) {
            Element groupEl = (Element) g;

            String id = Util.getAttrib(groupEl, Params.ID);
            final Element label = Util.getChild(groupEl, "label");


            groupRepository.update(Integer.valueOf(id), new Updater<Group>() {
                @Override
                public void apply(@Nonnull Group group) {
                    for (Object t : label.getChildren()) {
                        Element translationEl = (Element) t;
                        group.getLabelTranslations().put(translationEl.getName(), translationEl.getText());
                    }
                }
            });
        }

        return new Element("ok");
    }
}
