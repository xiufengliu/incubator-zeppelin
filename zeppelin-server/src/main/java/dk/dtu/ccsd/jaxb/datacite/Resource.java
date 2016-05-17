package dk.dtu.ccsd.jaxb.datacite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for relationType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class. <p>
 * <pre>
 * &lt;simpleType name="relationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IsSourceOf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
@XmlRootElement(name = "resource")
public class Resource {

  @XmlElement(required = true)
  protected Resource.Identifier identifier;
  @XmlElement(required = true)
  protected Resource.Creators creators;
  @XmlElement(required = true)
  protected Resource.Titles titles;
  @XmlElement(required = true)
  protected String publisher;
  @XmlElement(required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String publicationYear;
  protected Resource.Subjects subjects;
  protected Resource.Contributors contributors;
  protected Resource.Dates dates;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "language")
  protected String language;
  protected Resource.ResourceType resourceType;
  protected Resource.AlternateIdentifiers alternateIdentifiers;
  protected Resource.RelatedIdentifiers relatedIdentifiers;
  protected Resource.Sizes sizes;
  protected Resource.Formats formats;
  protected String version;
  protected Resource.RightsList rightsList;
  protected Resource.Descriptions descriptions;
  protected Resource.GeoLocations geoLocations;

  /**
   * Gets the value of the identifier property.
   *
   * @return possible object is {@link Resource.Identifier }
   */
  public Resource.Identifier getIdentifier() {
    return identifier;
  }

  /**
   * Sets the value of the identifier property.
   *
   * @param value allowed object is {@link Resource.Identifier }
   */
  public void setIdentifier(Resource.Identifier value) {
    this.identifier = value;
  }

  /**
   * Gets the value of the creators property.
   *
   * @return possible object is {@link Resource.Creators }
   */
  public Resource.Creators getCreators() {
    return creators;
  }

  /**
   * Sets the value of the creators property.
   *
   * @param value allowed object is {@link Resource.Creators }
   */
  public void setCreators(Resource.Creators value) {
    this.creators = value;
  }

  /**
   * Gets the value of the titles property.
   *
   * @return possible object is {@link Resource.Titles }
   */
  public Resource.Titles getTitles() {
    return titles;
  }

  /**
   * Sets the value of the titles property.
   *
   * @param value allowed object is {@link Resource.Titles }
   */
  public void setTitles(Resource.Titles value) {
    this.titles = value;
  }

  /**
   * Gets the value of the publisher property.
   *
   * @return possible object is {@link String }
   */
  public String getPublisher() {
    return publisher;
  }

  /**
   * Sets the value of the publisher property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPublisher(String value) {
    this.publisher = value;
  }

  /**
   * Gets the value of the publicationYear property.
   *
   * @return possible object is {@link String }
   */
  public String getPublicationYear() {
    return publicationYear;
  }

  /**
   * Sets the value of the publicationYear property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPublicationYear(String value) {
    this.publicationYear = value;
  }

  /**
   * Gets the value of the subjects property.
   *
   * @return possible object is {@link Resource.Subjects }
   */
  public Resource.Subjects getSubjects() {
    return subjects;
  }

  /**
   * Sets the value of the subjects property.
   *
   * @param value allowed object is {@link Resource.Subjects }
   */
  public void setSubjects(Resource.Subjects value) {
    this.subjects = value;
  }

  /**
   * Gets the value of the contributors property.
   *
   * @return possible object is {@link Resource.Contributors }
   */
  public Resource.Contributors getContributors() {
    return contributors;
  }

  /**
   * Sets the value of the contributors property.
   *
   * @param value allowed object is {@link Resource.Contributors }
   */
  public void setContributors(Resource.Contributors value) {
    this.contributors = value;
  }

  /**
   * Gets the value of the dates property.
   *
   * @return possible object is {@link Resource.Dates }
   */
  public Resource.Dates getDates() {
    return dates;
  }

  /**
   * Sets the value of the dates property.
   *
   * @param value allowed object is {@link Resource.Dates }
   */
  public void setDates(Resource.Dates value) {
    this.dates = value;
  }

  /**
   * Gets the value of the language property.
   *
   * @return possible object is {@link String }
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Sets the value of the language property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLanguage(String value) {
    this.language = value;
  }

  /**
   * Gets the value of the resourceType property.
   *
   * @return possible object is {@link Resource.ResourceType }
   */
  public Resource.ResourceType getResourceType() {
    return resourceType;
  }

  /**
   * Sets the value of the resourceType property.
   *
   * @param value allowed object is {@link Resource.ResourceType }
   */
  public void setResourceType(Resource.ResourceType value) {
    this.resourceType = value;
  }

  /**
   * Gets the value of the alternateIdentifiers property.
   *
   * @return possible object is {@link Resource.AlternateIdentifiers }
   */
  public Resource.AlternateIdentifiers getAlternateIdentifiers() {
    return alternateIdentifiers;
  }

  /**
   * Sets the value of the alternateIdentifiers property.
   *
   * @param value allowed object is {@link Resource.AlternateIdentifiers }
   */
  public void setAlternateIdentifiers(Resource.AlternateIdentifiers value) {
    this.alternateIdentifiers = value;
  }

  /**
   * Gets the value of the relatedIdentifiers property.
   *
   * @return possible object is {@link Resource.RelatedIdentifiers }
   */
  public Resource.RelatedIdentifiers getRelatedIdentifiers() {
    return relatedIdentifiers;
  }

  /**
   * Sets the value of the relatedIdentifiers property.
   *
   * @param value allowed object is {@link Resource.RelatedIdentifiers }
   */
  public void setRelatedIdentifiers(Resource.RelatedIdentifiers value) {
    this.relatedIdentifiers = value;
  }

  /**
   * Gets the value of the sizes property.
   *
   * @return possible object is {@link Resource.Sizes }
   */
  public Resource.Sizes getSizes() {
    return sizes;
  }

  /**
   * Sets the value of the sizes property.
   *
   * @param value allowed object is {@link Resource.Sizes }
   */
  public void setSizes(Resource.Sizes value) {
    this.sizes = value;
  }

  /**
   * Gets the value of the formats property.
   *
   * @return possible object is {@link Resource.Formats }
   */
  public Resource.Formats getFormats() {
    return formats;
  }

  /**
   * Sets the value of the formats property.
   *
   * @param value allowed object is {@link Resource.Formats }
   */
  public void setFormats(Resource.Formats value) {
    this.formats = value;
  }

  /**
   * Gets the value of the version property.
   *
   * @return possible object is {@link String }
   */
  public String getVersion() {
    return version;
  }

  /**
   * Sets the value of the version property.
   *
   * @param value allowed object is {@link String }
   */
  public void setVersion(String value) {
    this.version = value;
  }

  /**
   * Gets the value of the rightsList property.
   *
   * @return possible object is {@link Resource.RightsList }
   */
  public Resource.RightsList getRightsList() {
    return rightsList;
  }

  /**
   * Sets the value of the rightsList property.
   *
   * @param value allowed object is {@link Resource.RightsList }
   */
  public void setRightsList(Resource.RightsList value) {
    this.rightsList = value;
  }

  /**
   * Gets the value of the descriptions property.
   *
   * @return possible object is {@link Resource.Descriptions }
   */
  public Resource.Descriptions getDescriptions() {
    return descriptions;
  }

  /**
   * Sets the value of the descriptions property.
   *
   * @param value allowed object is {@link Resource.Descriptions }
   */
  public void setDescriptions(Resource.Descriptions value) {
    this.descriptions = value;
  }

  /**
   * Gets the value of the geoLocations property.
   *
   * @return possible object is {@link Resource.GeoLocations }
   */
  public Resource.GeoLocations getGeoLocations() {
    return geoLocations;
  }

  /**
   * Sets the value of the geoLocations property.
   *
   * @param value allowed object is {@link Resource.GeoLocations }
   */
  public void setGeoLocations(Resource.GeoLocations value) {
    this.geoLocations = value;
  }


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
   *         &lt;element name="alternateIdentifier" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="alternateIdentifierType" use="required"
   * type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "alternateIdentifier"
      })
  public static class AlternateIdentifiers {

    protected List<Resource.AlternateIdentifiers.AlternateIdentifier> alternateIdentifier;

    /**
     * Gets the value of the alternateIdentifier property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the alternateIdentifier property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateIdentifier().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * Resource.AlternateIdentifiers.AlternateIdentifier }
     */
    public List<Resource.AlternateIdentifiers.AlternateIdentifier> getAlternateIdentifier() {
      if (alternateIdentifier == null) {
        alternateIdentifier = new ArrayList<Resource.AlternateIdentifiers.AlternateIdentifier>();
      }
      return this.alternateIdentifier;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="alternateIdentifierType" use="required"
     * type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "value" })
    public static class AlternateIdentifier {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "alternateIdentifierType", required = true)
      @XmlSchemaType(name = "anySimpleType")
      protected String alternateIdentifierType;

      /**
       * Gets the value of the value property.
       *
       * @return possible object is {@link String }
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value allowed object is {@link String }
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the alternateIdentifierType property.
       *
       * @return possible object is {@link String }
       */
      public String getAlternateIdentifierType() {
        return alternateIdentifierType;
      }

      /**
       * Sets the value of the alternateIdentifierType property.
       *
       * @param value allowed object is {@link String }
       */
      public void setAlternateIdentifierType(String value) {
        this.alternateIdentifierType = value;
      }

    }

  }


  /**
   * XmlAccessorType
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"contributor" })
  public static class Contributors {

    protected List<Resource.Contributors.Contributor> contributor;

    /**
     * Gets the value of the contributor property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the contributor property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getContributor().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * Resource.Contributors.Contributor }
     */
    public List<Resource.Contributors.Contributor> getContributor() {
      if (contributor == null) {
        contributor = new ArrayList<Resource.Contributors.Contributor>();
      }
      return this.contributor;
    }

    /**
     * XmlAccessorType
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contributorName",
        "nameIdentifier",
        "affiliation"
        })
    /**
     * Contributor
     */
    public static class Contributor {

      @XmlElement(required = true)
      protected String contributorName;
      protected Resource.Contributors.Contributor.NameIdentifier nameIdentifier;
      protected List<Object> affiliation;
      @XmlAttribute(name = "contributorType", required = true)
      protected DateType.ContributorType contributorType;

      /**
       * Gets the value of the contributorName property.
       *
       * @return possible object is {@link String }
       */
      public String getContributorName() {
        return contributorName;
      }

      /**
       * Sets the value of the contributorName property.
       *
       * @param value allowed object is {@link String }
       */
      public void setContributorName(String value) {
        this.contributorName = value;
      }

      /**
       * Gets the value of the nameIdentifier property.
       *
       * @return possible object is {@link Resource.Contributors.Contributor.NameIdentifier }
       */
      public Resource.Contributors.Contributor.NameIdentifier getNameIdentifier() {
        return nameIdentifier;
      }

      /**
       * Sets the value of the nameIdentifier property.
       *
       * @param value allowed object is {@link Resource.Contributors.Contributor.NameIdentifier }
       */
      public void setNameIdentifier(Resource.Contributors.Contributor.NameIdentifier value) {
        this.nameIdentifier = value;
      }

      /**
       * Gets the value of the affiliation property.
       *
       * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore
       * any modification you make to the returned list will be present inside the JAXB object. This
       * is why there is not a <CODE>set</CODE> method for the affiliation property.
       *
       * <p> For example, to add a new item, do as follows:
       * <pre>
       *    getAffiliation().add(newItem);
       * </pre>
       *
       *
       * <p> Objects of the following type(s) are allowed in the list {@link Object }
       */
      public List<Object> getAffiliation() {
        if (affiliation == null) {
          affiliation = new ArrayList<Object>();
        }
        return this.affiliation;
      }

      /**
       * Gets the value of the contributorType property.
       *
       * @return possible object is {@link DateType.ContributorType }
       */
      public DateType.ContributorType getContributorType() {
        return contributorType;
      }

      /**
       * Sets the value of the contributorType property.
       *
       * @param value allowed object is {@link DateType.ContributorType }
       */
      public void setContributorType(DateType.ContributorType value) {
        this.contributorType = value;
      }


      /**
       * <p>Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this
       * class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;simpleContent>
       *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
       *       &lt;attribute name="nameIdentifierScheme" use="required"
       * type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
       *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"
       * />
       *     &lt;/extension>
       *   &lt;/simpleContent>
       * &lt;/complexType>
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
          "value"
          })
      /**
       * NameIdentifier
       */
      public static class NameIdentifier {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "nameIdentifierScheme", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String nameIdentifierScheme;
        @XmlAttribute(name = "schemeURI")
        @XmlSchemaType(name = "anyURI")
        protected String schemeURI;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is {@link String }
         */
        public String getValue() {
          return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is {@link String }
         */
        public void setValue(String value) {
          this.value = value;
        }

        /**
         * Gets the value of the nameIdentifierScheme property.
         *
         * @return possible object is {@link String }
         */
        public String getNameIdentifierScheme() {
          return nameIdentifierScheme;
        }

        /**
         * Sets the value of the nameIdentifierScheme property.
         *
         * @param value allowed object is {@link String }
         */
        public void setNameIdentifierScheme(String value) {
          this.nameIdentifierScheme = value;
        }

        /**
         * Gets the value of the schemeURI property.
         *
         * @return possible object is {@link String }
         */
        public String getSchemeURI() {
          return schemeURI;
        }

        /**
         * Sets the value of the schemeURI property.
         *
         * @param value allowed object is {@link String }
         */
        public void setSchemeURI(String value) {
          this.schemeURI = value;
        }

      }

    }

  }

  /**
   * doc
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "creator"
      })
  /**
   * Creators
   */
  public static class Creators {

    @XmlElement(required = true)
    protected List<Resource.Creators.Creator> creator;

    /**
     * Gets the value of the creator property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the creator property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link Resource.Creators.Creator
     * }
     */
    public List<Resource.Creators.Creator> getCreator() {
      if (creator == null) {
        creator = new ArrayList<Resource.Creators.Creator>();
      }
      return this.creator;
    }

    /**
     * doc
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "creatorName",
        "nameIdentifier",
        "affiliation"
        })
    /**
     * Creator
     */
    public static class Creator {

      @XmlElement(required = true)
      protected String creatorName;
      protected Resource.Creators.Creator.NameIdentifier nameIdentifier;
      protected List<Object> affiliation;

      /**
       * Gets the value of the creatorName property.
       *
       * @return possible object is {@link String }
       */
      public String getCreatorName() {
        return creatorName;
      }

      /**
       * Sets the value of the creatorName property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCreatorName(String value) {
        this.creatorName = value;
      }

      /**
       * Gets the value of the nameIdentifier property.
       *
       * @return possible object is {@link Resource.Creators.Creator.NameIdentifier }
       */
      public Resource.Creators.Creator.NameIdentifier getNameIdentifier() {
        return nameIdentifier;
      }

      /**
       * Sets the value of the nameIdentifier property.
       *
       * @param value allowed object is {@link Resource.Creators.Creator.NameIdentifier }
       */
      public void setNameIdentifier(Resource.Creators.Creator.NameIdentifier value) {
        this.nameIdentifier = value;
      }

      /**
       * Gets the value of the affiliation property.
       *
       * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore
       * any modification you make to the returned list will be present inside the JAXB object. This
       * is why there is not a <CODE>set</CODE> method for the affiliation property.
       *
       * <p> For example, to add a new item, do as follows:
       * <pre>
       *    getAffiliation().add(newItem);
       * </pre>
       *
       *
       * <p> Objects of the following type(s) are allowed in the list {@link Object }
       */
      public List<Object> getAffiliation() {
        if (affiliation == null) {
          affiliation = new ArrayList<Object>();
        }
        return this.affiliation;
      }


      /**
       * <p>Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this
       * class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;simpleContent>
       *     &lt;extension base="&lt;http://datacite.org/schema/kernel-3>nonemptycontentStringType">
       *       &lt;attribute name="nameIdentifierScheme" use="required"
       * type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
       *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"
       * />
       *     &lt;/extension>
       *   &lt;/simpleContent>
       * &lt;/complexType>
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
          "value"
          })
      /**
       * NameIdentifier
       */
      public static class NameIdentifier {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "nameIdentifierScheme", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String nameIdentifierScheme;
        @XmlAttribute(name = "schemeURI")
        @XmlSchemaType(name = "anyURI")
        protected String schemeURI;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is {@link String }
         */
        public String getValue() {
          return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is {@link String }
         */
        public void setValue(String value) {
          this.value = value;
        }

        /**
         * Gets the value of the nameIdentifierScheme property.
         *
         * @return possible object is {@link String }
         */
        public String getNameIdentifierScheme() {
          return nameIdentifierScheme;
        }

        /**
         * Sets the value of the nameIdentifierScheme property.
         *
         * @param value allowed object is {@link String }
         */
        public void setNameIdentifierScheme(String value) {
          this.nameIdentifierScheme = value;
        }

        /**
         * Gets the value of the schemeURI property.
         *
         * @return possible object is {@link String }
         */
        public String getSchemeURI() {
          return schemeURI;
        }

        /**
         * Sets the value of the schemeURI property.
         *
         * @param value allowed object is {@link String }
         */
        public void setSchemeURI(String value) {
          this.schemeURI = value;
        }

      }

    }

  }

  /**
   * doc
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "date"
      })
  /**
   * Dates
   *
   */
  public static class Dates {

    protected List<Resource.Dates.Date> date;

    /**
     * Gets the value of the date property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the date property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link Resource.Dates.Date }
     */
    public List<Resource.Dates.Date> getDate() {
      if (date == null) {
        date = new ArrayList<Resource.Dates.Date>();
      }
      return this.date;
    }

    /**
     * doc
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
        })
    public static class Date {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "dateType", required = true)
      protected DateType dateType;

      /**
       * Gets the value of the value property.
       *
       * @return possible object is {@link String }
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value allowed object is {@link String }
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the dateType property.
       *
       * @return possible object is {@link DateType }
       */
      public DateType getDateType() {
        return dateType;
      }

      /**
       * Sets the value of the dateType property.
       *
       * @param value allowed object is {@link DateType }
       */
      public void setDateType(DateType value) {
        this.dateType = value;
      }

    }

  }


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
   *         &lt;element name="description" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;choice>
   *                   &lt;element name="br" maxOccurs="unbounded" minOccurs="0">
   *                     &lt;simpleType>
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                         &lt;length value="0"/>
   *                       &lt;/restriction>
   *                     &lt;/simpleType>
   *                   &lt;/element>
   *                 &lt;/choice>
   *                 &lt;attribute name="descriptionType" use="required"
   * type="{http://datacite.org/schema/kernel-3}descriptionType" />
   *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "description"
      })
  public static class Descriptions {

    protected List<Resource.Descriptions.Description> description;

    /**
     * Gets the value of the description property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the description property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * Resource.Descriptions.Description }
     */
    public List<Resource.Descriptions.Description> getDescription() {
      if (description == null) {
        description = new ArrayList<Resource.Descriptions.Description>();
      }
      return this.description;
    }

    /**
     * doc
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
        })
    public static class Description {

      @XmlElementRef(name = "br", namespace = "http://datacite.org/schema/kernel-3",
          type = JAXBElement.class, required = false)
      @XmlMixed
      protected List<Serializable> content;
      @XmlAttribute(name = "descriptionType", required = true)
      protected DescriptionType descriptionType;
      @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
      protected String lang;

      /**
       * Gets the value of the content property.
       *
       * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore
       * any modification you make to the returned list will be present inside the JAXB object. This
       * is why there is not a <CODE>set</CODE> method for the content property.
       *
       * <p> For example, to add a new item, do as follows:
       * <pre>
       *    getContent().add(newItem);
       * </pre>
       *
       *
       * <p> Objects of the following type(s) are allowed in the list {@link String } {@link
       * JAXBElement }{@code <}{@link String }{@code >}
       */
      public List<Serializable> getContent() {
        if (content == null) {
          content = new ArrayList<Serializable>();
        }
        return this.content;
      }

      /**
       * Gets the value of the descriptionType property.
       *
       * @return possible object is {@link DescriptionType }
       */
      public DescriptionType getDescriptionType() {
        return descriptionType;
      }

      /**
       * Sets the value of the descriptionType property.
       *
       * @param value allowed object is {@link DescriptionType }
       */
      public void setDescriptionType(DescriptionType value) {
        this.descriptionType = value;
      }

      /**
       * Gets the value of the lang property.
       *
       * @return possible object is {@link String }
       */
      public String getLang() {
        return lang;
      }

      /**
       * Sets the value of the lang property.
       *
       * @param value allowed object is {@link String }
       */
      public void setLang(String value) {
        this.lang = value;
      }

    }

  }


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
   *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"
   * maxOccurs="unbounded" minOccurs="0"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "format"
      })
  public static class Formats {

    protected List<String> format;

    /**
     * Gets the value of the format property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the format property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getFormat() {
      if (format == null) {
        format = new ArrayList<String>();
      }
      return this.format;
    }

  }

  /**
   * doc
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "geoLocation"
      })
  public static class GeoLocations {

    protected List<Resource.GeoLocations.GeoLocation> geoLocation;

    /**
     * Gets the value of the geoLocation property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the geoLocation property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getGeoLocation().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * Resource.GeoLocations.GeoLocation }
     */
    public List<Resource.GeoLocations.GeoLocation> getGeoLocation() {
      if (geoLocation == null) {
        geoLocation = new ArrayList<Resource.GeoLocations.GeoLocation>();
      }
      return this.geoLocation;
    }


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
     *         &lt;element name="geoLocationPoint" type="{http://datacite.org/schema/kernel-3}point"
     * minOccurs="0"/>
     *         &lt;element name="geoLocationBox" type="{http://datacite.org/schema/kernel-3}box"
     * minOccurs="0"/>
     *         &lt;element name="geoLocationPlace" type="{http://www.w3.org/2001/XMLSchema}anyType"
     * minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "geoLocationPoint",
        "geoLocationBox",
        "geoLocationPlace"
        })
    public static class GeoLocation {

      @XmlList
      @XmlElement(type = Double.class)
      protected List<Double> geoLocationPoint;
      @XmlList
      @XmlElement(type = Double.class)
      protected List<Double> geoLocationBox;
      protected Object geoLocationPlace;

      /**
       * Gets the value of the geoLocationPoint property.
       *
       * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore
       * any modification you make to the returned list will be present inside the JAXB object. This
       * is why there is not a <CODE>set</CODE> method for the geoLocationPoint property.
       *
       * <p> For example, to add a new item, do as follows:
       * <pre>
       *    getGeoLocationPoint().add(newItem);
       * </pre>
       *
       *
       * <p> Objects of the following type(s) are allowed in the list {@link Double }
       */
      public List<Double> getGeoLocationPoint() {
        if (geoLocationPoint == null) {
          geoLocationPoint = new ArrayList<Double>();
        }
        return this.geoLocationPoint;
      }

      /**
       * Gets the value of the geoLocationBox property.
       *
       * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore
       * any modification you make to the returned list will be present inside the JAXB object. This
       * is why there is not a <CODE>set</CODE> method for the geoLocationBox property.
       *
       * <p> For example, to add a new item, do as follows:
       * <pre>
       *    getGeoLocationBox().add(newItem);
       * </pre>
       *
       *
       * <p> Objects of the following type(s) are allowed in the list {@link Double }
       */
      public List<Double> getGeoLocationBox() {
        if (geoLocationBox == null) {
          geoLocationBox = new ArrayList<Double>();
        }
        return this.geoLocationBox;
      }

      /**
       * Gets the value of the geoLocationPlace property.
       *
       * @return possible object is {@link Object }
       */
      public Object getGeoLocationPlace() {
        return geoLocationPlace;
      }

      /**
       * Sets the value of the geoLocationPlace property.
       *
       * @param value allowed object is {@link Object }
       */
      public void setGeoLocationPlace(Object value) {
        this.geoLocationPlace = value;
      }

    }

  }

  /**
   * doc
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "value"
      })
  public static class Identifier {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "identifierType", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String identifierType;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link String }
     */
    public String getValue() {
      return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link String }
     */
    public void setValue(String value) {
      this.value = value;
    }

    /**
     * Gets the value of the identifierType property.
     *
     * @return possible object is {@link String }
     */
    public String getIdentifierType() {
      if (identifierType == null) {
        return "DOI";
      } else {
        return identifierType;
      }
    }

    /**
     * Sets the value of the identifierType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setIdentifierType(String value) {
      this.identifierType = value;
    }

  }

  /**
   * doc
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "relatedIdentifier"
      })
  public static class RelatedIdentifiers {

    protected List<Resource.RelatedIdentifiers.RelatedIdentifier> relatedIdentifier;

    /**
     * Gets the value of the relatedIdentifier property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the relatedIdentifier property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedIdentifier().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * Resource.RelatedIdentifiers.RelatedIdentifier }
     */
    public List<Resource.RelatedIdentifiers.RelatedIdentifier> getRelatedIdentifier() {
      if (relatedIdentifier == null) {
        relatedIdentifier = new ArrayList<Resource.RelatedIdentifiers.RelatedIdentifier>();
      }
      return this.relatedIdentifier;
    }

    /**
     * doc
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
        })
    public static class RelatedIdentifier {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "relatedIdentifierType", required = true)
      protected RelatedIdentifierType relatedIdentifierType;
      @XmlAttribute(name = "relationType", required = true)
      protected RelationType relationType;
      @XmlAttribute(name = "relatedMetadataScheme")
      @XmlSchemaType(name = "anySimpleType")
      protected String relatedMetadataScheme;
      @XmlAttribute(name = "schemeURI")
      @XmlSchemaType(name = "anyURI")
      protected String schemeURI;
      @XmlAttribute(name = "schemeType")
      @XmlSchemaType(name = "anySimpleType")
      protected String schemeType;

      /**
       * Gets the value of the value property.
       *
       * @return possible object is {@link String }
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value allowed object is {@link String }
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the relatedIdentifierType property.
       *
       * @return possible object is {@link RelatedIdentifierType }
       */
      public RelatedIdentifierType getRelatedIdentifierType() {
        return relatedIdentifierType;
      }

      /**
       * Sets the value of the relatedIdentifierType property.
       *
       * @param value allowed object is {@link RelatedIdentifierType }
       */
      public void setRelatedIdentifierType(RelatedIdentifierType value) {
        this.relatedIdentifierType = value;
      }

      /**
       * Gets the value of the relationType property.
       *
       * @return possible object is {@link RelationType }
       */
      public RelationType getRelationType() {
        return relationType;
      }

      /**
       * Sets the value of the relationType property.
       *
       * @param value allowed object is {@link RelationType }
       */
      public void setRelationType(RelationType value) {
        this.relationType = value;
      }

      /**
       * Gets the value of the relatedMetadataScheme property.
       *
       * @return possible object is {@link String }
       */
      public String getRelatedMetadataScheme() {
        return relatedMetadataScheme;
      }

      /**
       * Sets the value of the relatedMetadataScheme property.
       *
       * @param value allowed object is {@link String }
       */
      public void setRelatedMetadataScheme(String value) {
        this.relatedMetadataScheme = value;
      }

      /**
       * Gets the value of the schemeURI property.
       *
       * @return possible object is {@link String }
       */
      public String getSchemeURI() {
        return schemeURI;
      }

      /**
       * Sets the value of the schemeURI property.
       *
       * @param value allowed object is {@link String }
       */
      public void setSchemeURI(String value) {
        this.schemeURI = value;
      }

      /**
       * Gets the value of the schemeType property.
       *
       * @return possible object is {@link String }
       */
      public String getSchemeType() {
        return schemeType;
      }

      /**
       * Sets the value of the schemeType property.
       *
       * @param value allowed object is {@link String }
       */
      public void setSchemeType(String value) {
        this.schemeType = value;
      }

    }

  }

  /**
   * doc
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "value"
      })
  public static class ResourceType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "resourceTypeGeneral", required = true)
    protected dk.dtu.ccsd.jaxb.datacite.ResourceType resourceTypeGeneral;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link String }
     */
    public String getValue() {
      return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link String }
     */
    public void setValue(String value) {
      this.value = value;
    }

    /**
     * Gets the value of the resourceTypeGeneral property.
     *
     * @return possible object is {@link dk.dtu.ccsd.jaxb.datacite.ResourceType }
     */
    public dk.dtu.ccsd.jaxb.datacite.ResourceType getResourceTypeGeneral() {
      return resourceTypeGeneral;
    }

    /**
     * Sets the value of the resourceTypeGeneral property.
     *
     * @param value allowed object is {@link dk.dtu.ccsd.jaxb.datacite.ResourceType }
     */
    public void setResourceTypeGeneral(dk.dtu.ccsd.jaxb.datacite.ResourceType value) {
      this.resourceTypeGeneral = value;
    }

  }


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
   *         &lt;element name="rights" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="rightsURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"
   * />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "rights"
      })
  public static class RightsList {

    protected List<Resource.RightsList.Rights> rights;

    /**
     * Gets the value of the rights property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the rights property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getRights().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * Resource.RightsList.Rights }
     */
    public List<Resource.RightsList.Rights> getRights() {
      if (rights == null) {
        rights = new ArrayList<Resource.RightsList.Rights>();
      }
      return this.rights;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="rightsURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
        })
    public static class Rights {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "rightsURI")
      @XmlSchemaType(name = "anyURI")
      protected String rightsURI;

      /**
       * Gets the value of the value property.
       *
       * @return possible object is {@link String }
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value allowed object is {@link String }
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the rightsURI property.
       *
       * @return possible object is {@link String }
       */
      public String getRightsURI() {
        return rightsURI;
      }

      /**
       * Sets the value of the rightsURI property.
       *
       * @param value allowed object is {@link String }
       */
      public void setRightsURI(String value) {
        this.rightsURI = value;
      }

    }

  }


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
   *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string"
   * maxOccurs="unbounded" minOccurs="0"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "size"
      })
  public static class Sizes {

    protected List<String> size;

    /**
     * Gets the value of the size property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the size property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getSize().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getSize() {
      if (size == null) {
        size = new ArrayList<String>();
      }
      return this.size;
    }

  }

  /**
   * doc
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "subject"
      })
  public static class Subjects {

    protected List<Resource.Subjects.Subject> subject;

    /**
     * Gets the value of the subject property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the subject property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link Resource.Subjects.Subject
     * }
     */
    public List<Resource.Subjects.Subject> getSubject() {
      if (subject == null) {
        subject = new ArrayList<Resource.Subjects.Subject>();
      }
      return this.subject;
    }

    /**
     * doc
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
        })
    public static class Subject {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "subjectScheme")
      @XmlSchemaType(name = "anySimpleType")
      protected String subjectScheme;
      @XmlAttribute(name = "schemeURI")
      @XmlSchemaType(name = "anyURI")
      protected String schemeURI;
      @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
      protected String lang;

      /**
       * Gets the value of the value property.
       *
       * @return possible object is {@link String }
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value allowed object is {@link String }
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the subjectScheme property.
       *
       * @return possible object is {@link String }
       */
      public String getSubjectScheme() {
        return subjectScheme;
      }

      /**
       * Sets the value of the subjectScheme property.
       *
       * @param value allowed object is {@link String }
       */
      public void setSubjectScheme(String value) {
        this.subjectScheme = value;
      }

      /**
       * Gets the value of the schemeURI property.
       *
       * @return possible object is {@link String }
       */
      public String getSchemeURI() {
        return schemeURI;
      }

      /**
       * Sets the value of the schemeURI property.
       *
       * @param value allowed object is {@link String }
       */
      public void setSchemeURI(String value) {
        this.schemeURI = value;
      }

      /**
       * Gets the value of the lang property.
       *
       * @return possible object is {@link String }
       */
      public String getLang() {
        return lang;
      }

      /**
       * Sets the value of the lang property.
       *
       * @param value allowed object is {@link String }
       */
      public void setLang(String value) {
        this.lang = value;
      }

    }

  }

  /**
   * doc
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "title"
      })
  public static class Titles {

    @XmlElement(required = true)
    protected List<Resource.Titles.Title> title;

    /**
     * Gets the value of the title property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the title property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link Resource.Titles.Title }
     */
    public List<Resource.Titles.Title> getTitle() {
      if (title == null) {
        title = new ArrayList<Resource.Titles.Title>();
      }
      return this.title;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://datacite.org/schema/kernel-3>nonemptycontentStringType">
     *       &lt;attribute name="titleType" type="{http://datacite.org/schema/kernel-3}titleType"
     * />
     *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
        })
    public static class Title {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "titleType")
      protected TitleType titleType;
      @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
      protected String lang;

      /**
       * Gets the value of the value property.
       *
       * @return possible object is {@link String }
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value allowed object is {@link String }
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the titleType property.
       *
       * @return possible object is {@link TitleType }
       */
      public TitleType getTitleType() {
        return titleType;
      }

      /**
       * Sets the value of the titleType property.
       *
       * @param value allowed object is {@link TitleType }
       */
      public void setTitleType(TitleType value) {
        this.titleType = value;
      }

      /**
       * Gets the value of the lang property.
       *
       * @return possible object is {@link String }
       */
      public String getLang() {
        return lang;
      }

      /**
       * Sets the value of the lang property.
       *
       * @param value allowed object is {@link String }
       */
      public void setLang(String value) {
        this.lang = value;
      }

    }

  }

}
