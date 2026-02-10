package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meeting: ImageVector? = null

val Icons.Br.Meeting: ImageVector
    get() = _Meeting ?: UXIcon(name = "Meeting") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1f, 15f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            close()
            moveTo(4f, 20f)
            curveToRelative(-1.85f, 0f, -3.42f, 1.17f, -3.96f, 2.79f)
            curveToRelative(-0.2f, 0.6f, 0.29f, 1.22f, 0.94f, 1.22f)
            horizontalLineToRelative(6.02f)
            curveToRelative(0.66f, 0f, 1.14f, -0.61f, 0.94f, -1.22f)
            curveToRelative(-0.53f, -1.61f, -2.1f, -2.79f, -3.96f, -2.79f)
            close()
            moveTo(23.95f, 22.79f)
            curveToRelative(-0.53f, -1.61f, -2.1f, -2.79f, -3.96f, -2.79f)
            reflectiveCurveToRelative(-3.42f, 1.17f, -3.96f, 2.79f)
            curveToRelative(-0.2f, 0.6f, 0.29f, 1.22f, 0.94f, 1.22f)
            horizontalLineToRelative(6.02f)
            curveToRelative(0.66f, 0f, 1.14f, -0.61f, 0.94f, -1.22f)
            close()
            moveTo(17f, 15f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
            close()
            moveTo(15.11f, 11.96f)
            lineToRelative(-1.78f, 1.54f)
            curveToRelative(-0.37f, 0.33f, -0.85f, 0.5f, -1.32f, 0.5f)
            curveToRelative(-0.48f, 0f, -0.96f, -0.17f, -1.35f, -0.51f)
            lineToRelative(-1.74f, -1.53f)
            curveToRelative(-2.22f, -0.29f, -3.92f, -2.18f, -3.92f, -4.45f)
            verticalLineToRelative(-3.02f)
            curveTo(4.99f, 2.02f, 7.01f, 0f, 9.48f, 0f)
            horizontalLineToRelative(5.02f)
            curveToRelative(2.48f, 0f, 4.49f, 2.02f, 4.49f, 4.49f)
            verticalLineToRelative(3.02f)
            curveToRelative(0f, 2.27f, -1.7f, 4.15f, -3.89f, 4.45f)
            close()
            moveTo(15.99f, 4.49f)
            curveToRelative(0f, -0.82f, -0.67f, -1.49f, -1.49f, -1.49f)
            horizontalLineToRelative(-5.02f)
            curveToRelative(-0.82f, 0f, -1.49f, 0.67f, -1.49f, 1.49f)
            verticalLineToRelative(3.02f)
            curveToRelative(0f, 0.82f, 0.67f, 1.49f, 1.49f, 1.49f)
            curveToRelative(0.36f, 0f, 0.76f, 0.13f, 1.03f, 0.38f)
            lineToRelative(1.48f, 1.31f)
            lineToRelative(1.52f, -1.31f)
            curveToRelative(0.27f, -0.23f, 0.62f, -0.36f, 0.98f, -0.36f)
            curveToRelative(0.82f, 0f, 1.49f, -0.67f, 1.49f, -1.49f)
            verticalLineToRelative(-3.02f)
            close()
        }
    }.also { _Meeting = it }
