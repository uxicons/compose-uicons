package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleRight: ImageVector? = null

val Icons.Ts.AngleRight: ImageVector
    get() = _AngleRight ?: UXIcon(name = "AngleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.73f, 23.89f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(10.83f, -10.83f)
                curveToRelative(0.1f, -0.1f, 0.15f, -0.22f, 0.15f, -0.35f)
                reflectiveCurveToRelative(-0.05f, -0.26f, -0.15f, -0.35f)
                lineTo(6.03f, 0.82f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(10.83f, 10.83f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                lineToRelative(-10.83f, 10.83f)
                close()
            }
        }.also { _AngleRight = it}
