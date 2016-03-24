package com.avos.avoscloud;

/**
 * <p>
 * A RequestPasswordResetCallback is used to run code requesting a password reset for a user.
 * </p>
 * <p>
 * The easiest way to use a RequestPasswordResetCallback is through an anonymous inner class.
 * Override the done function to specify what the callback should do after the request is complete.
 * The done function will be run in the UI thread, while the request happens in a background thread.
 * This ensures that the UI does not freeze while the request happens.
 * </p>
 * <p>
 * For example, this sample code requests a password reset for a user and calls a different function
 * depending on whether the request succeeded or not.
 * </p>
 * 
 */
abstract class RequestPasswordResetCallback extends AVCallback<Void> {
  /**
   * Override this function with the code you want to run after the request is complete.
   * 
   * @param e The exception raised by the save, or null if no account is associated with the email
   *          address.
   */
  public abstract void done(AVException e);

  @Override
  protected final void internalDone0(Void t, AVException parseException) {
    this.done(parseException);
  }


}
