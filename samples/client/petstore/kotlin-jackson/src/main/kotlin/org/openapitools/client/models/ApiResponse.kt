/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Describes the result of uploading an image resource
 * @param code 
 * @param type 
 * @param message 
 */

data class ApiResponse (
    @field:JsonProperty("code")
    val code: kotlin.Int? = null,
    @field:JsonProperty("type")
    val type: kotlin.String? = null,
    @field:JsonProperty("message")
    val message: kotlin.String? = null
)

