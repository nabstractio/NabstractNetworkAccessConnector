package com.mulesoft.connectors.nabstractserviceconnector.internal.operation.refinement;

import com.mulesoft.connectors.nabstractserviceconnector.internal.operation.base.RetrieveSimSwapDateOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class RetrieveSimSwapDateOperationRefinement extends RetrieveSimSwapDateOperationBase {
  public RetrieveSimSwapDateOperationRefinement() {
    super();
  }

  public RetrieveSimSwapDateOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
