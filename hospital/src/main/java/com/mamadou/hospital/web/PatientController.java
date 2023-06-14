package com.mamadou.hospital.web;

import com.mamadou.hospital.entities.Patient;
import com.mamadou.hospital.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller @AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name = "page" , defaultValue="0") int p,
                        @RequestParam(name = "size", defaultValue = "4") int s
                        ){
        Page<Patient> patientList = patientRepository.findAll(PageRequest.of(p,s));
        model.addAttribute("listPatients",patientList.getContent());
        model.addAttribute("pages",new int[patientList.getTotalPages()]);
        return "patients";
    }
}
