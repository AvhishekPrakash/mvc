 package org.prakav.mvc.web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.prakav.mvc.web.dto.FoodDeliveryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
	public class FoodDAO {

		@Autowired
		private SessionFactory factory;

		public FoodDAO() {
			System.out.println("Created : \t" + this.getClass().getSimpleName());
		}

		public void save(FoodDeliveryDTO foodDeldto) {

			System.out.println("saving food dto...");
			System.out.print("should impl jpa....");
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			try {
				session.save(foodDeldto);
				transaction.commit();
			} catch (Exception e) {
				System.err.print("exception raised saving dao..." + e.getMessage());
				transaction.rollback();
			} finally {
				session.close();
			}

		}

	}


