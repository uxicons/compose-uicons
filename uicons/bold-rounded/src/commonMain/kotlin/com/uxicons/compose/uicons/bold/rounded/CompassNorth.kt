package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassNorth: ImageVector? = null

val Icons.Br.CompassNorth: ImageVector
    get() = _CompassNorth ?: UXIcon(name = "CompassNorth") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.31f, 14.03f)
            curveToRelative(0.4f, 0.89f, -0.01f, 1.93f, -0.89f, 2.32f)
            curveToRelative(-0.47f, 0.21f, -1.0f, 0.2f, -1.45f, -0.02f)
            curveToRelative(-0.32f, -0.19f, -2.97f, -1.55f, -2.97f, -1.55f)
            curveToRelative(0f, 0f, -2.96f, 1.52f, -3.15f, 1.61f)
            curveToRelative(-0.56f, 0.23f, -1.3f, 0.09f, -1.8f, -0.41f)
            curveToRelative(-0.52f, -0.53f, -0.65f, -1.3f, -0.36f, -1.95f)
            curveToRelative(0.0f, -0.0f, 3.73f, -7.03f, 3.73f, -7.03f)
            curveToRelative(0.65f, -1.3f, 2.51f, -1.31f, 3.17f, -0.01f)
            curveToRelative(0f, 0f, 3.03f, 5.48f, 3.71f, 7.04f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            reflectiveCurveTo(3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            close()
        }
    }.also { _CompassNorth = it }
