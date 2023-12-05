package com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.operation.base.DeleteQosSessionOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteQosSessionOperationRefinement extends DeleteQosSessionOperationBase {
  public DeleteQosSessionOperationRefinement() {
    super();
  }

  public DeleteQosSessionOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
