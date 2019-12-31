package com.sabo10.kotlin.todo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Task(

    @Id
    @GeneratedValue
    val id: Long? = null,
    val content: String? = null

)