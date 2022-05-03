package com.devglan.exception;

public enum BusinessErrorCode {
  UserNotFound(40404),
  BookNotFound(40405),
  UserCanNotConverter(90909),
  InvalidParam(40000),
  InternalServer(500000),
  DuplicateCode(500001),
  DuplicateBookId(500002);

  private final int id;

  BusinessErrorCode(int id) {
    this.id = id;
  }

  public int getValue() {
    return id;
  }
}
