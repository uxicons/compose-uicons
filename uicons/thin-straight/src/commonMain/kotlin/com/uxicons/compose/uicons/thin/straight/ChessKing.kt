package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Ts.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.7f, 9.68f)
                curveToRelative(-0.32f, -0.61f, -0.87f, -1.05f, -1.53f, -1.25f)
                curveToRelative(-2.17f, -0.66f, -6.06f, -1.36f, -9.67f, -1.42f)
                verticalLineToRelative(-3.01f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.5f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 3f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.01f)
                curveToRelative(-3.61f, 0.06f, -7.5f, 0.76f, -9.67f, 1.42f)
                curveToRelative(-0.66f, 0.2f, -1.2f, 0.65f, -1.53f, 1.25f)
                curveToRelative(-0.33f, 0.61f, -0.39f, 1.32f, -0.19f, 1.99f)
                lineToRelative(3.49f, 11.33f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(1f)
                lineTo(22f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(3.49f, -11.33f)
                curveToRelative(0.2f, -0.67f, 0.14f, -1.37f, -0.19f, -1.99f)
                close()
                moveTo(22.93f, 11.37f)
                lineToRelative(-3.58f, 11.63f)
                lineTo(4.65f, 23f)
                lineTo(1.07f, 11.37f)
                curveToRelative(-0.13f, -0.41f, -0.09f, -0.84f, 0.12f, -1.22f)
                curveToRelative(0.2f, -0.37f, 0.53f, -0.65f, 0.93f, -0.77f)
                curveToRelative(2.2f, -0.67f, 6.24f, -1.39f, 9.88f, -1.39f)
                reflectiveCurveToRelative(7.67f, 0.72f, 9.88f, 1.39f)
                curveToRelative(0.4f, 0.12f, 0.73f, 0.4f, 0.93f, 0.77f)
                curveToRelative(0.2f, 0.38f, 0.24f, 0.81f, 0.12f, 1.22f)
                close()
            }
        }.also { _ChessKing = it}
