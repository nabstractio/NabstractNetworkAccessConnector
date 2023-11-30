package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.extension.NabstractNetworkAccessConnector;

public class DeleteQosSessionOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/delete-qos-session-output-schema.json";
  }

  @Override
  public String getResolverName() {
    return "delete-qos-session-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return NabstractNetworkAccessConnector.API_METADATA_CATEGORY;
  }
}
