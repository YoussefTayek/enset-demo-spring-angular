package net.youssfi.enset_demo_spring_angular;

import net.youssfi.enset_demo_spring_angular.entities.Payment;
import net.youssfi.enset_demo_spring_angular.entities.PaymentStatus;
import net.youssfi.enset_demo_spring_angular.entities.PaymentType;
import net.youssfi.enset_demo_spring_angular.entities.Student;
import net.youssfi.enset_demo_spring_angular.repository.PaymentRepository;
import net.youssfi.enset_demo_spring_angular.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class EnsetDemoSpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnsetDemoSpringAngularApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository,
										PaymentRepository paymentRepository){
		return  args -> {
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
					.firstName("Mohamed").lastName("Youssfi").code("112233").programId("SDIA").build());
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
					.firstName("Imane").lastName("Alexandre").code("112244").programId("SDIA").build());
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
					.firstName("Yasmine").lastName("Fleron").code("112255").programId("GLSID").build());
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
					.firstName("Najat").lastName("Karbouch").code("112266").programId("BDCC").build());
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
					.firstName("Fouzia").lastName("Tayek").code("112277").programId("GLSID").build());
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
					.firstName("Axelle").lastName("Bernard").code("112288").programId("SDIA").build());
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
					.firstName("Sofia").lastName("Tamim").code("112299").programId("BDCC").build());
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
					.firstName("Bernadette").lastName("Souki").code("112222").programId("BDCC").build());

			PaymentType[] paymentTypes = PaymentType.values();
			Random random = new Random();
			studentRepository.findAll().forEach(st->{
				for (int i = 0; i < 10; i++) {
					int index = random.nextInt(paymentTypes.length);
					Payment payment = Payment.builder()
							.amount(1000+(int)(Math.random()*20000))
							.type(paymentTypes[index])
							.status(PaymentStatus.CREATED)
							.date(LocalDate.now())
							.student(st)
							.build();
					paymentRepository.save(payment);
				}
			});
		};
	}
}
