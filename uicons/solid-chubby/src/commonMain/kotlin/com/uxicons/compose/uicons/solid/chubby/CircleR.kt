package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleR: ImageVector? = null

val Icons.Sc.CircleR: ImageVector
    get() = _CircleR ?: UXIcon(name = "CircleR") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(15.98f, 16.8f)
                curveToRelative(0.11f, 0.54f, -0.24f, 1.07f, -0.78f, 1.18f)
                curveToRelative(-0.53f, 0.11f, -1.07f, -0.24f, -1.18f, -0.78f)
                curveToRelative(-0.36f, -1.79f, -1.3f, -3.0f, -1.61f, -3.36f)
                curveToRelative(-0.55f, 0.1f, -1.18f, 0.17f, -1.91f, 0.17f)
                curveToRelative(-0.16f, 0f, -0.3f, -0.0f, -0.42f, -0.01f)
                curveToRelative(0.13f, 1.7f, 0.39f, 2.75f, 0.39f, 2.77f)
                curveToRelative(0.13f, 0.54f, -0.19f, 1.08f, -0.73f, 1.21f)
                curveToRelative(-0.52f, 0.14f, -1.08f, -0.19f, -1.21f, -0.73f)
                curveToRelative(-0.02f, -0.09f, -0.53f, -2.15f, -0.53f, -5.24f)
                curveToRelative(0f, -2.71f, 0.39f, -4.63f, 0.5f, -5.12f)
                curveToRelative(0.06f, -0.47f, 0.44f, -0.85f, 0.93f, -0.88f)
                curveToRelative(0.44f, -0.02f, 0.63f, 0f, 1.18f, -0.0f)
                curveToRelative(1.48f, 0.01f, 5.39f, 0.02f, 5.39f, 3.88f)
                curveToRelative(0f, 1.14f, -0.35f, 2.4f, -1.63f, 3.23f)
                curveToRelative(0.55f, 0.76f, 1.28f, 2.03f, 1.61f, 3.7f)
                close()
                moveTo(10f, 11.99f)
                curveToRelative(0f, -1.77f, 0.18f, -3.18f, 0.32f, -3.99f)
                horizontalLineToRelative(0.29f)
                curveToRelative(3.39f, 0.01f, 3.39f, 1.0f, 3.39f, 1.88f)
                curveToRelative(0f, 0.74f, 0f, 2.12f, -3.5f, 2.12f)
                curveToRelative(-0.21f, 0f, -0.36f, -0.0f, -0.5f, -0.01f)
                close()
            }
        }.also { _CircleR = it}
