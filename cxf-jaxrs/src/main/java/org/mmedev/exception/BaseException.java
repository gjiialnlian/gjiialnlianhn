package org.mmedev.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseException extends Exception {
  
  private static final long serialVersionUID = -4196777337018634572L;
  private static Logger logger = LoggerFactory.getLogger(BaseException.class);

  public BaseException() {  }
  
  public BaseException(String s) {
    super(s);
    logger.error(s);
  }

  public BaseException(String s, Throwable throwable) {
    super(s, throwable);
    logger.error(s,throwable);
  }
}
