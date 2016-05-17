package dk.dtu.ccsd.jaxb.datacite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dateType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class. <p>
 * <pre>
 * &lt;simpleType name="dateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Collected"/>
 *     &lt;enumeration value="Copyrighted"/>
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Issued"/>
 *     &lt;enumeration value="Submitted"/>
 *     &lt;enumeration value="Updated"/>
 *     &lt;enumeration value="Valid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "dateType")
@XmlEnum
public enum DateType {

  @XmlEnumValue("Accepted")
  ACCEPTED("Accepted"),
  @XmlEnumValue("Available")
  AVAILABLE("Available"),
  @XmlEnumValue("Collected")
  COLLECTED("Collected"),
  @XmlEnumValue("Copyrighted")
  COPYRIGHTED("Copyrighted"),
  @XmlEnumValue("Created")
  CREATED("Created"),
  @XmlEnumValue("Issued")
  ISSUED("Issued"),
  @XmlEnumValue("Submitted")
  SUBMITTED("Submitted"),
  @XmlEnumValue("Updated")
  UPDATED("Updated"),
  @XmlEnumValue("Valid")
  VALID("Valid");
  private final String value;

  DateType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static DateType fromValue(String v) {
    for (DateType c : DateType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

  /**
   * <p>Java class for contributorType.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   * <p>
   * <pre>
   * &lt;simpleType name="contributorType">
   *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *     &lt;enumeration value="ContactPerson"/>
   *     &lt;enumeration value="DataCollector"/>
   *     &lt;enumeration value="DataCurator"/>
   *     &lt;enumeration value="DataManager"/>
   *     &lt;enumeration value="Distributor"/>
   *     &lt;enumeration value="Editor"/>
   *     &lt;enumeration value="Funder"/>
   *     &lt;enumeration value="HostingInstitution"/>
   *     &lt;enumeration value="Other"/>
   *     &lt;enumeration value="Producer"/>
   *     &lt;enumeration value="ProjectLeader"/>
   *     &lt;enumeration value="ProjectManager"/>
   *     &lt;enumeration value="ProjectMember"/>
   *     &lt;enumeration value="RegistrationAgency"/>
   *     &lt;enumeration value="RegistrationAuthority"/>
   *     &lt;enumeration value="RelatedPerson"/>
   *     &lt;enumeration value="ResearchGroup"/>
   *     &lt;enumeration value="RightsHolder"/>
   *     &lt;enumeration value="Researcher"/>
   *     &lt;enumeration value="Sponsor"/>
   *     &lt;enumeration value="Supervisor"/>
   *     &lt;enumeration value="WorkPackageLeader"/>
   *   &lt;/restriction>
   * &lt;/simpleType>
   * </pre>
   */
  @XmlType(name = "contributorType")
  @XmlEnum
  public static enum ContributorType {

    @XmlEnumValue("ContactPerson")
    CONTACT_PERSON("ContactPerson"),
    @XmlEnumValue("DataCollector")
    DATA_COLLECTOR("DataCollector"),
    @XmlEnumValue("DataCurator")
    DATA_CURATOR("DataCurator"),
    @XmlEnumValue("DataManager")
    DATA_MANAGER("DataManager"),
    @XmlEnumValue("Distributor")
    DISTRIBUTOR("Distributor"),
    @XmlEnumValue("Editor")
    EDITOR("Editor"),
    @XmlEnumValue("Funder")
    FUNDER("Funder"),
    @XmlEnumValue("HostingInstitution")
    HOSTING_INSTITUTION("HostingInstitution"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Producer")
    PRODUCER("Producer"),
    @XmlEnumValue("ProjectLeader")
    PROJECT_LEADER("ProjectLeader"),
    @XmlEnumValue("ProjectManager")
    PROJECT_MANAGER("ProjectManager"),
    @XmlEnumValue("ProjectMember")
    PROJECT_MEMBER("ProjectMember"),
    @XmlEnumValue("RegistrationAgency")
    REGISTRATION_AGENCY("RegistrationAgency"),
    @XmlEnumValue("RegistrationAuthority")
    REGISTRATION_AUTHORITY("RegistrationAuthority"),
    @XmlEnumValue("RelatedPerson")
    RELATED_PERSON("RelatedPerson"),
    @XmlEnumValue("ResearchGroup")
    RESEARCH_GROUP("ResearchGroup"),
    @XmlEnumValue("RightsHolder")
    RIGHTS_HOLDER("RightsHolder"),
    @XmlEnumValue("Researcher")
    RESEARCHER("Researcher"),
    @XmlEnumValue("Sponsor")
    SPONSOR("Sponsor"),
    @XmlEnumValue("Supervisor")
    SUPERVISOR("Supervisor"),
    @XmlEnumValue("WorkPackageLeader")
    WORK_PACKAGE_LEADER("WorkPackageLeader");
    private final String value;

    ContributorType(String v) {
      value = v;
    }

    public String value() {
      return value;
    }

    public static ContributorType fromValue(String v) {
      for (ContributorType c : ContributorType.values()) {
        if (c.value.equals(v)) {
          return c;
        }
      }
      throw new IllegalArgumentException(v);
    }

  }
}
