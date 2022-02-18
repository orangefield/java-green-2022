package orangefield.bigdatatest;

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
        private Header heaader;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
            private int resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;
        }

        @AllArgsConstructor
        @Data
        class Items {
            private List<Hospital> item;

        }
    }
}
