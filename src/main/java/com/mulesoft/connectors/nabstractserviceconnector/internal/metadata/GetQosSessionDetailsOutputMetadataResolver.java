package com.mulesoft.connectors.nabstractserviceconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.extension.NabstractServiceConnector;

public class GetQosSessionDetailsOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/create-qos-session-output-schema.json";
  }

  @Override
  public String getResolverName() {
    return "get-qos-session-details-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return NabstractServiceConnector.API_METADATA_CATEGORY;
  }
}
