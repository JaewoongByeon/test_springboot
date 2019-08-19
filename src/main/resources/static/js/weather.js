var apiID = "884012cf97a0e88c53af7962cf5a0ad8";
var apiURL = "https://api.openweathermap.org/data/2.5/forecast/";
var cityID = 1835848;
var unit = "metric";
//unit setting
var tempunit;
var windunit;
if (unit == "metric") {
    tempunit = "&deg;C";
    windunit = "m/s";
} else if (unit == "imperial") {
    tempunit = "&deg;F";
    windunit = "mph";
} else {
    tempunit = "Kelvin";
    windunit = "m/s";
}
$(function () {
    $.ajax({
        type: "GET",
        url: "/api/weather/raw",
        data: {
            url: apiURL,
            id: cityID,
            appid: apiID,
            units: unit
        },
        success: function (data) {
            $.map(data, function (value0, key0) {
                if (key0 == "list") {
                    $.each(value0, function (key1, value1) {
                        $.map(value1, function (value2, key2) {
                            //$("#result").append(key2 + ": " + value2 + "<br>");
                            if (key2 == "dt") {
                                $("#time" + key1).text(CvtTime(value2));
                            }
                            if (key2 == "weather") {
                                $.each(value2, function (key3, value3) {
                                    $.map(value3, function (value4, key4) {
                                        if (key4 == "id") {
                                            $("#icon" + key1).html("<i style=\"font-size:40px\"class=\"wi wi-owm-" + value4 + "\"></i>");
                                        }
                                    });
                                });
                            }
                            if (key2 == "main") {
                                $.map(value2, function (value3, key3) {
                                    if (key3 == "temp") {
                                        $("#temp" + key1).append(value3.toFixed(1) + tempunit);
                                    }
                                });
                            }
                            if (key2 == "wind") {
                                $.map(value2, function (value3, key3) {
                                    if (key3 == "speed") {
                                        $("#wind" + key1).append(value3.toFixed(2) + windunit);
                                    }
                                });
                            }
                            if (key2 == "main") {
                                $.map(value2, function (value3, key3) {
                                    if (key3 == "pressure") {
                                        $("#prss" + key1).append(value3.toFixed(2) + "hPa");
                                    }
                                });
                            }
                        });
                    });
                }
            });
        }
    });
});
function CvtTime(dt) {
    var ms = new Date(dt * 1000);
    return (ms.getHours() < 10 ? '0' : '') + ms.getHours() + ":" + (ms.getMinutes() < 10 ? '0' : '') + ms.getMinutes();
}