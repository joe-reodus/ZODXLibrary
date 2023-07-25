import com.zoho.zodxlibrary.models.ZODXMeta
import kotlinx.serialization.json.*

class PermissionApi{
    fun isSelfModerartor(zaaid:String): Boolean{
        val appsArray = ZODXMeta.getPermission()?.get("apps")?.jsonArray
        val jsonZaaid= buildJsonObject { put("zaaid", zaaid) }
        val foundApp= appsArray?.find { app ->
            app.jsonObject["zaaid"] == jsonZaaid["zaaid"]
        }
        val appData = {};
        return isActiveModerator(foundApp)
    }
    private fun isActiveModerator(foundApp: JsonElement?): Boolean{
        return (foundApp!!.jsonObject["is_active"]?.jsonPrimitive?.boolean == true && foundApp.jsonObject["zarid"]?.jsonPrimitive?.content=="moderator")
    }
}