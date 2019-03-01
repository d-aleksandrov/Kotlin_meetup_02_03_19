package sample.optional

typealias ImageSize = String

object ImageSizes {
    val mini = construct(64)
    val middle = construct(128)
    val large = construct(256)
    val full = construct(1024)

    private fun construct(size: Int): ImageSize = "/$size/$size"
}
