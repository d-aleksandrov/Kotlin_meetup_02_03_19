package sample.optional

object Constants {
    const val basePath = "http://awesome.site.dev/"
    const val baseImagePath = "$basePath/attachments/photo/"
}

class User {
    val id: String = ""
    val name: String? = null
    val lastName: String? = null
    val nickName: String? = null
    val eMail: String? = null

    val photoObject: PhotoObj? = null
    val photoID: String? = null

    class PhotoObj(val id: String, val name: String?)
}





