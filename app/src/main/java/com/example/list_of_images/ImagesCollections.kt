package com.example.list_of_images

import kotlin.random.Random

data class Picture (
    val id: Int,
    val author: String,
    val url: String
)

object ImagesCollections {

    fun generateSamplePictures(): List<Picture> {
        return listOf(
            Picture(1, "Vincent van Gogh", "https://picsum.photos/seed/van-gogh/400/300"),
            Picture(2, "Pablo Picasso", "https://picsum.photos/seed/picasso/400/300"),
            Picture(3, "Claude Monet", "https://picsum.photos/seed/monet/400/300"),
            Picture(4, "Leonardo da Vinci", "https://picsum.photos/seed/leonardo/400/300"),
            Picture(5, "Salvador Dali", "https://picsum.photos/seed/dali/400/300"),
            Picture(6, "Frida Kahlo", "https://picsum.photos/seed/frida/400/300"),
            Picture(7, "Andy Warhol", "https://picsum.photos/seed/warhol/400/300")
        )
    }

    fun generateNewPicture(): Picture {
        val id = Random.nextInt(8, 1000)
        val authors = listOf(
            "Vincent van Gogh",
            "Pablo Picasso",
            "Claude Monet",
            "Leonardo da Vinci",
            "Salvador Dali",
            "Frida Kahlo",
            "Andy Warhol"
        )
        val imageUrls = listOf(
            "https://picsum.photos/seed/art1/400/300",
            "https://picsum.photos/seed/art2/400/300",
            "https://picsum.photos/seed/art3/400/300",
            "https://picsum.photos/seed/art4/400/300",
            "https://picsum.photos/seed/art5/400/300",
            "https://picsum.photos/seed/art6/400/300",
            "https://picsum.photos/seed/art7/400/300"
        )
        return Picture(
            id = id,
            author = authors.random(),
            url = imageUrls.random()
        )
    }
}
