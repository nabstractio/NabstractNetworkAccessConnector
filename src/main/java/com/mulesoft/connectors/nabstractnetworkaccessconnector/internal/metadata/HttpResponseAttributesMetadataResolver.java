package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.metadata;

import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.extension.NabstractNetworkAccessConnector;

/**
 * Metadata output attributes resolver for {@link
 * com.mulesoft.connectivity.rest.commons.api.operation.HttpResponseAttributes}.
 */
public class HttpResponseAttributesMetadataResolver
    extends com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output
        .HttpResponseAttributesMetadataResolver {
  @Override
  public String getCategoryName() {
    return NabstractNetworkAccessConnector.API_METADATA_CATEGORY;
  }
}
