package ch.elexis.ungrad.lucinda.model;

import java.util.List;

import ch.elexis.data.PersistentObject;

public interface Customer {
	/**
	 * Transcode a PersistentObject in a Document reflecting the customer's
	 * domain.
	 * 
	 * @param po
	 *            A PersistentObject, which is of the Customer's Subtype
	 * @return A 'Document' containing at least the properties "title" (String),
	 *         "type" (String), and "payload" (byte[]), and an arbitrary number
	 *         of arbitrary additional properties. Recommended are: "lastname",
	 *         "firstname", "birthdate" of the Patient this Document belongs to.
	 */
	public Document specify(PersistentObject po);
	
	/**
	 * Signal the Customer that a document was indexed successfully
	 * @param id
	 */
	public void success(String id);

	/**
	 * The Sender has finished the job. Do any cleanup
	 * 
	 * @param messages
	 *            All messages received from Lucinda while transmitting
	 */
	public void finished(List<Document> messages);
}