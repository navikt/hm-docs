/**
 * Hjelpemiddelsøknad model spec
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class Dummy {
    /**
    * used to trigger changes to model while debugging github actions
    */
    'dummy5'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "dummy5",
            "baseName": "dummy5",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Dummy.attributeTypeMap;
    }
    
    public constructor() {
    }
}
