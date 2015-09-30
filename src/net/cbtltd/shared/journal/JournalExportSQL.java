/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.journal;

import net.cbtltd.shared.Event;
import net.cbtltd.shared.Journal;

public class JournalExportSQL
extends Event<Journal> {
	private String filename = "Journal.csv";

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}
