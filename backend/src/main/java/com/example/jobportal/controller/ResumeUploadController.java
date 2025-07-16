package com.example.jobportal.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/upload")
public class ResumeUploadController {
    @PostMapping("/resume")
    public String upload() { return "Uploaded"; }
}