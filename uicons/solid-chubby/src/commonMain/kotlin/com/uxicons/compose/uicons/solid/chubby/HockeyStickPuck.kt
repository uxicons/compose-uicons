package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyStickPuck: ImageVector? = null

val Icons.Sc.HockeyStickPuck: ImageVector
    get() = _HockeyStickPuck ?: UXIcon(name = "HockeyStickPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.11f, 1.13f)
                curveToRelative(-0.76f, -0.34f, -1.64f, 0.0f, -1.98f, 0.76f)
                curveToRelative(-0.04f, 0.1f, -3.96f, 8.88f, -6.55f, 14.12f)
                curveToRelative(-1.79f, -1.19f, -4.92f, -2.69f, -8.76f, -1.99f)
                curveToRelative(-1.9f, 0.35f, -3.82f, 1.87f, -3.82f, 4.48f)
                curveToRelative(0f, 2.16f, 1.53f, 4.5f, 4f, 4.5f)
                horizontalLineToRelative(3.96f)
                curveToRelative(2.47f, 0f, 4.13f, -0.76f, 5.62f, -2.61f)
                curveToRelative(0.19f, -0.23f, 0.72f, -1.15f, 0.75f, -1.2f)
                curveToRelative(2.48f, -4.75f, 7.34f, -15.62f, 7.54f, -16.08f)
                curveToRelative(0.34f, -0.76f, -0.0f, -1.64f, -0.76f, -1.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _HockeyStickPuck = it}
