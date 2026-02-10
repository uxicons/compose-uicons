package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MouseField: ImageVector? = null

val Icons.Bs.MouseField: ImageVector
    get() = _MouseField ?: UXIcon(name = "MouseField") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                horizontalLineToRelative(-0.01f)
                curveTo(16.82f, 0.45f, 14.85f, -0.31f, 12.88f, 0.12f)
                curveToRelative(-1.88f, 0.42f, -3.4f, 1.97f, -3.78f, 3.86f)
                curveToRelative(-0.28f, 1.39f, 0.02f, 2.77f, 0.83f, 3.9f)
                curveToRelative(0.0f, 0.01f, 0.01f, 0.01f, 0.01f, 0.02f)
                curveToRelative(-1.25f, 0.51f, -2.33f, 1.23f, -3.23f, 2.18f)
                curveToRelative(-1.85f, 1.95f, -2.45f, 4.36f, -2.64f, 5.91f)
                horizontalLineToRelative(-0.08f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                lineTo(14f, 24.0f)
                verticalLineToRelative(-3f)
                lineTo(4f, 21.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(21f, 19.0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -3.44f, -2.24f, -7f, -6f, -7f)
                close()
                moveTo(16f, 16f)
                lineTo(7.11f, 16f)
                curveToRelative(0.18f, -1.1f, 0.64f, -2.65f, 1.8f, -3.87f)
                curveToRelative(0.95f, -1.0f, 2.26f, -1.64f, 3.88f, -1.94f)
                curveToRelative(0.71f, 1.16f, 1.85f, 2.04f, 3.2f, 2.48f)
                verticalLineToRelative(3.33f)
                close()
                moveTo(21f, 10f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.39f, 0f, -2.59f, -0.8f, -2.91f, -1.94f)
                curveToRelative(0f, 0f, -0.09f, -0.56f, -0.09f, -1.06f)
                curveToRelative(0f, 0f, -0.77f, -0.01f, -1f, 0f)
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
        }.also { _MouseField = it}
