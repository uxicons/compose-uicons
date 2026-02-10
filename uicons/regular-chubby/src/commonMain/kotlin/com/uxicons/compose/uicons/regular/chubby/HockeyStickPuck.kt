package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyStickPuck: ImageVector? = null

val Icons.Rc.HockeyStickPuck: ImageVector
    get() = _HockeyStickPuck ?: UXIcon(name = "HockeyStickPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.38f, 1.08f)
                curveToRelative(-0.51f, -0.21f, -1.1f, 0.03f, -1.31f, 0.54f)
                curveToRelative(-1.93f, 4.65f, -4.81f, 11.28f, -6.65f, 15.0f)
                curveToRelative(-1.51f, -1.19f, -5.07f, -3.42f, -9.6f, -2.6f)
                curveToRelative(-1.9f, 0.35f, -3.82f, 1.87f, -3.82f, 4.48f)
                curveToRelative(0f, 2.16f, 1.53f, 4.5f, 4f, 4.5f)
                horizontalLineToRelative(3.96f)
                curveToRelative(2.47f, 0f, 4.13f, -0.76f, 5.56f, -2.53f)
                curveToRelative(1.78f, -2.21f, 7.73f, -16.47f, 8.41f, -18.08f)
                curveToRelative(0.21f, -0.51f, -0.03f, -1.09f, -0.54f, -1.31f)
                close()
                moveTo(12.96f, 19.21f)
                curveToRelative(-1.04f, 1.29f, -2.16f, 1.79f, -4.0f, 1.79f)
                horizontalLineToRelative(-3.96f)
                curveToRelative(-1.36f, 0f, -2f, -1.49f, -2f, -2.5f)
                curveToRelative(0f, -1.56f, 1.17f, -2.33f, 2.18f, -2.52f)
                curveToRelative(0.54f, -0.1f, 1.07f, -0.14f, 1.58f, -0.14f)
                curveToRelative(3.31f, 0f, 5.85f, 1.85f, 6.71f, 2.58f)
                curveToRelative(-0.2f, 0.35f, -0.38f, 0.62f, -0.51f, 0.79f)
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
