package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Alien: ImageVector? = null

val Icons.Rs.Alien: ImageVector
    get() = _Alien ?: UXIcon(name = "Alien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23.96f)
                lineToRelative(-0.54f, -0.35f)
                curveToRelative(-0.39f, -0.25f, -9.46f, -6.15f, -9.46f, -13.61f)
                curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 7.46f, -9.07f, 13.36f, -9.46f, 13.61f)
                lineToRelative(-0.54f, 0.35f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                curveToRelative(0f, 5.42f, 6.12f, 10.21f, 8f, 11.55f)
                curveToRelative(1.88f, -1.34f, 8f, -6.14f, 8f, -11.55f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                close()
                moveTo(17.98f, 8.02f)
                reflectiveCurveToRelative(-2.73f, -0.25f, -3.97f, 0.99f)
                reflectiveCurveToRelative(-0.99f, 3.97f, -0.99f, 3.97f)
                curveToRelative(0f, 0f, 2.73f, 0.25f, 3.97f, -0.99f)
                reflectiveCurveToRelative(0.99f, -3.97f, 0.99f, -3.97f)
                close()
                moveTo(7.01f, 11.99f)
                curveToRelative(1.24f, 1.24f, 3.97f, 0.99f, 3.97f, 0.99f)
                curveToRelative(0f, 0f, 0.25f, -2.73f, -0.99f, -3.97f)
                reflectiveCurveToRelative(-3.97f, -0.99f, -3.97f, -0.99f)
                curveToRelative(0f, 0f, -0.25f, 2.73f, 0.99f, 3.97f)
                close()
            }
        }.also { _Alien = it}
