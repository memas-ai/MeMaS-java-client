# DpApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**recollect**](DpApi.md#recollect) | **POST** /dp/recollect | Recollects |
| [**remember**](DpApi.md#remember) | **POST** /dp/remember | Memorize information |


<a id="recollect"></a>
# **recollect**
> List&lt;CitedDocument&gt; recollect(recollectRequest)

Recollects



### Example
```java
// Import classes:
import ai.memas.memasclient.invoker.ApiClient;
import ai.memas.memasclient.invoker.ApiException;
import ai.memas.memasclient.invoker.Configuration;
import ai.memas.memasclient.invoker.models.*;
import ai.memas.memasclient.api.DpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DpApi apiInstance = new DpApi(defaultClient);
    RecollectRequest recollectRequest = new RecollectRequest(); // RecollectRequest | 
    try {
      List<CitedDocument> result = apiInstance.recollect(recollectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DpApi#recollect");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recollectRequest** | [**RecollectRequest**](RecollectRequest.md)|  | |

### Return type

[**List&lt;CitedDocument&gt;**](CitedDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a id="remember"></a>
# **remember**
> Remember200Response remember(rememberRequest)

Memorize information

Memorize information

### Example
```java
// Import classes:
import ai.memas.memasclient.invoker.ApiClient;
import ai.memas.memasclient.invoker.ApiException;
import ai.memas.memasclient.invoker.Configuration;
import ai.memas.memasclient.invoker.models.*;
import ai.memas.memasclient.api.DpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DpApi apiInstance = new DpApi(defaultClient);
    RememberRequest rememberRequest = new RememberRequest(); // RememberRequest | Request object for remembering a document
    try {
      Remember200Response result = apiInstance.remember(rememberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DpApi#remember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rememberRequest** | [**RememberRequest**](RememberRequest.md)| Request object for remembering a document | |

### Return type

[**Remember200Response**](Remember200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |

