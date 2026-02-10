package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaPosture: ImageVector? = null

val Icons.Br.YogaPosture: ImageVector
    get() = _YogaPosture ?: UXIcon(name = "YogaPosture") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 15f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
            moveTo(21.98f, 9.7f)
            curveToRelative(-0.07f, -4.73f, -4.35f, -8.44f, -8.98f, -8.7f)
            curveTo(7.04f, 0.73f, 1.97f, 5.51f, 1.98f, 11.5f)
            lineToRelative(0.02f, 10f)
            curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.0f)
            curveToRelative(0.83f, -0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineToRelative(-0.02f, -10.0f)
            curveToRelative(0f, -0.88f, 0.16f, -1.72f, 0.44f, -2.5f)
            horizontalLineToRelative(0.88f)
            curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(9f, 11f)
            curveToRelative(0f, -0.73f, 0.21f, -1.42f, 0.56f, -2.01f)
            curveToRelative(1.25f, -0.04f, 2.36f, -0.73f, 3.1f, -1.76f)
            curveToRelative(0.1f, -0.14f, 0.22f, -0.24f, 0.34f, -0.24f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(20f, 12.98f)
            curveToRelative(0.94f, -0.5f, 1.97f, -1.46f, 1.98f, -3.28f)
            close()
        }
    }.also { _YogaPosture = it }
