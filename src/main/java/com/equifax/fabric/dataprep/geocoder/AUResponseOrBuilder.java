// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddressStandardizer.proto

package com.equifax.fabric.dataprep.geocoder;

public interface AUResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AUResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.AUResponse.AUResponseOutputFields OutputFields = 1;</code>
   * @return Whether the outputFields field is set.
   */
  boolean hasOutputFields();
  /**
   * <code>.AUResponse.AUResponseOutputFields OutputFields = 1;</code>
   * @return The outputFields.
   */
  com.equifax.fabric.dataprep.geocoder.AUResponse.AUResponseOutputFields getOutputFields();
  /**
   * <code>.AUResponse.AUResponseOutputFields OutputFields = 1;</code>
   */
  com.equifax.fabric.dataprep.geocoder.AUResponse.AUResponseOutputFieldsOrBuilder getOutputFieldsOrBuilder();

  /**
   * <code>string correlationId = 2;</code>
   * @return The correlationId.
   */
  java.lang.String getCorrelationId();
  /**
   * <code>string correlationId = 2;</code>
   * @return The bytes for correlationId.
   */
  com.google.protobuf.ByteString
      getCorrelationIdBytes();
}
