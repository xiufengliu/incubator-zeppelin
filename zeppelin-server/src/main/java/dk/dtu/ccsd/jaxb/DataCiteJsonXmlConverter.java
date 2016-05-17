package dk.dtu.ccsd.jaxb;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import dk.dtu.ccsd.jaxb.datacite.Resource;

/**
 * This xml converter
 */

public class DataCiteJsonXmlConverter {


  public static void jsonToXml(Resource jsonObject, String xmlFile) throws Exception {
    JAXBContext jc = JAXBContext.newInstance(Resource.class);
        /*Unmarshaller unmarshaller = jc.createUnmarshaller();
        unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
        Resource resource =(Resource) unmarshaller.u(jsonFile);*/

    Marshaller xmlM = jc.createMarshaller();
    xmlM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    xmlM.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "");
    FileOutputStream fos = new FileOutputStream(new File(xmlFile), false);
    xmlM.marshal(jsonObject, fos);
    fos.close();
  }


  public static void jsonStringToXmlFile(String jsonString, String xmlFile) throws Exception {
    JAXBContext jc = JAXBContext.newInstance(Resource.class);
    Unmarshaller unmarshaller = jc.createUnmarshaller();
    unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
    Resource resource = (Resource) unmarshaller.unmarshal(new StringReader(jsonString));


    Marshaller xmlM = jc.createMarshaller();
    xmlM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    xmlM.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "");
    FileOutputStream fos = new FileOutputStream(new File(xmlFile), false);
    xmlM.marshal(resource, fos);
    fos.close();
  }

  public static String jsonStringToXmlString(String jsonString) throws Exception {
    JAXBContext jc = JAXBContext.newInstance(Resource.class);
    Unmarshaller unmarshaller = jc.createUnmarshaller();
    unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
    Resource resource = (Resource) unmarshaller.unmarshal(new StringReader(jsonString));


    Marshaller xmlM = jc.createMarshaller();
    xmlM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    xmlM.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "");
    StringWriter stringWriter = new StringWriter();
    xmlM.marshal(resource, stringWriter);
    return stringWriter.toString();
  }


  public static void jsonFileToXmlFile(String jsonFile, String xmlFile) throws Exception {
    JAXBContext jc = JAXBContext.newInstance(Resource.class);
    Unmarshaller unmarshaller = jc.createUnmarshaller();
    unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
    Resource resource = (Resource) unmarshaller.unmarshal(new File(jsonFile));

    Marshaller xmlM = jc.createMarshaller();
    xmlM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    xmlM.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "");
    FileOutputStream fos = new FileOutputStream(new File(xmlFile), false);
    xmlM.marshal(resource, fos);
    fos.close();
  }

  public static void xmlToJson(String xmlFile, String jsonFile) throws Exception {

    JAXBContext jc = JAXBContext.newInstance(Resource.class);
    Unmarshaller unmarshaller = jc.createUnmarshaller();
    File xml = new File(xmlFile);
    Resource resource = (Resource) unmarshaller.unmarshal(xml);

    Marshaller marshaller = jc.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
    marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, true);
    FileOutputStream fos = new FileOutputStream(new File(jsonFile), false);
    marshaller.marshal(resource, fos);
    fos.close();
  }

  public static void main(String[] args) {

    DataCiteJsonXmlConverter jxc = new DataCiteJsonXmlConverter();
    String jsonFile = "/tmp/convertedFile.json";
    String xmlFile = "/tmp/datacite-example-GeoLocation-v3.0.xml";
    String xmlFile2 = "/tmp/convertedFile.xml";
    try {
      //jxc.xmlToJson(xmlFile, jsonFile);
      jxc.jsonFileToXmlFile("/tmp/test.json", xmlFile2);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
