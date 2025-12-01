package cu.apkuba.sdk.license.models


data class AccountData(
    val username: String?,
    val deviceId: String?,
    val accessToken: String?,
    val code: String?
) {
    override fun toString(): String {
        return "ApklisAccountData(" +
                "username='$username', " +
                "deviceId='${if (deviceId != null) "***" else "null"}', " +
                "accessToken='${if (accessToken != null) "***" else "null"}', " +
                "code='${if (code != null) "***" else "null"}')"
    }
}