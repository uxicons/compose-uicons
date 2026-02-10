package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Images: ImageVector? = null

val Icons.Sr.Images: ImageVector
    get() = _Images ?: UXIcon(name = "Images") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 7.77f)
                curveToRelative(1.01f, -1.01f, 2.66f, -1.02f, 3.68f, 0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.23f, 0.23f, 0.62f, 0.23f, 0.85f, 0f)
                lineToRelative(5.95f, -5.95f)
                curveToRelative(-0.8f, -1.69f, -2.53f, -2.86f, -4.52f, -2.86f)
                lineTo(10f, -0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.07f, 0.34f, 2.06f, 0.91f, 2.87f)
                lineToRelative(6.1f, -6.1f)
                close()
                moveTo(9.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12.33f, 23.82f)
                lineToRelative(-8.67f, -2.41f)
                curveToRelative(-2.66f, -0.74f, -4.22f, -3.5f, -3.48f, -6.16f)
                lineToRelative(1.61f, -5.78f)
                curveToRelative(0.23f, -0.82f, 0.65f, -1.54f, 1.21f, -2.12f)
                verticalLineToRelative(3.66f)
                curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                horizontalLineToRelative(9.14f)
                lineToRelative(-0.65f, 2.34f)
                curveToRelative(-0.74f, 2.66f, -3.5f, 4.22f, -6.16f, 3.48f)
                close()
                moveTo(24f, 5.21f)
                verticalLineToRelative(5.79f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(10f, 16f)
                curveToRelative(-0.97f, 0f, -1.87f, -0.28f, -2.64f, -0.75f)
                lineToRelative(6.06f, -6.06f)
                curveToRelative(0.23f, -0.23f, 0.62f, -0.23f, 0.85f, 0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.98f, 0.98f, 2.69f, 0.98f, 3.67f, 0f)
                lineToRelative(5.02f, -5.02f)
                close()
            }
        }.also { _Images = it}
