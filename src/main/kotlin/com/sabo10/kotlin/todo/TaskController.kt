package com.sabo10.kotlin.todo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/todo")
class TaskController(private val taskService: TaskService){

    @GetMapping
    fun index(model: Model): String{
        println("index")
        model.addAttribute("todo", taskService.findAll())
        return "todo/index"
    }

    @GetMapping("new")
    fun newTask(): String{
        println("newTask")
        return "todo/new"
    }

    @GetMapping("{id}/edit")
    fun edit(@PathVariable id: Long, model: Model ): String{
        println("edit")
        model.addAttribute("task", taskService.findOne(id))
        return "todo/edit"
    }

    @GetMapping("{id}")
    fun show(@PathVariable id: Long, model: Model ): String{
        println("show")
        model.addAttribute("task", taskService.findOne(id))
        return "todo/show"
    }

    @PostMapping
    fun create(@ModelAttribute task: Task): String {
        println("create")
        taskService.save(task)
        return "redirect:/todo"
    }

    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @ModelAttribute task: Task): String {
        println("update")
        taskService.save(task.copy(id = id))
        return "redirect:/todo"
    }

    @DeleteMapping("{id}")
    fun destroy(@PathVariable id: Long): String {
        println("destroy")
        taskService.delete(id)
        return "redirect:/todo"
    }


}