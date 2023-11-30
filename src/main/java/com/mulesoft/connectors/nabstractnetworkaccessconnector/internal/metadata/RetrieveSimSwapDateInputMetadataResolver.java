package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.extension.NabstractNetworkAccessConnector;

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
    return NabstractNetworkAccessConnector.API_METADATA_CATEGORY;
  }
}
