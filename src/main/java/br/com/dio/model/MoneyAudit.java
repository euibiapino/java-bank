package br.com.dio.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public record MoneyAudit(
        UUID trasactionId,
        BankService targetService,
        String description,
        OffsetDateTime createdAt)
{
}
