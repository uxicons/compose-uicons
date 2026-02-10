package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBishop: ImageVector? = null

val Icons.Ts.ChessBishop: ImageVector
    get() = _ChessBishop ?: UXIcon(name = "ChessBishop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                curveToRelative(0f, -4.87f, -5.07f, -8.68f, -7.51f, -10.51f)
                curveToRelative(0.61f, -0.46f, 1.01f, -1.18f, 1.01f, -1.99f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.78f, 0.37f, 1.47f, 0.93f, 1.93f)
                curveToRelative(-2.58f, 1.81f, -7.43f, 5.84f, -7.43f, 10.57f)
                curveToRelative(0f, 3.48f, 1.99f, 6.5f, 4.9f, 8f)
                horizontalLineTo(3f)
                verticalLineToRelative(1f)
                horizontalLineTo(21f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.89f)
                curveToRelative(2.9f, -1.5f, 4.89f, -4.52f, 4.89f, -8f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4f, 15f)
                curveToRelative(0f, -4.67f, 5.67f, -8.86f, 7.46f, -10.06f)
                curveToRelative(0.17f, 0.04f, 0.35f, 0.06f, 0.54f, 0.06f)
                curveToRelative(0.15f, 0f, 0.3f, -0.02f, 0.45f, -0.04f)
                lineToRelative(0.44f, 0.34f)
                curveToRelative(0.9f, 0.67f, 2.17f, 1.63f, 3.39f, 2.81f)
                lineToRelative(-4.46f, 5.53f)
                lineToRelative(0.78f, 0.63f)
                lineToRelative(4.39f, -5.44f)
                curveToRelative(1.63f, 1.73f, 3.01f, 3.85f, 3.01f, 6.19f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                close()
            }
        }.also { _ChessBishop = it}
