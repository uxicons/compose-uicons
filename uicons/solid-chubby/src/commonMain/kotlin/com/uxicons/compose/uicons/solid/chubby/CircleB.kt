package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleB: ImageVector? = null

val Icons.Sc.CircleB: ImageVector
    get() = _CircleB ?: UXIcon(name = "CircleB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(11.37f, 18f)
                horizontalLineToRelative(-2.87f)
                curveToRelative(-0.46f, 0f, -0.86f, -0.31f, -0.97f, -0.76f)
                curveToRelative(-0.02f, -0.09f, -0.53f, -2.15f, -0.53f, -5.24f)
                reflectiveCurveToRelative(0.51f, -5.16f, 0.53f, -5.24f)
                curveToRelative(0.11f, -0.45f, 0.51f, -0.76f, 0.97f, -0.76f)
                horizontalLineToRelative(2.54f)
                curveToRelative(1.29f, 0.01f, 4.71f, 0.02f, 4.71f, 3.19f)
                curveToRelative(0f, 0.77f, -0.19f, 1.41f, -0.57f, 1.92f)
                curveToRelative(1.02f, 0.5f, 1.82f, 1.43f, 1.82f, 3.12f)
                curveToRelative(0f, 3.76f, -4.09f, 3.77f, -5.63f, 3.78f)
                close()
                moveTo(9.32f, 8f)
                horizontalLineToRelative(1.71f)
                curveToRelative(2.72f, 0.01f, 2.72f, 0.66f, 2.72f, 1.19f)
                curveToRelative(0f, 0.49f, 0f, 1.31f, -2.56f, 1.31f)
                horizontalLineToRelative(-2.14f)
                curveToRelative(0.06f, -1.07f, 0.18f, -1.93f, 0.28f, -2.5f)
                close()
                moveTo(11.36f, 16f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(-0.12f, -0.73f, -0.29f, -1.96f, -0.32f, -3.5f)
                curveToRelative(0.22f, 0.0f, 2.33f, -0.0f, 2.5f, 0f)
                curveToRelative(3.5f, 0f, 3.5f, 0.92f, 3.5f, 1.72f)
                curveToRelative(0f, 0.74f, 0f, 1.77f, -3.64f, 1.78f)
                close()
            }
        }.also { _CircleB = it}
