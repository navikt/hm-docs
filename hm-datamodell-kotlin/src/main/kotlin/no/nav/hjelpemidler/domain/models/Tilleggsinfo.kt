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
 * @param key 
 * @param values JSON med eventuelle verdier f.eks. begrunnelse for KAN_IKKE_HA_TILSVARENDE_BEGRUNNELSE.
 */

data class Tilleggsinfo (
    @Json(name = "key")
    val key: Tilleggsinfo.Key,
    /* JSON med eventuelle verdier f.eks. begrunnelse for KAN_IKKE_HA_TILSVARENDE_BEGRUNNELSE. */
    @Json(name = "values")
    val values: kotlin.String? = null
) {

    /**
     * 
     * Values: RULLESTOL_SKAL_BRUKES_I_BIL,SITTEPUTEVALG_STANDARD_SITTEPUTE,SITTEPUTEVALG_LEGGES_TIL_SEPARAT,SITTEPUTEVALG_HAR_FRA_FOR,SITTEPUTEVALG_TRENGER_SITTEPUTE,LAVERE_RANGERING_BEGRUNNELSE,KAN_IKKE_HA_TILSVARENDE_BEGRUNNELSE,ANNEN_KOMMENTAR
     */
    enum class Key(val value: kotlin.String) {
        @Json(name = "RULLESTOL_SKAL_BRUKES_I_BIL") RULLESTOL_SKAL_BRUKES_I_BIL("RULLESTOL_SKAL_BRUKES_I_BIL"),
        @Json(name = "SITTEPUTEVALG_STANDARD_SITTEPUTE") SITTEPUTEVALG_STANDARD_SITTEPUTE("SITTEPUTEVALG_STANDARD_SITTEPUTE"),
        @Json(name = "SITTEPUTEVALG_LEGGES_TIL_SEPARAT") SITTEPUTEVALG_LEGGES_TIL_SEPARAT("SITTEPUTEVALG_LEGGES_TIL_SEPARAT"),
        @Json(name = "SITTEPUTEVALG_HAR_FRA_FOR") SITTEPUTEVALG_HAR_FRA_FOR("SITTEPUTEVALG_HAR_FRA_FOR"),
        @Json(name = "SITTEPUTEVALG_TRENGER_SITTEPUTE") SITTEPUTEVALG_TRENGER_SITTEPUTE("SITTEPUTEVALG_TRENGER_SITTEPUTE"),
        @Json(name = "LAVERE_RANGERING_BEGRUNNELSE") LAVERE_RANGERING_BEGRUNNELSE("LAVERE_RANGERING_BEGRUNNELSE"),
        @Json(name = "KAN_IKKE_HA_TILSVARENDE_BEGRUNNELSE") KAN_IKKE_HA_TILSVARENDE_BEGRUNNELSE("KAN_IKKE_HA_TILSVARENDE_BEGRUNNELSE"),
        @Json(name = "ANNEN_KOMMENTAR") ANNEN_KOMMENTAR("ANNEN_KOMMENTAR");
    }
}

