/**
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. From visualizing data to 3D printing, take advantage of Autodesk’s expertise in design and engineering.
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
import com.autodesk.client.model.MeshGeom;
import com.autodesk.client.model.MeshProblems;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Mesh
 */

public class Mesh   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("file_id")
  private String fileId = null;

  @JsonProperty("visual_file_id")
  private String visualFileId = null;

  @JsonProperty("geom")
  private MeshGeom geom = null;

  @JsonProperty("transform")
  private List<List<Integer>> transform = new ArrayList<List<Integer>>();

  @JsonProperty("analyzed")
  private Boolean analyzed = null;

  @JsonProperty("problems")
  private List<MeshProblems> problems = new ArrayList<MeshProblems>();

  public Mesh id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Mesh name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Mesh fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * Get fileId
   * @return fileId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public Mesh visualFileId(String visualFileId) {
    this.visualFileId = visualFileId;
    return this;
  }

   /**
   * Get visualFileId
   * @return visualFileId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVisualFileId() {
    return visualFileId;
  }

  public void setVisualFileId(String visualFileId) {
    this.visualFileId = visualFileId;
  }

  public Mesh geom(MeshGeom geom) {
    this.geom = geom;
    return this;
  }

   /**
   * Get geom
   * @return geom
  **/
  @ApiModelProperty(example = "null", value = "")
  public MeshGeom getGeom() {
    return geom;
  }

  public void setGeom(MeshGeom geom) {
    this.geom = geom;
  }

  public Mesh transform(List<List<Integer>> transform) {
    this.transform = transform;
    return this;
  }

   /**
   * Get transform
   * @return transform
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<List<Integer>> getTransform() {
    return transform;
  }

  public void setTransform(List<List<Integer>> transform) {
    this.transform = transform;
  }

  public Mesh analyzed(Boolean analyzed) {
    this.analyzed = analyzed;
    return this;
  }

   /**
   * Get analyzed
   * @return analyzed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAnalyzed() {
    return analyzed;
  }

  public void setAnalyzed(Boolean analyzed) {
    this.analyzed = analyzed;
  }

  public Mesh problems(List<MeshProblems> problems) {
    this.problems = problems;
    return this;
  }

   /**
   * Get problems
   * @return problems
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MeshProblems> getProblems() {
    return problems;
  }

  public void setProblems(List<MeshProblems> problems) {
    this.problems = problems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mesh mesh = (Mesh) o;
    return Objects.equals(this.id, mesh.id) &&
        Objects.equals(this.name, mesh.name) &&
        Objects.equals(this.fileId, mesh.fileId) &&
        Objects.equals(this.visualFileId, mesh.visualFileId) &&
        Objects.equals(this.geom, mesh.geom) &&
        Objects.equals(this.transform, mesh.transform) &&
        Objects.equals(this.analyzed, mesh.analyzed) &&
        Objects.equals(this.problems, mesh.problems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fileId, visualFileId, geom, transform, analyzed, problems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mesh {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    visualFileId: ").append(toIndentedString(visualFileId)).append("\n");
    sb.append("    geom: ").append(toIndentedString(geom)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    analyzed: ").append(toIndentedString(analyzed)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
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

