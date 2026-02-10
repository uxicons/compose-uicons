package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueen: ImageVector? = null

val Icons.Ts.ChessQueen: ImageVector
    get() = _ChessQueen ?: UXIcon(name = "ChessQueen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 10f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-0.66f, 0f, -1.27f, 0.06f, -1.85f, 0.16f)
                curveToRelative(-1.02f, -1.67f, -3.12f, -4.22f, -6.64f, -4.95f)
                curveToRelative(0.6f, -0.55f, 0.99f, -1.33f, 0.99f, -2.21f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.88f, 0.39f, 1.66f, 0.99f, 2.21f)
                curveToRelative(-3.56f, 0.75f, -5.66f, 3.37f, -6.64f, 4.95f)
                curveToRelative(-0.57f, -0.1f, -1.19f, -0.16f, -1.85f, -0.16f)
                lineTo(0.88f, 10.0f)
                lineToRelative(2.78f, 13f)
                horizontalLineToRelative(-1.66f)
                verticalLineToRelative(1f)
                lineTo(22f, 24.0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.66f)
                lineToRelative(2.78f, -13f)
                close()
                moveTo(10f, 3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(12f, 6f)
                curveToRelative(4.05f, 0f, 6.46f, 2.62f, 7.63f, 4.42f)
                curveToRelative(-1.46f, 0.47f, -2.54f, 1.31f, -3.13f, 2.45f)
                curveToRelative(-0.8f, -1.69f, -2.51f, -2.86f, -4.5f, -2.86f)
                reflectiveCurveToRelative(-3.7f, 1.18f, -4.5f, 2.86f)
                curveToRelative(-0.59f, -1.13f, -1.67f, -1.98f, -3.13f, -2.45f)
                curveToRelative(1.13f, -1.72f, 3.55f, -4.42f, 7.63f, -4.42f)
                close()
                moveTo(2.12f, 11.02f)
                curveToRelative(2.46f, 0.15f, 4.88f, 1.26f, 4.88f, 3.98f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.72f, 2.42f, -3.83f, 4.88f, -3.98f)
                lineToRelative(-2.56f, 11.98f)
                lineTo(4.69f, 23f)
                lineTo(2.12f, 11.02f)
                close()
            }
        }.also { _ChessQueen = it}
