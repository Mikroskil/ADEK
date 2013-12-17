package pkti.adek.budi.adapter;

import pkti.adek.budi.layer.baju_adat;
import pkti.adek.budi.layer.rumah_adat;
import pkti.adek.budi.layer.makanan_khas;
import pkti.adek.budi.layer.senjata_tradisional;
import pkti.adek.budi.layer.tari_daerah;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Baju Adat fragment activity
			return new baju_adat();
		case 1:
			// Rumah Adat fragment activity
			return new rumah_adat();
		case 2:
			// makanan khas fragment activity
			return new makanan_khas();
		case 3:
			// senjata tradisional fragment activity
			return new senjata_tradisional();
		case 4:
			// tari daerah fragment activity
			return new tari_daerah();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 5;
	}

}

