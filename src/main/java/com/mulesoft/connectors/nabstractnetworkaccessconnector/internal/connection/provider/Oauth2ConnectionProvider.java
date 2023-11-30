package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.connection.provider;

import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.connection.provider.refinement.Oauth2ConnectionProviderRefinement;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.connectivity.oauth.ClientCredentials;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

/**
 * This is the last layer of the connection provider generation gap pattern. It is what finally gets
 * exposed as the connection provider, including all customizations made in the refinement layer.
 */
@Alias("oauth2")
@DisplayName("Oauth2 Connection Provider")
@ClientCredentials(
    tokenUrl = "http://18.188.143.195:31996/realms/nabstract/protocol/openid-connect/token",
    defaultScopes = "openid profile email other-scopes")
public class Oauth2ConnectionProvider extends Oauth2ConnectionProviderRefinement {}
