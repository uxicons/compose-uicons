package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picking: ImageVector? = null

val Icons.Sr.Picking: ImageVector
    get() = _Picking ?: UXIcon(name = "Picking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.94f)
                lineTo(1f, 7.09f)
                curveToRelative(-0.78f, 0.28f, -1.19f, 1.13f, -0.91f, 1.92f)
                curveToRelative(0.28f, 0.78f, 1.13f, 1.19f, 1.92f, 0.91f)
                lineToRelative(9.0f, -2.91f)
                lineToRelative(-4.82f, 2.7f)
                curveToRelative(-0.88f, 0.49f, -1.58f, 1.24f, -2.03f, 2.13f)
                lineToRelative(-1.99f, 4.0f)
                curveToRelative(-0.37f, 0.74f, -0.07f, 1.64f, 0.68f, 2.01f)
                curveToRelative(0.21f, 0.11f, 0.44f, 0.16f, 0.67f, 0.16f)
                curveToRelative(0.55f, 0f, 1.08f, -0.3f, 1.34f, -0.83f)
                lineToRelative(2.16f, -4.33f)
                curveToRelative(0.1f, -0.19f, 0.25f, -0.34f, 0.44f, -0.44f)
                lineToRelative(0.86f, -0.45f)
                curveToRelative(-0.81f, 0.96f, -1.31f, 2.2f, -1.31f, 3.55f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.85f)
                curveToRelative(0f, -1.31f, 0.94f, -2.5f, 2.24f, -2.63f)
                curveToRelative(1.5f, -0.15f, 2.76f, 1.02f, 2.76f, 2.49f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.64f, -1.15f, 1.74f, -1.99f, 2.26f)
                reflectiveCurveToRelative(-1.24f, 1.62f, -0.84f, 2.53f)
                curveToRelative(0.34f, 0.77f, 1.08f, 1.2f, 1.84f, 1.2f)
                curveToRelative(0.35f, 0f, 0.7f, -0.09f, 1.02f, -0.28f)
                curveToRelative(0.21f, -0.13f, 1.29f, -0.8f, 2.27f, -1.88f)
                lineToRelative(5.13f, -5.54f)
                curveToRelative(1.01f, -1.11f, 1.57f, -2.55f, 1.57f, -4.05f)
                verticalLineToRelative(-4.25f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineTo(3.5f)
                close()
            }
        }.also { _Picking = it}
