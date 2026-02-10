package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gramophone: ImageVector? = null

val Icons.Sr.Gramophone: ImageVector
    get() = _Gramophone ?: UXIcon(name = "Gramophone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-2.78f)
                curveToRelative(-0.81f, -0.24f, -5.6f, -1.78f, -9.2f, -5.32f)
                curveTo(7.36f, 0.02f, 6.4f, -0.15f, 5.52f, 0.21f)
                curveToRelative(-0.92f, 0.39f, -1.52f, 1.28f, -1.52f, 2.26f)
                verticalLineToRelative(9.2f)
                curveToRelative(0f, 0.96f, 0.58f, 1.82f, 1.47f, 2.19f)
                curveToRelative(0.29f, 0.12f, 0.6f, 0.18f, 0.9f, 0.18f)
                curveToRelative(0.56f, 0f, 1.11f, -0.22f, 1.53f, -0.63f)
                curveToRelative(3.71f, -3.63f, 8.51f, -5.18f, 9.32f, -5.42f)
                horizontalLineToRelative(2.78f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Gramophone = it}
