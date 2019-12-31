package com.sabo10.kotlin.todo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


//ToDo Create only Get Post to support Browser.
//ToDo migrate DB to MySQL.
@SpringBootApplication
class TodoApplication

fun main(args: Array<String>) {
	runApplication<TodoApplication>(*args)
}
