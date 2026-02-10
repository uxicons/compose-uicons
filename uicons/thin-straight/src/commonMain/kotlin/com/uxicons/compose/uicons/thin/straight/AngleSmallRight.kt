package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallRight: ImageVector? = null

val Icons.Ts.AngleSmallRight: ImageVector
    get() = _AngleSmallRight ?: UXIcon(name = "AngleSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.28f, 18.34f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(5.28f, -5.28f)
                curveToRelative(0.09f, -0.1f, 0.15f, -0.22f, 0.15f, -0.35f)
                reflectiveCurveToRelative(-0.05f, -0.26f, -0.15f, -0.35f)
                lineToRelative(-5.28f, -5.28f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(5.28f, 5.28f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                lineToRelative(-5.28f, 5.28f)
                close()
            }
        }.also { _AngleSmallRight = it}
