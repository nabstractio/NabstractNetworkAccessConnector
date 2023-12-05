package com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.extension.NabstractNetworkAccessConnectorMule4;

public class CreateQosSessionOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/create-qos-session-output-schema.json";
  }

  @Override
  public String getResolverName() {
    return "create-qos-session-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return NabstractNetworkAccessConnectorMule4.API_METADATA_CATEGORY;
  }
}
