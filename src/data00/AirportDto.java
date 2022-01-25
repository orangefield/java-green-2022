package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AirportDto {
    private Response response;
}

@AllArgsConstructor
@Data
class Response {
    private Header header;
    private Body body;
}

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
}

@AllArgsConstructor
@Data
class Items {
    private List<Item> item;
}

@AllArgsConstructor
@Data
// Dto가 이것만 다르구나 이 부분을 제네릭으로 바꿔서 만들어놓으면 편하겠구나~
class Item {
    private String airportId;
    private String airportNm;
}