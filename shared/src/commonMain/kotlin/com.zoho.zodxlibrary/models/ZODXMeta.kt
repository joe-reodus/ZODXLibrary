package com.zoho.zodxlibrary.models
import ZODUser
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject

class ZODXMeta {
    companion object {
        // Private properties to store JSON objects
        private var permission: JsonObject? = null
        private var serviceInfo: JsonObject? = null
        private var widgetProperties: JsonObject? = null
        private var currentUser: ZODUser?=null

        fun getPermission(): JsonObject? {
            return permission
        }
        fun getServiceInfo(): JsonObject? {
            return serviceInfo
        }

        fun getwidgetProperties(): JsonObject? {
            return widgetProperties
        }

        fun setPermission(permission: JsonObject) {
            this.permission = permission
        }

        fun setServiceInfo(serviceInfo: JsonObject) {
            this.serviceInfo = serviceInfo
        }
        fun setWidgetProperties(widgetProperties: JsonObject) {
            this.widgetProperties = widgetProperties
        }
        fun setCurrentUser(user: JsonObject) {
            val jsonParser = Json {
                ignoreUnknownKeys = true
            }
            currentUser = jsonParser.decodeFromString<ZODUser>(user.toString())
        }
        fun getCurrentUser():ZODUser?{
            return currentUser
        }
    }
}