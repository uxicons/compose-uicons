package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Alien: ImageVector? = null

val Icons.Bs.Alien: ImageVector
    get() = _Alien ?: UXIcon(name = "Alien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(6.49f, 0f, 2f, 4.49f, 2f, 10f)
                curveToRelative(0f, 7.34f, 8.8f, 13.18f, 9.18f, 13.42f)
                lineToRelative(0.82f, 0.54f)
                lineToRelative(0.82f, -0.54f)
                curveToRelative(0.38f, -0.24f, 9.18f, -6.08f, 9.18f, -13.42f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                close()
                moveTo(12f, 20.32f)
                curveToRelative(-2.01f, -1.51f, -7f, -5.74f, -7f, -10.32f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 4.59f, -4.99f, 8.81f, -7f, 10.32f)
                close()
                moveTo(14.01f, 9.01f)
                curveToRelative(1.24f, -1.24f, 3.97f, -0.99f, 3.97f, -0.99f)
                curveToRelative(0f, 0f, 0.25f, 2.73f, -0.99f, 3.97f)
                reflectiveCurveToRelative(-3.97f, 0.99f, -3.97f, 0.99f)
                curveToRelative(0f, 0f, -0.25f, -2.73f, 0.99f, -3.97f)
                close()
                moveTo(9.99f, 9.01f)
                curveToRelative(1.24f, 1.24f, 0.99f, 3.97f, 0.99f, 3.97f)
                curveToRelative(0f, 0f, -2.73f, 0.25f, -3.97f, -0.99f)
                reflectiveCurveToRelative(-0.99f, -3.97f, -0.99f, -3.97f)
                curveToRelative(0f, 0f, 2.73f, -0.25f, 3.97f, 0.99f)
                close()
            }
        }.also { _Alien = it}
