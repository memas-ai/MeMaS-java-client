/*
 * MeMaS DP APIs
 * This is the Data Plane client for MeMaS (Memory Management Service).  See https://github.com/memas-ai/MeMaS for more details.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: max.yu@memas.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.memas.memasclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ai.memas.memasclient.invoker.JSON;

/**
 * RememberRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-20T02:18:29.780519497-07:00[America/Los_Angeles]")
public class RememberRequestAllOf {
  public static final String SERIALIZED_NAME_CORPUS_PATHNAME = "corpus_pathname";
  @SerializedName(SERIALIZED_NAME_CORPUS_PATHNAME)
  private String corpusPathname;

  public RememberRequestAllOf() {
  }

  public RememberRequestAllOf corpusPathname(String corpusPathname) {
    
    this.corpusPathname = corpusPathname;
    return this;
  }

   /**
   * Full name of a corpus, specifying which namespace the corpus is under.  The name takes on the format of \\\&quot;&lt;namespace_pathname&gt;:&lt;corpus_name&gt;\\\&quot;
   * @return corpusPathname
  **/
  @javax.annotation.Nullable
  public String getCorpusPathname() {
    return corpusPathname;
  }


  public void setCorpusPathname(String corpusPathname) {
    this.corpusPathname = corpusPathname;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RememberRequestAllOf rememberRequestAllOf = (RememberRequestAllOf) o;
    return Objects.equals(this.corpusPathname, rememberRequestAllOf.corpusPathname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corpusPathname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RememberRequestAllOf {\n");
    sb.append("    corpusPathname: ").append(toIndentedString(corpusPathname)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("corpus_pathname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RememberRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RememberRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RememberRequestAllOf is not found in the empty JSON string", RememberRequestAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RememberRequestAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RememberRequestAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("corpus_pathname") != null && !jsonObj.get("corpus_pathname").isJsonNull()) && !jsonObj.get("corpus_pathname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `corpus_pathname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("corpus_pathname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RememberRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RememberRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RememberRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RememberRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<RememberRequestAllOf>() {
           @Override
           public void write(JsonWriter out, RememberRequestAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RememberRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RememberRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RememberRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to RememberRequestAllOf
  */
  public static RememberRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RememberRequestAllOf.class);
  }

 /**
  * Convert an instance of RememberRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
