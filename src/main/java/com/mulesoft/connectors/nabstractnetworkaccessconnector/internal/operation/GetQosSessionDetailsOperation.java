package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.metadata.GetQosSessionDetailsOutputMetadataResolver;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.operation.refinement.GetQosSessionDetailsOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class GetQosSessionDetailsOperation extends GetQosSessionDetailsOperationRefinement {
  public GetQosSessionDetailsOperation() {
    super();
  }

  public GetQosSessionDetailsOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Get Qos Session Details
   *
   * <p>This operation makes an HTTP GET request to the /qod/v0/sessions/{sessionId} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param sessionIdUriParam Session ID that was obtained from the createSession operation
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get Qos Session Details")
  @MediaType("application/json")
  @OutputResolver(
      output = GetQosSessionDetailsOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getQosSessionDetails(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("Session Id")
          @Summary("Session ID that was obtained from the createSession operation")
          String sessionIdUriParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.getQosSessionDetails(
        config, connection, sessionIdUriParam, parameters, overrides, callback);
  }
}
