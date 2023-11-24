package com.mulesoft.connectors.nabstractserviceconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.extension.NabstractServiceConnector;

public class CreateQosSessionInputMetadataResolver extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/create-qos-session-input-schema.json";
  }

  @Override
  public String getResolverName() {
    return "create-qos-session-input-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return NabstractServiceConnector.API_METADATA_CATEGORY;
  }
}
