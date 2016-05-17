package dk.dtu.ccsd.rest;

import com.google.gson.Gson;

import dk.dtu.ccsd.jaxb.DataCiteJsonXmlConverter;

import org.apache.zeppelin.server.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import java.io.IOException;

/**
 * Created by xiuli on 11/18/15.
 */
@Path("/metadata")
@Produces("metadata/json")
public class MetadataApi {
  Logger logger = LoggerFactory.getLogger(MetadataApi.class);


  Gson gson = new Gson();


  @POST
  @Path("/save")
  public Response login(String message) throws IOException {
    logger.info("message={}", message);
    try {
      String xmlString = DataCiteJsonXmlConverter.jsonStringToXmlString(message);
      return new JsonResponse(Response.Status.OK, "", xmlString).build();
    } catch (Exception e) {
      e.printStackTrace();
      return new JsonResponse(Response.Status.OK, "", "Failed to convert to xml").build();
    }

  }
}
