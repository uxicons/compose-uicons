package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandZoomIn: ImageVector? = null

val Icons.Br.HandZoomIn: ImageVector
    get() = _HandZoomIn ?: UXIcon(name = "HandZoomIn") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 20.98f)
            verticalLineToRelative(1.52f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.52f)
            curveToRelative(0f, -1.11f, -0.72f, -2.08f, -1.78f, -2.39f)
            lineToRelative(-6.22f, -1.87f)
            verticalLineToRelative(5.28f)
            curveToRelative(0f, 1.1f, -0.9f, 2.0f, -2.0f, 2f)
            horizontalLineToRelative(-0.78f)
            curveToRelative(-0.5f, -0.0f, -0.98f, -0.19f, -1.35f, -0.53f)
            lineToRelative(-3.13f, -2.86f)
            curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
            reflectiveCurveToRelative(2.01f, -0.98f, 2.87f, -0.26f)
            lineToRelative(1.64f, 1.3f)
            verticalLineToRelative(-10.27f)
            curveToRelative(0f, -0.96f, 0.88f, -1.71f, 1.88f, -1.45f)
            curveToRelative(0.68f, 0.17f, 1.13f, 0.84f, 1.13f, 1.54f)
            verticalLineToRelative(4.99f)
            lineToRelative(7.08f, 2.12f)
            curveToRelative(2.35f, 0.7f, 3.92f, 2.82f, 3.92f, 5.27f)
            close()
            moveTo(4.11f, 11.02f)
            lineTo(11.02f, 4.1f)
            lineTo(11.69f, 4.77f)
            curveToRelative(0.49f, 0.49f, 1.32f, 0.14f, 1.32f, -0.55f)
            verticalLineToRelative(-3.45f)
            curveToRelative(0f, -0.43f, -0.35f, -0.77f, -0.77f, -0.77f)
            horizontalLineToRelative(-3.45f)
            curveToRelative(-0.69f, 0f, -1.03f, 0.83f, -0.55f, 1.32f)
            lineToRelative(0.66f, 0.66f)
            lineToRelative(-6.91f, 6.91f)
            lineToRelative(-0.67f, -0.67f)
            curveToRelative(-0.49f, -0.49f, -1.32f, -0.14f, -1.32f, 0.55f)
            verticalLineToRelative(3.45f)
            curveToRelative(0f, 0.43f, 0.35f, 0.77f, 0.77f, 0.77f)
            horizontalLineToRelative(3.45f)
            curveToRelative(0.69f, 0f, 1.03f, -0.83f, 0.55f, -1.32f)
            lineToRelative(-0.67f, -0.67f)
            close()
        }
    }.also { _HandZoomIn = it }
