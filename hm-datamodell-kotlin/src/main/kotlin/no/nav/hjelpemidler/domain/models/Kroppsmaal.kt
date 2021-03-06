/**
* Hjelpemiddelsøknad model spec
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
 * @param setebredde 
 * @param laarlengde 
 * @param legglengde 
 * @param hoyde 
 * @param kroppsvekt 
 */

data class Kroppsmaal (
    @Json(name = "setebredde")
    val setebredde: kotlin.Int? = null,
    @Json(name = "laarlengde")
    val laarlengde: kotlin.Int? = null,
    @Json(name = "legglengde")
    val legglengde: kotlin.Int? = null,
    @Json(name = "hoyde")
    val hoyde: kotlin.Int? = null,
    @Json(name = "kroppsvekt")
    val kroppsvekt: kotlin.Int? = null
)

