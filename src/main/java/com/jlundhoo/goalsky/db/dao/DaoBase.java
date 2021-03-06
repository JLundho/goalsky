/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlundhoo.goalsky.db.dao;

import java.io.Serializable;

/**
 *
 * @author jlundhol
 * @param <E>
 * @param <PK>
 */
public interface DaoBase<E, PK extends Serializable> {
    E create (E entity);
    E read (PK id);
    E update(E entity);
    void delete(E entity);
}
