package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spider: ImageVector? = null

val Icons.Sc.Spider: ImageVector
    get() = _Spider ?: UXIcon(name = "Spider") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 21.24f)
                verticalLineToRelative(0.26f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.26f)
                curveToRelative(0.0f, -3.25f, -0.16f, -5.53f, -2.08f, -6.49f)
                curveToRelative(0.04f, 0.4f, 0.08f, 0.8f, 0.08f, 1.25f)
                curveToRelative(0f, 4.15f, -1.85f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -1.85f, -6f, -6f)
                curveToRelative(0f, -0.45f, 0.03f, -0.85f, 0.08f, -1.25f)
                curveToRelative(-1.92f, 0.95f, -2.08f, 3.24f, -2.08f, 6.49f)
                verticalLineToRelative(0.26f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.26f)
                curveToRelative(-0.0f, -2.79f, 0.01f, -6.76f, 3.01f, -8.76f)
                curveToRelative(-0.66f, -0.1f, -1.36f, -0.28f, -2.1f, -0.6f)
                curveToRelative(-0.76f, -0.33f, -1.11f, -1.21f, -0.79f, -1.97f)
                curveToRelative(0.33f, -0.76f, 1.21f, -1.11f, 1.97f, -0.79f)
                curveToRelative(0.65f, 0.28f, 1.25f, 0.41f, 1.8f, 0.45f)
                curveToRelative(-1.97f, -1.36f, -2.95f, -3.7f, -2.95f, -7.07f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 3.72f, 1.23f, 5.24f, 4.59f, 5.46f)
                curveToRelative(-0.35f, -0.49f, -0.53f, -1.14f, -0.53f, -1.97f)
                curveToRelative(0f, -1.99f, 1.01f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.01f, 3f, 3f)
                curveToRelative(0f, 0.83f, -0.19f, 1.48f, -0.53f, 1.97f)
                curveToRelative(3.37f, -0.23f, 4.59f, -1.74f, 4.59f, -5.46f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 3.37f, -0.98f, 5.71f, -2.95f, 7.07f)
                curveToRelative(0.55f, -0.04f, 1.15f, -0.17f, 1.8f, -0.45f)
                curveToRelative(0.76f, -0.33f, 1.64f, 0.03f, 1.97f, 0.79f)
                curveToRelative(0.33f, 0.76f, -0.03f, 1.64f, -0.79f, 1.97f)
                curveToRelative(-0.74f, 0.32f, -1.44f, 0.5f, -2.1f, 0.6f)
                curveToRelative(3.0f, 2.0f, 3.01f, 5.97f, 3.01f, 8.76f)
                close()
            }
        }.also { _Spider = it}
