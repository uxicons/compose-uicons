package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueenAlt: ImageVector? = null

val Icons.Ts.ChessQueenAlt: ImageVector
    get() = _ChessQueenAlt ?: UXIcon(name = "ChessQueenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 19f)
                horizontalLineToRelative(-0.67f)
                curveToRelative(-0.54f, -1.32f, -2.66f, -6.79f, -2.82f, -11f)
                horizontalLineToRelative(1.98f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.87f)
                lineToRelative(1.43f, -6.21f)
                lineToRelative(-3.44f, 1.29f)
                lineTo(12f, 0.02f)
                lineToRelative(-2.12f, 2.07f)
                lineTo(6.44f, 0.79f)
                lineToRelative(1.43f, 6.21f)
                horizontalLineToRelative(-1.87f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.98f)
                curveToRelative(-0.16f, 4.21f, -2.28f, 9.68f, -2.82f, 11f)
                horizontalLineToRelative(-0.67f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                lineTo(22f, 24f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7.84f, 2.39f)
                lineToRelative(2.28f, 0.86f)
                lineToRelative(1.88f, -1.83f)
                lineToRelative(1.88f, 1.83f)
                lineToRelative(2.28f, -0.86f)
                lineToRelative(-1.06f, 4.61f)
                horizontalLineToRelative(-6.22f)
                lineToRelative(-1.05f, -4.61f)
                close()
                moveTo(8.98f, 8f)
                horizontalLineToRelative(6.03f)
                curveToRelative(0.15f, 4.1f, 2.01f, 9.17f, 2.74f, 11f)
                lineTo(6.25f, 19f)
                curveToRelative(0.73f, -1.83f, 2.59f, -6.9f, 2.74f, -11f)
                close()
                moveTo(21f, 23f)
                lineTo(3f, 23f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _ChessQueenAlt = it}
