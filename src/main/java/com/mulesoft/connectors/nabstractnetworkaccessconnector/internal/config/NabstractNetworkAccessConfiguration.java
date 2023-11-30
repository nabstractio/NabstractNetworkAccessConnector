package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.config;

import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.config.refinement.NabstractNetworkAccessConfigurationRefinement;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.connection.provider.Oauth2ConnectionProvider;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.operation.CheckSimSwapOperation;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.operation.CreateQosSessionOperation;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.operation.DeleteQosSessionOperation;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.operation.GetQosSessionDetailsOperation;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.operation.RetrieveSimSwapDateOperation;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

@Configuration
@Operations({
  CheckSimSwapOperation.class,
  RetrieveSimSwapDateOperation.class,
  CreateQosSessionOperation.class,
  GetQosSessionDetailsOperation.class,
  DeleteQosSessionOperation.class
})
@ConnectionProviders({Oauth2ConnectionProvider.class})
public class NabstractNetworkAccessConfiguration
    extends NabstractNetworkAccessConfigurationRefinement {}
