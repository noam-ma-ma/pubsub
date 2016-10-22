// Copyright 2016 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
////////////////////////////////////////////////////////////////////////////////
package com.google.pubsub.clients.adapter;

import com.google.pubsub.clients.common.LoadTestRunner;
import com.google.pubsub.clients.common.MetricsHandler;
import com.google.pubsub.flic.common.LoadtestProto;

/**
 * Runs a task that publishes on the adapter server.
 */
class AdapterSubscriberTask extends AdapterTask {

  private AdapterSubscriberTask(LoadtestProto.StartRequest request) {
    super(request, MetricsHandler.MetricName.END_TO_END_LATENCY);
  }

  public static void main(String[] args) throws Exception {
    LoadTestRunner.run(AdapterSubscriberTask::new);
  }
}
