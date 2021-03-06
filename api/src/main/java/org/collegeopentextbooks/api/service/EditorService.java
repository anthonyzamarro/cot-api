package org.collegeopentextbooks.api.service;

import java.util.List;

import org.collegeopentextbooks.api.exception.RequiredValueEmptyException;
import org.collegeopentextbooks.api.model.Editor;
import org.collegeopentextbooks.api.model.Resource;

public interface EditorService {

	/**
	 * Retrieves ALL editors
	 * @return
	 * @author steve.perkins
	 */
	List<Editor> getEditors();

	/**
	 * Retrieves an editor by it's ID
	 * @param editorId
	 * @return
	 * @author steve.perkins
	 */
	Editor getEditor(Integer editorId);
	
	/**
	 * Retrieves the editors associated with the given resource
	 * @param resource
	 * @return
	 * @author steve.perkins
	 */
	List<Editor> getEditors(Resource resource);

	/**
	 * Creates or updates the given editor's scalar values.
	 * @param repository the editor to create or update
	 * @return the updated editor. If this is a create operation, the new object's ID is populated on both the returned object and the given object.
	 * @throws RequiredValueEmptyException if the provided name is missing or blank
	 * @author steve.perkins
	 */
	Editor save(Editor editor);
	
	void addEditorToResource(Resource resource, Editor editor);

}