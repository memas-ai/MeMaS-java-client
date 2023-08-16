/*
 * MeMaS DP APIs
 * This is the Data Plane APIs for MeMaS (Memory Management Service).
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: max.yu@memas.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.memas.memas_client.api;

import ai.memas.memas_client.invoker.ApiCallback;
import ai.memas.memas_client.invoker.ApiClient;
import ai.memas.memas_client.invoker.ApiException;
import ai.memas.memas_client.invoker.ApiResponse;
import ai.memas.memas_client.invoker.Configuration;
import ai.memas.memas_client.invoker.Pair;
import ai.memas.memas_client.invoker.ProgressRequestBody;
import ai.memas.memas_client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ai.memas.memas_client.model.CitedDocument;
import ai.memas.memas_client.model.RecollectRequest;
import ai.memas.memas_client.model.Remember200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DpApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DpApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DpApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for recollect
     * @param recollectRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call recollectCall(RecollectRequest recollectRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = recollectRequest;

        // create path and map variables
        String localVarPath = "/dp/recollect";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call recollectValidateBeforeCall(RecollectRequest recollectRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'recollectRequest' is set
        if (recollectRequest == null) {
            throw new ApiException("Missing the required parameter 'recollectRequest' when calling recollect(Async)");
        }

        return recollectCall(recollectRequest, _callback);

    }

    /**
     * Recollects
     * 
     * @param recollectRequest  (required)
     * @return List&lt;CitedDocument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public List<CitedDocument> recollect(RecollectRequest recollectRequest) throws ApiException {
        ApiResponse<List<CitedDocument>> localVarResp = recollectWithHttpInfo(recollectRequest);
        return localVarResp.getData();
    }

    /**
     * Recollects
     * 
     * @param recollectRequest  (required)
     * @return ApiResponse&lt;List&lt;CitedDocument&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CitedDocument>> recollectWithHttpInfo(RecollectRequest recollectRequest) throws ApiException {
        okhttp3.Call localVarCall = recollectValidateBeforeCall(recollectRequest, null);
        Type localVarReturnType = new TypeToken<List<CitedDocument>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Recollects (asynchronously)
     * 
     * @param recollectRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call recollectAsync(RecollectRequest recollectRequest, final ApiCallback<List<CitedDocument>> _callback) throws ApiException {

        okhttp3.Call localVarCall = recollectValidateBeforeCall(recollectRequest, _callback);
        Type localVarReturnType = new TypeToken<List<CitedDocument>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for remember
     * @param citedDocument Remember the following information (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call rememberCall(CitedDocument citedDocument, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = citedDocument;

        // create path and map variables
        String localVarPath = "/dp/remember";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call rememberValidateBeforeCall(CitedDocument citedDocument, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'citedDocument' is set
        if (citedDocument == null) {
            throw new ApiException("Missing the required parameter 'citedDocument' when calling remember(Async)");
        }

        return rememberCall(citedDocument, _callback);

    }

    /**
     * Memorize information
     * Memorize information
     * @param citedDocument Remember the following information (required)
     * @return Remember200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Operation </td><td>  -  </td></tr>
     </table>
     */
    public Remember200Response remember(CitedDocument citedDocument) throws ApiException {
        ApiResponse<Remember200Response> localVarResp = rememberWithHttpInfo(citedDocument);
        return localVarResp.getData();
    }

    /**
     * Memorize information
     * Memorize information
     * @param citedDocument Remember the following information (required)
     * @return ApiResponse&lt;Remember200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Remember200Response> rememberWithHttpInfo(CitedDocument citedDocument) throws ApiException {
        okhttp3.Call localVarCall = rememberValidateBeforeCall(citedDocument, null);
        Type localVarReturnType = new TypeToken<Remember200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Memorize information (asynchronously)
     * Memorize information
     * @param citedDocument Remember the following information (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call rememberAsync(CitedDocument citedDocument, final ApiCallback<Remember200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = rememberValidateBeforeCall(citedDocument, _callback);
        Type localVarReturnType = new TypeToken<Remember200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
