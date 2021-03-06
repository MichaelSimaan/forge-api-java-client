/*
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. Take advantage of Autodesk’s expertise in design and engineering.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: forge.help@autodesk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
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


package com.autodesk.client.model;

import java.util.Objects;

import com.autodesk.client.model.BaseAttributesCreatedUpdated;
import com.autodesk.client.model.ItemAttributes;
import com.autodesk.client.model.ItemRelationships;
import com.autodesk.client.model.JsonApiDocument;
import com.autodesk.client.model.JsonApiLinks;
import com.autodesk.client.model.JsonApiMeta;
import com.autodesk.client.model.JsonApiResource;
import com.autodesk.client.model.JsonApiVersionJsonapi;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Item
 */

public class Item   {
  @JsonProperty("jsonapi")
  private JsonApiVersionJsonapi jsonapi = null;

  @JsonProperty("data")
  private JsonApiResource data = null;

  @JsonProperty("included")
  private List<JsonApiResource> included = new ArrayList<JsonApiResource>();

  @JsonProperty("links")
  private JsonApiLinks links = null;

  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ITEMS("items");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("attributes")
  private ItemAttributes attributes = null;

  @JsonProperty("meta")
  private JsonApiMeta meta = null;

  @JsonProperty("relationships")
  private ItemRelationships relationships = null;

  public Item jsonapi(JsonApiVersionJsonapi jsonapi) {
    this.jsonapi = jsonapi;
    return this;
  }

   /**
   * Get jsonapi
   * @return jsonapi
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiVersionJsonapi getJsonapi() {
    return jsonapi;
  }

  public void setJsonapi(JsonApiVersionJsonapi jsonapi) {
    this.jsonapi = jsonapi;
  }

  public Item data(JsonApiResource data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public JsonApiResource getData() {
    return data;
  }

  public void setData(JsonApiResource data) {
    this.data = data;
  }

  public Item included(List<JsonApiResource> included) {
    this.included = included;
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<JsonApiResource> getIncluded() {
    return included;
  }

  public void setIncluded(List<JsonApiResource> included) {
    this.included = included;
  }

  public Item links(JsonApiLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public JsonApiLinks getLinks() {
    return links;
  }

  public void setLinks(JsonApiLinks links) {
    this.links = links;
  }

  public Item id(String id) {
    this.id = id;
    return this;
  }

   /**
   * resource id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "resource id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Item type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Item attributes(ItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(example = "null", value = "")
  public ItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributes attributes) {
    this.attributes = attributes;
  }

  public Item meta(JsonApiMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiMeta getMeta() {
    return meta;
  }

  public void setMeta(JsonApiMeta meta) {
    this.meta = meta;
  }

  public Item relationships(ItemRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(example = "null", value = "")
  public ItemRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(ItemRelationships relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.jsonapi, item.jsonapi) &&
        Objects.equals(this.data, item.data) &&
        Objects.equals(this.included, item.included) &&
        Objects.equals(this.links, item.links) &&
        Objects.equals(this.id, item.id) &&
        Objects.equals(this.type, item.type) &&
        Objects.equals(this.attributes, item.attributes) &&
        Objects.equals(this.meta, item.meta) &&
        Objects.equals(this.relationships, item.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonapi, data, included, links, id, type, attributes, meta, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    jsonapi: ").append(toIndentedString(jsonapi)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

