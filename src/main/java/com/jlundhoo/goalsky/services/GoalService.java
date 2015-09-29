/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlundhoo.goalsky.services;

import com.jlundhoo.goalsky.db.dao.GoalDAOOld;
import com.jlundhoo.goalsky.db.GoalDAO;
import com.jlundhoo.goalsky.models.Goal;
import java.util.List;

/**
 *
 * @author jonas
 */
public class GoalService {
    
    GoalDAOOld goalDAO;
    
    public GoalService(){
        goalDAO = new GoalDAO();
    }
    
    public List<Goal> returnGoals(int year, int start, int size) throws Exception{
        return goalDAO.getAllGoals(year, start, size);
    }
    
    public Goal getGoal(int id){
        return goalDAO.getGoal(id);
    }

    public void postGoal(Goal goal) {
        goalDAO.postGoal(goal);
    }
    
    public void updateGoal(Goal goal, int id) {
        goalDAO.updateGoal(goal, id);
    }
    
    public void deleteGoal(int id) {
        goalDAO.deleteGoal(id);
    }

    
}
