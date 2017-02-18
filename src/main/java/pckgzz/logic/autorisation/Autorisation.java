package pckgzz.logic.autorisation;

import dao.UsersEntity;
import mvc.model.TempUser;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pckgzz.utilz.HibernateSessionFactory;


// процедура возвращает статус пользователя 0 - покупатель, 1 - продавец, 2 - админ, 3 - нет аткого пользователя.

public class Autorisation {

    public static int autorisation(TempUser tempUser){


        int statusNoBody = 3;      // статус несуществующего пользователя
        UsersEntity newUser;


        /*

            // **********************      работа с базой данных ***************************************************

            Session session = HibernateSessionFactory.getSessionFactory().openSession();
            session.beginTransaction();


        try{

            // *************************     ищем пользователя  ************************************

            Criteria userCriteria = session.createCriteria(UsersEntity.class);
                             // выбираем строчку из таблицы со значением столбца равному login  из Index
            userCriteria.add(Restrictions.eq("userLogin", tempUser.getLogin() ));


             // если такого пользователя нет то ...
            if ( userCriteria.uniqueResult()== null)
                   {
                       session.close();   // закрытие сессии перед выходом
                       return statusNoBody;  // возвращаем несуществующий статус пользователя

                   }

            else     // в противном случае проверяем пароль на соответствие
              {

                  newUser = (UsersEntity) userCriteria.uniqueResult();

                  if (    (tempUser.getPassword()).equals(newUser.getUserPassword())   )     {

                         // возвращаем статус пользователя, если логин и пароль есть в базе
                      statusNoBody = newUser.getUserStatusId();
                      session.close();    // закрытие сессии перед выходом
                      return  statusNoBody;

                  }

                  else    {    // если пароль не верный ...

                      session.close();   // закрытие сессии перед выходом
                      return statusNoBody;  // возвращаем несуществующий статус пользователя

                  }




              }
        session.close();
        } catch (Exception e) {e.printStackTrace();}

                       */


    return statusNoBody;   // возвращаем несуществующий статус пользователя для отлова ошбок
    }
}
