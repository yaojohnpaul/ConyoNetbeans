{"changed":true,"filter":false,"title":"yaya_section.java","tooltip":"/src/created/ParseTree/Program/yaya_section.java","value":"package created.ParseTree.Program;\n\nimport created.ParseTree.Array.*;\nimport created.ParseTree.Arte.*;\nimport created.ParseTree.Literals.*;\nimport created.ParseTree.SabiSabi.*;\nimport created.ParseTree.SubYaya.*;\nimport created.ParseTree.Utos.*;\nimport created.ParseTree.Yaya.*;\n\npublic abstract class yaya_section implements created.iNode \n{\n    public static class yayaSection extends yaya_section\n    {\n        public yaya_list l;\n        \n        public yayaSection()\n        {\n            this.l = null;\n        }\n        \n        public yayaSection(yaya_list l)\n        {\n            this.l = l;\n        }\n        \n        public String toString()\n        {\n            if(l != null)\n                return l.toString();\n            else\n                return \"\";\n        }\n    }\n    \n}","undoManager":{"mark":31,"position":36,"stack":[[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":27,"column":9},"end":{"row":28,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":28,"column":0},"end":{"row":28,"column":12}},"text":"            "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":12},"end":{"row":28,"column":13}},"text":"i"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":13},"end":{"row":28,"column":14}},"text":"f"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":14},"end":{"row":28,"column":16}},"text":"()"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":15},"end":{"row":28,"column":16}},"text":"1"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":16},"end":{"row":28,"column":17}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":28,"column":16},"end":{"row":28,"column":17}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":28,"column":15},"end":{"row":28,"column":16}},"text":"1"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":15},"end":{"row":28,"column":16}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":16},"end":{"row":28,"column":17}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":17},"end":{"row":28,"column":18}},"text":"!"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":18},"end":{"row":28,"column":19}},"text":"="}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":19},"end":{"row":28,"column":20}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":20},"end":{"row":28,"column":21}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":21},"end":{"row":28,"column":22}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":22},"end":{"row":28,"column":23}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":28,"column":23},"end":{"row":28,"column":24}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":29,"column":12},"end":{"row":29,"column":16}},"text":"    "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":29,"column":36},"end":{"row":30,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":30,"column":0},"end":{"row":30,"column":16}},"text":"                "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":30,"column":12},"end":{"row":30,"column":16}},"text":"    "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":30,"column":8},"end":{"row":30,"column":12}},"text":"    "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":30,"column":8},"end":{"row":30,"column":12}},"text":"    "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":30,"column":12},"end":{"row":30,"column":13}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":30,"column":13},"end":{"row":30,"column":14}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":30,"column":14},"end":{"row":30,"column":15}},"text":"s"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":30,"column":15},"end":{"row":30,"column":16}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":30,"column":16},"end":{"row":31,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":31,"column":0},"end":{"row":31,"column":12}},"text":"            "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":12},"end":{"row":31,"column":16}},"text":"    "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":16},"end":{"row":31,"column":17}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":17},"end":{"row":31,"column":18}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":18},"end":{"row":31,"column":19}},"text":"t"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":19},"end":{"row":31,"column":20}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":20},"end":{"row":31,"column":21}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":21},"end":{"row":31,"column":22}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":22},"end":{"row":31,"column":23}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":23},"end":{"row":31,"column":25}},"text":"\"\""}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":25},"end":{"row":31,"column":26}},"text":";"}]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":31,"column":26},"end":{"row":31,"column":26},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1416134684004}