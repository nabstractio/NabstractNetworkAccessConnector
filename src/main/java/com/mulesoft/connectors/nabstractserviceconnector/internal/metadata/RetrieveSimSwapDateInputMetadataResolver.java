package com.mulesoft.connectors.nabstractserviceconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.extension.NabstractServiceConnector;

public class RetrieveSimSwapDateInputMetadataResolver extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/retrieve-sim-swap-date-input-schema.json";
  }

  @Override
  public String getResolverName() {
    return "retrieve-sim-swap-date-input-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return NabstractServiceConnector.API_METADATA_CATEGORY;
  }
}
