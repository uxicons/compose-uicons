package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleK: ImageVector? = null

val Icons.Br.CircleK: ImageVector
    get() = _CircleK ?: UXIcon(name = "CircleK") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(16.51f, 15.68f)
            curveToRelative(0.45f, 0.69f, 0.25f, 1.62f, -0.44f, 2.08f)
            curveToRelative(-0.25f, 0.16f, -0.54f, 0.24f, -0.82f, 0.24f)
            curveToRelative(-0.49f, 0f, -0.97f, -0.24f, -1.26f, -0.68f)
            lineToRelative(-2.81f, -4.32f)
            horizontalLineToRelative(-1.19f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(7.0f, 7.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(1.29f)
            lineToRelative(2.8f, -3.45f)
            curveToRelative(0.52f, -0.64f, 1.47f, -0.74f, 2.11f, -0.22f)
            curveToRelative(0.64f, 0.52f, 0.74f, 1.47f, 0.22f, 2.11f)
            lineToRelative(-2.56f, 3.15f)
            lineToRelative(2.65f, 4.08f)
            close()
        }
    }.also { _CircleK = it }
