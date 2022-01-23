package jsonex01;

import com.google.gson.Gson;

class SMSDto {
    private String groupId;
    private String successCount;
    private String errorCount;

    public SMSDto(String groupId, String successCount, String errorCount) {
        this.groupId = groupId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(String successCount) {
        this.successCount = successCount;
    }

    public String getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(String errorCount) {
        this.errorCount = errorCount;
    }

}

public class GsonEx02 {
    public static void main(String[] args) {
        // String smsReturn =
        // "{"groupId":"R2GdEONszq64lNB9","successCount":1,"errorCount":0}";

        Gson gson = new Gson(); // toJson, fromJson
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";

        // Json -> JavaObject 로 변경(데이터 다운로드 받아서 내 맘대로 다루려고)
        SMSDto javaUserDto = gson.fromJson(smsReturn, SMSDto.class); // UserDto 타입으로 바꿀건데 .class 붙여야 함
        System.out.println(javaUserDto);
        System.out.println(javaUserDto.getGroupId());
        System.out.println(javaUserDto.getSuccessCount());
        System.out.println(javaUserDto.getErrorCount());

    }// end of main
}