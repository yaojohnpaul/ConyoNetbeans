{"filter":false,"title":"ss_OR.java","tooltip":"/src/created/ParseTree/SabiSabi/ss_OR.java","undoManager":{"mark":100,"position":100,"stack":[[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":70,"column":17},"end":{"row":70,"column":18}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":70,"column":18},"end":{"row":70,"column":19}},"text":"d"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":70,"column":19},"end":{"row":70,"column":20}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":70,"column":20},"end":{"row":70,"column":21}},"text":"="}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":70,"column":21},"end":{"row":70,"column":22}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":74,"column":0},"end":{"row":74,"column":42}},"text":"            String and = a.checkContext();"},{"action":"removeText","range":{"start":{"row":73,"column":1},"end":{"row":73,"column":41}},"text":"           String or = o.checkContext();"},{"action":"removeText","range":{"start":{"row":73,"column":1},"end":{"row":74,"column":0}},"text":"\n"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":73,"column":0},"end":{"row":73,"column":1}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":72,"column":32},"end":{"row":73,"column":0}},"text":"\n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":53,"column":25},"end":{"row":53,"column":26}},"text":"1"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":54,"column":26},"end":{"row":54,"column":27}},"text":"2"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":92,"column":9},"end":{"row":93,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":93,"column":0},"end":{"row":93,"column":8}},"text":"        "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":93,"column":8},"end":{"row":94,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":94,"column":0},"end":{"row":94,"column":8}},"text":"        "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":94,"column":8},"end":{"row":94,"column":42}},"text":"public void setSymList(SymList sl)"},{"action":"insertText","range":{"start":{"row":94,"column":42},"end":{"row":95,"column":0}},"text":"\n"},{"action":"insertLines","range":{"start":{"row":95,"column":0},"end":{"row":114,"column":0}},"lines":["        {","            if(o instanceof ss_OR.ssOR)","            {","                ((ss_OR.ssOR) o).setSymList(sl);","            }","            else if(o instanceof ss_OR.ssORExpansion)","            {","                ((ss_OR.ssORExpansion) o).setSymList(sl);","            }","            ","            if(a instanceof ss_AND.ssAND)","            {","                ((ss_AND.ssAND) o).setSymList(sl);","            }","            else if(a instanceof ss_OR.ssORExpansion)","            {","                ((ss_AND.ssANDExpansion) o).setSymList(sl);","            }","        }"]},{"action":"insertText","range":{"start":{"row":114,"column":0},"end":{"row":114,"column":8}},"text":"        "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":103,"column":0},"end":{"row":103,"column":13}},"text":"            }"},{"action":"removeLines","range":{"start":{"row":97,"column":0},"end":{"row":103,"column":0}},"nl":"\n","lines":["            {","                ((ss_OR.ssOR) o).setSymList(sl);","            }","            else if(o instanceof ss_OR.ssORExpansion)","            {","                ((ss_OR.ssORExpansion) o).setSymList(sl);"]},{"action":"removeText","range":{"start":{"row":96,"column":12},"end":{"row":96,"column":39}},"text":"if(o instanceof ss_OR.ssOR)"},{"action":"removeText","range":{"start":{"row":96,"column":12},"end":{"row":97,"column":0}},"text":"\n"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":96,"column":8},"end":{"row":96,"column":12}},"text":"    "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":96,"column":4},"end":{"row":96,"column":8}},"text":"    "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":96,"column":0},"end":{"row":96,"column":4}},"text":"    "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":95,"column":9},"end":{"row":96,"column":0}},"text":"\n"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":96,"column":0},"end":{"row":96,"column":1}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":96,"column":0},"end":{"row":96,"column":11}},"text":"           "},{"action":"removeText","range":{"start":{"row":95,"column":9},"end":{"row":96,"column":0}},"text":"\n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":109,"column":32},"end":{"row":110,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":110,"column":0},"end":{"row":110,"column":12}},"text":"            "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":110,"column":12},"end":{"row":110,"column":42}},"text":" if(a instanceof ss_AND.ssAND)"},{"action":"insertText","range":{"start":{"row":110,"column":42},"end":{"row":111,"column":0}},"text":"\n"},{"action":"insertLines","range":{"start":{"row":111,"column":0},"end":{"row":117,"column":0}},"lines":["            {","                ((ss_AND.ssAND) o).setSymList(sl);","            }","            else if(a instanceof ss_OR.ssORExpansion)","            {","                ((ss_AND.ssANDExpansion) o).setSymList(sl);"]},{"action":"insertText","range":{"start":{"row":117,"column":0},"end":{"row":117,"column":13}},"text":"            }"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":118,"column":12},"end":{"row":118,"column":36}},"text":"return a.checkContext();"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":116,"column":15},"end":{"row":116,"column":16}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":116,"column":16},"end":{"row":116,"column":17}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":116,"column":17},"end":{"row":116,"column":18}},"text":"t"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":116,"column":18},"end":{"row":116,"column":19}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":116,"column":19},"end":{"row":116,"column":20}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":116,"column":20},"end":{"row":116,"column":21}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":112,"column":32},"end":{"row":112,"column":33}},"text":"o"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":112,"column":32},"end":{"row":112,"column":33}},"text":"a"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":116,"column":47},"end":{"row":116,"column":48}},"text":"o"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":116,"column":47},"end":{"row":116,"column":48}},"text":"a"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":116,"column":15},"end":{"row":116,"column":16}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":112,"column":16},"end":{"row":112,"column":17}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":112,"column":17},"end":{"row":112,"column":18}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":112,"column":18},"end":{"row":112,"column":19}},"text":"t"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":112,"column":19},"end":{"row":112,"column":20}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":112,"column":20},"end":{"row":112,"column":21}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":112,"column":21},"end":{"row":112,"column":22}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":112,"column":22},"end":{"row":112,"column":23}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":110,"column":12},"end":{"row":110,"column":13}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":98,"column":32},"end":{"row":98,"column":33}},"text":"o"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":98,"column":32},"end":{"row":98,"column":33}},"text":"a"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":98,"column":32},"end":{"row":98,"column":33}},"text":"a"},{"action":"insertText","range":{"start":{"row":98,"column":32},"end":{"row":98,"column":33}},"text":"a"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":102,"column":41},"end":{"row":102,"column":42}},"text":"o"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":102,"column":41},"end":{"row":102,"column":42}},"text":"a"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":102,"column":41},"end":{"row":102,"column":42}},"text":"a"},{"action":"insertText","range":{"start":{"row":102,"column":41},"end":{"row":102,"column":42}},"text":"a"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":66,"column":38},"end":{"row":66,"column":39}},"text":"o"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":66,"column":38},"end":{"row":66,"column":39}},"text":"a"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":66,"column":38},"end":{"row":66,"column":39}},"text":"a"},{"action":"insertText","range":{"start":{"row":66,"column":38},"end":{"row":66,"column":39}},"text":"a"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":70,"column":47},"end":{"row":70,"column":48}},"text":"o"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":70,"column":47},"end":{"row":70,"column":48}},"text":"a"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":70,"column":47},"end":{"row":70,"column":48}},"text":"a"},{"action":"insertText","range":{"start":{"row":70,"column":47},"end":{"row":70,"column":48}},"text":"a"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":116,"column":51},"end":{"row":116,"column":61}},"text":"setSymList"},{"action":"insertText","range":{"start":{"row":116,"column":51},"end":{"row":116,"column":52}},"text":"c"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":116,"column":51},"end":{"row":116,"column":52}},"text":"c"},{"action":"insertText","range":{"start":{"row":116,"column":51},"end":{"row":116,"column":63}},"text":"checkContext"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":112,"column":42},"end":{"row":112,"column":52}},"text":"setSymList"},{"action":"insertText","range":{"start":{"row":112,"column":42},"end":{"row":112,"column":43}},"text":"c"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":112,"column":42},"end":{"row":112,"column":43}},"text":"c"},{"action":"insertText","range":{"start":{"row":112,"column":42},"end":{"row":112,"column":54}},"text":"checkContext"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":117,"column":13},"end":{"row":118,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":118,"column":0},"end":{"row":118,"column":12}},"text":"            "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":118,"column":12},"end":{"row":118,"column":13}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":118,"column":13},"end":{"row":118,"column":14}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":118,"column":14},"end":{"row":118,"column":15}},"text":"t"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":118,"column":15},"end":{"row":118,"column":16}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":118,"column":16},"end":{"row":118,"column":17}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":118,"column":17},"end":{"row":118,"column":18}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":118,"column":18},"end":{"row":118,"column":19}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":118,"column":19},"end":{"row":118,"column":21}},"text":"\"\""}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":118,"column":21},"end":{"row":118,"column":22}},"text":";"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":76,"column":51},"end":{"row":77,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":77,"column":0},"end":{"row":77,"column":12}},"text":"            "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":12},"end":{"row":77,"column":13}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":13},"end":{"row":77,"column":14}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":14},"end":{"row":77,"column":15}},"text":"t"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":15},"end":{"row":77,"column":16}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":16},"end":{"row":77,"column":17}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":17},"end":{"row":77,"column":18}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":18},"end":{"row":77,"column":19}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":19},"end":{"row":77,"column":21}},"text":"\"\""}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":20},"end":{"row":77,"column":21}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":21},"end":{"row":77,"column":22}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":22},"end":{"row":77,"column":23}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":23},"end":{"row":77,"column":24}},"text":"o"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":24},"end":{"row":77,"column":25}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":77,"column":26},"end":{"row":77,"column":27}},"text":";"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":23,"column":9},"end":{"row":24,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":24,"column":0},"end":{"row":24,"column":8}},"text":"        "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":78,"column":25},"end":{"row":78,"column":26}},"text":"\""}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":78,"column":24},"end":{"row":78,"column":25}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":78,"column":23},"end":{"row":78,"column":24}},"text":"o"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":78,"column":22},"end":{"row":78,"column":23}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":78,"column":21},"end":{"row":78,"column":22}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":78,"column":20},"end":{"row":78,"column":21}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":78,"column":19},"end":{"row":78,"column":20}},"text":"\""}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":78,"column":19},"end":{"row":78,"column":20}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":78,"column":20},"end":{"row":78,"column":21}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":78,"column":21},"end":{"row":78,"column":22}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":78,"column":22},"end":{"row":78,"column":23}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":120,"column":19},"end":{"row":120,"column":21}},"text":"\"\""}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":120,"column":19},"end":{"row":120,"column":20}},"text":";"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":120,"column":19},"end":{"row":120,"column":20}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":120,"column":20},"end":{"row":120,"column":21}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":120,"column":21},"end":{"row":120,"column":22}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":120,"column":22},"end":{"row":120,"column":23}},"text":"l"}]}]]},"ace":{"folds":[],"scrolltop":1140,"scrollleft":0,"selection":{"start":{"row":120,"column":23},"end":{"row":120,"column":23},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":{"row":41,"state":"start","mode":"ace/mode/java"}},"timestamp":1416186610849,"hash":"b35f416f1df2efcf4be8dc5d69bbe4f9c0bef72e"}