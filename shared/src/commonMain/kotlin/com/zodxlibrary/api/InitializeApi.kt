import com.zodxlibrary.models.ZODXMeta
import kotlinx.serialization.json.JsonObject

class InitializeApi {
    fun initialize(permissionJson: JsonObject, serviceInfoJson: JsonObject, widgetProepertiesJson: JsonObject,currentUserJson:JsonObject){
        ZODXMeta.setPermission(permissionJson)
        ZODXMeta.setServiceInfo(serviceInfoJson)
        ZODXMeta.setWidgetProperties(widgetProepertiesJson)
        ZODXMeta.setCurrentUser(currentUserJson)
    }
}