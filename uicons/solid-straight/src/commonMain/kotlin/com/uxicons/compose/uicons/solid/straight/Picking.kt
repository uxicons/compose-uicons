package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picking: ImageVector? = null

val Icons.Ss.Picking: ImageVector
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
                lineToRelative(-6.16f, 3.46f)
                lineToRelative(-2.67f, 5.37f)
                curveToRelative(-0.37f, 0.74f, -0.07f, 1.64f, 0.68f, 2.01f)
                curveToRelative(0.21f, 0.11f, 0.44f, 0.16f, 0.67f, 0.16f)
                curveToRelative(0.55f, 0f, 1.08f, -0.3f, 1.34f, -0.83f)
                lineToRelative(2.3f, -4.63f)
                lineToRelative(1.15f, -0.59f)
                curveToRelative(-0.81f, 0.96f, -1.31f, 2.2f, -1.31f, 3.55f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.65f, -1.18f, 1.77f, -2.03f, 2.29f)
                curveToRelative(-0.94f, 0.57f, -1.25f, 1.79f, -0.69f, 2.74f)
                curveToRelative(0.37f, 0.63f, 1.04f, 0.97f, 1.72f, 0.97f)
                curveToRelative(0.35f, 0f, 0.7f, -0.09f, 1.02f, -0.28f)
                curveToRelative(0.21f, -0.13f, 1.29f, -0.8f, 2.27f, -1.88f)
                lineToRelative(0.04f, 0.04f)
                lineToRelative(6.66f, -7.29f)
                verticalLineTo(1f)
                horizontalLineTo(3.5f)
                close()
            }
        }.also { _Picking = it}
