/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2020 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2020 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ipc.proto

package org.opennms.core.ipc.grpc.common;

public interface SinkMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SinkMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message_id = 1;</code>
   * @return The messageId.
   */
  String getMessageId();
  /**
   * <code>string message_id = 1;</code>
   * @return The bytes for messageId.
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  /**
   * <code>bytes content = 2;</code>
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  /**
   * <code>string system_id = 3;</code>
   * @return The systemId.
   */
  String getSystemId();
  /**
   * <code>string system_id = 3;</code>
   * @return The bytes for systemId.
   */
  com.google.protobuf.ByteString
      getSystemIdBytes();

  /**
   * <code>string location = 4;</code>
   * @return The location.
   */
  String getLocation();
  /**
   * <code>string location = 4;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>string module_id = 5;</code>
   * @return The moduleId.
   */
  String getModuleId();
  /**
   * <code>string module_id = 5;</code>
   * @return The bytes for moduleId.
   */
  com.google.protobuf.ByteString
      getModuleIdBytes();

  /**
   * <code>map&lt;string, string&gt; tracing_info = 6;</code>
   */
  int getTracingInfoCount();
  /**
   * <code>map&lt;string, string&gt; tracing_info = 6;</code>
   */
  boolean containsTracingInfo(
          String key);
  /**
   * Use {@link #getTracingInfoMap()} instead.
   */
  @Deprecated
  java.util.Map<String, String>
  getTracingInfo();
  /**
   * <code>map&lt;string, string&gt; tracing_info = 6;</code>
   */
  java.util.Map<String, String>
  getTracingInfoMap();
  /**
   * <code>map&lt;string, string&gt; tracing_info = 6;</code>
   */

  String getTracingInfoOrDefault(
          String key,
          String defaultValue);
  /**
   * <code>map&lt;string, string&gt; tracing_info = 6;</code>
   */

  String getTracingInfoOrThrow(
          String key);
}
