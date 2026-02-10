package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Suggestion: ImageVector? = null

val Icons.Ss.Suggestion: ImageVector
    get() = _Suggestion ?: UXIcon(name = "Suggestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 0f)
                curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(3.59f, 0f, 6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(7.5f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7.9f, 7.65f)
                curveToRelative(-0.4f, 0.21f, -0.4f, 0.28f, -0.4f, 0.35f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.34f, 1.06f, -1.9f, 1.47f, -2.12f)
                curveToRelative(0.33f, -0.17f, 0.62f, -0.59f, 0.51f, -1.11f)
                curveToRelative(-0.07f, -0.35f, -0.35f, -0.65f, -0.69f, -0.74f)
                curveToRelative(-0.8f, -0.15f, -1.24f, 0.34f, -1.29f, 0.99f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.93f, 0.44f, -1.83f, 1.18f, -2.4f)
                curveToRelative(0.74f, -0.57f, 1.7f, -0.76f, 2.61f, -0.52f)
                curveToRelative(1.07f, 0.28f, 1.91f, 1.17f, 2.14f, 2.26f)
                curveToRelative(0.28f, 1.34f, -0.34f, 2.66f, -1.54f, 3.29f)
                close()
                moveTo(16.09f, 16f)
                horizontalLineToRelative(-3.09f)
                verticalLineToRelative(-3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 2.23f, -0.85f, 3.09f, 0f)
                reflectiveCurveToRelative(0.85f, 2.23f, 0f, 3.09f)
                close()
                moveTo(15.0f, 6.5f)
                curveToRelative(0f, -0.87f, -0.13f, -1.71f, -0.38f, -2.5f)
                horizontalLineToRelative(4.51f)
                curveToRelative(-0.09f, 0.08f, -0.19f, 0.14f, -0.27f, 0.23f)
                lineToRelative(-4.07f, 4.07f)
                curveToRelative(0.12f, -0.58f, 0.2f, -1.17f, 0.2f, -1.79f)
                close()
                moveTo(24.0f, 10.91f)
                verticalLineToRelative(10.94f)
                curveToRelative(0f, 0.79f, -0.43f, 1.52f, -1.13f, 1.89f)
                curveToRelative(-0.32f, 0.17f, -0.67f, 0.26f, -1.01f, 0.26f)
                curveToRelative(-0.42f, 0f, -0.83f, -0.12f, -1.19f, -0.36f)
                lineToRelative(-3.96f, -2.64f)
                horizontalLineToRelative(-10.7f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.65f, 0f, 3.19f, -0.48f, 4.5f, -1.3f)
                verticalLineToRelative(4.3f)
                horizontalLineToRelative(5.91f)
                lineToRelative(7.09f, -7.09f)
                close()
            }
        }.also { _Suggestion = it}
