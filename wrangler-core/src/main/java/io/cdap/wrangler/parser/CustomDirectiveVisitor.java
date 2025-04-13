/*
 * Copyright © 2017-2019 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

 package io.cdap.wrangler.parser;

 import io.cdap.wrangler.api.parser.Token;
 import io.cdap.wrangler.api.parser.ByteSize;
 import io.cdap.wrangler.api.parser.TimeDuration;
 // ✅ most important ones:
import io.cdap.wrangler.parser.DirectivesBaseVisitor;
import io.cdap.wrangler.parser.DirectivesParser;


 public class CustomDirectiveVisitor extends DirectivesBaseVisitor<Token> {
 
   @Override
   public Token visitByteSizeArg(DirectivesParser.ByteSizeArgContext ctx) {
     return new ByteSize(ctx.getText());
   }
 
   @Override
   public Token visitTimeDurationArg(DirectivesParser.TimeDurationArgContext ctx) {
     return new TimeDuration(ctx.getText());
   }
 
 }
 