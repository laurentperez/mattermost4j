/*
 * Copyright (c) 2019 Takayuki Maruyama
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package net.bis5.mattermost.websocket;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

/**
 * TODO 型の説明
 * 
 * @author Takayuki Maruyama
 */
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class HandlerRegistration {

  private final Runnable removeHandler;

  public void removeHandler() {
    removeHandler.run();
  }
}