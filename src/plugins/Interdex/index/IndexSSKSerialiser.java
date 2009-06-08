/* This code is part of Freenet. It is distributed under the GNU General
 * Public License, version 2 (or at your option any later version). See
 * http://www.gnu.org/ for further details of the GPL. */
package plugins.Interdex.index;

import freenet.keys.FreenetURI;

import plugins.Interdex.util.PrefixTreeMap;

/**
** This class handles serialisation of an IndexTree into an SSK. This includes
** metadata, filters, and {IndexNode}s. {TokenIndex}s are stored in CHKs.
**
** @author infinity0
*/
public class IndexSSKSerialiser extends IndexSerialiser {

	public IndexSSKSerialiser(FreenetURI u) {
		super(u);
	}

	public IndexSSKSerialiser(Index t) {
		super(t);
	}

	// TODO
	void inflateIndex() {}
	void inflateMeta() {}
	void inflatePMN(PrefixTreeMap node) {}

	// TODO
	void deflateIndex() {}
	void deflateMeta() {}
	void deflatePMN(PrefixTreeMap node) {}

	public void deflate(Token tk) {
		throw new UnsupportedOperationException("SSKSerialiser does not support token-deflate.");
	}

}
