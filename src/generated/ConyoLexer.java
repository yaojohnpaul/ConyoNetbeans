/* The following code was generated by JFlex 1.6.0 */

/*Import*/
import generated.sym;
import java.io.*;
import java_cup.runtime.*;

/**
 * Conyo++ Language Lexer
 * CHUA, Jedrick
 * LIVELO, Evan Dennison
 * YAO, John Paul
 */

public class ConyoLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int CHARACTER = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\2\5\1\3\1\104\1\104\1\4\22\0\1\5\1\101\1\103"+
    "\1\0\1\62\1\73\1\77\1\102\1\63\1\64\1\10\1\71\1\60"+
    "\1\72\1\12\1\7\1\11\11\2\1\61\1\0\1\74\1\76\1\75"+
    "\2\0\1\36\1\31\1\1\1\53\2\1\1\16\1\54\2\1\1\47"+
    "\1\1\1\15\1\41\1\14\1\50\1\1\1\51\1\46\1\44\1\43"+
    "\1\1\1\52\1\1\1\22\1\1\1\65\1\6\1\66\1\0\1\1"+
    "\1\0\1\23\1\25\1\57\1\26\1\13\1\55\1\45\1\17\1\20"+
    "\1\1\1\30\1\32\1\27\1\40\1\56\1\35\1\1\1\21\1\33"+
    "\1\37\1\34\1\1\1\42\1\1\1\24\1\1\1\67\1\100\1\70"+
    "\7\0\1\104\u1fa2\0\1\104\1\104\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\0\1\2\1\3\1\4\2\5\1\6"+
    "\1\7\1\4\1\10\17\3\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\3\2\1\27\1\30\1\31\1\1\1\32"+
    "\1\2\1\5\3\0\11\3\1\33\11\3\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\2\45"+
    "\2\0\1\46\1\47\1\50\20\3\2\0\1\51\1\3"+
    "\1\52\1\53\10\3\1\54\4\3\2\45\3\3\1\55"+
    "\1\56\16\3\1\57\1\3\1\60\5\3\1\61\16\3"+
    "\1\62\1\3\1\63\20\3\1\64\1\3\1\65\1\66"+
    "\1\67\1\3\1\70\1\71\1\72\3\3\1\73\1\3"+
    "\1\74\5\3\1\75\1\3\1\76\1\3\1\77\1\100"+
    "\1\101\1\3\1\102\1\3\1\103\1\104\1\105\1\106"+
    "\4\3\1\107";

  private static int [] zzUnpackAction() {
    int [] result = new int[226];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\105\0\212\0\317\0\u0114\0\u0159\0\317\0\u019e"+
    "\0\u01e3\0\317\0\u0228\0\317\0\u026d\0\u02b2\0\u02f7\0\u033c"+
    "\0\u0381\0\u03c6\0\u040b\0\u0450\0\u0495\0\u04da\0\u051f\0\u0564"+
    "\0\u05a9\0\u05ee\0\u0633\0\317\0\317\0\317\0\317\0\317"+
    "\0\317\0\317\0\317\0\317\0\u0678\0\u06bd\0\317\0\u0702"+
    "\0\u0747\0\u078c\0\u07d1\0\u0816\0\317\0\317\0\317\0\u085b"+
    "\0\317\0\u08a0\0\u08a0\0\u08a0\0\u08e5\0\u092a\0\u096f\0\u09b4"+
    "\0\u09f9\0\u0a3e\0\u0a83\0\u0ac8\0\u0b0d\0\u0b52\0\u0b97\0\u0114"+
    "\0\u0bdc\0\u0c21\0\u0c66\0\u0cab\0\u0cf0\0\u0d35\0\u0d7a\0\u0dbf"+
    "\0\u0e04\0\317\0\317\0\317\0\317\0\317\0\317\0\317"+
    "\0\317\0\317\0\u0e49\0\u0e8e\0\u0ed3\0\u0f18\0\u0114\0\u0114"+
    "\0\u0114\0\u0f5d\0\u0fa2\0\u0fe7\0\u102c\0\u1071\0\u10b6\0\u10fb"+
    "\0\u1140\0\u1185\0\u11ca\0\u120f\0\u1254\0\u1299\0\u12de\0\u1323"+
    "\0\u1368\0\u13ad\0\u13f2\0\317\0\u1437\0\u0114\0\u0114\0\u147c"+
    "\0\u14c1\0\u1506\0\u154b\0\u1590\0\u15d5\0\u161a\0\u165f\0\u0114"+
    "\0\u16a4\0\u16e9\0\u172e\0\u1773\0\u17b8\0\317\0\u17fd\0\u1842"+
    "\0\u1887\0\u0114\0\u0114\0\u18cc\0\u1911\0\u1956\0\u199b\0\u19e0"+
    "\0\u1a25\0\u1a6a\0\u1aaf\0\u1af4\0\u1b39\0\u1b7e\0\u1bc3\0\u1c08"+
    "\0\u1c4d\0\u0114\0\u1c92\0\u0114\0\u1cd7\0\u1d1c\0\u1d61\0\u1da6"+
    "\0\u1deb\0\u0114\0\u1e30\0\u1e75\0\u1eba\0\u1eff\0\u1f44\0\u1f89"+
    "\0\u1fce\0\u2013\0\u2058\0\u209d\0\u20e2\0\u2127\0\u216c\0\u21b1"+
    "\0\u0114\0\u21f6\0\u0114\0\u223b\0\u2280\0\u22c5\0\u230a\0\u234f"+
    "\0\u2394\0\u23d9\0\u241e\0\u2463\0\u24a8\0\u24ed\0\u2532\0\u2577"+
    "\0\u25bc\0\u2601\0\u2646\0\u0114\0\u268b\0\u0114\0\u0114\0\u0114"+
    "\0\u26d0\0\u0114\0\u0114\0\u0114\0\u2715\0\u275a\0\u279f\0\u0114"+
    "\0\u27e4\0\u0114\0\u2829\0\u286e\0\u28b3\0\u28f8\0\u293d\0\u0114"+
    "\0\u2982\0\u0114\0\u29c7\0\u0114\0\u0114\0\u0114\0\u2a0c\0\u0114"+
    "\0\u2a51\0\u0114\0\u0114\0\u0114\0\u2a96\0\u2adb\0\u2b20\0\u2b65"+
    "\0\u2baa\0\u0114";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[226];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\7\1\4\1\11"+
    "\1\12\1\13\1\14\1\5\1\15\1\16\1\5\1\17"+
    "\1\20\3\5\1\21\1\22\1\23\1\24\2\5\1\25"+
    "\1\26\1\5\1\27\1\5\1\30\1\21\1\5\1\31"+
    "\12\5\1\32\1\5\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\0\3\60\1\7\1\10\1\60\1\4\74\60\1\61"+
    "\1\60\3\62\1\7\1\10\1\63\1\4\74\62\1\4"+
    "\1\64\106\0\2\5\6\0\1\5\1\0\45\5\27\0"+
    "\1\6\6\0\1\6\1\65\75\0\1\7\111\0\1\66"+
    "\106\0\1\65\73\0\2\5\6\0\1\5\1\0\2\5"+
    "\1\67\42\5\26\0\2\5\6\0\1\5\1\0\36\5"+
    "\1\70\1\5\1\71\4\5\26\0\2\5\6\0\1\5"+
    "\1\0\5\5\1\72\37\5\26\0\2\5\6\0\1\5"+
    "\1\0\25\5\1\73\17\5\26\0\2\5\6\0\1\5"+
    "\1\0\21\5\1\74\23\5\26\0\2\5\6\0\1\5"+
    "\1\0\6\5\1\75\1\5\1\76\32\5\1\77\1\5"+
    "\26\0\2\5\6\0\1\5\1\0\12\5\1\100\32\5"+
    "\26\0\2\5\6\0\1\5\1\0\10\5\1\101\34\5"+
    "\26\0\2\5\6\0\1\5\1\0\5\5\1\102\37\5"+
    "\26\0\2\5\6\0\1\5\1\0\21\5\1\103\2\5"+
    "\1\104\20\5\26\0\2\5\6\0\1\5\1\0\43\5"+
    "\1\105\1\5\26\0\2\5\6\0\1\5\1\0\4\5"+
    "\1\106\40\5\26\0\2\5\6\0\1\5\1\0\10\5"+
    "\1\107\34\5\26\0\2\5\6\0\1\5\1\0\17\5"+
    "\1\110\25\5\26\0\2\5\6\0\1\5\1\0\4\5"+
    "\1\111\40\5\116\0\1\112\105\0\1\113\107\0\1\114"+
    "\1\115\104\0\1\116\104\0\1\117\105\0\1\120\105\0"+
    "\1\121\4\0\3\60\2\0\1\60\1\0\74\60\1\0"+
    "\1\60\102\0\1\122\4\0\1\123\6\0\1\124\73\0"+
    "\10\125\1\126\74\125\1\0\2\5\6\0\1\5\1\0"+
    "\3\5\1\127\41\5\26\0\2\5\6\0\1\5\1\0"+
    "\37\5\1\130\5\5\26\0\2\5\6\0\1\5\1\0"+
    "\36\5\1\131\6\5\26\0\2\5\6\0\1\5\1\0"+
    "\6\5\1\132\36\5\26\0\2\5\6\0\1\5\1\0"+
    "\24\5\1\133\20\5\26\0\2\5\6\0\1\5\1\0"+
    "\4\5\1\134\40\5\26\0\2\5\6\0\1\5\1\0"+
    "\1\135\7\5\1\136\34\5\26\0\2\5\6\0\1\5"+
    "\1\0\11\5\1\137\33\5\26\0\2\5\6\0\1\5"+
    "\1\0\43\5\1\140\1\5\26\0\2\5\6\0\1\5"+
    "\1\0\15\5\1\141\27\5\26\0\2\5\6\0\1\5"+
    "\1\0\15\5\1\142\27\5\26\0\2\5\6\0\1\5"+
    "\1\0\22\5\1\143\22\5\26\0\2\5\6\0\1\5"+
    "\1\0\6\5\1\144\36\5\26\0\2\5\6\0\1\5"+
    "\1\0\43\5\1\145\1\5\26\0\2\5\6\0\1\5"+
    "\1\0\5\5\1\146\37\5\26\0\2\5\6\0\1\5"+
    "\1\0\17\5\1\147\25\5\26\0\2\5\6\0\1\5"+
    "\1\0\43\5\1\150\1\5\26\0\2\5\6\0\1\5"+
    "\1\0\10\5\1\151\34\5\27\0\1\123\6\0\1\123"+
    "\1\0\1\152\104\0\1\152\71\0\10\125\1\153\74\125"+
    "\7\0\1\154\1\126\75\0\2\5\6\0\1\5\1\0"+
    "\1\155\44\5\26\0\2\5\6\0\1\5\1\0\11\5"+
    "\1\156\33\5\26\0\2\5\6\0\1\5\1\0\4\5"+
    "\1\157\40\5\26\0\2\5\6\0\1\5\1\0\10\5"+
    "\1\160\34\5\26\0\2\5\6\0\1\5\1\0\25\5"+
    "\1\161\17\5\26\0\2\5\6\0\1\5\1\0\10\5"+
    "\1\162\34\5\26\0\2\5\6\0\1\5\1\0\17\5"+
    "\1\163\25\5\26\0\2\5\6\0\1\5\1\0\1\164"+
    "\44\5\26\0\2\5\6\0\1\5\1\0\1\165\44\5"+
    "\26\0\2\5\6\0\1\5\1\0\1\166\44\5\26\0"+
    "\2\5\6\0\1\5\1\0\5\5\1\167\37\5\26\0"+
    "\2\5\6\0\1\5\1\0\6\5\1\170\36\5\26\0"+
    "\2\5\6\0\1\5\1\0\20\5\1\171\24\5\26\0"+
    "\2\5\6\0\1\5\1\0\1\172\44\5\26\0\2\5"+
    "\6\0\1\5\1\0\10\5\1\173\34\5\26\0\2\5"+
    "\6\0\1\5\1\0\6\5\1\174\36\5\27\0\1\175"+
    "\6\0\1\176\73\0\7\125\1\154\1\153\74\125\1\0"+
    "\2\5\6\0\1\5\1\0\7\5\1\177\35\5\26\0"+
    "\2\5\6\0\1\5\1\0\15\5\1\200\27\5\26\0"+
    "\2\5\6\0\1\5\1\0\13\5\1\201\31\5\26\0"+
    "\2\5\6\0\1\5\1\0\13\5\1\202\31\5\26\0"+
    "\2\5\6\0\1\5\1\0\11\5\1\203\33\5\26\0"+
    "\2\5\6\0\1\5\1\0\3\5\1\204\12\5\1\205"+
    "\2\5\1\206\1\5\1\207\4\5\1\210\1\211\1\5"+
    "\1\212\1\213\1\214\7\5\26\0\2\5\6\0\1\5"+
    "\1\0\34\5\1\215\4\5\1\216\3\5\26\0\2\5"+
    "\6\0\1\5\1\0\6\5\1\217\36\5\26\0\2\5"+
    "\6\0\1\5\1\0\25\5\1\220\17\5\26\0\2\5"+
    "\6\0\1\5\1\0\26\5\1\221\16\5\26\0\2\5"+
    "\6\0\1\5\1\0\11\5\1\222\33\5\26\0\2\5"+
    "\6\0\1\5\1\0\24\5\1\223\20\5\26\0\2\5"+
    "\6\0\1\5\1\0\11\5\1\224\33\5\27\0\1\175"+
    "\6\0\1\175\74\0\2\5\6\0\1\5\1\0\10\5"+
    "\1\225\34\5\26\0\2\5\6\0\1\5\1\0\21\5"+
    "\1\226\23\5\26\0\2\5\6\0\1\5\1\0\26\5"+
    "\1\227\16\5\26\0\2\5\6\0\1\5\1\0\10\5"+
    "\1\230\34\5\26\0\2\5\6\0\1\5\1\0\10\5"+
    "\1\231\34\5\26\0\2\5\6\0\1\5\1\0\22\5"+
    "\1\232\22\5\26\0\2\5\6\0\1\5\1\0\6\5"+
    "\1\233\36\5\26\0\2\5\6\0\1\5\1\0\17\5"+
    "\1\234\4\5\1\235\20\5\26\0\2\5\6\0\1\5"+
    "\1\0\10\5\1\236\34\5\26\0\2\5\6\0\1\5"+
    "\1\0\5\5\1\237\2\5\1\240\10\5\1\241\23\5"+
    "\26\0\2\5\6\0\1\5\1\0\21\5\1\242\23\5"+
    "\26\0\2\5\6\0\1\5\1\0\10\5\1\243\34\5"+
    "\26\0\2\5\6\0\1\5\1\0\10\5\1\244\34\5"+
    "\26\0\2\5\6\0\1\5\1\0\10\5\1\245\34\5"+
    "\26\0\2\5\6\0\1\5\1\0\7\5\1\246\35\5"+
    "\26\0\2\5\6\0\1\5\1\0\32\5\1\247\12\5"+
    "\26\0\2\5\6\0\1\5\1\0\10\5\1\250\34\5"+
    "\26\0\2\5\6\0\1\5\1\0\11\5\1\251\33\5"+
    "\26\0\2\5\6\0\1\5\1\0\11\5\1\252\33\5"+
    "\26\0\2\5\6\0\1\5\1\0\22\5\1\253\22\5"+
    "\26\0\2\5\6\0\1\5\1\0\1\254\44\5\26\0"+
    "\2\5\6\0\1\5\1\0\27\5\1\255\15\5\26\0"+
    "\2\5\6\0\1\5\1\0\17\5\1\256\1\257\24\5"+
    "\26\0\2\5\6\0\1\5\1\0\24\5\1\260\20\5"+
    "\26\0\2\5\6\0\1\5\1\0\5\5\1\261\37\5"+
    "\26\0\2\5\6\0\1\5\1\0\21\5\1\262\23\5"+
    "\26\0\2\5\6\0\1\5\1\0\27\5\1\263\15\5"+
    "\26\0\2\5\6\0\1\5\1\0\14\5\1\264\30\5"+
    "\26\0\2\5\6\0\1\5\1\0\12\5\1\265\32\5"+
    "\26\0\2\5\6\0\1\5\1\0\17\5\1\266\25\5"+
    "\26\0\2\5\6\0\1\5\1\0\4\5\1\267\40\5"+
    "\26\0\2\5\6\0\1\5\1\0\17\5\1\270\25\5"+
    "\26\0\2\5\6\0\1\5\1\0\22\5\1\271\22\5"+
    "\26\0\2\5\6\0\1\5\1\0\12\5\1\272\32\5"+
    "\26\0\2\5\6\0\1\5\1\0\10\5\1\273\34\5"+
    "\26\0\2\5\6\0\1\5\1\0\11\5\1\274\33\5"+
    "\26\0\2\5\6\0\1\5\1\0\17\5\1\275\25\5"+
    "\26\0\2\5\6\0\1\5\1\0\10\5\1\276\34\5"+
    "\26\0\2\5\6\0\1\5\1\0\27\5\1\277\15\5"+
    "\26\0\2\5\6\0\1\5\1\0\10\5\1\300\34\5"+
    "\26\0\2\5\6\0\1\5\1\0\5\5\1\301\37\5"+
    "\26\0\2\5\6\0\1\5\1\0\10\5\1\302\34\5"+
    "\26\0\2\5\6\0\1\5\1\0\1\303\44\5\26\0"+
    "\2\5\6\0\1\5\1\0\24\5\1\304\20\5\26\0"+
    "\2\5\6\0\1\5\1\0\20\5\1\305\24\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\306\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\21\5\1\307\23\5\26\0"+
    "\2\5\6\0\1\5\1\0\5\5\1\310\37\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\311\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\312\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\5\5\1\313\37\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\314\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\315\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\11\5\1\316\33\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\317\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\15\5\1\320\27\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\321\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\32\5\1\322\12\5\26\0"+
    "\2\5\6\0\1\5\1\0\17\5\1\323\25\5\26\0"+
    "\2\5\6\0\1\5\1\0\24\5\1\324\20\5\26\0"+
    "\2\5\6\0\1\5\1\0\24\5\1\325\20\5\26\0"+
    "\2\5\6\0\1\5\1\0\32\5\1\326\12\5\26\0"+
    "\2\5\6\0\1\5\1\0\25\5\1\327\17\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\330\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\25\5\1\331\17\5\26\0"+
    "\2\5\6\0\1\5\1\0\25\5\1\332\17\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\333\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\32\5\1\334\12\5\26\0"+
    "\2\5\6\0\1\5\1\0\32\5\1\335\12\5\26\0"+
    "\2\5\6\0\1\5\1\0\34\5\1\336\10\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\337\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\22\5\1\340\22\5\26\0"+
    "\2\5\6\0\1\5\1\0\10\5\1\341\34\5\26\0"+
    "\2\5\6\0\1\5\1\0\32\5\1\342\12\5\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11247];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\0\1\11\2\1\1\11\2\1\1\11"+
    "\1\1\1\11\17\1\11\11\2\1\1\11\5\1\3\11"+
    "\1\1\1\11\2\1\3\0\23\1\11\11\2\1\2\0"+
    "\23\1\2\0\1\11\21\1\1\11\144\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[226];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	StringBuffer string = new StringBuffer();

	private Symbol symbol(int type) {
		return new Symbol(type, yyline, yycolumn);
	}
	
	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}
	
	public int lineNo()
	{
		return yyline;
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ConyoLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 224) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { return symbol(sym.STRING_LITERAL, yytext());
          }
        case 72: break;
        case 2: 
          { System.out.println("Invalid.");
          }
        case 73: break;
        case 3: 
          { return symbol(sym.IDENTIFIER, yytext());
          }
        case 74: break;
        case 4: 
          { return symbol(sym.INT_LITERAL, yytext());
          }
        case 75: break;
        case 5: 
          { /*blank*/
          }
        case 76: break;
        case 6: 
          { return symbol(sym.DIVIDE);
          }
        case 77: break;
        case 7: 
          { return symbol(sym.TIMES);
          }
        case 78: break;
        case 8: 
          { return symbol(sym.PERIOD);
          }
        case 79: break;
        case 9: 
          { return symbol(sym.COMMA);
          }
        case 80: break;
        case 10: 
          { return symbol(sym.COLON);
          }
        case 81: break;
        case 11: 
          { return symbol(sym.DOLLAR_SIGN);
          }
        case 82: break;
        case 12: 
          { return symbol(sym.LEFT_PAREN);
          }
        case 83: break;
        case 13: 
          { return symbol(sym.RIGHT_PAREN);
          }
        case 84: break;
        case 14: 
          { return symbol(sym.LEFT_BRACE);
          }
        case 85: break;
        case 15: 
          { return symbol(sym.RIGHT_BRACE);
          }
        case 86: break;
        case 16: 
          { return symbol(sym.LEFT_CURLY);
          }
        case 87: break;
        case 17: 
          { return symbol(sym.RIGHT_CURLY);
          }
        case 88: break;
        case 18: 
          { return symbol(sym.PLUS);
          }
        case 89: break;
        case 19: 
          { return symbol(sym.MINUS);
          }
        case 90: break;
        case 20: 
          { return symbol(sym.MODULO);
          }
        case 91: break;
        case 21: 
          { return symbol(sym.LESS_THAN);
          }
        case 92: break;
        case 22: 
          { return symbol(sym.GREATER_THAN);
          }
        case 93: break;
        case 23: 
          { return symbol(sym.NOT);
          }
        case 94: break;
        case 24: 
          { yybegin(CHARACTER);
          }
        case 95: break;
        case 25: 
          { yybegin(STRING);
          }
        case 96: break;
        case 26: 
          { yybegin(YYINITIAL);
          }
        case 97: break;
        case 27: 
          { return symbol(sym.DB);
          }
        case 98: break;
        case 28: 
          { return symbol(sym.POS_INC);
          }
        case 99: break;
        case 29: 
          { return symbol(sym.NEG_INC);
          }
        case 100: break;
        case 30: 
          { return symbol(sym.NOT_EQUAL);
          }
        case 101: break;
        case 31: 
          { return symbol(sym.LT_EQUAL);
          }
        case 102: break;
        case 32: 
          { return symbol(sym.GT_EQUAL);
          }
        case 103: break;
        case 33: 
          { return symbol(sym.EQUAL_EQUAL);
          }
        case 104: break;
        case 34: 
          { return symbol(sym.AND);
          }
        case 105: break;
        case 35: 
          { return symbol(sym.OR);
          }
        case 106: break;
        case 36: 
          { yybegin(YYINITIAL); return symbol(sym.CHAR_LITERAL, yytext().substring(0, 1));
          }
        case 107: break;
        case 37: 
          { return symbol(sym.FLOAT_LITERAL, yytext());
          }
        case 108: break;
        case 38: 
          { return symbol(sym.OMG);
          }
        case 109: break;
        case 39: 
          { return symbol(sym.MRW);
          }
        case 110: break;
        case 40: 
          { return symbol(sym.MDR);
          }
        case 111: break;
        case 41: 
          { /*Comment*/
          }
        case 112: break;
        case 42: 
          { return symbol(sym.INTY, yytext());
          }
        case 113: break;
        case 43: 
          { return symbol(sym.BOOL_LITERAL, yytext());
          }
        case 114: break;
        case 44: 
          { return symbol(sym.POOR, yytext());
          }
        case 115: break;
        case 45: 
          { return symbol(sym.BAYAD);
          }
        case 116: break;
        case 46: 
          { return symbol(sym.BOOLY, yytext());
          }
        case 117: break;
        case 47: 
          { return symbol(sym.WALEY, yytext());
          }
        case 118: break;
        case 48: 
          { return symbol(sym.CHARY, yytext());
          }
        case 119: break;
        case 49: 
          { return symbol(sym.MAKEUP);
          }
        case 120: break;
        case 50: 
          { return symbol(sym.FLOATY, yytext());
          }
        case 121: break;
        case 51: 
          { return symbol(sym.BREAKUP);
          }
        case 122: break;
        case 52: 
          { return symbol(sym.STRINGY, yytext());
          }
        case 123: break;
        case 53: 
          { return symbol(sym.HIRE_YAYA);
          }
        case 124: break;
        case 54: 
          { return symbol(sym.BRAND_NEW);
          }
        case 125: break;
        case 55: 
          { return symbol(sym.MAKE_GAWA);
          }
        case 126: break;
        case 56: 
          { return symbol(sym.MAKE_BASA);
          }
        case 127: break;
        case 57: 
          { return symbol(sym.MAKE_ARTE);
          }
        case 128: break;
        case 58: 
          { return symbol(sym.MAKE_ULIT);
          }
        case 129: break;
        case 59: 
          { return symbol(sym.MAKE_SABI);
          }
        case 130: break;
        case 60: 
          { return symbol(sym.MAKE_KUHA);
          }
        case 131: break;
        case 61: 
          { return symbol(sym.MAKE_BALIK);
          }
        case 132: break;
        case 62: 
          { return symbol(sym.MAKE_TAWAG);
          }
        case 133: break;
        case 63: 
          { return symbol(sym.MAKE_SULAT);
          }
        case 134: break;
        case 64: 
          { return symbol(sym.MAKE_PALIT);
          }
        case 135: break;
        case 65: 
          { return symbol(sym.LIKE_KAPAG);
          }
        case 136: break;
        case 66: 
          { return symbol(sym.SUPER_YAYA);
          }
        case 137: break;
        case 67: 
          { return symbol(sym.MAKE_UTUSAN);
          }
        case 138: break;
        case 68: 
          { return symbol(sym.MAKE_SIMULA);
          }
        case 139: break;
        case 69: 
          { return symbol(sym.LIKE_HABANG);
          }
        case 140: break;
        case 70: 
          { return symbol(sym.THIS_NALANG);
          }
        case 141: break;
        case 71: 
          { return symbol(sym.THIS_NALANG_KAPAG);
          }
        case 142: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {
                return symbol(sym.EOF);
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
