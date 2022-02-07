package orangefield.dtotest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {

    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    private int accExamCnt; // 누적 의심신고 검사자
                    private String createDt; // 등록일시분초
                    private int deathCnt; // 사망자 수
                    private String seq; // 게시글번호
                    private String stateDt; // 기준일
                    private String stateTime; // 기준시간
                    private String updateDt; // 수정일시분초
                }
            }
        }

    }

}
