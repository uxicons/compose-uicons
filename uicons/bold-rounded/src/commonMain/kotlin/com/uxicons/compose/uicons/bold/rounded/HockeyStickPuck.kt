package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyStickPuck: ImageVector? = null

val Icons.Br.HockeyStickPuck: ImageVector
    get() = _HockeyStickPuck ?: UXIcon(name = "HockeyStickPuck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.2f, 0.17f)
            curveToRelative(-0.73f, -0.38f, -1.64f, -0.1f, -2.02f, 0.63f)
            lineToRelative(-7.96f, 15.2f)
            lineTo(4f, 16f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(4.47f)
            curveToRelative(2.43f, 0f, 4.63f, -1.33f, 5.76f, -3.48f)
            lineTo(23.83f, 2.2f)
            curveToRelative(0.38f, -0.73f, 0.1f, -1.64f, -0.63f, -2.02f)
            close()
            moveTo(11.57f, 19.12f)
            curveToRelative(-0.6f, 1.16f, -1.79f, 1.88f, -3.1f, 1.88f)
            horizontalLineToRelative(-4.47f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(7.64f)
            lineToRelative(-0.07f, 0.12f)
            close()
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _HockeyStickPuck = it }
