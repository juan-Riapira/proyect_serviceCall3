package testServicePhone;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import model.CellPlan;
import model.Phone;
import model.ServicePhone;

class test {
	
	
	CellPlan plan1 ;
	
	
	Phone phoneOne;
	Phone Phonetwo;
	Phone Phonethree;

	public void setUp() {
		plan1 = new CellPlan("pla 1",25);
		phoneOne = new Phone(plan1, "IMEI-12345", "310314840", LocalDate.of(2003, 12, 7));
        Phonetwo = new Phone(plan1, "IMEI-67890", "310314841", LocalDate.of(2004, 1, 15));
        Phonethree = new Phone(plan1, "IMEI-98765", "310314842", LocalDate.of(2005, 5, 22));

	}
	@Test
	void testFindPhone() {
		
		setUp();
		ServicePhone servicePhone = new ServicePhone();
		servicePhone.setPhoneOne(phoneOne);
		servicePhone.setPhoneTwo(Phonetwo);
		servicePhone.setPhoneThree(Phonethree);
		assertEquals(phoneOne,servicePhone.findPhone("IMEI-12345"));
	

}
	}
