package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Life: ImageVector? = null

val Icons.Sc.Life: ImageVector
    get() = _Life ?: UXIcon(name = "Life") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8f)
                curveToRelative(1.99f, 0f, 3f, 1.01f, 3f, 3f)
                reflectiveCurveToRelative(-1.01f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.01f, -3f, -3f)
                reflectiveCurveToRelative(1.01f, -3f, 3f, -3f)
                close()
                moveTo(11.28f, 6.79f)
                curveToRelative(0.44f, 0.28f, 1.01f, 0.28f, 1.45f, 0f)
                curveToRelative(1.02f, -0.65f, 2.77f, -2.09f, 2.77f, -4.03f)
                curveToRelative(0f, -0.98f, -0.78f, -1.77f, -1.75f, -1.77f)
                reflectiveCurveToRelative(-1.75f, 0.66f, -1.75f, 1.64f)
                curveToRelative(0f, -0.98f, -0.78f, -1.64f, -1.75f, -1.64f)
                reflectiveCurveToRelative(-1.75f, 0.79f, -1.75f, 1.77f)
                curveToRelative(0f, 1.93f, 1.75f, 3.38f, 2.77f, 4.03f)
                close()
                moveTo(22.19f, 9.17f)
                curveToRelative(-0.73f, -0.38f, -1.64f, -0.09f, -2.02f, 0.65f)
                curveToRelative(-1.82f, 3.44f, -5.45f, 5.07f, -5.74f, 5.35f)
                curveToRelative(-0.71f, -0.08f, -1.61f, -0.16f, -2.43f, -0.16f)
                reflectiveCurveToRelative(-1.72f, 0.08f, -2.43f, 0.16f)
                curveToRelative(-0.31f, -0.28f, -3.89f, -1.9f, -5.74f, -5.35f)
                curveToRelative(-0.38f, -0.74f, -1.28f, -1.02f, -2.02f, -0.65f)
                curveToRelative(-0.74f, 0.38f, -1.02f, 1.28f, -0.65f, 2.02f)
                curveToRelative(1.65f, 3.19f, 4.76f, 5.3f, 6.12f, 6.1f)
                curveToRelative(-0.13f, 0.96f, -0.28f, 2.38f, -0.28f, 3.75f)
                curveToRelative(0f, 0.17f, 0.0f, 0.82f, 0.01f, 0.99f)
                curveToRelative(0.02f, 0.54f, 0.46f, 0.97f, 1f, 0.97f)
                horizontalLineToRelative(7.99f)
                curveToRelative(0.54f, 0f, 0.99f, -0.43f, 1f, -0.98f)
                curveToRelative(0.0f, -0.17f, 0.01f, -0.81f, 0.01f, -0.98f)
                curveToRelative(0f, -1.37f, -0.15f, -2.79f, -0.28f, -3.75f)
                curveToRelative(1.36f, -0.81f, 4.47f, -2.91f, 6.12f, -6.1f)
                curveToRelative(0.38f, -0.74f, 0.09f, -1.64f, -0.65f, -2.02f)
                close()
            }
        }.also { _Life = it}
