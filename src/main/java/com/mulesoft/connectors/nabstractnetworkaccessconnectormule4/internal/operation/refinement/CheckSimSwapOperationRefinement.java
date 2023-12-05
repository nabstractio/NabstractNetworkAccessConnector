package com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.operation.base.CheckSimSwapOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class CheckSimSwapOperationRefinement extends CheckSimSwapOperationBase {
  public CheckSimSwapOperationRefinement() {
    super();
  }

  public CheckSimSwapOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
