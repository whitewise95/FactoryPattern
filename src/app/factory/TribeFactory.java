package app.factory;

import app.tribe.Terran;
import app.tribe.Tribe;

public class TribeFactory {

	public Tribe getTribe(String tribe) {
		if (tribe.isEmpty() || tribe == null) {
			return null;
		}

		switch (tribe) {
			case "테란":
				return new Terran();
		}

		return null;
	}
}
