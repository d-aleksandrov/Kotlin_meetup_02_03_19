package sample.optional

fun User.photoURL2(size: ImageSize = ImageSizes.middle): String? =
    (photoObject?.id ?: photoID)?.let { photoID ->
        "${Constants.baseImagePath}$photoID$size"
    }

fun User.photoURL(size: ImageSize = ImageSizes.middle): String? {
    val photoID = photoObject?.id
        ?: photoID
        ?: return null

    return "${Constants.baseImagePath}$photoID$size"
}

fun User.simpleName(): String = name ?: "User#$id"

fun User.displayedName(): String =
    nickName
        ?: name?.let {
            lastName?.let { "$name$lastName" }
                ?: name
        } ?: eMail
        ?: id

fun User.displayedName2(): String {
    if (nickName != null) return nickName

    name?.let {
        return lastName?.let { "$name$lastName" }
            ?: name
    }
    return eMail ?: id
}

fun User.displayedName22(): String {
    if (nickName != null) return nickName

    if (name != null) {
        return if (lastName != null)
            "$name$lastName"
        else
            name
    }

    eMail?.let { return eMail }

    return id
}


fun User.displayedName3(): String = when {
    nickName != null -> nickName
    name != null && lastName != null -> "$name$lastName"
    name != null -> name
    else -> eMail ?: id
}




