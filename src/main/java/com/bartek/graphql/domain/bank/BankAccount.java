package com.bartek.graphql.domain.bank;

import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class BankAccount {

    UUID id;
    String name;
    Currency currency;
}
