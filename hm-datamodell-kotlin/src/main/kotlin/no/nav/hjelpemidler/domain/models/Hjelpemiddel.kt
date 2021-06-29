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

import no.nav.hjelpemidler.domain.models.HjelpemiddelRullestolInfo
import no.nav.hjelpemidler.domain.models.HjelpemiddelVilkar
import no.nav.hjelpemidler.domain.models.Tilbehor

import com.squareup.moshi.Json

/**
 * 
 * @param antall 
 * @param beskrivelse 
 * @param hjelpemiddelkategori 
 * @param hmsNr 
 * @param tilleggsinformasjon 
 * @param utlevertFraHjelpemiddelsentralen 
 * @param rangering 
 * @param vilkarliste 
 * @param tilbehorListe 
 * @param begrunnelse 
 * @param kanIkkeTilsvarande 
 * @param navn 
 * @param rullestolInfo 
 */

data class Hjelpemiddel (
    @Json(name = "antall")
    val antall: kotlin.Int,
    @Json(name = "beskrivelse")
    val beskrivelse: kotlin.String,
    @Json(name = "hjelpemiddelkategori")
    val hjelpemiddelkategori: kotlin.String,
    @Json(name = "hmsNr")
    val hmsNr: kotlin.String,
    @Json(name = "tilleggsinformasjon")
    val tilleggsinformasjon: kotlin.String,
    @Json(name = "utlevertFraHjelpemiddelsentralen")
    val utlevertFraHjelpemiddelsentralen: kotlin.Boolean,
    @Json(name = "rangering")
    val rangering: kotlin.String? = null,
    @Json(name = "vilkarliste")
    val vilkarliste: kotlin.collections.List<HjelpemiddelVilkar>? = null,
    @Json(name = "tilbehorListe")
    val tilbehorListe: kotlin.collections.List<Tilbehor>? = null,
    @Json(name = "begrunnelse")
    val begrunnelse: kotlin.String? = null,
    @Json(name = "kanIkkeTilsvarande")
    val kanIkkeTilsvarande: kotlin.Boolean? = null,
    @Json(name = "navn")
    val navn: kotlin.String? = null,
    @Json(name = "rullestolInfo")
    val rullestolInfo: HjelpemiddelRullestolInfo? = null
)

