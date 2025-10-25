package exercice2.entities;

import javax.persistence.Column;
import java.io.Serializable;

public class EmployeTacheId implements Serializable {
    @Column(name = "employe_id")
    private int employeId;

    @Column(name = "tache_id")
    private int tacheId;

    public EmployeTacheId() {}
    public EmployeTacheId(int employeId, int tacheId) {
        this.employeId = employeId;
        this.tacheId = tacheId;
    }

    public int getEmployeId() {
        return employeId;
    }
    public void setEmployeId(int employeId) {
        this.employeId = employeId;
    }
    public int getTacheId() {
        return tacheId;
    }
    public void setTacheId(int tacheId) {
        this.tacheId = tacheId;
    }
}
