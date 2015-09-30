/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.api;

import com.google.gwt.user.client.rpc.IsSerializable;


public interface HasResponse extends IsSerializable { //Interface for GWT RPC
	void setStatus(int status);
	int getStatus();
}
