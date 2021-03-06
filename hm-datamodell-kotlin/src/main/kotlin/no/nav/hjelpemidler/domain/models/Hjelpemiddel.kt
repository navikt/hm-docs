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

import no.nav.hjelpemidler.domain.models.HjelpemiddelVilkar
import no.nav.hjelpemidler.domain.models.Tilbehor
import no.nav.hjelpemidler.domain.models.Tilleggsinfo
import no.nav.hjelpemidler.domain.models.UtlevertInfo

import com.squareup.moshi.Json

/**
 * 
 * @param antall 
 * @param beskrivelse 
 * @param hjelpemiddelkategori 
 * @param hmsNr 
 * @param utlevertFraHjelpemiddelsentralen 
 * @param navn 
 * @param rangering 
 * @param utlevertInfo 
 * @param vilkarliste 
 * @param tilbehorListe 
 * @param tilleggsinfo 
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
    @Json(name = "utlevertFraHjelpemiddelsentralen")
    val utlevertFraHjelpemiddelsentralen: kotlin.Boolean,
    @Json(name = "navn")
    val navn: kotlin.String? = null,
    @Json(name = "rangering")
    val rangering: kotlin.String? = null,
    @Json(name = "utlevertInfo")
    val utlevertInfo: UtlevertInfo? = null,
    @Json(name = "vilkarliste")
    val vilkarliste: kotlin.collections.List<HjelpemiddelVilkar>? = null,
    @Json(name = "tilbehorListe")
    val tilbehorListe: kotlin.collections.List<Tilbehor>? = null,
    @Json(name = "tilleggsinfo")
    val tilleggsinfo: kotlin.collections.List<Tilleggsinfo>? = null
)

