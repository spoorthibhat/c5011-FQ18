package driver;

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
import system.RegistrationSystem;

/**
 * The Driver interfaces with the registration system and populates
 * faculty, students, subjects, courses, their prerequisites, and
 * course sections
 * 
 * @author 
 */
public class Driver {

	public static void main(String[] args) {
		RegistrationSystem system = new RegistrationSystem();
		populateSystem(system);		
		
		// TODO: print the results of the RegistrationSystem collections
		// this include: faculty, students, subjects, courses (and their prerequisites), and course section
	}
	
	private static void populateSystem(RegistrationSystem system) {
		try {
			populateFaculty(system);
			populateStudents(system);
			populateSubjects(system);
			populateCourses(system);
			populatePrerequisites(system);
			populateSections(system);
		} catch (DuplicatePersonException e) {
			System.out.println(e.getMessage());
		} catch (DuplicateSubjectException e) {
			System.out.println(e.getMessage());
		} catch (DuplicateCourseException e) {
			System.out.println(e.getMessage());
		} catch (CourseNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void populateStudents(RegistrationSystem system) throws DuplicatePersonException {
		system.addStudent("Michael", "Bluth", StudentType.UNDERGRAD);
		system.addStudent("Gob", "Bluth", StudentType.UNDERGRAD);
		system.addStudent("Buster", "Bluth", StudentType.UNDERGRAD);
		system.addStudent("Lucille", "Bluth", StudentType.UNDERGRAD);
		system.addStudent("Lindsay", "Funke", StudentType.UNDERGRAD);
		system.addStudent("Tobias", "Funke", StudentType.UNDERGRAD);
		system.addStudent("Maeby", "Funke", StudentType.UNDERGRAD);
		system.addStudent("Kitty", "Sanchez", StudentType.NONMAT_UNDERGRAD);	
		system.addStudent("Edsger", "Dijkstra", StudentType.GRAD);
		system.addStudent("Ada", "Lovelace", StudentType.GRAD);
		system.addStudent("Grace", "Hopper", StudentType.GRAD);
		system.addStudent("Marie", "Curie", StudentType.NONMAT_GRAD);
		system.addStudent("Alan", "Turing", StudentType.GRAD);
		system.addStudent("Katherine", "Johnson", StudentType.GRAD);
	}
	
	private static void populateFaculty(RegistrationSystem system) throws DuplicatePersonException {
		system.addFaculty("Adair", "Dingle", FacultyType.PROF);
		system.addFaculty("Steven", "Hanks", FacultyType.LECTURE);
		system.addFaculty("Pejman", "Khadivi", FacultyType.ASSTPROF);
		system.addFaculty("Michael", "Koenig", FacultyType.LECTURE);
		system.addFaculty("Eric", "Larson", FacultyType.PROF);
		system.addFaculty("Richard", "LeBlanc", FacultyType.PROF);
		system.addFaculty("Lin", "Li", FacultyType.ASSTPROF);
		system.addFaculty("David", "Lillethun", FacultyType.ASSTPROF);
		system.addFaculty("Kevin", "Lundeen", FacultyType.INSTRUCT);
		system.addFaculty("Michael", "McKee", FacultyType.LECTURE);
		system.addFaculty("Aditya", "Mishra", FacultyType.ASSTPROF);
		system.addFaculty("James", "Obare", FacultyType.INSTRUCT);
		system.addFaculty("Sheila", "Oh", FacultyType.SEN_INSTRUCT);
		system.addFaculty("Susan", "Reeder", FacultyType.SEN_INSTRUCT);
		system.addFaculty("Roshanak", "Roshandel", FacultyType.ASSOCPROF);
		system.addFaculty("Jason", "Wong", FacultyType.INSTRUCT);
		system.addFaculty("Yingwu", "Zhu", FacultyType.ASSOCPROF);		
	}

	private static void populateSubjects(RegistrationSystem system) throws DuplicateSubjectException {
		system.addSubject(SubjectCode.BIOL, "Biology");
		system.addSubject(SubjectCode.CHEM, "Chemistry");
		system.addSubject(SubjectCode.CPSC, "Computer Science");
		system.addSubject(SubjectCode.MATH, "Mathematics");
	}
	
	private static void populateCourses(RegistrationSystem system) throws DuplicateCourseException {
		system.addCourse(SubjectCode.CPSC, 1420, "Programming and Problem Solving I", 5);
		system.addCourse(SubjectCode.CPSC, 1430, "Programming and Problem Solving II", 5);
		system.addCourse(SubjectCode.CPSC, 2430, "Data Structures", 5);
		system.addCourse(SubjectCode.CPSC, 2500, "Computer Organization", 5);
		system.addCourse(SubjectCode.CPSC, 2600, "Foundations of Computer Science", 5);
		system.addCourse(SubjectCode.CPSC, 3200, "Object-Oriented Development", 5);
		system.addCourse(SubjectCode.CPSC, 3300, "Fundamentals of Databases", 5);
		system.addCourse(SubjectCode.CPSC, 3400, "Languages and Computation", 5);
		system.addCourse(SubjectCode.CPSC, 3500, "Computing Systems", 5);
		system.addCourse(SubjectCode.CPSC, 4100, "Design and Analysis of Algorithms", 5);
		system.addCourse(SubjectCode.CPSC, 5001, "Programming Boot Camp I", 3);
		system.addCourse(SubjectCode.CPSC, 5002, "Programming Boot Camp II", 3);
		system.addCourse(SubjectCode.CPSC, 5003, "Programming Boot Camp III", 3);
		system.addCourse(SubjectCode.CPSC, 5011, "Object-Oriented Concepts", 3);
		system.addCourse(SubjectCode.CPSC, 5021, "Database Systems", 3);
		system.addCourse(SubjectCode.CPSC, 5031, "Data Structures and Algorithms", 3);
		system.addCourse(SubjectCode.CPSC, 5041, "Computing Systems Principles I", 3);
		system.addCourse(SubjectCode.CPSC, 5042, "Computing Systems Principles II", 3);
		system.addCourse(SubjectCode.CPSC, 5051, "Fundamentals of Software Engineering", 3);
		system.addCourse(SubjectCode.CPSC, 5200, "Software Architecture and Design", 5);
		system.addCourse(SubjectCode.CPSC, 5800, "Ethics and Professional Issues in Computing", 2);
		system.addCourse(SubjectCode.CPSC, 5600, "Parallel Computing", 5);
		system.addCourse(SubjectCode.CPSC, 5610, "Artificial Intelligence", 5);
		system.addCourse(SubjectCode.CPSC, 5510, "Computer Networks", 5);
		system.addCourse(SubjectCode.CPSC, 5520, "Distributed Systems", 5);
		system.addCourse(SubjectCode.CPSC, 5240, "Software as a Service", 5);
		system.addCourse(SubjectCode.CPSC, 5250, "Mobile Software Development", 5);
		system.addCourse(SubjectCode.CPSC, 5300, "Physical Database Design & Optimization", 5);
		system.addCourse(SubjectCode.CPSC, 5400, "Complier Principles and Techniques", 5);
		system.addCourse(SubjectCode.CPSC, 5700, "Computer Graphics", 5);
	}
	
	private static void populatePrerequisites(RegistrationSystem system) throws CourseNotFoundException {
		system.addPrerequisite(SubjectCode.CPSC, 1430, SubjectCode.CPSC, 1420);
		system.addPrerequisite(SubjectCode.CPSC, 2430, SubjectCode.CPSC, 1430);
		system.addPrerequisite(SubjectCode.CPSC, 2500, SubjectCode.CPSC, 1430);
		system.addPrerequisite(SubjectCode.CPSC, 2600, SubjectCode.CPSC, 1430);
		system.addPrerequisite(SubjectCode.CPSC, 3200, SubjectCode.CPSC, 2430);
		system.addPrerequisite(SubjectCode.CPSC, 3300, SubjectCode.CPSC, 2430);
		system.addPrerequisite(SubjectCode.CPSC, 3400, SubjectCode.CPSC, 2430);
		system.addPrerequisite(SubjectCode.CPSC, 3400, SubjectCode.CPSC, 2600);
		system.addPrerequisite(SubjectCode.CPSC, 3500, SubjectCode.CPSC, 2430);
		system.addPrerequisite(SubjectCode.CPSC, 3500, SubjectCode.CPSC, 2500);
		system.addPrerequisite(SubjectCode.CPSC, 4100, SubjectCode.CPSC, 2430);
		system.addPrerequisite(SubjectCode.CPSC, 4100, SubjectCode.CPSC, 2600);		
		system.addPrerequisite(SubjectCode.CPSC, 5002, SubjectCode.CPSC, 5001);
		system.addPrerequisite(SubjectCode.CPSC, 5003, SubjectCode.CPSC, 5002);
		system.addPrerequisite(SubjectCode.CPSC, 5011, SubjectCode.CPSC, 5003);
		system.addPrerequisite(SubjectCode.CPSC, 5021, SubjectCode.CPSC, 5003);
		system.addPrerequisite(SubjectCode.CPSC, 5042, SubjectCode.CPSC, 5041);	
		system.addPrerequisite(SubjectCode.CPSC, 5200, SubjectCode.CPSC, 5011);		
		system.addPrerequisite(SubjectCode.CPSC, 5200, SubjectCode.CPSC, 5051);
		system.addPrerequisite(SubjectCode.CPSC, 5600, SubjectCode.CPSC, 5031);
		system.addPrerequisite(SubjectCode.CPSC, 5600, SubjectCode.CPSC, 5042);
		system.addPrerequisite(SubjectCode.CPSC, 5610, SubjectCode.CPSC, 5031);
		system.addPrerequisite(SubjectCode.CPSC, 5510, SubjectCode.CPSC, 5042);
		system.addPrerequisite(SubjectCode.CPSC, 5520, SubjectCode.CPSC, 5042);
		system.addPrerequisite(SubjectCode.CPSC, 5240, SubjectCode.CPSC, 5042);
		system.addPrerequisite(SubjectCode.CPSC, 5250, SubjectCode.CPSC, 5011);
		system.addPrerequisite(SubjectCode.CPSC, 5300, SubjectCode.CPSC, 5021);
		system.addPrerequisite(SubjectCode.CPSC, 5700, SubjectCode.CPSC, 5031);	
	}
	
	private static void populateSections(RegistrationSystem system) throws CourseNotFoundException, PersonNotFoundException {
		system.addSection(SubjectCode.CPSC, 2430, 1, "Reeder", Quarter.FQ, 2018, 15, Building.PIGT, 207);
		system.addSection(SubjectCode.CPSC, 2430, 1, "Dingle", Quarter.FQ, 2018, 30, Building.PIGT, 207);
		system.addSection(SubjectCode.CPSC, 2600, 1, "Oh", Quarter.FQ, 2018, 30, Building.LEML, 122);		
		system.addSection(SubjectCode.CPSC, 4100, 1, "Zhu", Quarter.FQ, 2018, 34, Building.PIGT, 102);
		system.addSection(SubjectCode.CPSC, 5011, 1, "Hanks", Quarter.FQ, 2018, 20, Building.ADMN, 203);
		system.addSection(SubjectCode.CPSC, 5011, 2, "Oh", Quarter.FQ, 2018, 30, Building.LEML, 122);
		system.addSection(SubjectCode.CPSC, 5021, 1, "McKee", Quarter.FQ, 2018, 36, Building.BANN, 401);
		system.addSection(SubjectCode.CPSC, 5021, 2, "McKee", Quarter.FQ, 2018, 30, Building.LEML, 122);
		system.addSection(SubjectCode.CPSC, 5510, 1, "Lillethun", Quarter.FQ, 2018, 30, Building.ENGR, 304);		
		system.addSection(SubjectCode.CPSC, 5600, 2, "Lundeen", Quarter.FQ, 2018, 20, Building.BANN, 402);
	}

}
