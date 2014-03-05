/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.odata4.client.core.edm.xml;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.olingo.odata4.client.api.edm.xml.EntityKey;
import org.apache.olingo.odata4.client.api.edm.xml.EntityType;
import org.apache.olingo.odata4.client.core.op.impl.EntityTypeDeserializer;

@JsonDeserialize(using = EntityTypeDeserializer.class)
public abstract class AbstractEntityType extends AbstractComplexType implements EntityType {

  private static final long serialVersionUID = -1579462552966168139L;

  private boolean abstractEntityType = false;

  private String baseType;

  private boolean openType = false;

  private boolean hasStream = false;

  private EntityKeyImpl key;

  @Override
  public boolean isAbstractEntityType() {
    return abstractEntityType;
  }

  @Override
  public void setAbstractEntityType(final boolean abstractEntityType) {
    this.abstractEntityType = abstractEntityType;
  }

  @Override
  public String getBaseType() {
    return baseType;
  }

  @Override
  public void setBaseType(final String baseType) {
    this.baseType = baseType;
  }

  @Override
  public boolean isOpenType() {
    return openType;
  }

  @Override
  public void setOpenType(final boolean openType) {
    this.openType = openType;
  }

  @Override
  public EntityKeyImpl getKey() {
    return key;
  }

  public void setKey(final EntityKey key) {
    this.key = (EntityKeyImpl) key;
  }

  @Override
  public boolean isHasStream() {
    return hasStream;
  }

  @Override
  public void setHasStream(final boolean hasStream) {
    this.hasStream = hasStream;
  }

}