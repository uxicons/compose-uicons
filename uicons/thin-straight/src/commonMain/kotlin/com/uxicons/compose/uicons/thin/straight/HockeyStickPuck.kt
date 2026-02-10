package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyStickPuck: ImageVector? = null

val Icons.Ts.HockeyStickPuck: ImageVector
    get() = _HockeyStickPuck ?: UXIcon(name = "HockeyStickPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.1f, 0f)
                lineToRelative(-9.29f, 18f)
                lineTo(3f, 18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6.09f)
                curveToRelative(1.69f, 0f, 3.22f, -0.93f, 4.0f, -2.44f)
                lineTo(23.99f, 0.46f)
                lineTo(23.1f, 0f)
                close()
                moveTo(12.2f, 21.11f)
                curveToRelative(-0.6f, 1.17f, -1.79f, 1.9f, -3.11f, 1.9f)
                lineTo(3f, 23.0f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(10.29f)
                lineToRelative(-1.09f, 2.1f)
                close()
                moveTo(18.0f, 21.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(23.0f, 23.0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _HockeyStickPuck = it}
