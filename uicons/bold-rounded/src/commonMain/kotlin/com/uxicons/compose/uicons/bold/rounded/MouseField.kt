package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MouseField: ImageVector? = null

val Icons.Br.MouseField: ImageVector
    get() = _MouseField ?: UXIcon(name = "MouseField") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 2f)
            horizontalLineToRelative(-0.01f)
            curveTo(16.82f, 0.44f, 14.83f, -0.32f, 12.85f, 0.13f)
            curveToRelative(-1.86f, 0.42f, -3.37f, 1.97f, -3.75f, 3.85f)
            curveToRelative(-0.28f, 1.4f, 0.02f, 2.8f, 0.85f, 3.94f)
            curveToRelative(-4.07f, 1.67f, -5.58f, 5.32f, -5.89f, 8.09f)
            horizontalLineToRelative(-0.06f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            lineTo(12.5f, 24f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(4f, 21f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -3.44f, -2.24f, -7f, -6f, -7f)
            close()
            moveTo(16f, 16f)
            lineTo(7.09f, 16f)
            curveToRelative(0.29f, -1.87f, 1.43f, -5.0f, 5.71f, -5.8f)
            curveToRelative(0.71f, 1.16f, 1.85f, 2.03f, 3.2f, 2.47f)
            verticalLineToRelative(3.33f)
            close()
            moveTo(21f, 10f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.47f, 0f, -2.71f, -0.88f, -2.95f, -2.12f)
            curveToRelative(-0.1f, -0.51f, -0.53f, -0.88f, -1.05f, -0.88f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            verticalLineToRelative(1.5f)
            curveToRelative(0.69f, 0f, 1.38f, -0.72f, 1.74f, -1.5f)
            horizontalLineToRelative(0.26f)
            curveToRelative(2.07f, 0f, 3f, 2.34f, 3f, 4f)
            verticalLineToRelative(1f)
            close()
        }
    }.also { _MouseField = it }
