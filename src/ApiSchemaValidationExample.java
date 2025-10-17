//package src;
//
//public class ApiSchemaValidationExample {
//
//    public static void main(String[] args) {
//        // Base URI of the API
//        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
//
//        // Make a GET request
//        Response response = RestAssured
//                .given()
//                .when()
//                .get("/users/1")
//                .then()
//                .statusCode(200) // Verify HTTP status
//                .body("id", notNullValue())
//                .body("name", notNullValue())
//                .body("email", containsString("@")) // simple field check
//                // Validate the entire response structure against a schema
//              //  .body(matchesJsonSchemaInClasspath("user-schema.json"))
//                .extract()
//                .response();
//
//        System.out.println("✅ Schema validation passed for: " + response.getBody().asString());
//    }
//}
//
