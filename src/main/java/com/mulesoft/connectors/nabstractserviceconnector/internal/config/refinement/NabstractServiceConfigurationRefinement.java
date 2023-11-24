package com.mulesoft.connectors.nabstractserviceconnector.internal.config.refinement;

import com.mulesoft.connectors.nabstractserviceconnector.internal.config.base.NabstractServiceConfigurationBase;

/**
 * This refinement is the middle layer of the configuration generation gap pattern. It can be
 * overridden to add custom logic in the configuration.
 */
public abstract class NabstractServiceConfigurationRefinement
    extends NabstractServiceConfigurationBase {}
