package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkullCow: ImageVector? = null

val Icons.Br.SkullCow: ImageVector
    get() = _SkullCow ?: UXIcon(name = "SkullCow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 10.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(8.5f, 9f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(23.86f, 2.14f)
            curveToRelative(-0.78f, 1.64f, -2.4f, 2.71f, -4.2f, 2.83f)
            lineToRelative(2.08f, 5.5f)
            curveToRelative(0.76f, 2.17f, -0.2f, 4.54f, -2.22f, 5.55f)
            curveToRelative(-0.06f, 0.03f, -1.72f, 0.61f, -1.72f, 0.61f)
            lineToRelative(-0.98f, 4.6f)
            curveToRelative(-0.34f, 1.6f, -1.78f, 2.77f, -3.42f, 2.77f)
            horizontalLineToRelative(-2.77f)
            curveToRelative(-1.64f, 0f, -3.08f, -1.16f, -3.42f, -2.77f)
            lineToRelative(-0.98f, -4.6f)
            reflectiveCurveToRelative(-1.67f, -0.59f, -1.72f, -0.61f)
            curveToRelative(-2.02f, -1.01f, -2.98f, -3.38f, -2.23f, -5.51f)
            lineToRelative(2.09f, -5.53f)
            curveToRelative(-1.79f, -0.12f, -3.42f, -1.2f, -4.2f, -2.83f)
            curveTo(-0.21f, 1.4f, 0.11f, 0.5f, 0.86f, 0.14f)
            curveToRelative(0.75f, -0.35f, 1.64f, -0.04f, 2.0f, 0.71f)
            curveToRelative(0.33f, 0.69f, 1.04f, 1.14f, 1.81f, 1.14f)
            horizontalLineToRelative(14.67f)
            curveToRelative(0.77f, 0f, 1.48f, -0.45f, 1.81f, -1.14f)
            curveToRelative(0.36f, -0.75f, 1.25f, -1.07f, 2.0f, -0.71f)
            curveToRelative(0.75f, 0.35f, 1.07f, 1.25f, 0.71f, 2.0f)
            close()
            moveTo(18.91f, 11.5f)
            lineToRelative(-2.45f, -6.5f)
            lineTo(7.54f, 5f)
            lineToRelative(-2.46f, 6.54f)
            curveToRelative(-0.23f, 0.65f, 0.06f, 1.41f, 0.69f, 1.77f)
            lineToRelative(1.71f, 0.6f)
            curveToRelative(0.82f, 0.29f, 1.44f, 0.99f, 1.62f, 1.83f)
            lineToRelative(1.04f, 4.87f)
            curveToRelative(0.05f, 0.23f, 0.26f, 0.4f, 0.49f, 0.4f)
            horizontalLineToRelative(2.77f)
            curveToRelative(0.23f, 0f, 0.44f, -0.17f, 0.49f, -0.4f)
            lineToRelative(1.04f, -4.87f)
            curveToRelative(0.18f, -0.84f, 0.8f, -1.55f, 1.62f, -1.84f)
            lineToRelative(1.71f, -0.6f)
            curveToRelative(0.62f, -0.35f, 0.92f, -1.11f, 0.68f, -1.8f)
            close()
        }
    }.also { _SkullCow = it }
