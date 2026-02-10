package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandLove: ImageVector? = null

val Icons.Br.HandLove: ImageVector
    get() = _HandLove ?: UXIcon(name = "HandLove") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 13.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(13.5f, 15f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(22.5f, 2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-5.16f)
            curveToRelative(-1.52f, 0f, -2.98f, -0.64f, -4.02f, -1.75f)
            lineToRelative(-0.45f, -0.47f)
            curveToRelative(0.06f, -0.02f, 0.12f, -0.04f, 0.18f, -0.07f)
            curveToRelative(1.18f, -0.49f, 1.95f, -1.64f, 1.95f, -2.92f)
            lineTo(10.0f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            lineTo(7.0f, 15.79f)
            curveToRelative(0f, 0.04f, 0f, 0.1f, -0.1f, 0.14f)
            curveToRelative(-0.1f, 0.04f, -0.14f, -0.01f, -0.17f, -0.03f)
            lineToRelative(-3.34f, -3.36f)
            curveToRelative(-0.07f, -0.07f, -0.14f, -0.13f, -0.22f, -0.18f)
            curveToRelative(-0.7f, -0.48f, -1.82f, -0.56f, -2.59f, 0.22f)
            curveToRelative(-0.8f, 0.8f, -0.69f, 1.94f, -0.17f, 2.65f)
            curveToRelative(0.04f, 0.05f, 0.07f, 0.1f, 0.12f, 0.14f)
            lineToRelative(5.61f, 5.93f)
            curveToRelative(1.6f, 1.71f, 3.86f, 2.69f, 6.21f, 2.69f)
            horizontalLineToRelative(5.16f)
            curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
            lineTo(24f, 3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _HandLove = it }
