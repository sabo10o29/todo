package com.sabo10.kotlin.todo

import org.springframework.stereotype.Service

@Service
class TaskService(private val taskRepository: TaskRepository){

    fun findAll() = taskRepository.findAll()

    fun findOne(id: Long) = taskRepository.findById(id).orElse(null)

    fun save(task: Task) = taskRepository.save(task)

    fun delete(id: Long) = taskRepository.deleteById(id)

}