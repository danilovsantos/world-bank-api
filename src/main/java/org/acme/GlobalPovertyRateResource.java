package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/poverty-rate")
public class GlobalPovertyRateResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/country/{countryCode}/indicator")
    public String getIndicator(String countryCode) {
        return countryCode;
    }
}