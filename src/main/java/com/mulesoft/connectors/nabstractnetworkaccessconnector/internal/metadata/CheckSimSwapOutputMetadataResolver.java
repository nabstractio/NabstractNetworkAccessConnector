package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.extension.NabstractNetworkAccessConnector;

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
    return NabstractNetworkAccessConnector.API_METADATA_CATEGORY;
  }
}
