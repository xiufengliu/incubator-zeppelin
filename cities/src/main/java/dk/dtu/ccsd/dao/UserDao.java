package dk.dtu.ccsd.dao;

import dk.dtu.ccsd.dto.User;
import dk.dtu.ccsd.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiuli on 11/12/15.
 */
public class UserDao {


  public void addUser(User user) {
    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      trns = session.beginTransaction();
      session.save(user);
      session.getTransaction().commit();
    } catch (RuntimeException e) {
      if (trns != null) {
        trns.rollback();
      }
      e.printStackTrace();
    } finally {
      session.flush();
      session.close();
    }
  }

  public void deleteUser(int userid) {
    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      trns = session.beginTransaction();
      User user = (User) session.load(User.class, new Integer(userid));
      session.delete(user);
      session.getTransaction().commit();
    } catch (RuntimeException e) {
      if (trns != null) {
        trns.rollback();
      }
      e.printStackTrace();
    } finally {
      session.flush();
      session.close();
    }
  }

  public void updateUser(User user) {
    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      trns = session.beginTransaction();
      session.update(user);
      session.getTransaction().commit();
    } catch (RuntimeException e) {
      if (trns != null) {
        trns.rollback();
      }
      e.printStackTrace();
    } finally {
      session.flush();
      session.close();
    }
  }

  public List<User> getAllUsers() {
    List<User> users = new ArrayList<User>();
    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      trns = session.beginTransaction();
      users = session.createQuery("from User").list();
    } catch (RuntimeException e) {
      e.printStackTrace();
    } finally {
      session.flush();
      session.close();
    }
    return users;
  }

  public boolean isUsernameExisted(String username) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      Query query = session.createQuery("from User where username=:username");
      query.setString("username", username);
      return query.uniqueResult() != null;
    } catch (RuntimeException e) {
      e.printStackTrace();
    } finally {
      session.close();
    }
    return false;
  }

  public boolean isEmailExisted(String email) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      Query query = session.createQuery("from User where email=:email");
      query.setString("email", email);
      return query.uniqueResult() != null;
    } catch (RuntimeException e) {
      e.printStackTrace();
    } finally {
      session.close();
    }
    return false;
  }


  public User getUserById(int userid) {
    User user = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {

      String queryString = "from User where id = :id";
      Query query = session.createQuery(queryString);
      query.setInteger("id", userid);
      user = (User) query.uniqueResult();
    } catch (RuntimeException e) {
      e.printStackTrace();
    } finally {
      session.close();
    }
    return user;
  }

  public User getUserByUsername(String username) {
    User user = null;
    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      trns = session.beginTransaction();
      String queryString = "from User where username = :username";
      Query query = session.createQuery(queryString);
      query.setString("username", username);
      user = (User) query.uniqueResult();
    } catch (RuntimeException e) {
      e.printStackTrace();
    } finally {
      session.flush();
      session.close();
    }
    return user;
  }
}
