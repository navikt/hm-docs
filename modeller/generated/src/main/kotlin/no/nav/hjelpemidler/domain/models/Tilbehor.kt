/**
* Hjelpemiddel søknad model spec
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package no.nav.hjelpemidler.domain.models


import com.squareup.moshi.Json

/**
 * 
 * @param hmsnr 
 * @param antall 
 * @param navn 
 */

data class Tilbehor (
    @Json(name = "hmsnr")
    val hmsnr: kotlin.String,
    @Json(name = "antall")
    val antall: kotlin.Int,
    @Json(name = "navn")
    val navn: kotlin.String
)

