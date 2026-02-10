package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyStickPuck: ImageVector? = null

val Icons.Rs.HockeyStickPuck: ImageVector
    get() = _HockeyStickPuck ?: UXIcon(name = "HockeyStickPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.19f, 0.03f)
                lineToRelative(-8.66f, 16.97f)
                lineTo(3.5f, 17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(6.25f)
                curveToRelative(1.51f, 0f, 2.88f, -0.84f, 3.56f, -2.18f)
                lineTo(23.97f, 0.94f)
                lineTo(22.19f, 0.03f)
                close()
                moveTo(11.53f, 20.91f)
                curveToRelative(-0.34f, 0.67f, -1.03f, 1.09f, -1.78f, 1.09f)
                lineTo(3.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.0f)
                lineToRelative(-0.97f, 1.91f)
                close()
                moveTo(24.0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _HockeyStickPuck = it}
