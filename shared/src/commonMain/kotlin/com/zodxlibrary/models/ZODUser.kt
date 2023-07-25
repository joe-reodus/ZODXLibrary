 data class ZODUser(
    val zuid: String,
    val display_name: String,
    val user_id: String,
    val user_type: String,
    val apps: List<ZODUserApp>? = null
) {

    internal fun isSelfModerator(zaaid: String) {
    }

    internal fun isSelfServiceAdmin(zaaid: String) {
    }
}
