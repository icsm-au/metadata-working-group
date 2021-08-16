/*
 *
 * Copyright (C) 2001-2016 Food and Agriculture Organization of the
 * United Nations (FAO-UN), United Nations World Food Programme (WFP)
 * and United Nations Environment Programme (UNEP)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 *
 * Contact: Jeroen Ticheler - FAO - Viale delle Terme di Caracalla 2,
 * Rome - Italy. email: geonetwork@osgeo.org
 */

package org.fao.geonet.kernel.schema.editorconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}expanded"/>
 *         &lt;element ref="{}exclude"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "expanded",
    "exclude"
})
@XmlRootElement(name = "multilingualFields")
public class MultilingualFields {

    @XmlElement(required = true)
    protected Expanded expanded;
    @XmlElement(required = true)
    protected Exclude exclude;

    /**
     * Gets the value of the expanded property.
     *
     * @return possible object is {@link Expanded }
     */
    public Expanded getExpanded() {
        return expanded;
    }

    /**
     * Sets the value of the expanded property.
     *
     * @param value allowed object is {@link Expanded }
     */
    public void setExpanded(Expanded value) {
        this.expanded = value;
    }

    /**
     * Gets the value of the exclude property.
     *
     * @return possible object is {@link Exclude }
     */
    public Exclude getExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     *
     * @param value allowed object is {@link Exclude }
     */
    public void setExclude(Exclude value) {
        this.exclude = value;
    }

}
