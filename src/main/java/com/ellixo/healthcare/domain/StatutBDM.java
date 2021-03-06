/*
 * Open Medicaments
 * Copyright (C) 2015  Ellixo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ellixo.healthcare.domain;

import com.google.common.base.Strings;

public enum StatutBDM {
    RAS(""), ALERTE("Alerte"), WARNING_DISPONIBILITE("Warning disponibilité");

    private String libelle;

    StatutBDM(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public static StatutBDM fromCode(String libelle) {
        if (Strings.isNullOrEmpty(libelle)) {
            return RAS;
        }

        for (StatutBDM type : values()) {
            if (type.libelle.equalsIgnoreCase(libelle)) {
                return type;
            }
        }
        return null;
    }
}
