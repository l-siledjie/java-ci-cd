package com.example.demoexample.controller;

import com.example.demoexample.entity.Doctor;
import com.example.demoexample.repository.DoctorRepository;
//import com.example.demoexample.services.ClientService;
import lombok.AllArgsConstructor;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@AllArgsConstructor
public class MedecinController {
      private DoctorRepository doctorRepository;
      @GetMapping("/indexD")
      public String showDoc(Model model){
       List<Doctor> doctors = doctorRepository.findAll() ;
       model.addAttribute("ListDocs", doctors);
       return "doctors";
      }


      @GetMapping("/delD/{id_doc}")
      public String deleteDoc(@PathVariable(value = "id_doc") long id_doc, Model model){
       doctorRepository.deleteById(id_doc);
       return "redirect:/indexD";
 }
}
