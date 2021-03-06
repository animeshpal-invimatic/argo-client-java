# WorkflowServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflow**](WorkflowServiceApi.md#createWorkflow) | **POST** /api/v1/workflows/{namespace} | 
[**deleteWorkflow**](WorkflowServiceApi.md#deleteWorkflow) | **DELETE** /api/v1/workflows/{namespace}/{name} | 
[**getWorkflow**](WorkflowServiceApi.md#getWorkflow) | **GET** /api/v1/workflows/{namespace}/{name} | 
[**lintWorkflow**](WorkflowServiceApi.md#lintWorkflow) | **POST** /api/v1/workflows/{namespace}/lint | 
[**listWorkflows**](WorkflowServiceApi.md#listWorkflows) | **GET** /api/v1/workflows/{namespace} | 
[**podLogs**](WorkflowServiceApi.md#podLogs) | **GET** /api/v1/workflows/{namespace}/{name}/{podName}/log | 
[**resubmitWorkflow**](WorkflowServiceApi.md#resubmitWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/resubmit | 
[**resumeWorkflow**](WorkflowServiceApi.md#resumeWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/resume | 
[**retryWorkflow**](WorkflowServiceApi.md#retryWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/retry | 
[**stopWorkflow**](WorkflowServiceApi.md#stopWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/stop | 
[**submitWorkflow**](WorkflowServiceApi.md#submitWorkflow) | **POST** /api/v1/workflows/{namespace}/submit | 
[**suspendWorkflow**](WorkflowServiceApi.md#suspendWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/suspend | 
[**terminateWorkflow**](WorkflowServiceApi.md#terminateWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/terminate | 
[**watchWorkflows**](WorkflowServiceApi.md#watchWorkflows) | **GET** /api/v1/workflow-events/{namespace} | 


<a name="createWorkflow"></a>
# **createWorkflow**
> Workflow createWorkflow(namespace, body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    WorkflowCreateRequest body = new WorkflowCreateRequest(); // WorkflowCreateRequest | 
    try {
      Workflow result = apiInstance.createWorkflow(namespace, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#createWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **body** | [**WorkflowCreateRequest**](WorkflowCreateRequest.md)|  |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="deleteWorkflow"></a>
# **deleteWorkflow**
> Object deleteWorkflow(namespace, name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String name = "name_example"; // String | 
    String deleteOptionsGracePeriodSeconds = "deleteOptionsGracePeriodSeconds_example"; // String | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. +optional.
    String deleteOptionsPreconditionsUid = "deleteOptionsPreconditionsUid_example"; // String | Specifies the target UID. +optional.
    String deleteOptionsPreconditionsResourceVersion = "deleteOptionsPreconditionsResourceVersion_example"; // String | Specifies the target ResourceVersion +optional.
    Boolean deleteOptionsOrphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both. +optional.
    String deleteOptionsPropagationPolicy = "deleteOptionsPropagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground. +optional.
    List<String> deleteOptionsDryRun = Arrays.asList(); // List<String> | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed +optional.
    try {
      Object result = apiInstance.deleteWorkflow(namespace, name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#deleteWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **deleteOptionsGracePeriodSeconds** | **String**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. +optional. | [optional]
 **deleteOptionsPreconditionsUid** | **String**| Specifies the target UID. +optional. | [optional]
 **deleteOptionsPreconditionsResourceVersion** | **String**| Specifies the target ResourceVersion +optional. | [optional]
 **deleteOptionsOrphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. +optional. | [optional]
 **deleteOptionsPropagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. +optional. | [optional]
 **deleteOptionsDryRun** | [**List&lt;String&gt;**](String.md)| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed +optional. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="getWorkflow"></a>
# **getWorkflow**
> Workflow getWorkflow(namespace, name, getOptionsResourceVersion, fields)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String name = "name_example"; // String | 
    String getOptionsResourceVersion = "getOptionsResourceVersion_example"; // String | When specified: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
    String fields = "fields_example"; // String | Fields to be included or excluded in the response. e.g. \"spec,status.phase\", \"-status.nodes\".
    try {
      Workflow result = apiInstance.getWorkflow(namespace, name, getOptionsResourceVersion, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#getWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **getOptionsResourceVersion** | **String**| When specified: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **fields** | **String**| Fields to be included or excluded in the response. e.g. \&quot;spec,status.phase\&quot;, \&quot;-status.nodes\&quot;. | [optional]

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="lintWorkflow"></a>
# **lintWorkflow**
> Workflow lintWorkflow(namespace, body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    WorkflowLintRequest body = new WorkflowLintRequest(); // WorkflowLintRequest | 
    try {
      Workflow result = apiInstance.lintWorkflow(namespace, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#lintWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **body** | [**WorkflowLintRequest**](WorkflowLintRequest.md)|  |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="listWorkflows"></a>
# **listWorkflows**
> WorkflowList listWorkflows(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue, fields)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String listOptionsLabelSelector = "listOptionsLabelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything. +optional.
    String listOptionsFieldSelector = "listOptionsFieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything. +optional.
    Boolean listOptionsWatch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. +optional.
    Boolean listOptionsAllowWatchBookmarks = true; // Boolean | allowWatchBookmarks requests watch events with type \"BOOKMARK\". Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server's discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored. +optional.
    String listOptionsResourceVersion = "listOptionsResourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. +optional.
    String listOptionsTimeoutSeconds = "listOptionsTimeoutSeconds_example"; // String | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. +optional.
    String listOptionsLimit = "listOptionsLimit_example"; // String | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
    String listOptionsContinue = "listOptionsContinue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \"next key\".  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
    String fields = "fields_example"; // String | Fields to be included or excluded in the response. e.g. \"items.spec,items.status.phase\", \"-items.status.nodes\".
    try {
      WorkflowList result = apiInstance.listWorkflows(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#listWorkflows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **listOptionsLabelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. +optional. | [optional]
 **listOptionsFieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. +optional. | [optional]
 **listOptionsWatch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. +optional. | [optional]
 **listOptionsAllowWatchBookmarks** | **Boolean**| allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored. +optional. | [optional]
 **listOptionsResourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. +optional. | [optional]
 **listOptionsTimeoutSeconds** | **String**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. +optional. | [optional]
 **listOptionsLimit** | **String**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
 **listOptionsContinue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]
 **fields** | **String**| Fields to be included or excluded in the response. e.g. \&quot;items.spec,items.status.phase\&quot;, \&quot;-items.status.nodes\&quot;. | [optional]

### Return type

[**WorkflowList**](WorkflowList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="podLogs"></a>
# **podLogs**
> StreamResultOfLogEntry podLogs(namespace, name, podName, logOptionsContainer, logOptionsFollow, logOptionsPrevious, logOptionsSinceSeconds, logOptionsSinceTimeSeconds, logOptionsSinceTimeNanos, logOptionsTimestamps, logOptionsTailLines, logOptionsLimitBytes, logOptionsInsecureSkipTLSVerifyBackend)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String name = "name_example"; // String | 
    String podName = "podName_example"; // String | 
    String logOptionsContainer = "logOptionsContainer_example"; // String | The container for which to stream logs. Defaults to only container if there is one container in the pod. +optional.
    Boolean logOptionsFollow = true; // Boolean | Follow the log stream of the pod. Defaults to false. +optional.
    Boolean logOptionsPrevious = true; // Boolean | Return previous terminated container logs. Defaults to false. +optional.
    String logOptionsSinceSeconds = "logOptionsSinceSeconds_example"; // String | A relative time in seconds before the current time from which to show logs. If this value precedes the time a pod was started, only logs since the pod start will be returned. If this value is in the future, no logs will be returned. Only one of sinceSeconds or sinceTime may be specified. +optional.
    String logOptionsSinceTimeSeconds = "logOptionsSinceTimeSeconds_example"; // String | Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive.
    Integer logOptionsSinceTimeNanos = 56; // Integer | Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context.
    Boolean logOptionsTimestamps = true; // Boolean | If true, add an RFC3339 or RFC3339Nano timestamp at the beginning of every line of log output. Defaults to false. +optional.
    String logOptionsTailLines = "logOptionsTailLines_example"; // String | If set, the number of lines from the end of the logs to show. If not specified, logs are shown from the creation of the container or sinceSeconds or sinceTime +optional.
    String logOptionsLimitBytes = "logOptionsLimitBytes_example"; // String | If set, the number of bytes to read from the server before terminating the log output. This may not display a complete final line of logging, and may return slightly more or slightly less than the specified limit. +optional.
    Boolean logOptionsInsecureSkipTLSVerifyBackend = true; // Boolean | insecureSkipTLSVerifyBackend indicates that the apiserver should not confirm the validity of the serving certificate of the backend it is connecting to.  This will make the HTTPS connection between the apiserver and the backend insecure. This means the apiserver cannot verify the log data it is receiving came from the real kubelet.  If the kubelet is configured to verify the apiserver's TLS credentials, it does not mean the connection to the real kubelet is vulnerable to a man in the middle attack (e.g. an attacker could not intercept the actual log data coming from the real kubelet). +optional.
    try {
      StreamResultOfLogEntry result = apiInstance.podLogs(namespace, name, podName, logOptionsContainer, logOptionsFollow, logOptionsPrevious, logOptionsSinceSeconds, logOptionsSinceTimeSeconds, logOptionsSinceTimeNanos, logOptionsTimestamps, logOptionsTailLines, logOptionsLimitBytes, logOptionsInsecureSkipTLSVerifyBackend);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#podLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **podName** | **String**|  |
 **logOptionsContainer** | **String**| The container for which to stream logs. Defaults to only container if there is one container in the pod. +optional. | [optional]
 **logOptionsFollow** | **Boolean**| Follow the log stream of the pod. Defaults to false. +optional. | [optional]
 **logOptionsPrevious** | **Boolean**| Return previous terminated container logs. Defaults to false. +optional. | [optional]
 **logOptionsSinceSeconds** | **String**| A relative time in seconds before the current time from which to show logs. If this value precedes the time a pod was started, only logs since the pod start will be returned. If this value is in the future, no logs will be returned. Only one of sinceSeconds or sinceTime may be specified. +optional. | [optional]
 **logOptionsSinceTimeSeconds** | **String**| Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive. | [optional]
 **logOptionsSinceTimeNanos** | **Integer**| Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context. | [optional]
 **logOptionsTimestamps** | **Boolean**| If true, add an RFC3339 or RFC3339Nano timestamp at the beginning of every line of log output. Defaults to false. +optional. | [optional]
 **logOptionsTailLines** | **String**| If set, the number of lines from the end of the logs to show. If not specified, logs are shown from the creation of the container or sinceSeconds or sinceTime +optional. | [optional]
 **logOptionsLimitBytes** | **String**| If set, the number of bytes to read from the server before terminating the log output. This may not display a complete final line of logging, and may return slightly more or slightly less than the specified limit. +optional. | [optional]
 **logOptionsInsecureSkipTLSVerifyBackend** | **Boolean**| insecureSkipTLSVerifyBackend indicates that the apiserver should not confirm the validity of the serving certificate of the backend it is connecting to.  This will make the HTTPS connection between the apiserver and the backend insecure. This means the apiserver cannot verify the log data it is receiving came from the real kubelet.  If the kubelet is configured to verify the apiserver&#39;s TLS credentials, it does not mean the connection to the real kubelet is vulnerable to a man in the middle attack (e.g. an attacker could not intercept the actual log data coming from the real kubelet). +optional. | [optional]

### Return type

[**StreamResultOfLogEntry**](StreamResultOfLogEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |

<a name="resubmitWorkflow"></a>
# **resubmitWorkflow**
> Workflow resubmitWorkflow(namespace, name, body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String name = "name_example"; // String | 
    WorkflowResubmitRequest body = new WorkflowResubmitRequest(); // WorkflowResubmitRequest | 
    try {
      Workflow result = apiInstance.resubmitWorkflow(namespace, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#resubmitWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **body** | [**WorkflowResubmitRequest**](WorkflowResubmitRequest.md)|  |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="resumeWorkflow"></a>
# **resumeWorkflow**
> Workflow resumeWorkflow(namespace, name, body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String name = "name_example"; // String | 
    WorkflowResumeRequest body = new WorkflowResumeRequest(); // WorkflowResumeRequest | 
    try {
      Workflow result = apiInstance.resumeWorkflow(namespace, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#resumeWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **body** | [**WorkflowResumeRequest**](WorkflowResumeRequest.md)|  |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="retryWorkflow"></a>
# **retryWorkflow**
> Workflow retryWorkflow(namespace, name, body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String name = "name_example"; // String | 
    WorkflowRetryRequest body = new WorkflowRetryRequest(); // WorkflowRetryRequest | 
    try {
      Workflow result = apiInstance.retryWorkflow(namespace, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#retryWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **body** | [**WorkflowRetryRequest**](WorkflowRetryRequest.md)|  |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="stopWorkflow"></a>
# **stopWorkflow**
> Workflow stopWorkflow(namespace, name, body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String name = "name_example"; // String | 
    WorkflowStopRequest body = new WorkflowStopRequest(); // WorkflowStopRequest | 
    try {
      Workflow result = apiInstance.stopWorkflow(namespace, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#stopWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **body** | [**WorkflowStopRequest**](WorkflowStopRequest.md)|  |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="submitWorkflow"></a>
# **submitWorkflow**
> Workflow submitWorkflow(namespace, body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    WorkflowSubmitRequest body = new WorkflowSubmitRequest(); // WorkflowSubmitRequest | 
    try {
      Workflow result = apiInstance.submitWorkflow(namespace, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#submitWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **body** | [**WorkflowSubmitRequest**](WorkflowSubmitRequest.md)|  |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="suspendWorkflow"></a>
# **suspendWorkflow**
> Workflow suspendWorkflow(namespace, name, body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String name = "name_example"; // String | 
    WorkflowSuspendRequest body = new WorkflowSuspendRequest(); // WorkflowSuspendRequest | 
    try {
      Workflow result = apiInstance.suspendWorkflow(namespace, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#suspendWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **body** | [**WorkflowSuspendRequest**](WorkflowSuspendRequest.md)|  |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="terminateWorkflow"></a>
# **terminateWorkflow**
> Workflow terminateWorkflow(namespace, name, body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String name = "name_example"; // String | 
    WorkflowTerminateRequest body = new WorkflowTerminateRequest(); // WorkflowTerminateRequest | 
    try {
      Workflow result = apiInstance.terminateWorkflow(namespace, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#terminateWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **body** | [**WorkflowTerminateRequest**](WorkflowTerminateRequest.md)|  |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="watchWorkflows"></a>
# **watchWorkflows**
> StreamResultOfWorkflowWatchEvent watchWorkflows(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.WorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowServiceApi apiInstance = new WorkflowServiceApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String listOptionsLabelSelector = "listOptionsLabelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything. +optional.
    String listOptionsFieldSelector = "listOptionsFieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything. +optional.
    Boolean listOptionsWatch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. +optional.
    Boolean listOptionsAllowWatchBookmarks = true; // Boolean | allowWatchBookmarks requests watch events with type \"BOOKMARK\". Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server's discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored. +optional.
    String listOptionsResourceVersion = "listOptionsResourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. +optional.
    String listOptionsTimeoutSeconds = "listOptionsTimeoutSeconds_example"; // String | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. +optional.
    String listOptionsLimit = "listOptionsLimit_example"; // String | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
    String listOptionsContinue = "listOptionsContinue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \"next key\".  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
    try {
      StreamResultOfWorkflowWatchEvent result = apiInstance.watchWorkflows(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowServiceApi#watchWorkflows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **listOptionsLabelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. +optional. | [optional]
 **listOptionsFieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. +optional. | [optional]
 **listOptionsWatch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. +optional. | [optional]
 **listOptionsAllowWatchBookmarks** | **Boolean**| allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored. +optional. | [optional]
 **listOptionsResourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. +optional. | [optional]
 **listOptionsTimeoutSeconds** | **String**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. +optional. | [optional]
 **listOptionsLimit** | **String**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
 **listOptionsContinue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]

### Return type

[**StreamResultOfWorkflowWatchEvent**](StreamResultOfWorkflowWatchEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |

