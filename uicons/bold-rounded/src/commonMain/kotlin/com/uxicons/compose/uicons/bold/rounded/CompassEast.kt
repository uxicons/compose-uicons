package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassEast: ImageVector? = null

val Icons.Br.CompassEast: ImageVector
    get() = _CompassEast ?: UXIcon(name = "CompassEast") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 13.57f)
            reflectiveCurveToRelative(-7.03f, 3.73f, -7.03f, 3.73f)
            curveToRelative(-0.64f, 0.29f, -1.42f, 0.16f, -1.95f, -0.36f)
            curveToRelative(-0.5f, -0.5f, -0.65f, -1.24f, -0.41f, -1.8f)
            curveToRelative(0.09f, -0.19f, 1.61f, -3.15f, 1.61f, -3.15f)
            curveToRelative(0f, 0f, -1.36f, -2.65f, -1.55f, -2.97f)
            curveToRelative(-0.22f, -0.45f, -0.23f, -0.98f, -0.02f, -1.45f)
            curveToRelative(0.39f, -0.88f, 1.42f, -1.28f, 2.32f, -0.89f)
            curveToRelative(1.57f, 0.68f, 7.04f, 3.71f, 7.04f, 3.71f)
            curveToRelative(1.3f, 0.66f, 1.29f, 2.52f, -0.01f, 3.17f)
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
    }.also { _CompassEast = it }
