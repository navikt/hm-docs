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

import no.nav.hjelpemidler.domain.models.KontaktPerson
import no.nav.hjelpemidler.domain.models.Leveringsmaate

import com.squareup.moshi.Json

/**
 * 
 * @param kontaktPerson 
 * @param leveringsmaate 
 * @param adresse 
 * @param merknad 
 */

data class Levering (
    @Json(name = "kontaktPerson")
    val kontaktPerson: KontaktPerson,
    @Json(name = "leveringsmaate")
    val leveringsmaate: Leveringsmaate,
    @Json(name = "adresse")
    val adresse: kotlin.String? = null,
    @Json(name = "merknad")
    val merknad: kotlin.String? = null
)

