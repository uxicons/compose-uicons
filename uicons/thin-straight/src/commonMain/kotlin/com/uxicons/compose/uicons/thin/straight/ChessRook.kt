package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessRook: ImageVector? = null

val Icons.Ts.ChessRook: ImageVector
    get() = _ChessRook ?: UXIcon(name = "ChessRook") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 11f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-6f)
                lineTo(18f, 4f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 4f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 8.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(12f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                lineTo(24f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 11f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(4f, 23f)
                lineTo(4f, 10f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 1f)
                lineTo(5f, 1f)
                lineTo(5f, 5f)
                horizontalLineToRelative(5f)
                lineTo(10f, 1f)
                horizontalLineToRelative(4f)
                lineTo(14f, 5f)
                horizontalLineToRelative(5f)
                lineTo(19f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(13f)
                lineTo(4f, 23f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(14f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _ChessRook = it}
