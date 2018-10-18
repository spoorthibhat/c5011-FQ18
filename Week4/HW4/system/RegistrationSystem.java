package system;

import enums.Building;
import enums.FacultyType;
import enums.Quarter;
import enums.StudentType;
import enums.SubjectCode;
import exception.CourseNotFoundException;
import exception.DuplicateCourseException;
import exception.DuplicatePersonException;
import exception.DuplicateSubjectException;
import exception.PersonNotFoundException;

/**
 * The RegistrationSystem class stores information about the school, including
 * the ability to add students, add faculty, add courses, and add prerequisite(s).
 * 
 * @author ohsh
 */
public class RegistrationSystem {
	
	/**
	 * 
	 */
	public RegistrationSystem() { 
		
		// TODO: implement RegistrationSystem constructor
	
	}
	
	/**
	 * Add a student to the student list collection.
	 * 
	 * @param firstName	The first name of the student
	 * @param lastName	The last name of the student
	 * @param type		The student type
	 * @throws DuplicatePersonException The person is already in the system
	 */
	public void addStudent(String firstName, String lastName, 
							StudentType type) throws DuplicatePersonException {
		
		// TODO: implement addStudent method
	
	}
	
	/**
	 * Add a faculty to the faculty list collection.
	 * 
	 * @param firstName	The first name of the faculty
	 * @param lastName	The last name of the faculty
	 * @param type		The faculty type
	 * @throws DuplicatePersonException The person is already in the system
	 */
	public void addFaculty(String firstName, String lastName,
							FacultyType type) throws DuplicatePersonException {
		
		// TODO: implement addFaculty method
	
	}
	
	/**
	 * Adds a subject to the subject list collection.
	 * (hint: use a Pair instead of creating a class)
	 * 
	 * @param code	The subject code
	 * @param desc	The subject description
	 * @throws DuplicateSubjectException The subject is already in the system
	 */
	public void addSubject(SubjectCode code, String desc) 
							throws DuplicateSubjectException {
		
		// TODO: implement addSubject method
	
	}
	
	/**
	 * Adds a course to the course list collection.
	 * 
	 * @param code		The subject code of the course
	 * @param num		The course number of the course
	 * @param name		The course name
	 * @param creditNum	The number of the credits of the course
	 * @throws DuplicateCourseException	The course is already in the system 
	 */
	public void addCourse(SubjectCode code, int num, String name, 
							int creditNum) throws DuplicateCourseException {
		
		// TODO: implement addCourse method
	
	}
	
	/**
	 * Adds a prerequisite to an existing course in the course
	 * list collection.
	 * 
	 * @param code			The subject code of the course
	 * @param num			The course number of the course
	 * @param prereqCode	The subject code of the prerequisite
	 * 						to add to the course
	 * @param prereqNum		The course number of the prerequisite
	 * 						to add to the course
	 * @throws CourseNotFoundException The course was not found in the system
	 */
	public void addPrerequisite(SubjectCode code, int num, 
							SubjectCode prereqCode, int prereqNum) 
							throws CourseNotFoundException {
		
		// TODO: implement addPrerequisite method
	
	}
	
	
	
	/**
	 * Adds a section to the section list collection.
	 * 
	 * @param code		 The subject code of the course
	 * @param courseNum	 The course number of the course
	 * @param sectionNum The section number for the course
	 * @param facultyLN	 The last name for the faculty teaching the course
	 * @param quarter	 The quarter that the course section is held 
	 * @param year		 The year that the course section is held
	 * @param cap		 The capacity of the course section
	 * @param bldg		 The building that the course section is held
	 * @param room		 The room that the course section is held
	 * @throws CourseNotFoundException The course was not found in the system
	 * @throws PersonNotFoundException The person was not found in the system
	 */
	public void addSection(SubjectCode code, int courseNum, int sectionNum,
							String lastName, Quarter quarter, int year, 
							int cap, Building bldg, int room) 
							throws CourseNotFoundException, PersonNotFoundException {

		// TODO: implement addSection method
	
	}
	
	
	// TODO: add RegistrationSystem collections
	// student list, faculty list, subject list, course list, section list
	
}
