package person;

/**
 * The Student class holds information about a student. 
 * 
 * - suid: Seattle U identification number
 * - status: the status of the student (see PersonStatus enum)
 * - student type: a student can only be assigned a single student type
 *   (see StudentType enum)
 * - student program: a student can only be assigned to a single program at 
 *   a point of time, but can switch from one program to another (i.e. when 
 *   they've graduated from a program (see StudentProgram enum)
 * - student year: only relevant for undergraduates (see StudentYear enum)
 * - faculty advisor: students are assigned a faculty advisor, but may switch 
 *   advisors (i.e. faculty leaves or on sabbatical); may not be assigned an
 *   advisor for a period of time when first enrolled as a student
 * - start term: associated with the quarter and year a student starts a
 *   particular program; for example, a single student may start the CERT in 
 *   RQ17 and then continue the MSCS in FQ18 (see Quarter enum)
 * - email: the school (i.e. SU) email address
 * 
 * @author 
 */
public class Student {

	/**
	 * 
	 * @param firstName	The first name of the student
	 * @param lastName	The last name of the student
	 */
	public Student(String firstName, String lastName) {
		
		// TODO: implement Student constructor
	
	}

	
	// TODO: add Student fields
	// SUID, status, student type, student program, start quarter/year, 
	// faculty advisor, email; if undergrad, also add student year
	// Note -- do not need to worry about registering students for courses;
	//         will implement this functionality during HW5

}
