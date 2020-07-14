package com.rbkmoney.three.ds.server.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_ABSENT)
@ToString(onlyExplicitlyIncluded = true)
public class Sdk {

    @JsonProperty("AppID")
    private String appID;

    @JsonProperty("EncData")
    private String encData;

    @JsonProperty("EphemPubKey")
    private Map<String, String> ephemPubKey;

    @JsonProperty("MaxTimeout")
    private String maxTimeout;

    @JsonProperty("ReferenceNumber")
    private String referenceNumber;

    @JsonProperty("TransID")
    private String transID;

}
