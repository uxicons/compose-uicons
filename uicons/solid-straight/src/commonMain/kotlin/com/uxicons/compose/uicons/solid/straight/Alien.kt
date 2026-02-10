package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Alien: ImageVector? = null

val Icons.Ss.Alien: ImageVector
    get() = _Alien ?: UXIcon(name = "Alien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(6.49f, 0f, 2f, 4.49f, 2f, 10f)
                curveToRelative(0f, 7.46f, 9.07f, 13.36f, 9.46f, 13.61f)
                lineToRelative(0.54f, 0.35f)
                lineToRelative(0.54f, -0.35f)
                curveToRelative(0.39f, -0.25f, 9.46f, -6.15f, 9.46f, -13.61f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                close()
                moveTo(10.98f, 12.98f)
                reflectiveCurveToRelative(-2.73f, 0.25f, -3.97f, -0.99f)
                reflectiveCurveToRelative(-0.99f, -3.97f, -0.99f, -3.97f)
                curveToRelative(0f, 0f, 2.73f, -0.25f, 3.97f, 0.99f)
                reflectiveCurveToRelative(0.99f, 3.97f, 0.99f, 3.97f)
                close()
                moveTo(16.99f, 11.99f)
                curveToRelative(-1.24f, 1.24f, -3.97f, 0.99f, -3.97f, 0.99f)
                curveToRelative(0f, 0f, -0.25f, -2.73f, 0.99f, -3.97f)
                reflectiveCurveToRelative(3.97f, -0.99f, 3.97f, -0.99f)
                curveToRelative(0f, 0f, 0.25f, 2.73f, -0.99f, 3.97f)
                close()
            }
        }.also { _Alien = it}
