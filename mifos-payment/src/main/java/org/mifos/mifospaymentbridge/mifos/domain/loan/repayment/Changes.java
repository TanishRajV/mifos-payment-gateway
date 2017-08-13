package org.mifos.mifospaymentbridge.mifos.domain.loan.repayment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Changes {

    @JsonProperty("transactionDate")
    private String transactionDate;

    @JsonProperty("transactionAmount")
    private String transactionAmount;

    @JsonProperty("locale")
    private String locale;

    @JsonProperty("dateFormat")
    private String dateFormat;

    @JsonProperty("note")
    private String note;

    @JsonProperty("accountNumber")
    private String accountNumber;

    @JsonProperty("checkNumber")
    private String checkNumber;

    @JsonProperty("routingCode")
    private String routingCode;

    @JsonProperty("receiptNumber")
    private String receiptNumber;

    @JsonProperty("bankNumber")
    private String bankNumber;
}