/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.persistence;

import co.edu.escuelaing.is.labinfo.samples.entities.Eps1;
import java.util.List;
/**
 *
 * @author blackphantom
 */
public interface EPS1DAO {
    public List<Eps1> load() throws PersistenceException;
    public void save(Eps1 e) throws PersistenceException;
    public void update(Eps1 e) throws PersistenceException;
}