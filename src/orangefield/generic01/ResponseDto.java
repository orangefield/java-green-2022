package orangefield.generic01;

public class ResponseDto {

    // 1. AirportDto의 item 클래스를 만든다
    class AirportItem {
        private String airportId;
        private String airportNm;
    }

    // 2. FlightDto의 item 클래스를 만든다
    class FlightItem {
        private String airlineNm;
        private String arrAirportNm;
        private String arrPlandTime;
        private String depAirportNm;
        private String depPlandTime;
        private int economyCharge;
        private int prestigeCharge;
        private String vihicleId;
    }

    // 3. ResponseBox를 만든다
    class ResponseBox<T> {
        T item;
    }

    // 4. ResponseBox의 생성자를 만든다
    // 5. 리턴타입 AirportDto를 new 한다
    // 6. 리턴타입 FlightDto를 new 한다.

}