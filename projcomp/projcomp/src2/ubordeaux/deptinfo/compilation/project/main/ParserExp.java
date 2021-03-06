package ubordeaux.deptinfo.compilation.project.main;

import java.util.Iterator;
import ubordeaux.deptinfo.compilation.project.intermediateCode.*;
import ubordeaux.deptinfo.compilation.project.environment.*;
import ubordeaux.deptinfo.compilation.project.type.*;
import beaver.*;
import java.util.ArrayList;
import ubordeaux.deptinfo.compilation.project.node.*;
import ubordeaux.deptinfo.compilation.project.main.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "Parser.grammar".
 */
public class ParserExp extends Parser {

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pjLsTuLLKMNVVUXzZG14G9GrGG8JHHYZ8n84N0Q4H0Ge14a6YGG50iY33eW0qLGucAOCK" +
		"eA2g251KiAAWq1IbsLAmpmoXs77N6FUkUjzzxvrKJZD$d3r##TTSvUv#zroatvvmB1EQYFm" +
		"x7cJW5mr0NIt003iH1E1XrS0WEHHhIKG#7eJwweZrEGczqn6d8nUau0vcOYlrmD#x7Ax8BE" +
		"JWAZV4N785ZSGp6y#yyZC5PE1i3CHX5A4sGeVPlqXvkj3rgrmfgYr2x0kFbxIfe5#Dct8fh" +
		"SHskPuO6E1dPxCUBU0fpsVUSk0nsJ$UlLayN82#OdJhTT9PkrrcQNOCwfw8x5LpquFDSrHa" +
		"Vr95fANL6L4kdaSvL7#fSe3gFw7WkIQapibewHwhEPTIvL7N6gKvbIfsoQkaShJgLrBb1TQ" +
		"vKdHjJwbnU3PqcgiByr6aQgQ6SEZDIwZoML2SJpQnCjsdl6vhUPo83pT42hT06RN52b6y7j" +
		"aJvCl5NP6ccLp4p9i$Sf7dMOb1CdgVnBBgWfTMhI9x2f7aoCJI5RquAtnr9VHVHQ$jAehpz" +
		"i3YcvwFHMdiz5dV5gEGaLQcKjw9yyIiVRpakijl8qrMA#DFonx7y7JTX6YRXAap655oDQtW" +
		"MvPkpw7XTrtRA5TfsbjKs4$VmRRgFCG#OcE2x53wBmZ6tM34TDDzKp3Sn2$4W7aeGSwSLSs" +
		"8uvcycPfxy4zCJnAon#oR$m2BvZ37pKlPjenNJAQnpiOaPXkKy3U9ZjbenIx4CcuWLUDAW4" +
		"W4yQiKyZiwQjPToV$HL7c2uGEr3bCzHFbzvbFA5oXEnLbRXNZoFYR8P3vEVm3hkL1Em6Lja" +
		"6rPY5Pv1Juxx2lgUmsgyW9Vmicp1Ucp0Tl9sl8Pju4z#v5wPpRmvx6KNvkxAKxqxUl3yxSd" +
		"#zWw$9mxFOeyZgyLRKcrpbhkq5HXR9#xXMRgdjpPxUWF#DUHiDp8dtr4ybHedoD2g1hGxKp" +
		"jDjK7jEbHEgv9s4#vtJRdhDMFxK3$QS3Tpc24hBiE#zxGm79j6Nx2dxNMMIcjGfundRXfFt" +
		"WnhHXgepeKrg1EAJATAHzKvNdK6$Guw9r5dXEeqLntdTz1ngDDMTT9hN2SKv#TFYwfbKQV5" +
		"FkguKPdQHTshN8wYhjwi3kUNZEqRpBt6zhbyQqAPBk2v7vt7IPfdO8o6ontpN8x6xbLL#fF" +
		"QLvZ2rpofBurUszSXoflETpMwvoU6Urr2RxHALb8L$wsnVV4hd$nTy7URZ2f5$6dvurZo#2" +
		"NJXrytVNdhxizld05iasxQXDOrn7KIj7LvkyfYXCEzney9lakHioXHJ6I72fYOO8kgnZGtC" +
		"ItvNpdoLs9Sjl5l$mvRLxzlhVGyxiBJ87NCEVm#yZ4SnGOERphvLipek9dyhPpFdIh3$A$b" +
		"yrbaLipVgOhCJfZEkaTxI$wDCgCVo7a8sZ9CoOziZNJXZmoyFjc$EudyYrIF64pq8oucwX8" +
		"bldzVm9m$aze3piwG3N0Nixw8l9gydBnUxLkLt#5Z4FbZm5j1$fprXkJloNxSB#GFwQlD#F" +
		"haD78kEODy9Ra9#MroAo3WaJkmlZkYppM2rvbvODcMiRw0l2LO3nIoJI$QHYSQ5#rJcFEWO" +
		"DaxY$LHQf$1EllkpLBVSDeEqV8ebfjg#LAMswcsFzxvH5$rJQAlAmiS0xWcJXsrNqTx7zQx" +
		"QNqwwqKiVCFoZq6Raw7SbXYdPQwdSut6RE1Z2EiJKgrRz5YT0g8ynZQ7ZqRakSHRp3jFywz" +
		"Ilp#VN1TCjUQi4$qxo1EqVW$dkKZZLaRQUUN4Dgk#YNYF#21O3t1kl5tKM1ZT9tUcpkSRsa" +
		"xN932Mu7e5M0sC8qQhVHWnLSldC#UUIAx0DE8cOW9nEL5Ax6$vPn8LMXv9y9qBNAlriaWxV" +
		"ZM1Um6yz$qw$n$MaOOackVgWB$ScBhEZLDFkRVoHEKfoWkKDob$7MGtJtboaBqovR7ASvIN" +
		"AdyMtwT0Ue9#NX7JfdxLnXV8YAbdMkN6LlbOgzmYHhiMCLrzRTIsHdclsay8ijDIwns3x3R" +
		"bOxEs$JoIqnaQwe#$vX6xbrULSVtwkBrogroiFCaQKpxxi3ScPhPLFcyVTVVe#2fYx3kLTo" +
		"UFTTP7rmCThFWbyUtjjVGsMddkew#PvViaFXQlyx$e5zc5y4yso3fvMLwI5sMjh94Nv7bPB" +
		"KlbSLaYYwN2j7XExkUpag22p2Fk9UucxYBk8BYB2NSqkPsOJTn6S7UIEqtyhNABPdf0Piby" +
		"Kth6F5VAJ9aXqwLSRfQdsEfPsYhaIUEha2SChp3FvUQvJFkyKVanOf6M7msFw15vK1us9Pv" +
		"8ye6yh$QTyX$vGVRAz$ATV2lVoDVobNn9#sxP8rzOCy8pGpxLyYVoiPO#D4#UfVAkl6FA$v" +
		"QFrFUUyaEoKDQJtoJycTuXsyDPjvhdg#QvILw1zPFNv0q#$oV$rVfFX7$oNyPlzVtu5G$2v" +
		"RUO3uVtYm3F88UtgCJeQo6FwASuatUOFeh#p3kIjX3EPku1p5jABcMz4Fxj3OJBMv1hRa95" +
		"jEKpDj$SqK0ul9svXCCRd6imbENXH35tZsBUaNb640vlLnxXy2xbyKuOG07R5h1#Yg9h2dH" +
		"d#nviVp9v3FEDeQsCUSh8fv9x4hs8tiHfH3VQRUGoBfVZFPry1ljLmZObj0zYVGJpZM0zc$" +
		"LirhFDLxGN0pT9EH6SC78IuAB$0oVOqW8=");

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

    static class Events extends beaver.Parser.Events {
        public void syntaxError(Symbol token) {
            System.err.format("*** Erreur de syntaxe en ligne %d, colonne %d. Token inattendu: %s\n",
                Symbol.getLine(token.getStart()),
                Symbol.getColumn(token.getStart()),
                Terminals.NAMES[token.getId()]);
        }
    }
   
    public void semanticError(String msg, Symbol token) {
            System.err.format("*** " + msg + " ligne %d, colonne %d\n",
                Symbol.getLine(token.getStart()),
                Symbol.getColumn(token.getStart()));
        }
       
    private Environment typeEnvironment = new Environment("types");
    private Environment procedureEnvironment = new Environment("procedures");
    private EnvironmentValue valueEnvironment = new EnvironmentValue("values");
    private Subst subst = new Subst();
    private StackEnvironment stackEnvironment = new StackEnvironment("local variables stack");
    private String type_declaration_name;

	private final Action[] actions;

	public ParserExp() {
		super(PARSING_TABLES);
		actions = new Action[] {
			new Action() {	// [0] program = type_declaration_part.type variable_declaration_part.var procedure_definition_part.procedure TOKEN_BEGIN statement_list.stm_l TOKEN_END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_type = _symbols[offset + 1];
					final Node type = (Node) _symbol_type.value;
					final Symbol _symbol_var = _symbols[offset + 2];
					final Node var = (Node) _symbol_var.value;
					final Symbol _symbol_procedure = _symbols[offset + 3];
					final Node procedure = (Node) _symbol_procedure.value;
					final Symbol _symbol_stm_l = _symbols[offset + 5];
					final Node stm_l = (Node) _symbol_stm_l.value;
					 
    NodeList program = new NodeList();
    if(type!= null)
        program.add(type);
     if(var!= null)
        program.add(var);
     if(procedure!= null)
        program.add(procedure);
    program.add(stm_l);    
    
    return program;
				}
			},
			Action.NONE,  	// [1] type_declaration_part = 
			RETURN2,	// [2] type_declaration_part = TOKEN_TYPE type_declaration_list; returns 'type_declaration_list' although none is marked
			new Action() {	// [3] type_declaration_list = type_declaration_list.l type_declaration.td
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l = _symbols[offset + 1];
					final Node l = (Node) _symbol_l.value;
					final Symbol _symbol_td = _symbols[offset + 2];
					final Node td = (Node) _symbol_td.value;
					 l.add(td); return l;
				}
			},
			new Action() {	// [4] type_declaration_list = type_declaration.td
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_td = _symbols[offset + 1];
					final Node td = (Node) _symbol_td.value;
					 NodeList l = new NodeList(td);return l;
				}
			},
			new Action() {	// [5] type_declaration = type_declaration_head.i TOKEN_AFF type.t TOKEN_SEMIC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol i = _symbols[offset + 1];
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					 typeEnvironment.putVariable(type_declaration_name,t);return new NodeId(type_declaration_name,t);
				}
			},
			new Action() {	// [6] type_declaration_head = TOKEN_IDENTIFIER.id
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					 type_declaration_name = id; return new TypeNamed(id);
				}
			},
			Action.RETURN,	// [7] type = simple_type
			Action.RETURN,	// [8] type = named_type
			Action.RETURN,	// [9] type = index_type
			Action.RETURN,	// [10] type = array_type
			Action.RETURN,	// [11] type = pointer_type
			Action.RETURN,	// [12] type = structure_type
			new Action() {	// [13] simple_type = TOKEN_STRING
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new TypeString();
				}
			},
			new Action() {	// [14] simple_type = TOKEN_INTEGER
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new TypeInt();
				}
			},
			new Action() {	// [15] simple_type = TOKEN_BOOLEAN
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new TypeBoolean();
				}
			},
			new Action() {	// [16] named_type = TOKEN_IDENTIFIER.id
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					 return typeEnvironment.getVariableType(id);
				}
			},
			Action.RETURN,	// [17] index_type = enumerated_type
			Action.RETURN,	// [18] index_type = subrange_type
			new Action() {	// [19] enumerated_type = TOKEN_LPAR identifier_list.l TOKEN_RPAR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l = _symbols[offset + 2];
					final IdentifierList l = (IdentifierList) _symbol_l.value;
					
    Iterator<String> it = l.iterator();
    String name = it.next();
    TypeItemEnum min = new TypeItemEnum(0,type_declaration_name);
    typeEnvironment.putVariable(name, min);
    TypeEnumRange en = new TypeEnumRange(min,min);
    int i=1;
    while(it.hasNext()){ 
        name = it.next();
        TypeItemEnum item = new TypeItemEnum(i, type_declaration_name);
        en.setLast(item);
        typeEnvironment.putVariable(name, item);
        i++;
    }
    return en;
				}
			},
			new Action() {	// [20] subrange_type = TOKEN_LIT_INTEGER.i1 TOKEN_DOTDOT TOKEN_LIT_INTEGER.i2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i1 = _symbols[offset + 1];
					final Integer i1 = (Integer) _symbol_i1.value;
					final Symbol _symbol_i2 = _symbols[offset + 3];
					final Integer i2 = (Integer) _symbol_i2.value;
					 return new TypeArrayRange(new TypeInt(i1), new TypeInt(i2));
				}
			},
			new Action() {	// [21] subrange_type = TOKEN_IDENTIFIER.id1 TOKEN_DOTDOT TOKEN_IDENTIFIER.id2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id1 = _symbols[offset + 1];
					final String id1 = (String) _symbol_id1.value;
					final Symbol _symbol_id2 = _symbols[offset + 3];
					final String id2 = (String) _symbol_id2.value;
					 
    TypeItemEnum e1 = (TypeItemEnum) typeEnvironment.getVariableType(id1); 
    TypeItemEnum e2 = (TypeItemEnum) typeEnvironment.getVariableType(id2);
    return new TypeArrayRange(e1,e2);
				}
			},
			new Action() {	// [22] array_type = TOKEN_ARRAY TOKEN_LBRACKET range_type.r TOKEN_RBRACKET TOKEN_OF type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_r = _symbols[offset + 3];
					final TypeRange r = (TypeRange) _symbol_r.value;
					final Symbol _symbol_t = _symbols[offset + 6];
					final Type t = (Type) _symbol_t.value;
					 return new TypeArray(r,t);
				}
			},
			new Action() {	// [23] range_type = enumerated_type.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol e = _symbols[offset + 1];
					 return e;
				}
			},
			new Action() {	// [24] range_type = subrange_type.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol s = _symbols[offset + 1];
					 return s;
				}
			},
			Action.RETURN,	// [25] range_type = named_type
			new Action() {	// [26] pointer_type = TOKEN_CIRC type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 2];
					final Type t = (Type) _symbol_t.value;
					 return new TypePointer(t);
				}
			},
			RETURN4,	// [27] structure_type = TOKEN_STRUCT TOKEN_LBRACE feature_list_type TOKEN_RBRACE; returns 'TOKEN_RBRACE' although none is marked
			new Action() {	// [28] feature_list_type = feature_list_type feature_type
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [29] feature_list_type = feature_type
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			RETURN4,	// [30] feature_type = TOKEN_IDENTIFIER TOKEN_COLON type TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			Action.NONE,  	// [31] variable_declaration_part = 
			RETURN2,	// [32] variable_declaration_part = TOKEN_VAR variable_declaration_list.l
			new Action() {	// [33] variable_declaration_list = variable_declaration_list.l variable_declaration.vd
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l = _symbols[offset + 1];
					final Node l = (Node) _symbol_l.value;
					final Symbol _symbol_vd = _symbols[offset + 2];
					final Node vd = (Node) _symbol_vd.value;
					 l.add(vd); return l;
				}
			},
			new Action() {	// [34] variable_declaration_list = variable_declaration.vd
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_vd = _symbols[offset + 1];
					final Node vd = (Node) _symbol_vd.value;
					 NodeList l = new NodeList(); l.add(vd); return l;
				}
			},
			new Action() {	// [35] variable_declaration = identifier_list.l_id TOKEN_COLON type.t TOKEN_SEMIC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l_id = _symbols[offset + 1];
					final IdentifierList l_id = (IdentifierList) _symbol_l_id.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					 
    NodeList l = new NodeList();
    Iterator<String> it = l_id.iterator();
    while(it.hasNext()){
        String name = it.next();
        NodeId id = new NodeId(name, t);
        typeEnvironment.putVariable(name, t);
        l.add(id);
    }
    return l;
				}
			},
			new Action() {	// [36] identifier_list = identifier_list.l TOKEN_COMMA TOKEN_IDENTIFIER.id
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l = _symbols[offset + 1];
					final IdentifierList l = (IdentifierList) _symbol_l.value;
					final Symbol _symbol_id = _symbols[offset + 3];
					final String id = (String) _symbol_id.value;
					 l.add(id); return l;
				}
			},
			new Action() {	// [37] identifier_list = TOKEN_IDENTIFIER.id
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					 IdentifierList l = new IdentifierList(); l.add(id); return l;
				}
			},
			Action.NONE,  	// [38] procedure_definition_part = 
			Action.RETURN,	// [39] procedure_definition_part = procedure_definition_list
			new Action() {	// [40] procedure_definition_list = procedure_definition_list.l procedure_definition.elt
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l = _symbols[offset + 1];
					final Node l = (Node) _symbol_l.value;
					final Symbol _symbol_elt = _symbols[offset + 2];
					final Node elt = (Node) _symbol_elt.value;
					 l.add(elt); return l;
				}
			},
			new Action() {	// [41] procedure_definition_list = procedure_definition.elt
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_elt = _symbols[offset + 1];
					final Node elt = (Node) _symbol_elt.value;
					 NodeList l = new NodeList(elt); return l;
				}
			},
			RETURN2,	// [42] procedure_definition = procedure_definition_head block; returns 'block' although none is marked
			new Action() {	// [43] procedure_definition = procedure_declaration_head.d TOKEN_SEMIC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_d = _symbols[offset + 1];
					final Node d = (Node) _symbol_d.value;
					 return d;
				}
			},
			new Action() {	// [44] procedure_definition_head = procedure_head.h
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_h = _symbols[offset + 1];
					final Node h = (Node) _symbol_h.value;
					 return h;
				}
			},
			Action.RETURN,	// [45] procedure_declaration_head = procedure_head
			new Action() {	// [46] procedure_head = TOKEN_PROCEDURE TOKEN_IDENTIFIER.id TOKEN_LPAR argt_part.args TOKEN_RPAR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 2];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_args = _symbols[offset + 4];
					final TypeFeatureList args = (TypeFeatureList) _symbol_args.value;
					
    int i = 0;
    TypeTuple tt = new TypeTuple();
    while(i < args.size()){
        TypeFeature tf = (TypeFeature) args.get(i);
        tt.add(tf);
        i++;
    }
    TypeFunct t_fct = new TypeFunct(id, tt, new TypeVoid());
    procedureEnvironment.putVariable(id, t_fct);
    return new NodeId(id, t_fct);
				}
			},
			new Action() {	// [47] procedure_head = TOKEN_FUNCTION TOKEN_IDENTIFIER.id TOKEN_LPAR argt_part.args TOKEN_RPAR TOKEN_COLON type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 2];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_args = _symbols[offset + 4];
					final TypeFeatureList args = (TypeFeatureList) _symbol_args.value;
					final Symbol _symbol_t = _symbols[offset + 7];
					final Type t = (Type) _symbol_t.value;
					
    int i = 0;
    TypeTuple tt = new TypeTuple();
    while(i < args.size()){
        TypeFeature tf = (TypeFeature) args.get(i);
        tt.add(tf);
        i++;
    }
    TypeFunct t_fct = new TypeFunct(id, tt, t);
    procedureEnvironment.putVariable(id, t_fct);
    return new NodeId(id, t_fct);
				}
			},
			Action.NONE,  	// [48] argt_part = 
			Action.RETURN,	// [49] argt_part = argt_list
			new Action() {	// [50] argt_list = argt_list.l TOKEN_COMMA argt.elt
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l = _symbols[offset + 1];
					final TypeFeatureList l = (TypeFeatureList) _symbol_l.value;
					final Symbol _symbol_elt = _symbols[offset + 3];
					final TypeFeature elt = (TypeFeature) _symbol_elt.value;
					 l.add(elt); return l;
				}
			},
			new Action() {	// [51] argt_list = argt.elt
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_elt = _symbols[offset + 1];
					final TypeFeature elt = (TypeFeature) _symbol_elt.value;
					 TypeFeatureList l = new TypeFeatureList(elt); return l;
				}
			},
			new Action() {	// [52] argt = TOKEN_IDENTIFIER.id TOKEN_COLON type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					
    typeEnvironment.putVariable(id, t); 
    return new TypeFeature(id,t);
				}
			},
			new Action() {	// [53] block = variable_declaration_part.vd TOKEN_BEGIN statement_list.sl TOKEN_END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_vd = _symbols[offset + 1];
					final Node vd = (Node) _symbol_vd.value;
					final Symbol _symbol_sl = _symbols[offset + 3];
					final Node sl = (Node) _symbol_sl.value;
					
    NodeList l = new NodeList();
    if(vd != null){
        l.add(vd);
    }
    l.add(sl);
    return l;
				}
			},
			new Action() {	// [54] statement_list = statement_list.l statement.st
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l = _symbols[offset + 1];
					final Node l = (Node) _symbol_l.value;
					final Symbol _symbol_st = _symbols[offset + 2];
					final Node st = (Node) _symbol_st.value;
					 l.add(st); return l;
				}
			},
			new Action() {	// [55] statement_list = statement.st
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_st = _symbols[offset + 1];
					final Node st = (Node) _symbol_st.value;
					 NodeList l = new NodeList(st); return l;
				}
			},
			Action.RETURN,	// [56] statement = simple_statement
			Action.RETURN,	// [57] statement = structured_statement
			new Action() {	// [58] simple_statement = assignment_statement.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Node a = (Node) _symbol_a.value;
					 return a;
				}
			},
			new Action() {	// [59] simple_statement = procedure_statement.p
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_p = _symbols[offset + 1];
					final Node p = (Node) _symbol_p.value;
					 return p;
				}
			},
			new Action() {	// [60] simple_statement = new_statement.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_n = _symbols[offset + 1];
					final Node n = (Node) _symbol_n.value;
					 return n ;
				}
			},
			new Action() {	// [61] simple_statement = dispose_statement.d
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_d = _symbols[offset + 1];
					final Node d = (Node) _symbol_d.value;
					 return d;
				}
			},
			new Action() {	// [62] simple_statement = println_statement.p
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_p = _symbols[offset + 1];
					final Node p = (Node) _symbol_p.value;
					 return p;
				}
			},
			Action.RETURN,	// [63] simple_statement = readln_statement.r
			new Action() {	// [64] simple_statement = return_statement.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_r = _symbols[offset + 1];
					final Node r = (Node) _symbol_r.value;
					 return r;
				}
			},
			new Action() {	// [65] assignment_statement = variable_access.v TOKEN_AFF expression.e TOKEN_SEMIC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_v = _symbols[offset + 1];
					final NodeExp v = (NodeExp) _symbol_v.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final NodeExp e = (NodeExp) _symbol_e.value;
					
     TypeVoid vd = new TypeVoid();
     if(e.getType().equals(vd)){
     	Type t = v.getType();
     	NodeLiteral nl = new NodeLiteral (t, "null");
     	return new NodeAssign(v,nl);
     }
     valueEnvironment.putVariable("a",e);
     return new NodeAssign(v,e);
				}
			},
			new Action() {	// [66] procedure_statement = procedure_expression.p TOKEN_SEMIC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_p = _symbols[offset + 1];
					final Node p = (Node) _symbol_p.value;
					 return p;
				}
			},
			new Action() {	// [67] procedure_expression = TOKEN_IDENTIFIER.id TOKEN_LPAR expression_part.ep TOKEN_RPAR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_ep = _symbols[offset + 3];
					final NodeList ep = (NodeList) _symbol_ep.value;
					
        TypeFunct tf = (TypeFunct) procedureEnvironment.getVariableType(id); 
        return new NodeCallFct(id, tf, ep);
				}
			},
			new Action() {	// [68] expression_part = 
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new NodeList();
				}
			},
			Action.RETURN,	// [69] expression_part = expression_list
			new Action() {	// [70] expression_list = expression_list.l TOKEN_COMMA expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l = _symbols[offset + 1];
					final NodeList l = (NodeList) _symbol_l.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 l.add(e); return l;
				}
			},
			new Action() {	// [71] expression_list = expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 NodeList l = new NodeList(e); return l;
				}
			},
			new Action() {	// [72] new_statement = TOKEN_NEW variable_access.va TOKEN_SEMIC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_va = _symbols[offset + 2];
					final NodeExp va = (NodeExp) _symbol_va.value;
					 return new NodeNew(va);
				}
			},
			new Action() {	// [73] dispose_statement = TOKEN_DISPOSE variable_access.va TOKEN_SEMIC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_va = _symbols[offset + 2];
					final NodeExp va = (NodeExp) _symbol_va.value;
					 return new NodeDispose(va);
				}
			},
			new Action() {	// [74] println_statement = TOKEN_PRINTLN expression.e TOKEN_SEMIC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					
          TypeFeature a = new TypeFeature("println_param",e.getType());
          Type st = new TypeString();  
          TypeTuple tt = new TypeTuple(a); 
          TypeFunct tf = new TypeFunct("println", tt, st); 
          NodeList nl = new NodeList(e);
          return new NodeCallFct("println", tf, nl);
				}
			},
			new Action() {	// [75] readln_statement = TOKEN_READLN expression.e TOKEN_SEMIC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					
          TypeFeature a = new TypeFeature("println_param",e.getType());
          Type st = new TypeString();  
          TypeTuple tt = new TypeTuple(a); 
          TypeFunct tf = new TypeFunct("readln", tt, st); 
          NodeList nl = new NodeList(e);
          return new NodeCallFct("readln", tf, nl);
				}
			},
			new Action() {	// [76] return_statement = TOKEN_RETURN expression.e TOKEN_SEMIC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodeReturn(e);
				}
			},
			new Action() {	// [77] structured_statement = block.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_b = _symbols[offset + 1];
					final Node b = (Node) _symbol_b.value;
					 return b;
				}
			},
			new Action() {	// [78] structured_statement = if_statement.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final Node i = (Node) _symbol_i.value;
					 return i;
				}
			},
			new Action() {	// [79] structured_statement = while_statement.w
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_w = _symbols[offset + 1];
					final Node w = (Node) _symbol_w.value;
					 return w;
				}
			},
			new Action() {	// [80] structured_statement = switch_statement.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 1];
					final Node s = (Node) _symbol_s.value;
					 return s;
				}
			},
			new Action() {	// [81] if_statement = TOKEN_IF expression.e1 TOKEN_THEN statement.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 2];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_s = _symbols[offset + 4];
					final Node s = (Node) _symbol_s.value;
					 return new NodeIf(e1,s);
				}
			},
			new Action() {	// [82] if_statement = TOKEN_IF expression.e1 TOKEN_THEN statement.s1 TOKEN_ELSE statement.s2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 2];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_s1 = _symbols[offset + 4];
					final Node s1 = (Node) _symbol_s1.value;
					final Symbol _symbol_s2 = _symbols[offset + 6];
					final Node s2 = (Node) _symbol_s2.value;
					 return new NodeIf(e1,s1,s2);
				}
			},
			new Action() {	// [83] while_statement = TOKEN_WHILE expression.e TOKEN_DO statement.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					final Symbol _symbol_s = _symbols[offset + 4];
					final Node s = (Node) _symbol_s.value;
					 return new NodeWhile(e,s);
				}
			},
			new Action() {	// [84] switch_statement = TOKEN_SWITCH expression.e1 TOKEN_BEGIN case_statement_list.c TOKEN_END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 2];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_c = _symbols[offset + 4];
					final Node c = (Node) _symbol_c.value;
					return new NodeSwitch(e1,c);
				}
			},
			new Action() {	// [85] case_statement_list = case_statement_list.c1 case_statement.c2 case_default.c3
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c1 = _symbols[offset + 1];
					final Node c1 = (Node) _symbol_c1.value;
					final Symbol _symbol_c2 = _symbols[offset + 2];
					final Node c2 = (Node) _symbol_c2.value;
					final Symbol _symbol_c3 = _symbols[offset + 3];
					final Node c3 = (Node) _symbol_c3.value;
					
   	 c1.add(c2);
   	 if(c3!=null){
     	c1.add(c3);
     }
     return c1;
				}
			},
			new Action() {	// [86] case_statement_list = case_statement.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 1];
					final Node c = (Node) _symbol_c.value;
					 NodeCaseList c_l = new NodeCaseList(); c_l.add(c); return c_l;
				}
			},
			new Action() {	// [87] case_statement = TOKEN_CASE identifier_list.l_id TOKEN_COLON statement.stm
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l_id = _symbols[offset + 2];
					final IdentifierList l_id = (IdentifierList) _symbol_l_id.value;
					final Symbol _symbol_stm = _symbols[offset + 4];
					final Node stm = (Node) _symbol_stm.value;
					 
     return new NodeCase(l_id.first(), stm);
				}
			},
			Action.NONE,  	// [88] case_default = 
			new Action() {	// [89] case_default = TOKEN_DEFAULT TOKEN_COLON statement.stm
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_stm = _symbols[offset + 3];
					final Node stm = (Node) _symbol_stm.value;
					 return new NodeCase(stm);
				}
			},
			new Action() {	// [90] variable_access = TOKEN_IDENTIFIER.id
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					 Type t = typeEnvironment.getVariableType(id); return new NodeLiteral(t,id);
				}
			},
			new Action() {	// [91] variable_access = variable_access.va TOKEN_LBRACKET expression.e TOKEN_RBRACKET
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_va = _symbols[offset + 1];
					final NodeExp va = (NodeExp) _symbol_va.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodeArrayAccess(va,e);
				}
			},
			new Action() {	// [92] variable_access = expression.e TOKEN_CIRC
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodePtrAccess(e);
				}
			},
			new Action() {	// [93] expression = expression.e1 TOKEN_PLUS expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("PLUS", e1,e2);
				}
			},
			new Action() {	// [94] expression = expression.e1 TOKEN_MINUS expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("MINUS", e1,e2);
				}
			},
			new Action() {	// [95] expression = expression.e1 TOKEN_TIMES expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("TIMES", e1,e2);
				}
			},
			new Action() {	// [96] expression = expression.e1 TOKEN_DIV expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeOp("DIV", e1,e2);
				}
			},
			new Action() {	// [97] expression = TOKEN_MINUS expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodeOp("MINUS", e);
				}
			},
			new Action() {	// [98] expression = expression.e1 TOKEN_OR expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeRel("OR", e1,e2);
				}
			},
			new Action() {	// [99] expression = expression.e1 TOKEN_AND expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeRel("AND", e1,e2);
				}
			},
			new Action() {	// [100] expression = TOKEN_NOT expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return new NodeRel("NOT", e,new NodeLiteral(new TypeBoolean(), false));
				}
			},
			new Action() {	// [101] expression = expression.e1 TOKEN_LT expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeRel("LT", e1,e2);
				}
			},
			new Action() {	// [102] expression = expression.e1 TOKEN_LE expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeRel("LE", e1,e2);
				}
			},
			new Action() {	// [103] expression = expression.e1 TOKEN_GT expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeRel("GT", e1,e2);
				}
			},
			new Action() {	// [104] expression = expression.e1 TOKEN_GE expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeRel("GE", e1,e2);
				}
			},
			new Action() {	// [105] expression = expression.e1 TOKEN_EQ expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeRel("EQ", e1,e2);
				}
			},
			new Action() {	// [106] expression = expression.e1 TOKEN_NE expression.e2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e1 = _symbols[offset + 1];
					final NodeExp e1 = (NodeExp) _symbol_e1.value;
					final Symbol _symbol_e2 = _symbols[offset + 3];
					final NodeExp e2 = (NodeExp) _symbol_e2.value;
					 return new NodeRel("NE", e1,e2);
				}
			},
			new Action() {	// [107] expression = TOKEN_LPAR expression.e TOKEN_RPAR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final NodeExp e = (NodeExp) _symbol_e.value;
					 return e;
				}
			},
			new Action() {	// [108] expression = procedure_expression.pe
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_pe = _symbols[offset + 1];
					final Node pe = (Node) _symbol_pe.value;
					 return pe;
				}
			},
			new Action() {	// [109] expression = variable_access.va
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_va = _symbols[offset + 1];
					final NodeExp va = (NodeExp) _symbol_va.value;
					 return va;
				}
			},
			new Action() {	// [110] expression = literal.l
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol l = _symbols[offset + 1];
					 return l;
				}
			},
			new Action() {	// [111] literal = TOKEN_LIT_INTEGER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final Integer i = (Integer) _symbol_i.value;
					 TypeInt type = new TypeInt(i); return new NodeLiteral(type, i);
				}
			},
			new Action() {	// [112] literal = TOKEN_LIT_STRING.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 1];
					final String s = (String) _symbol_s.value;
					 TypeString type = new TypeString(); return new NodeLiteral(type, s);
				}
			},
			new Action() {	// [113] literal = TOKEN_TRUE.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Boolean t = (Boolean) _symbol_t.value;
					 TypeBoolean type = new TypeBoolean(); return new NodeLiteral(type, "true");
				}
			},
			new Action() {	// [114] literal = TOKEN_FALSE.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_f = _symbols[offset + 1];
					final Boolean f = (Boolean) _symbol_f.value;
					 TypeBoolean type = new TypeBoolean(); return new NodeLiteral(type, "false");
				}
			},
			new Action() {	// [115] literal = TOKEN_NULL.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_n = _symbols[offset + 1];
					final Void n = (Void) _symbol_n.value;
					 TypeVoid type = new TypeVoid(); return new NodeLiteral(type, "null");
				}
			}
		};


    report = new Events();
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
