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
package org.apache.fineract.cn.identity.internal.command;

/**
 * @author Myrle Krantz
 */
@SuppressWarnings("unused")
public class DeleteApplicationPermissionCommand {
  private String applicationIdentifier;
  private String permittableGroupIdentifier;

  public DeleteApplicationPermissionCommand() {
  }

  public DeleteApplicationPermissionCommand(String applicationIdentifier, String permittableGroupIdentifier) {
    this.applicationIdentifier = applicationIdentifier;
    this.permittableGroupIdentifier = permittableGroupIdentifier;
  }

  public String getApplicationIdentifier() {
    return applicationIdentifier;
  }

  public void setApplicationIdentifier(String applicationIdentifier) {
    this.applicationIdentifier = applicationIdentifier;
  }

  public String getPermittableGroupIdentifier() {
    return permittableGroupIdentifier;
  }

  public void setPermittableGroupIdentifier(String permittableGroupIdentifier) {
    this.permittableGroupIdentifier = permittableGroupIdentifier;
  }

  @Override
  public String toString() {
    return "DeleteApplicationPermissionCommand{" +
            "applicationIdentifier='" + applicationIdentifier + '\'' +
            ", permittableGroupIdentifier='" + permittableGroupIdentifier + '\'' +
            '}';
  }
}
