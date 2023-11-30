package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.config.refinement;

import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.config.base.NabstractNetworkAccessConfigurationBase;

/**
 * This refinement is the middle layer of the configuration generation gap pattern. It can be
 * overridden to add custom logic in the configuration.
 */
public abstract class NabstractNetworkAccessConfigurationRefinement
    extends NabstractNetworkAccessConfigurationBase {}
