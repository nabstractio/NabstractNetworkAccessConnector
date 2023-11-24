package com.mulesoft.connectors.nabstractserviceconnector.internal.config;

import com.mulesoft.connectors.nabstractserviceconnector.internal.config.refinement.NabstractServiceConfigurationRefinement;
import com.mulesoft.connectors.nabstractserviceconnector.internal.connection.provider.Oauth2ConnectionProvider;
import com.mulesoft.connectors.nabstractserviceconnector.internal.operation.CheckSimSwapOperation;
import com.mulesoft.connectors.nabstractserviceconnector.internal.operation.CreateQosSessionOperation;
import com.mulesoft.connectors.nabstractserviceconnector.internal.operation.DeleteQosSessionOperation;
import com.mulesoft.connectors.nabstractserviceconnector.internal.operation.GetQosSessionDetailsOperation;
import com.mulesoft.connectors.nabstractserviceconnector.internal.operation.RetrieveSimSwapDateOperation;
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
public class NabstractServiceConfiguration extends NabstractServiceConfigurationRefinement {}
