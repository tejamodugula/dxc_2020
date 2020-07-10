package OneToManyStudent;



import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import OneToManyStudent.OneToManyLibrary;
import OneToManyStudent.OneToManyStudent;

public class OneToManyExample {

	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("OneToManyStudent");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		OneToManyLibrary lib1 = new OneToManyLibrary();
		lib1.setB_id(101);
		lib1.setB_name("Core Java");
		
		OneToManyLibrary lib2 = new OneToManyLibrary();
		lib2.setB_id(102);
		lib2.setB_name("DBMS");
		
		em.persist(lib1);
		em.persist(lib2);
		
		ArrayList<OneToManyLibrary> mList = new ArrayList<OneToManyLibrary>();
		mList.add(lib1);
		mList.add(lib2);
		
		OneToManyStudent stud1 = new OneToManyStudent();
		stud1.setId(1);
		stud1.setName("John");
		stud1.setBooks_issued(mList);
		
		em.persist(stud1);
		
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}