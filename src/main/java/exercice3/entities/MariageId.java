package exercice3.entities;

import javax.persistence.Column;
import java.io.Serializable;

public class MariageId implements Serializable {
    @Column(name = "homme_id")
    private int hommeId;

    @Column(name = "femme_id")
    private int femmeId;

    public MariageId() {}

    public MariageId(int hommeId, int femmeId) {
        this.hommeId = hommeId;
    }

    public int getHommeId() {
        return hommeId;
    }
    public void setHommeId(int hommeId) {
        this.hommeId = hommeId;
    }
    public int getFemmeId() {
        return femmeId;
    }
    public void setFemmeId(int femmeId) {
        this.femmeId = femmeId;
    }
}
