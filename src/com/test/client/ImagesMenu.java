package com.test.client;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.user.client.ui.Tree;


/**
 * Specifies the images that will be bundled for this example.
 * 
 * We will override the leaf image used in the tree. Instead of using a blank
 * 16x16 image, we will use a blank 1x1 image so it does not take up any
 * space. Each TreeItem will use its own custom image.
 */
public interface ImagesMenu extends Tree.Resources {

	@Source("contactsgroup.png")
  ImageResource contactsgroup();

	@Source("defaultcontact.png")
  ImageResource defaultContact();

	@Source("drafts.png")
  ImageResource drafts();

	@Source("filtergroup.png")
  ImageResource filtersgroup();

	@Source("inbox.png")
  ImageResource inbox();

	@Source("mailgroup.png")
  ImageResource mailgroup();

	@Source("sent.png")
  ImageResource sent();

	@Source("template.png")
  ImageResource templates();

	@Source("trash.png")
  ImageResource trash();

  /**
   * Use noimage.png, which is a blank 1x1 image.
   */
  @Source("noimage.png")
  ImageResource treeLeaf();
}