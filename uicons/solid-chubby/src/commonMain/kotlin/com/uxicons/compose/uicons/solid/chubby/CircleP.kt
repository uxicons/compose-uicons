package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleP: ImageVector? = null

val Icons.Sc.CircleP: ImageVector
    get() = _CircleP ?: UXIcon(name = "CircleP") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(10.5f, 14f)
                curveToRelative(-0.16f, 0f, -0.3f, -0.0f, -0.42f, -0.01f)
                curveToRelative(0.13f, 1.7f, 0.39f, 2.75f, 0.39f, 2.77f)
                curveToRelative(0.13f, 0.54f, -0.19f, 1.08f, -0.73f, 1.21f)
                curveToRelative(-0.52f, 0.14f, -1.08f, -0.19f, -1.21f, -0.73f)
                curveToRelative(-0.02f, -0.09f, -0.53f, -2.15f, -0.53f, -5.24f)
                curveToRelative(0f, -2.71f, 0.39f, -4.63f, 0.5f, -5.12f)
                curveToRelative(0.06f, -0.47f, 0.44f, -0.85f, 0.93f, -0.88f)
                curveToRelative(0.44f, -0.02f, 0.63f, 0f, 1.18f, -0.0f)
                curveToRelative(1.48f, 0.01f, 5.39f, 0.02f, 5.39f, 3.88f)
                curveToRelative(0f, 1.88f, -0.95f, 4.12f, -5.5f, 4.12f)
                close()
                moveTo(10.5f, 12f)
                curveToRelative(-0.21f, 0f, -0.36f, -0.0f, -0.5f, -0.01f)
                curveToRelative(0f, -1.77f, 0.18f, -3.18f, 0.32f, -3.99f)
                horizontalLineToRelative(0.29f)
                curveToRelative(3.39f, 0.01f, 3.39f, 1.0f, 3.39f, 1.88f)
                curveToRelative(0f, 0.74f, 0f, 2.12f, -3.5f, 2.12f)
                close()
            }
        }.also { _CircleP = it}
