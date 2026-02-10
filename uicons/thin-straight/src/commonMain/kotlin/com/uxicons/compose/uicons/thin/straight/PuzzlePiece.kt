package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PuzzlePiece: ImageVector? = null

val Icons.Ts.PuzzlePiece: ImageVector
    get() = _PuzzlePiece ?: UXIcon(name = "PuzzlePiece") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 24f)
                horizontalLineToRelative(-7.43f)
                reflectiveCurveToRelative(0.43f, -1.31f, 0.43f, -2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.01f, 0.43f, 2.5f, 0.43f, 2.5f)
                lineTo(0f, 24f)
                lineTo(0f, 8.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.91f)
                curveToRelative(-0.25f, -0.97f, -0.41f, -1.9f, -0.41f, -2.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 0.6f, -0.15f, 1.53f, -0.41f, 2.5f)
                horizontalLineToRelative(3.91f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.91f)
                curveToRelative(0.97f, -0.25f, 1.9f, -0.41f, 2.5f, -0.41f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-0.6f, 0f, -1.53f, -0.15f, -2.5f, -0.41f)
                verticalLineToRelative(6.41f)
                close()
                moveTo(11.82f, 23f)
                horizontalLineToRelative(5.18f)
                verticalLineToRelative(-6.74f)
                reflectiveCurveToRelative(2.1f, 0.74f, 3.5f, 0.74f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-1.06f, 0f, -3.5f, 0.74f, -3.5f, 0.74f)
                verticalLineToRelative(-4.24f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.24f)
                reflectiveCurveToRelative(0.74f, -2.33f, 0.74f, -3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.22f, 0.74f, 3.5f, 0.74f, 3.5f)
                lineTo(2.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                lineTo(5.18f, 23f)
                curveToRelative(-0.12f, -0.59f, -0.18f, -1.12f, -0.18f, -1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 0.38f, -0.06f, 0.91f, -0.18f, 1.5f)
                close()
            }
        }.also { _PuzzlePiece = it}
