package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyStickPuck: ImageVector? = null

val Icons.Bs.HockeyStickPuck: ImageVector
    get() = _HockeyStickPuck ?: UXIcon(name = "HockeyStickPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.32f, 0.07f)
                lineToRelative(-8.17f, 15.93f)
                lineTo(4f, 16f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(5.67f)
                curveToRelative(1.7f, 0f, 3.23f, -0.94f, 4.0f, -2.45f)
                lineTo(23.99f, 1.44f)
                lineTo(21.32f, 0.07f)
                close()
                moveTo(11.0f, 20.18f)
                curveToRelative(-0.26f, 0.5f, -0.77f, 0.81f, -1.33f, 0.81f)
                horizontalLineToRelative(-5.67f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7.61f)
                lineToRelative(-0.61f, 1.19f)
                close()
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _HockeyStickPuck = it}
