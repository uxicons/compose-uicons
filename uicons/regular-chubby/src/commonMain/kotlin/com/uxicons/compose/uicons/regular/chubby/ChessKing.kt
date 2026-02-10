package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Rc.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.25f, 20.67f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(0.77f, -2.19f, 2.33f, -7.01f, 2.33f, -10.13f)
                curveToRelative(0f, -0.4f, -0.23f, -0.76f, -0.6f, -0.92f)
                curveToRelative(-3.86f, -1.69f, -6.49f, -2.63f, -8.98f, -2.84f)
                verticalLineToRelative(-1.82f)
                horizontalLineToRelative(1.52f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.52f)
                verticalLineTo(1.67f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.29f)
                horizontalLineToRelative(-1.52f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.52f)
                verticalLineToRelative(1.82f)
                curveToRelative(-2.48f, 0.2f, -5.12f, 1.15f, -8.98f, 2.84f)
                curveToRelative(-0.36f, 0.16f, -0.6f, 0.52f, -0.6f, 0.92f)
                curveToRelative(0f, 3.15f, 1.56f, 7.95f, 2.33f, 10.13f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(20.25f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(3.45f, 11.18f)
                curveToRelative(7.58f, -3.28f, 9.52f, -3.28f, 17.1f, 0f)
                curveToRelative(-0.22f, 3.2f, -1.91f, 8.03f, -2.44f, 9.49f)
                horizontalLineTo(5.88f)
                curveToRelative(-0.53f, -1.45f, -2.22f, -6.27f, -2.44f, -9.49f)
                close()
            }
        }.also { _ChessKing = it}
