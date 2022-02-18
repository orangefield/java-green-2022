package orangefield.bigdatatest;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Hospital {
    private String addr;
    private String mgtStaDd;
    private String pcrPsblYn;
    private String ratPsblYn;
    private String recuClCd;
    private String rprtWorpClicFndtTgtYn;
    private String sgguCdNm;
    private String sidoCdNm;
    private String telno;
    private int XPos;
    private String XPosWgs84;
    private int YPos;
    private String YPosWgs84;
    private String yadmNm;
    private String ykihoEnc;
}
