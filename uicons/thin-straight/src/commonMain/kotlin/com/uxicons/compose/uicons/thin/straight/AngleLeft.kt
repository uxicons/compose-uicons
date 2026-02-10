package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleLeft: ImageVector? = null

val Icons.Ts.AngleLeft: ImageVector
    get() = _AngleLeft ?: UXIcon(name = "AngleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.27f, 23.89f)
                lineTo(6.44f, 13.06f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
                lineTo(17.27f, 0.11f)
                lineToRelative(0.71f, 0.71f)
                lineTo(7.15f, 11.65f)
                curveToRelative(-0.09f, 0.1f, -0.15f, 0.22f, -0.15f, 0.35f)
                reflectiveCurveToRelative(0.05f, 0.26f, 0.15f, 0.35f)
                lineToRelative(10.83f, 10.83f)
                lineToRelative(-0.71f, 0.71f)
                close()
            }
        }.also { _AngleLeft = it}
