package ru.netology.coroutines.dto

import Post

data class PostWithAuthorAndComments(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor>
)