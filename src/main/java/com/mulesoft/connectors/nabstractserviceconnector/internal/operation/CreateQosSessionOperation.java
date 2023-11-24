package com.mulesoft.connectors.nabstractserviceconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.nabstractserviceconnector.internal.metadata.CreateQosSessionInputMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.metadata.CreateQosSessionOutputMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.operation.refinement.CreateQosSessionOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.api.metadata.TypedValue;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class CreateQosSessionOperation extends CreateQosSessionOperationRefinement {
  public CreateQosSessionOperation() {
    super();
  }

  public CreateQosSessionOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Create QoS Session to manage latency/throughput priorities
   *
   * <p>This operation makes an HTTP POST request to the /qod/v0/sessions endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param createQosSessionBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create Qos Session")
  @Summary("Create QoS Session to manage latency/throughput priorities")
  @MediaType("application/json")
  @OutputResolver(
      output = CreateQosSessionOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void createQosSession(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(CreateQosSessionInputMetadataResolver.class)
          TypedValue<InputStream> createQosSessionBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.createQosSession(
        config, connection, createQosSessionBody, parameters, overrides, callback);
  }
}
