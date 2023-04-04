/*
 * Copyright 2016 Netflix, Inc.
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/* PartitionParser.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. PartitionParser.java */
package com.netflix.metacat.common.server.partition.parser;
public class PartitionParser/*@bgen(jjtree)*/implements PartitionParserTreeConstants, PartitionParserConstants {/*@bgen(jjtree)*/
  protected JJTPartitionParserState jjtree = new JJTPartitionParserState();public static void main (String [] args) throws ParseException {
                PartitionParser parser = new PartitionParser(new java.io.StringReader(args[0]));
            SimpleNode root = parser.filter();
            root.dump("");
            System.out.println(root.jjtAccept(new com.netflix.metacat.common.server.partition.visitor.PartitionParserEval(), null));
        }

  public final SimpleNode filter() throws ParseException {/*@bgen(jjtree) FILTER */
  ASTFILTER jjtn000 = new ASTFILTER(JJTFILTER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      expr();
      jjConsumeToken(0);
jjtree.closeNodeScope(jjtn000, true);
                 jjtc000 = false;
{
        if (!"".equals(null)) {
            return jjtn000;
        }}
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {
          if (true) {
              throw (RuntimeException) jjte000;
          }}
    }
    if (jjte000 instanceof ParseException) {
      {
          if (true) {
              throw (ParseException) jjte000;
          }}
    }
    {
        if (true) {
            throw (Error) jjte000;
        }}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

  public final void expr() throws ParseException {
    switch ((jjNtk==-1)?jjNtkF():jjNtk) {
    case LPAREN:{
      jjConsumeToken(LPAREN);
      expr();
      jjConsumeToken(RPAREN);
      switch ((jjNtk==-1)?jjNtkF():jjNtk) {
      case AND:
      case OR:{
        switch ((jjNtk==-1)?jjNtkF():jjNtk) {
        case AND:{
          jjConsumeToken(AND);
ASTAND jjtn001 = new ASTAND(JJTAND);
                                                boolean jjtc001 = true;
                                                jjtree.openNodeScope(jjtn001);
          try {
            expr();
          } catch (Throwable jjte001) {
if (jjtc001) {
                                                  jjtree.clearNodeScope(jjtn001);
                                                  jjtc001 = false;
                                                } else {
                                                  jjtree.popNode();
                                                }
                                                if (jjte001 instanceof RuntimeException) {
                                                  {
                                                      if (true) {
                                                          throw (RuntimeException) jjte001;
                                                      }}
                                                }
                                                if (jjte001 instanceof ParseException) {
                                                  {
                                                      if (true) {
                                                          throw (ParseException) jjte001;
                                                      }}
                                                }
                                                {
                                                    if (true) {
                                                        throw (Error) jjte001;
                                                    }}
          } finally {
if (jjtc001) {
                                                  jjtree.closeNodeScope(jjtn001,  2);
                                                }
          }
          break;
          }
        case OR:{
          jjConsumeToken(OR);
ASTOR jjtn002 = new ASTOR(JJTOR);
                                                                        boolean jjtc002 = true;
                                                                        jjtree.openNodeScope(jjtn002);
          try {
            expr();
          } catch (Throwable jjte002) {
if (jjtc002) {
                                                                          jjtree.clearNodeScope(jjtn002);
                                                                          jjtc002 = false;
                                                                        } else {
                                                                          jjtree.popNode();
                                                                        }
                                                                        if (jjte002 instanceof RuntimeException) {
                                                                          {
                                                                              if (true) {
                                                                                  throw (RuntimeException) jjte002;
                                                                              }}
                                                                        }
                                                                        if (jjte002 instanceof ParseException) {
                                                                          {
                                                                              if (true) {
                                                                                  throw (ParseException) jjte002;
                                                                              }}
                                                                        }
                                                                        {
                                                                            if (true) {
                                                                                throw (Error) jjte002;
                                                                            }}
          } finally {
if (jjtc002) {
                                                                          jjtree.closeNodeScope(jjtn002,  2);
                                                                        }
          }
          break;
          }
        default:
          jjLa1[0] = jjGen;
          jjConsumeToken(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jjLa1[1] = jjGen;
        ;
      }
      break;
      }
    default:
      jjLa1[4] = jjGen;
      if (jj21(1)) {
        EvalExpr();
        switch ((jjNtk==-1)?jjNtkF():jjNtk) {
        case AND:
        case OR:{
          switch ((jjNtk==-1)?jjNtkF():jjNtk) {
          case AND:{
            jjConsumeToken(AND);
ASTAND jjtn003 = new ASTAND(JJTAND);
                              boolean jjtc003 = true;
                              jjtree.openNodeScope(jjtn003);
            try {
              expr();
            } catch (Throwable jjte003) {
if (jjtc003) {
                                jjtree.clearNodeScope(jjtn003);
                                jjtc003 = false;
                              } else {
                                jjtree.popNode();
                              }
                              if (jjte003 instanceof RuntimeException) {
                                {
                                    if (true) {
                                        throw (RuntimeException) jjte003;
                                    }}
                              }
                              if (jjte003 instanceof ParseException) {
                                {
                                    if (true) {
                                        throw (ParseException) jjte003;
                                    }}
                              }
                              {
                                  if (true) {
                                      throw (Error) jjte003;
                                  }}
            } finally {
if (jjtc003) {
                                jjtree.closeNodeScope(jjtn003,  2);
                              }
            }
            break;
            }
          case OR:{
            jjConsumeToken(OR);
ASTOR jjtn004 = new ASTOR(JJTOR);
                                                      boolean jjtc004 = true;
                                                      jjtree.openNodeScope(jjtn004);
            try {
              expr();
            } catch (Throwable jjte004) {
if (jjtc004) {
                                                        jjtree.clearNodeScope(jjtn004);
                                                        jjtc004 = false;
                                                      } else {
                                                        jjtree.popNode();
                                                      }
                                                      if (jjte004 instanceof RuntimeException) {
                                                        {
                                                            if (true) {
                                                                throw (RuntimeException) jjte004;
                                                            }}
                                                      }
                                                      if (jjte004 instanceof ParseException) {
                                                        {
                                                            if (true) {
                                                                throw (ParseException) jjte004;
                                                            }}
                                                      }
                                                      {
                                                          if (true) {
                                                              throw (Error) jjte004;
                                                          }}
            } finally {
if (jjtc004) {
                                                        jjtree.closeNodeScope(jjtn004,  2);
                                                      }
            }
            break;
            }
          default:
            jjLa1[2] = jjGen;
            jjConsumeToken(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jjLa1[3] = jjGen;
          ;
        }
      } else {
        jjConsumeToken(-1);
        throw new ParseException();
      }
    }
  }

  public final void EvalExpr() throws ParseException {boolean not = false;
ASTNOT jjtn001 = new ASTNOT(JJTNOT);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
      switch ((jjNtk==-1)?jjNtkF():jjNtk) {
      case NOT:{
        jjConsumeToken(NOT);
not=true;
        break;
        }
      default:
        jjLa1[5] = jjGen;
        ;
      }
      eval();
    } catch (Throwable jjte001) {
if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {
                if (true) {
                    throw (RuntimeException) jjte001;
                }}
          }
          if (jjte001 instanceof ParseException) {
            {
                if (true) {
                    throw (ParseException) jjte001;
                }}
          }
          {
              if (true) {
                  throw (Error) jjte001;
              }}
    } finally {
if (jjtc001) {
            jjtree.closeNodeScope(jjtn001,  not);
          }
    }
  }

  public final void eval() throws ParseException {
    if (getToken(2).kind==BETWEEN || getToken(3).kind==BETWEEN) {
      BetweenEval();
    } else if (getToken(2).kind==IN || getToken(3).kind==IN) {
      InEval();
    } else if (getToken(2).kind==LIKE || getToken(3).kind==LIKE) {
      LikeEval();
    } else if (getToken(2).kind==IS) {
      NullEval();
    } else {
      switch ((jjNtk==-1)?jjNtkF():jjNtk) {
      case INT:
      case FLOAT:
      case BOOLEAN:
      case VARIABLE:
      case QUOTE:
      case SQUOTE:{
        CompareEval();
        break;
        }
      default:
        jjLa1[6] = jjGen;
        jjConsumeToken(-1);
        throw new ParseException();
      }
    }
  }

  public final void BetweenEval() throws ParseException {/*@bgen(jjtree) BETWEEN */
  ASTBETWEEN jjtn000 = new ASTBETWEEN(JJTBETWEEN);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      term();
      switch ((jjNtk==-1)?jjNtkF():jjNtk) {
      case NOT:{
        jjConsumeToken(NOT);
jjtn000.not=true;
        break;
        }
      default:
        jjLa1[7] = jjGen;
        ;
      }
      jjConsumeToken(BETWEEN);
      term();
      jjConsumeToken(AND);
      term();
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {
            if (true) {
                throw (RuntimeException) jjte000;
            }}
      }
      if (jjte000 instanceof ParseException) {
        {
            if (true) {
                throw (ParseException) jjte000;
            }}
      }
      {
          if (true) {
              throw (Error) jjte000;
          }}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  public final void InEval() throws ParseException {/*@bgen(jjtree) IN */
  ASTIN jjtn000 = new ASTIN(JJTIN);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      term();
      switch ((jjNtk==-1)?jjNtkF():jjNtk) {
      case NOT:{
        jjConsumeToken(NOT);
jjtn000.not=true;
        break;
        }
      default:
        jjLa1[8] = jjGen;
        ;
      }
      jjConsumeToken(IN);
      jjConsumeToken(LPAREN);
      term();
      label_1:
      while (true) {
        switch ((jjNtk==-1)?jjNtkF():jjNtk) {
        case COMMA:{
          break;
          }
        default:
          jjLa1[9] = jjGen;
          break label_1;
        }
        jjConsumeToken(COMMA);
        term();
      }
      jjConsumeToken(RPAREN);
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {
            if (true) {
                throw (RuntimeException) jjte000;
            }}
      }
      if (jjte000 instanceof ParseException) {
        {
            if (true) {
                throw (ParseException) jjte000;
            }}
      }
      {
          if (true) {
              throw (Error) jjte000;
          }}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  public final void LikeEval() throws ParseException {/*@bgen(jjtree) LIKE */
  ASTLIKE jjtn000 = new ASTLIKE(JJTLIKE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      term();
      switch ((jjNtk==-1)?jjNtkF():jjNtk) {
      case NOT:{
        jjConsumeToken(NOT);
jjtn000.not=true;
        break;
        }
      default:
        jjLa1[10] = jjGen;
        ;
      }
      jjConsumeToken(LIKE);
      term();
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {
            if (true) {
                throw (RuntimeException) jjte000;
            }}
      }
      if (jjte000 instanceof ParseException) {
        {
            if (true) {
                throw (ParseException) jjte000;
            }}
      }
      {
          if (true) {
              throw (Error) jjte000;
          }}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  public final void NullEval() throws ParseException {/*@bgen(jjtree) NULL */
  ASTNULL jjtn000 = new ASTNULL(JJTNULL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      term();
      jjConsumeToken(IS);
      switch ((jjNtk==-1)?jjNtkF():jjNtk) {
      case NOT:{
        jjConsumeToken(NOT);
jjtn000.not=true;
        break;
        }
      default:
        jjLa1[11] = jjGen;
        ;
      }
      jjConsumeToken(NULL);
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {
            if (true) {
                throw (RuntimeException) jjte000;
            }}
      }
      if (jjte000 instanceof ParseException) {
        {
            if (true) {
                throw (ParseException) jjte000;
            }}
      }
      {
          if (true) {
              throw (Error) jjte000;
          }}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  public final void CompareEval() throws ParseException {/*@bgen(jjtree) COMPARE */
  ASTCOMPARE jjtn000 = new ASTCOMPARE(JJTCOMPARE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      term();
      switch ((jjNtk==-1)?jjNtkF():jjNtk) {
      case EQUAL:
      case NEQUAL:
      case GTE:
      case GT:
      case LTE:
      case LT:
      case MATCHES:{
        comp();
        term();
        break;
        }
      default:
        jjLa1[12] = jjGen;
        ;
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {
            if (true) {
                throw (RuntimeException) jjte000;
            }}
      }
      if (jjte000 instanceof ParseException) {
        {
            if (true) {
                throw (ParseException) jjte000;
            }}
      }
      {
          if (true) {
              throw (Error) jjte000;
          }}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  public final void comp() throws ParseException {
    switch ((jjNtk==-1)?jjNtkF():jjNtk) {
    case GT:{
ASTGT jjtn001 = new ASTGT(JJTGT);
    boolean jjtc001 = true;
    jjtree.openNodeScope(jjtn001);
      try {
        jjConsumeToken(GT);
      } finally {
if (jjtc001) {
      jjtree.closeNodeScope(jjtn001, true);
    }
      }
      break;
      }
    case LT:{
ASTLT jjtn002 = new ASTLT(JJTLT);
    boolean jjtc002 = true;
    jjtree.openNodeScope(jjtn002);
      try {
        jjConsumeToken(LT);
      } finally {
if (jjtc002) {
      jjtree.closeNodeScope(jjtn002, true);
    }
      }
      break;
      }
    case LTE:{
ASTLTE jjtn003 = new ASTLTE(JJTLTE);
    boolean jjtc003 = true;
    jjtree.openNodeScope(jjtn003);
      try {
        jjConsumeToken(LTE);
      } finally {
if (jjtc003) {
      jjtree.closeNodeScope(jjtn003, true);
    }
      }
      break;
      }
    case GTE:{
ASTGTE jjtn004 = new ASTGTE(JJTGTE);
    boolean jjtc004 = true;
    jjtree.openNodeScope(jjtn004);
      try {
        jjConsumeToken(GTE);
      } finally {
if (jjtc004) {
      jjtree.closeNodeScope(jjtn004, true);
    }
      }
      break;
      }
    case EQUAL:{
ASTEQ jjtn005 = new ASTEQ(JJTEQ);
    boolean jjtc005 = true;
    jjtree.openNodeScope(jjtn005);
      try {
        jjConsumeToken(EQUAL);
      } finally {
if (jjtc005) {
      jjtree.closeNodeScope(jjtn005, true);
    }
      }
      break;
      }
    case NEQUAL:{
ASTNEQ jjtn006 = new ASTNEQ(JJTNEQ);
    boolean jjtc006 = true;
    jjtree.openNodeScope(jjtn006);
      try {
        jjConsumeToken(NEQUAL);
      } finally {
if (jjtc006) {
      jjtree.closeNodeScope(jjtn006, true);
    }
      }
      break;
      }
    case MATCHES:{
ASTMATCHES jjtn007 = new ASTMATCHES(JJTMATCHES);
    boolean jjtc007 = true;
    jjtree.openNodeScope(jjtn007);
      try {
        jjConsumeToken(MATCHES);
      } finally {
if (jjtc007) {
      jjtree.closeNodeScope(jjtn007, true);
    }
      }
      break;
      }
    default:
      jjLa1[13] = jjGen;
      jjConsumeToken(-1);
      throw new ParseException();
    }
  }

  public final void term() throws ParseException {Token t;
  StringBuilder builder = new StringBuilder();
    switch ((jjNtk==-1)?jjNtkF():jjNtk) {
    case INT:{
      t = jjConsumeToken(INT);
ASTNUM jjtn001 = new ASTNUM(JJTNUM);
                      boolean jjtc001 = true;
                      jjtree.openNodeScope(jjtn001);
      try {
jjtree.closeNodeScope(jjtn001, true);
                      jjtc001 = false;
jjtn001.value = new java.math.BigDecimal(t.image);
      } finally {
if (jjtc001) {
                        jjtree.closeNodeScope(jjtn001, true);
                      }
      }
      break;
      }
    case FLOAT:{
      t = jjConsumeToken(FLOAT);
ASTNUM jjtn002 = new ASTNUM(JJTNUM);
                      boolean jjtc002 = true;
                      jjtree.openNodeScope(jjtn002);
      try {
jjtree.closeNodeScope(jjtn002, true);
                      jjtc002 = false;
jjtn002.value = new java.math.BigDecimal(t.image);
      } finally {
if (jjtc002) {
                        jjtree.closeNodeScope(jjtn002, true);
                      }
      }
      break;
      }
    case QUOTE:{
      jjConsumeToken(QUOTE);
      label_2:
      while (true) {
        switch ((jjNtk==-1)?jjNtkF():jjNtk) {
        case CHAR:{
          break;
          }
        default:
          jjLa1[14] = jjGen;
          break label_2;
        }
        t = jjConsumeToken(CHAR);
builder.append(t.image);
      }
      jjConsumeToken(ENDQUOTE);
ASTSTRING jjtn003 = new ASTSTRING(JJTSTRING);
                                                                            boolean jjtc003 = true;
                                                                            jjtree.openNodeScope(jjtn003);
      try {
jjtree.closeNodeScope(jjtn003, true);
                                                                            jjtc003 = false;
jjtn003.value = builder.toString();
      } finally {
if (jjtc003) {
                                                                              jjtree.closeNodeScope(jjtn003, true);
                                                                            }
      }
      break;
      }
    case SQUOTE:{
      jjConsumeToken(SQUOTE);
      label_3:
      while (true) {
        switch ((jjNtk==-1)?jjNtkF():jjNtk) {
        case SCHAR:{
          break;
          }
        default:
          jjLa1[15] = jjGen;
          break label_3;
        }
        t = jjConsumeToken(SCHAR);
builder.append(t.image);
      }
      jjConsumeToken(SENDQUOTE);
ASTSTRING jjtn004 = new ASTSTRING(JJTSTRING);
                                                                               boolean jjtc004 = true;
                                                                               jjtree.openNodeScope(jjtn004);
      try {
jjtree.closeNodeScope(jjtn004, true);
                                                                               jjtc004 = false;
jjtn004.value = builder.toString();
      } finally {
if (jjtc004) {
                                                                                 jjtree.closeNodeScope(jjtn004, true);
                                                                               }
      }
      break;
      }
    case BOOLEAN:{
      t = jjConsumeToken(BOOLEAN);
ASTBOOLEAN jjtn005 = new ASTBOOLEAN(JJTBOOLEAN);
                        boolean jjtc005 = true;
                        jjtree.openNodeScope(jjtn005);
      try {
jjtree.closeNodeScope(jjtn005, true);
                        jjtc005 = false;
jjtn005.value = t.image;
      } finally {
if (jjtc005) {
                          jjtree.closeNodeScope(jjtn005, true);
                        }
      }
      break;
      }
    case VARIABLE:{
      t = jjConsumeToken(VARIABLE);
ASTVAR jjtn006 = new ASTVAR(JJTVAR);
                         boolean jjtc006 = true;
                         jjtree.openNodeScope(jjtn006);
      try {
jjtree.closeNodeScope(jjtn006, true);
                         jjtc006 = false;
jjtn006.value = new Variable(t.image);
      } finally {
if (jjtc006) {
                           jjtree.closeNodeScope(jjtn006, true);
                         }
      }
      break;
      }
    default:
      jjLa1[16] = jjGen;
      jjConsumeToken(-1);
      throw new ParseException();
    }
  }

  private boolean jj21(int xla)
 {
    jjLa = xla; jjLastpos = jjScanpos = token;
    try { return !jj31(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jjSave(0, xla); }
  }

  private boolean jj3R8()
 {
     return jj3R13();
  }

  private boolean jj3R5()
 {
     return jjScanToken(NOT);
  }

  private boolean jj3R7()
 {
     return jj3R12();
  }

  private boolean jj3R6()
 {
    Token xsp;
    xsp = jjScanpos;
    jjLookingAhead = true;
    jjSemLA = getToken(2).kind==BETWEEN || getToken(3).kind==BETWEEN;
    jjLookingAhead = false;
    if (!jjSemLA || jj3R7()) {
    jjScanpos = xsp;
    jjLookingAhead = true;
    jjSemLA = getToken(2).kind==IN || getToken(3).kind==IN;
    jjLookingAhead = false;
    if (!jjSemLA || jj3R8()) {
    jjScanpos = xsp;
    jjLookingAhead = true;
    jjSemLA = getToken(2).kind==LIKE || getToken(3).kind==LIKE;
    jjLookingAhead = false;
    if (!jjSemLA || jj3R9()) {
    jjScanpos = xsp;
    jjLookingAhead = true;
    jjSemLA = getToken(2).kind==IS;
    jjLookingAhead = false;
    if (!jjSemLA || jj3R10()) {
    jjScanpos = xsp;
        if (jj3R11()) {
            return true;
        }
    }
    }
    }
    }
    return false;
  }

  private boolean jj3R4()
 {
    Token xsp;
    xsp = jjScanpos;
     if (jj3R5()) {
         jjScanpos = xsp;
     }
     return jj3R6();
  }

  private boolean jj31()
 {
     return jj3R4();
  }

  private boolean jj3R16()
 {
     return jj3R17();
  }

  private boolean jj3R15()
 {
     return jj3R17();
  }

  private boolean jj3R14()
 {
     return jj3R17();
  }

  private boolean jj3R13()
 {
     return jj3R17();
  }

  private boolean jj3R12()
 {
     return jj3R17();
  }

  private boolean jj3R23()
 {
     return jjScanToken(VARIABLE);
  }

  private boolean jj3R22()
 {
     return jjScanToken(BOOLEAN);
  }

  private boolean jj3R11()
 {
     return jj3R16();
  }

  private boolean jj3R21()
 {
     return jjScanToken(SQUOTE);
  }

  private boolean jj3R20()
 {
     return jjScanToken(QUOTE);
  }

  private boolean jj3R10()
 {
     return jj3R15();
  }

  private boolean jj3R19()
 {
     return jjScanToken(FLOAT);
  }

  private boolean jj3R9()
 {
     return jj3R14();
  }

  private boolean jj3R17()
 {
    Token xsp;
    xsp = jjScanpos;
    if (jj3R18()) {
    jjScanpos = xsp;
    if (jj3R19()) {
    jjScanpos = xsp;
    if (jj3R20()) {
    jjScanpos = xsp;
    if (jj3R21()) {
    jjScanpos = xsp;
    if (jj3R22()) {
    jjScanpos = xsp;
        if (jj3R23()) {
            return true;
        }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj3R18()
 {
     return jjScanToken(INT);
  }

  /** Generated Token Manager. */
  public PartitionParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jjNtk;
    private Token jjScanpos;
    private Token jjLastpos;
  private int jjLa;
  /** Whether we are looking ahead. */
  private boolean jjLookingAhead;
  private boolean jjSemLA;
  private int jjGen;
  private final int[] jjLa1 = new int[17];
  private static int[] jjLa10;
  private static int[] jjLa11;
  static {
      jjLa1Init0();
      jjLa1Init1();
   }
   private static void jjLa1Init0() {
      jjLa10 = new int[] {0xc0000,0xc0000,0xc0000,0xc0000,0x200,0x100000,0xd8005000,0x100000,0x100000,0x800,0x100000,0x100000,0x2001f8,0x2001f8,0x0,0x0,0xd8005000,};
   }
   private static void jjLa1Init1() {
      jjLa11 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x2,0x8,0x0,};
   }
  private final JJCalls[] jj2Rtns = new JJCalls[1];
  private boolean jjRescan;
  private int jjGc;

  /** Constructor with InputStream. */
  public PartitionParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public PartitionParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new PartitionParserTokenManager(jj_input_stream);
    token = new Token();
    jjNtk = -1;
    jjGen = 0;
      for (int i = 0;i < 17;i++) {
          jjLa1[i] = -1;
      }
      for (int i = 0;i < jj2Rtns.length;i++) {
          jj2Rtns[i] = new JJCalls();
      }
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jjNtk = -1;
    jjtree.reset();
    jjGen = 0;
      for (int i = 0;i < 17;i++) {
          jjLa1[i] = -1;
      }
      for (int i = 0;i < jj2Rtns.length;i++) {
          jj2Rtns[i] = new JJCalls();
      }
  }

  /** Constructor. */
  public PartitionParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new PartitionParserTokenManager(jj_input_stream);
    token = new Token();
    jjNtk = -1;
    jjGen = 0;
      for (int i = 0;i < 17;i++) {
          jjLa1[i] = -1;
      }
      for (int i = 0;i < jj2Rtns.length;i++) {
          jj2Rtns[i] = new JJCalls();
      }
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
      jj_input_stream = new SimpleCharStream(stream, 1, 1);
   } else {
      jj_input_stream.ReInit(stream, 1, 1);
   }
   if (token_source == null) {
      token_source = new PartitionParserTokenManager(jj_input_stream);
   }

    token_source.ReInit(jj_input_stream);
    token = new Token();
    jjNtk = -1;
    jjtree.reset();
    jjGen = 0;
      for (int i = 0;i < 17;i++) {
          jjLa1[i] = -1;
      }
      for (int i = 0;i < jj2Rtns.length;i++) {
          jj2Rtns[i] = new JJCalls();
      }
  }

  /** Constructor with generated Token Manager. */
  public PartitionParser(PartitionParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jjNtk = -1;
    jjGen = 0;
      for (int i = 0;i < 17;i++) {
          jjLa1[i] = -1;
      }
      for (int i = 0;i < jj2Rtns.length;i++) {
          jj2Rtns[i] = new JJCalls();
      }
  }

  /** Reinitialise. */
  public void ReInit(PartitionParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jjNtk = -1;
    jjtree.reset();
    jjGen = 0;
      for (int i = 0;i < 17;i++) {
          jjLa1[i] = -1;
      }
      for (int i = 0;i < jj2Rtns.length;i++) {
          jj2Rtns[i] = new JJCalls();
      }
  }

  private Token jjConsumeToken(int kind) throws ParseException {
    Token oldToken;
      if ((oldToken = token).next != null) {
          token = token.next;
      } else {
          token = token.next = token_source.getNextToken();
      }
    jjNtk = -1;
    if (token.kind == kind) {
      jjGen++;
      if (++jjGc > 100) {
        jjGc = 0;
        for (int i = 0; i < jj2Rtns.length; i++) {
          JJCalls c = jj2Rtns[i];
          while (c != null) {
              if (c.gen < jjGen) {
                  c.first = null;
              }
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jjKind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  private static final class LookaheadSuccess extends java.lang.Error { }
  private final LookaheadSuccess jjLs = new LookaheadSuccess();
  private boolean jjScanToken(int kind) {
    if (jjScanpos == jjLastpos) {
      jjLa--;
      if (jjScanpos.next == null) {
        jjLastpos = jjScanpos = jjScanpos.next = token_source.getNextToken();
      } else {
        jjLastpos = jjScanpos = jjScanpos.next;
      }
    } else {
      jjScanpos = jjScanpos.next;
    }
    if (jjRescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jjScanpos) { i++; tok = tok.next; }
        if (tok != null) {
            jjAddErrorToken(kind, i);
        }
    }
      if (jjScanpos.kind != kind) {
          return true;
      }
      if (jjLa == 0 && jjScanpos == jjLastpos) {
          throw jjLs;
      }
    return false;
  }


/** Get the next Token. */
  public final Token getNextToken() {
      if (token.next != null) {
          token = token.next;
      } else {
          token = token.next = token_source.getNextToken();
      }
    jjNtk = -1;
    jjGen++;
    return token;
  }

/** Get the specific Token. */
  public final Token getToken(int index) {
    Token t = jjLookingAhead ? jjScanpos : token;
    for (int i = 0; i < index; i++) {
        if (t.next != null) {
            t = t.next;
        } else {
            t = t.next = token_source.getNextToken();
        }
    }
    return t;
  }

  private int jjNtkF() {
      if ((jj_nt = token.next) == null) {
          return jjNtk = (token.next = token_source.getNextToken()).kind;
      } else {
          return jjNtk = jj_nt.kind;
      }
  }

  private java.util.List<int[]> jjExpentries = new java.util.ArrayList<>();
  private int[] jjExpentry;
  private int jjKind = -1;
  private int[] jjLasttokens = new int[100];
  private int jjEndpos;

  private void jjAddErrorToken(int kind, int pos) {
    if (pos >= 100) {
       return;
    }

    if (pos == jjEndpos + 1) {
      jjLasttokens[jjEndpos++] = kind;
    } else if (jjEndpos != 0) {
      jjExpentry = new int[jjEndpos];

      for (int i = 0; i < jjEndpos; i++) {
        jjExpentry[i] = jjLasttokens[i];
      }

      for (int[] oldentry : jjExpentries) {
        if (oldentry.length == jjExpentry.length) {
          boolean isMatched = true;

          for (int i = 0; i < jjExpentry.length; i++) {
            if (oldentry[i] != jjExpentry[i]) {
              isMatched = false;
              break;
            }

          }
          if (isMatched) {
            jjExpentries.add(jjExpentry);
            break;
          }
        }
      }

      if (pos != 0) {
        jjLasttokens[(jjEndpos = pos) - 1] = kind;
      }
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jjExpentries.clear();
    boolean[] la1tokens = new boolean[36];
    if (jjKind >= 0) {
      la1tokens[jjKind] = true;
      jjKind = -1;
    }
    for (int i = 0; i < 17; i++) {
      if (jjLa1[i] == jjGen) {
        for (int j = 0; j < 32; j++) {
          if ((jjLa10[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jjLa11[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 36; i++) {
      if (la1tokens[i]) {
        jjExpentry = new int[1];
        jjExpentry[0] = i;
        jjExpentries.add(jjExpentry);
      }
    }
    jjEndpos = 0;
    jjRescanToken();
    jjAddErrorToken(0, 0);
    int[][] exptokseq = new int[jjExpentries.size()][];
    for (int i = 0; i < jjExpentries.size(); i++) {
      exptokseq[i] = jjExpentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  public final void enable_tracing() {
  }

  /** Disable tracing. */
  public final void disable_tracing() {
  }

  private void jjRescanToken() {
    jjRescan = true;
    for (int i = 0; i < 1; i++) {
      try {
        JJCalls p = jj2Rtns[i];

        do {
          if (p.gen > jjGen) {
            jjLa = p.arg; jjLastpos = jjScanpos = p.first;
              if (i == 0) {
                  jj31();
              }
          }
          p = p.next;
        } while (p != null);

        } catch(LookaheadSuccess ls) { }
    }
    jjRescan = false;
  }

  private void jjSave(int index, int xla) {
    JJCalls p = jj2Rtns[index];
    while (p.gen > jjGen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }

    p.gen = jjGen + xla - jjLa;
    p.first = token;
    p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
