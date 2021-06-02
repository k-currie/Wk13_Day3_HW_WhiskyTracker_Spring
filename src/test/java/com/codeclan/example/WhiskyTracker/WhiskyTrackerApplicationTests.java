package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WhiskyTrackerApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	void canCreateNewDistilleryAndWhiskey() {
//		Distillery distillery1 = new Distillery("Glendronach", "Highland");
//		distilleryRepository.save(distillery1);
//
//		Whisky whisky1 = new Whisky("The Glendronach Revival", 15, 2018, distillery1);
//		whiskyRepository.save(whisky1);
//	}
//
//	@Test
//	void canAddWhiskyToDistillery(){
//		Distillery distillery1 = new Distillery("Glendronach", "Highland");
//		distilleryRepository.save(distillery1);
//
//		Whisky whisky1 = new Whisky("The Glendronach Revival", 15, 2018, distillery1);
//		whiskyRepository.save(whisky1);
//
//		distillery1.addWhisky(whisky1);
//		distilleryRepository.save(distillery1); // save is a built in function in repository
//
//		assertEquals(1, distilleryRepository.get)
//	}

//	@Test
//	void canFindWhiskysWithAge12Years() {
//		List<Whisky> foundWhiskys = whiskyRepository.findByAge(12);
//		assertEquals(2, foundWhiskys.size());
//	}
}
