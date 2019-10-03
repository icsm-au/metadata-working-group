cd _defs
pandoc -V 'mainfont:FreeSerif.otf' GuidanceIntro.md TableOfContents.md PatternGuide.md Template.md \
    class-MD_Metadata.md MetadataIdentifier.md MetadataLinkage.md MetadataDate.md \
      MetadataContact.md MetadataLocale.md MetadataScope.md \
      MetadataLegalConstraints.md MetadataSecurityConstraints.md ParentMetadata.md \
    class-MD_DataIdentification.md ResourceLocale.md Abstract.md Purpose.md \
      Status.md TopicCategory.md SpatialResolution.md ResourcePointOfContact.md \
      AdditionalDocs.md SpatialRepresentationType.md AssociatedResources.md \
      ResourceFormat.md BrowseGraphic.md ResourceCitiation.md \
        ResourceTitle.md ResourceIdentifier.md ResourceDate.md \
ResourceEdition.md ResourceSeries.md ResourceResponsibleParty.md \
      Keywords.md Maintenance.md ResourceOtherConstraints.md \
      ResourceLegalContraints.md ResourceSecurityConstraints.md \
    GeographicExtent.md ExtentGeographicDescription.md \
      ExtentBoundingBox.md VerticalExtent.md TemporalExtents.md \
    ResourceLineage.md SpatialReferenceSystem.md DistributionInfo.md \
    class-CI_Citation.md class-CI_Date.md class-CI_OnlineResource.md \
      class-CI_Responsibility.md class-MD_BrowseGraphic.md class-md_constraints.md \
      class-MD_DataIdentification.md class-MD_Metadata.md class-MD_Identification.md \
      class-MD_Identifier.md class-MD_LegalConstraints.md class-MD_Scope.md \
      class-MD_SecurityConstraints.md PT_Locale.md \
    -o ../../../pandoc-test/icsm.pdf --pdf-engine=xelatex