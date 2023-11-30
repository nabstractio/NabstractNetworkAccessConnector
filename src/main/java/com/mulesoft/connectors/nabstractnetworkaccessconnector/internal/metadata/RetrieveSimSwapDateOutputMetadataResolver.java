package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.extension.NabstractNetworkAccessConnector;

public class RetrieveSimSwapDateOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/retrieve-sim-swap-date-output-schema.json";
  }

  @Override
  public String getResolverName() {
    return "retrieve-sim-swap-date-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return NabstractNetworkAccessConnector.API_METADATA_CATEGORY;
  }
}
