/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.amqp_open.model.v20191212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.amqp_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListQueueConsumersRequest extends RpcAcsRequest<ListQueueConsumersResponse> {
	   

	private String instanceId;

	private String nextToken;

	private Integer queryCount;

	private String virtualHost;

	private String queue;
	public ListQueueConsumersRequest() {
		super("amqp-open", "2019-12-12", "ListQueueConsumers", "onsproxy");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getQueryCount() {
		return this.queryCount;
	}

	public void setQueryCount(Integer queryCount) {
		this.queryCount = queryCount;
		if(queryCount != null){
			putQueryParameter("QueryCount", queryCount.toString());
		}
	}

	public String getVirtualHost() {
		return this.virtualHost;
	}

	public void setVirtualHost(String virtualHost) {
		this.virtualHost = virtualHost;
		if(virtualHost != null){
			putQueryParameter("VirtualHost", virtualHost);
		}
	}

	public String getQueue() {
		return this.queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
		if(queue != null){
			putQueryParameter("Queue", queue);
		}
	}

	@Override
	public Class<ListQueueConsumersResponse> getResponseClass() {
		return ListQueueConsumersResponse.class;
	}

}
