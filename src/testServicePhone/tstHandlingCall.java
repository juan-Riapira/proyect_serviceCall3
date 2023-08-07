package testServicePhone;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import model.CellPlan;
import model.Phone;
import model.ServicePhone;
import presenter.HandlingCalls;

class tstHandlingCall {

	CellPlan planOne;
	
	Phone phoneOne;
	Phone phonetwo;
	Phone phonethree;
	

	public void setUp() {
	planOne= new CellPlan("plan1",45);	
		phoneOne = new Phone(planOne, "IMEI-12345", "310314840", LocalDate.of(2003, 12, 7));
        phonetwo = new Phone(planOne, "IMEI-67890", "310314841", LocalDate.of(2004, 1, 15));
        phonethree = new Phone(planOne, "IMEI-98765", "310314842", LocalDate.of(2005, 5, 22));
	}
	@Test
	void testAddPhone() {
		setUp();
		HandlingCalls handlingCall= new HandlingCalls();
		}

	@Test
	void testFindPhone() {
		fail("Not yet implemented");
	}

}
