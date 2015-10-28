/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlundhoo.goalsky.db.dao;

import com.jlundhoo.goalsky.models.GoalEO;
import java.util.logging.Logger;
import java.util.Collection;
import java.util.logging.Level;
import javax.persistence.Query;

/**
 *
 * @author jonas
 */



public class GoalDAO extends Dao {
    private static final Logger logger = Logger.getLogger(GoalDAO.class.getName());

    public Collection<GoalEO> getAllGoals() {
        entityManager = getEntityManager();
        Query query;
        query = entityManager.createQuery("SELECT goalID FROM GoalEO");
        Collection<GoalEO> goalList = query.getResultList();
        entityManager.close();
        return goalList;
    }
    
    public void postGoal(GoalEO goal) {
        create(goal);
        entityManager.close();
    }
    
    public GoalEO getGoal(int id) {
        GoalEO goal = (GoalEO) read(id);
        entityManager.close();
        return goal;
    }
    
    public GoalEO updateGoal(GoalEO goal) {
        update(goal);
        logger.log(Level.INFO, "Created item with title {0}", goal.getTitle());
        entityManager.close();
        return goal;
    }

    public void deleteGoal(GoalEO goal) {
        delete(goal);
        entityManager.close();
    }
    
}
