/*
 * MeMaS DP APIs
 * This is the Data Plane client for MeMaS (Memory Management Service).  See https://github.com/memas-ai/MeMaS for more details.
 *
 * The version of the OpenAPI document: 0.1.1
 * Contact: max.yu@memas.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.memas.memasclient.model;

import java.util.Objects;
import java.util.Arrays;
import ai.memas.memasclient.model.NamespaceDoesNotExistError;
import ai.memas.memasclient.model.NamespaceIllegalNameError;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import ai.memas.memasclient.invoker.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-17T16:04:35.398509042-08:00[America/Los_Angeles]")
public class Memorize400Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Memorize400Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Memorize400Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Memorize400Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NamespaceDoesNotExistError> adapterNamespaceDoesNotExistError = gson.getDelegateAdapter(this, TypeToken.get(NamespaceDoesNotExistError.class));
            final TypeAdapter<NamespaceIllegalNameError> adapterNamespaceIllegalNameError = gson.getDelegateAdapter(this, TypeToken.get(NamespaceIllegalNameError.class));

            return (TypeAdapter<T>) new TypeAdapter<Memorize400Response>() {
                @Override
                public void write(JsonWriter out, Memorize400Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `NamespaceDoesNotExistError`
                    if (value.getActualInstance() instanceof NamespaceDoesNotExistError) {
                        JsonObject obj = adapterNamespaceDoesNotExistError.toJsonTree((NamespaceDoesNotExistError)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `NamespaceIllegalNameError`
                    if (value.getActualInstance() instanceof NamespaceIllegalNameError) {
                        JsonObject obj = adapterNamespaceIllegalNameError.toJsonTree((NamespaceIllegalNameError)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: NamespaceDoesNotExistError, NamespaceIllegalNameError");
                }

                @Override
                public Memorize400Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize NamespaceDoesNotExistError
                    try {
                        // validate the JSON object to see if any exception is thrown
                        NamespaceDoesNotExistError.validateJsonObject(jsonObject);
                        actualAdapter = adapterNamespaceDoesNotExistError;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'NamespaceDoesNotExistError'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for NamespaceDoesNotExistError failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'NamespaceDoesNotExistError'", e);
                    }

                    // deserialize NamespaceIllegalNameError
                    try {
                        // validate the JSON object to see if any exception is thrown
                        NamespaceIllegalNameError.validateJsonObject(jsonObject);
                        actualAdapter = adapterNamespaceIllegalNameError;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'NamespaceIllegalNameError'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for NamespaceIllegalNameError failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'NamespaceIllegalNameError'", e);
                    }

                    if (match == 1) {
                        Memorize400Response ret = new Memorize400Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Memorize400Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public Memorize400Response() {
        super("oneOf", Boolean.FALSE);
    }

    public Memorize400Response(NamespaceDoesNotExistError o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Memorize400Response(NamespaceIllegalNameError o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("NamespaceDoesNotExistError", new GenericType<NamespaceDoesNotExistError>() {
        });
        schemas.put("NamespaceIllegalNameError", new GenericType<NamespaceIllegalNameError>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Memorize400Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * NamespaceDoesNotExistError, NamespaceIllegalNameError
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof NamespaceDoesNotExistError) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof NamespaceIllegalNameError) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be NamespaceDoesNotExistError, NamespaceIllegalNameError");
    }

    /**
     * Get the actual instance, which can be the following:
     * NamespaceDoesNotExistError, NamespaceIllegalNameError
     *
     * @return The actual instance (NamespaceDoesNotExistError, NamespaceIllegalNameError)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `NamespaceDoesNotExistError`. If the actual instance is not `NamespaceDoesNotExistError`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NamespaceDoesNotExistError`
     * @throws ClassCastException if the instance is not `NamespaceDoesNotExistError`
     */
    public NamespaceDoesNotExistError getNamespaceDoesNotExistError() throws ClassCastException {
        return (NamespaceDoesNotExistError)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NamespaceIllegalNameError`. If the actual instance is not `NamespaceIllegalNameError`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NamespaceIllegalNameError`
     * @throws ClassCastException if the instance is not `NamespaceIllegalNameError`
     */
    public NamespaceIllegalNameError getNamespaceIllegalNameError() throws ClassCastException {
        return (NamespaceIllegalNameError)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Memorize400Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with NamespaceDoesNotExistError
    try {
      NamespaceDoesNotExistError.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for NamespaceDoesNotExistError failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with NamespaceIllegalNameError
    try {
      NamespaceIllegalNameError.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for NamespaceIllegalNameError failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for Memorize400Response with oneOf schemas: NamespaceDoesNotExistError, NamespaceIllegalNameError. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of Memorize400Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Memorize400Response
  * @throws IOException if the JSON string is invalid with respect to Memorize400Response
  */
  public static Memorize400Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Memorize400Response.class);
  }

 /**
  * Convert an instance of Memorize400Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

