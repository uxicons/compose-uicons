package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnightAlt: ImageVector? = null

val Icons.Ts.ChessKnightAlt: ImageVector
    get() = _ChessKnightAlt ?: UXIcon(name = "ChessKnightAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19.05f)
                lineTo(20f, 8f)
                curveToRelative(0f, -0.08f, -0.11f, -8f, -9.94f, -8f)
                horizontalLineToRelative(-0.39f)
                lineToRelative(-0.1f, 0.38f)
                curveToRelative(-0.74f, 2.98f, -2.02f, 4.02f, -3.98f, 4.82f)
                curveToRelative(-0.97f, 0.39f, -1.6f, 1.31f, -1.6f, 2.33f)
                verticalLineToRelative(1.48f)
                horizontalLineToRelative(6.39f)
                curveToRelative(-0.8f, 3.32f, -3.36f, 4.92f, -4.88f, 5.6f)
                curveToRelative(-0.92f, 0.41f, -1.51f, 1.31f, -1.51f, 2.3f)
                verticalLineToRelative(2.15f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(2.5f)
                lineTo(22f, 24f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(5.92f, 15.51f)
                curveToRelative(1.78f, -0.8f, 4.88f, -2.75f, 5.57f, -6.93f)
                lineToRelative(0.1f, -0.58f)
                lineTo(5f, 8f)
                verticalLineToRelative(-0.47f)
                curveToRelative(0f, -0.61f, 0.38f, -1.16f, 0.97f, -1.4f)
                curveToRelative(2.06f, -0.83f, 3.61f, -2.04f, 4.47f, -5.12f)
                curveToRelative(8.43f, 0.19f, 8.55f, 6.72f, 8.55f, 7.0f)
                verticalLineToRelative(11f)
                lineTo(5f, 19f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0f, -0.59f, 0.36f, -1.13f, 0.92f, -1.38f)
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
        }.also { _ChessKnightAlt = it}
