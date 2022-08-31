package com.nttdata.bootcamp.bank.springboot.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection="purse")
public class Purse {

    @Id
    private String codePurse;

    @Builder.Default
    private String name = "";

    @Builder.Default
    private String description = "";

    @Builder.Default
    private String numberCellPhone = "";

    @Builder.Default
    private String imeiCellPhone = "";

    @Builder.Default
    private String email = "";

    @Builder.Default
    private String user = "";

    @Builder.Default
    private String password = "";

    @Builder.Default
    private String numberDocumentType = "";

    @Builder.Default
    private Double totalBalance = 0.00;

    @Builder.Default
    private String state = "";

    @Builder.Default
    private String codeDocumentType = "";
}
