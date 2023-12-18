# DpApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**memorize**](DpApi.md#memorize) | **POST** /dp/memorize | Memorize information |
| [**recall**](DpApi.md#recall) | **GET** /dp/recall | Recalls information |


<a id="memorize"></a>
# **memorize**
> Memorize200Response memorize(memorizeRequest)

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
    MemorizeRequest memorizeRequest = new MemorizeRequest(); // MemorizeRequest | 
    try {
      Memorize200Response result = apiInstance.memorize(memorizeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DpApi#memorize");
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
| **memorizeRequest** | [**MemorizeRequest**](MemorizeRequest.md)|  | |

### Return type

[**Memorize200Response**](Memorize200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Failed operation |  -  |

<a id="recall"></a>
# **recall**
> List&lt;CitedDocument&gt; recall(recallRequest)

Recalls information

Recalls relevant information related to the given clue

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
    RecallRequest recallRequest = new RecallRequest(); // RecallRequest | 
    try {
      List<CitedDocument> result = apiInstance.recall(recallRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DpApi#recall");
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
| **recallRequest** | [**RecallRequest**](RecallRequest.md)|  | |

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
| **400** | Failed operation |  -  |

