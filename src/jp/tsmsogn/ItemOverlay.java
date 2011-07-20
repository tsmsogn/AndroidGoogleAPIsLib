package jp.tsmsogn;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class ItemOverlay extends ItemizedOverlay<OverlayItem> {
	protected ArrayList<OverlayItem> mItems = new ArrayList<OverlayItem>();
	protected Context mContext;

	public ItemOverlay(Drawable defaultMarker, Context context) {
		super(boundCenterBottom(defaultMarker));
		mContext = context;
	}

	@Override
	protected OverlayItem createItem(int i) {
		return mItems.get(i);
	}

	@Override
	public int size() {
		return mItems.size();
	}

	public void add(OverlayItem overlay) {
		mItems.add(overlay);
		populate();
	}
	
	public void clear() {
		mItems.clear();
		populate();
	}
	
	public void remove(int i) {
		mItems.remove(i);
		populate();
	}

}
