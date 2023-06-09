package com.example.demoexample;

import com.example.demoexample.entity.Client;
import com.example.demoexample.entity.Doctor;
import com.example.demoexample.repository.ClientRepository;
import com.example.demoexample.repository.DoctorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoexampleApplication {

/*	@Bean
	public void createClient(ClientRepository cr){
		cr.save(new Client(null, "Siledjie", "Landry", "Master"));
	}
	public void createDoc(DoctorRepository dr){
		dr.save(new Doctor(null, "Moyo", "General"));
	}	*/
	public static void main(String[] args) {
		SpringApplication.run(DemoexampleApplication.class, args);
	}
	@Bean
	CommandLineRunner cmdR(ClientRepository cr, DoctorRepository dr){
		return args -> {
			cr.save( new Client(null, "Djoum", "Wilfried", "Andre Brink"));
			dr.save( new Doctor(null, "Jean", "Nzoa"));
		};
	}


}

