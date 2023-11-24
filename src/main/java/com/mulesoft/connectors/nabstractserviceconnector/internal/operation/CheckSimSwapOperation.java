package com.mulesoft.connectors.nabstractserviceconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.nabstractserviceconnector.internal.metadata.CheckSimSwapInputMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.metadata.CheckSimSwapOutputMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.nabstractserviceconnector.internal.operation.refinement.CheckSimSwapOperationRefinement;
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
public class CheckSimSwapOperation extends CheckSimSwapOperationRefinement {
  public CheckSimSwapOperation() {
    super();
  }

  public CheckSimSwapOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Check if SIM swap has been performed during a past period
   *
   * <p>This operation makes an HTTP POST request to the /sim-swap/v0/check endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param clientIdHeader Client-id
   * @param checkSimSwapBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Check Sim Swap")
  @Summary("Check if SIM swap has been performed during a past period")
  @MediaType("application/json")
  @OutputResolver(
      output = CheckSimSwapOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void checkSimSwap(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("Client id") @Summary("Client-id") String clientIdHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(CheckSimSwapInputMetadataResolver.class)
          TypedValue<InputStream> checkSimSwapBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.checkSimSwap(
        config, connection, clientIdHeader, checkSimSwapBody, parameters, overrides, callback);
  }
}
