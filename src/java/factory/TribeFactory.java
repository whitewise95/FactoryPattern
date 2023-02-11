package java.factory;

import java.tribe.Terran;
import java.tribe.Tribe;

public class TribeFactory {

	public Tribe getTribe(String tribe){
		if(tribe.isBlank() || tribe == null){
			return null;
		}

		switch (tribe){
			case "Terran" : return new Terran();
		}

		return null;
	}
}
