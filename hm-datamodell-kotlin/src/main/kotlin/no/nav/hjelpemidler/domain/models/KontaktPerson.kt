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

import no.nav.hjelpemidler.domain.models.KontaktpersonType

import com.squareup.moshi.Json

/**
 * 
 * @param kontaktpersonType 
 * @param navn 
 * @param telefon 
 */

data class KontaktPerson (
    @Json(name = "kontaktpersonType")
    val kontaktpersonType: KontaktpersonType,
    @Json(name = "navn")
    val navn: kotlin.String? = null,
    @Json(name = "telefon")
    val telefon: kotlin.String? = null
)

