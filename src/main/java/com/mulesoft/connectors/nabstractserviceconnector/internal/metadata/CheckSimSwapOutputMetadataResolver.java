package com.mulesoft.connectors.nabstractserviceconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.extension.NabstractServiceConnector;

public class CheckSimSwapOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/check-sim-swap-output-schema.json";
  }

  @Override
  public String getResolverName() {
    return "check-sim-swap-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return NabstractServiceConnector.API_METADATA_CATEGORY;
  }
}
