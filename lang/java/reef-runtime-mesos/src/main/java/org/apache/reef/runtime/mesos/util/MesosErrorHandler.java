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
package org.apache.reef.runtime.mesos.util;

import org.apache.reef.wake.EventHandler;

import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ErrorHandler for MesosRemoteManager.
 * TODO[JIRA REEF-103]: Replace this class once Tang's namespace feature is enabled
 */
public final class MesosErrorHandler implements EventHandler<Throwable> {

  private static final Logger LOG = Logger.getLogger(MesosErrorHandler.class.getName());

  @Inject
  MesosErrorHandler() {
  }

  @Override
  public void onNext(final Throwable e) {
    LOG.log(Level.SEVERE, "MesosRemoteManager Error", e);
  }
}
