package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Sc.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.79f, 20f)
                horizontalLineTo(4.21f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(15.58f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.66f, 18.06f)
                curveToRelative(0.68f, -2.24f, 1.39f, -5.08f, 1.39f, -7.14f)
                curveToRelative(0f, -0.4f, -0.23f, -0.76f, -0.6f, -0.92f)
                curveToRelative(-3.37f, -1.49f, -5.75f, -2.37f, -7.95f, -2.64f)
                verticalLineToRelative(-1.19f)
                horizontalLineToRelative(0.89f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.89f)
                verticalLineToRelative(-0.67f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.67f)
                horizontalLineToRelative(-0.89f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.89f)
                verticalLineToRelative(1.19f)
                curveToRelative(-2.19f, 0.28f, -4.58f, 1.16f, -7.95f, 2.64f)
                curveToRelative(-0.36f, 0.16f, -0.6f, 0.52f, -0.6f, 0.92f)
                curveToRelative(0f, 2.08f, 0.71f, 4.91f, 1.39f, 7.14f)
                horizontalLineTo(20.66f)
                close()
            }
        }.also { _ChessKing = it}
