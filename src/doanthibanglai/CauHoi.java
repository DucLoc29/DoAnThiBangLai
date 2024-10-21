
package doanthibanglai;

/**
 *
 * @author Duc Loc
 */
public class CauHoi {
    private String cauHoi;
    private String cauA;
    private String cauB;
    private String cauC;
    private String cauD;
    private int dapAn;
    private int trangThaiTraLoi;

    public CauHoi(String cauHoi, String cauA, String cauB, String cauC, String cauD, int dapAn, int trangThaiTraLoi) {
        this.cauHoi = cauHoi;
        this.cauA = cauA;
        this.cauB = cauB;
        this.cauC = cauC;
        this.cauD = cauD;
        this.dapAn = dapAn;
        this.trangThaiTraLoi = trangThaiTraLoi;
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public String getCauA() {
        return cauA;
    }

    public String getCauB() {
        return cauB;
    }

    public String getCauC() {
        return cauC;
    }

    public String getCauD() {
        return cauD;
    }

    public int getDapAn() {
        return dapAn;
    }

    public int getTrangThaiTraLoi() {
        return trangThaiTraLoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    public void setCauA(String cauA) {
        this.cauA = cauA;
    }

    public void setCauB(String cauB) {
        this.cauB = cauB;
    }

    public void setCauC(String cauC) {
        this.cauC = cauC;
    }

    public void setCauD(String cauD) {
        this.cauD = cauD;
    }

    public void setDapAn(int dapAn) {
        this.dapAn = dapAn;
    }

    public void setTrangThaiTraLoi(int trangThaiTraLoi) {
        this.trangThaiTraLoi = trangThaiTraLoi;
    }
    
}
