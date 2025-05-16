package entities;

import com.google.gson.annotations.SerializedName;

public record ExchangeRateResponse(@SerializedName("base_code") String baseCode,
                                   @SerializedName("target_code") String targetCode,
                                   @SerializedName("conversion_rate") double conversionRate,
                                   @SerializedName("conversion_result") double conversionResult) {
}
