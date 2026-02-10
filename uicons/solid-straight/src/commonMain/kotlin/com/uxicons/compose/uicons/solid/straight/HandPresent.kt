package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandPresent: ImageVector? = null

val Icons.Ss.HandPresent: ImageVector
    get() = _HandPresent ?: UXIcon(name = "HandPresent") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.34f, 12.35f)
                lineToRelative(-10.67f, 11.65f)
                lineTo(3.0f, 24f)
                curveTo(1.35f, 24f, 0.0f, 22.65f, 0.0f, 21f)
                verticalLineToRelative(-7f)
                curveTo(0.0f, 12.35f, 1.35f, 11f, 3.0f, 11f)
                lineTo(11.79f, 11f)
                curveToRelative(1.22f, 0f, 2.21f, 0.99f, 2.21f, 2.21f)
                curveToRelative(0f, 1.09f, -0.82f, 2.04f, -1.9f, 2.19f)
                lineToRelative(-4.24f, 0.61f)
                lineToRelative(0.28f, 1.98f)
                lineToRelative(4.24f, -0.61f)
                curveToRelative(2.06f, -0.29f, 3.62f, -2.09f, 3.62f, -4.17f)
                curveToRelative(0f, -0.22f, -0.03f, -0.43f, -0.07f, -0.64f)
                lineToRelative(3.54f, -3.74f)
                curveToRelative(0.91f, -1.04f, 2.67f, -1.12f, 3.67f, -0.16f)
                curveToRelative(1.05f, 0.96f, 1.14f, 2.6f, 0.19f, 3.67f)
                close()
                moveTo(7.5f, 9f)
                lineTo(7.5f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.71f, 0.08f, 1.39f, 0.34f, 2f, 0.66f)
                verticalLineToRelative(-2.66f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-0.9f)
                curveToRelative(0.66f, -0.39f, 1.17f, -0.75f, 1.18f, -0.76f)
                curveToRelative(0.8f, -0.6f, 0.96f, -1.73f, 0.36f, -2.52f)
                curveToRelative(-0.6f, -0.8f, -1.73f, -0.96f, -2.52f, -0.36f)
                curveToRelative(-1.09f, 0.82f, -1.51f, 2.27f, -1.62f, 2.91f)
                curveToRelative(-0.11f, -0.65f, -0.52f, -2.09f, -1.62f, -2.91f)
                curveToRelative(-0.8f, -0.6f, -1.92f, -0.43f, -2.52f, 0.36f)
                curveToRelative(-0.6f, 0.8f, -0.43f, 1.92f, 0.36f, 2.52f)
                curveToRelative(0.01f, 0.01f, 0.52f, 0.37f, 1.18f, 0.76f)
                horizontalLineToRelative(-0.9f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(2.22f)
                curveToRelative(0.48f, -0.14f, 0.98f, -0.22f, 1.5f, -0.22f)
                lineTo(7.5f, 9f)
                close()
            }
        }.also { _HandPresent = it}
