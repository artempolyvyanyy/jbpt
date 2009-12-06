/**
 * Copyright (c) 2008 Artem Polyvyanyy
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.hpi.bpt.process.epc;

/**
 * EPC connector implementation
 * 
 * @author Artem Polyvyanyy
 */
public class Connector extends FlowObject implements IConnector {
	private ConnectorType type = ConnectorType.UNDEFINED;
	
	public Connector(ConnectorType type) {
		super();
		this.setConnectorType(type);
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.flow.IConnector#getConnectorType()
	 */
	public ConnectorType getConnectorType() {
		return type;
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.flow.IConnector#setConnectorType(de.hpi.bpt.process.epc.flow.ConnectorType)
	 */
	public void setConnectorType(ConnectorType type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.flow.FlowObject#getType()
	 */
	@Override
	public FlowObjectType getType() {
		return FlowObjectType.CONNECTOR;
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.hypergraph.abs.GObject#toString()
	 */
	@Override
	public String toString() {
		return this.type.name();
	}

	public boolean isAND() {
		return this.getConnectorType()==ConnectorType.AND;
	}

	public boolean isOR() {
		return this.getConnectorType()==ConnectorType.OR;
	}

	public boolean isXOR() {
		return this.getConnectorType()==ConnectorType.XOR;
	}	
}