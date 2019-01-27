import groovy.swing.SwingBuilder

import java.awt.BorderLayout as BL

count = 0
new SwingBuilder().edt {
	frame(title: 'Swing', size: [ 200, 100 ], show: true) {
		borderLayout()
		textlabel = label(text: 'Click the button!', constraints: BL.NORTH)
		button(text: 'Click Me', constraints: BL.SOUTH,
				actionPerformed: {
					textlabel.text = "Clicked ${ ++count } time(s)."
				})
	}
}
