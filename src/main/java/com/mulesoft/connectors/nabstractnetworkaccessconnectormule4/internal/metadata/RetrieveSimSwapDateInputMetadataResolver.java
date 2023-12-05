package com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;
import com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.extension.NabstractNetworkAccessConnectorMule4;

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
    return NabstractNetworkAccessConnectorMule4.API_METADATA_CATEGORY;
  }
}
