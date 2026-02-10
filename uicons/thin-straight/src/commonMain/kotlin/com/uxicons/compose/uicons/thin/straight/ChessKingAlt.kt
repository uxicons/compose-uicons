package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKingAlt: ImageVector? = null

val Icons.Ts.ChessKingAlt: ImageVector
    get() = _ChessKingAlt ?: UXIcon(name = "ChessKingAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 19f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-0.59f, -1.13f, -2.95f, -5.9f, -3.26f, -10f)
                horizontalLineToRelative(2.46f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.39f)
                lineToRelative(1.8f, -4.0f)
                curveToRelative(0.16f, -0.46f, 0.09f, -0.97f, -0.19f, -1.37f)
                curveToRelative(-0.28f, -0.4f, -0.74f, -0.64f, -1.23f, -0.64f)
                horizontalLineToRelative(-3.5f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 2f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.49f, 0f, -0.94f, 0.24f, -1.23f, 0.64f)
                curveToRelative(-0.28f, 0.4f, -0.35f, 0.91f, -0.17f, 1.4f)
                lineToRelative(1.79f, 3.96f)
                horizontalLineToRelative(-2.39f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.46f)
                curveToRelative(-0.31f, 4.1f, -2.67f, 8.87f, -3.26f, 10f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                lineTo(22f, 24f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7.53f, 3.67f)
                curveToRelative(-0.06f, -0.15f, -0.03f, -0.32f, 0.06f, -0.46f)
                curveToRelative(0.1f, -0.14f, 0.24f, -0.21f, 0.41f, -0.21f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.17f, 0f, 0.31f, 0.08f, 0.41f, 0.21f)
                curveToRelative(0.1f, 0.14f, 0.12f, 0.3f, 0.08f, 0.42f)
                lineToRelative(-1.96f, 4.37f)
                horizontalLineToRelative(-5.09f)
                lineToRelative(-1.91f, -4.33f)
                close()
                moveTo(9.47f, 9f)
                horizontalLineToRelative(5.07f)
                curveToRelative(0.27f, 3.92f, 2.28f, 8.28f, 3.14f, 10f)
                lineTo(6.32f, 19f)
                curveToRelative(0.86f, -1.72f, 2.87f, -6.08f, 3.14f, -10f)
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
        }.also { _ChessKingAlt = it}
