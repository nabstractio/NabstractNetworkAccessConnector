package com.mulesoft.connectors.nabstractserviceconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.extension.NabstractServiceConnector;

public class CheckSimSwapInputMetadataResolver extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/check-sim-swap-input-schema.json";
  }

  @Override
  public String getResolverName() {
    return "check-sim-swap-input-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return NabstractServiceConnector.API_METADATA_CATEGORY;
  }
}
