package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessRook: ImageVector? = null

val Icons.Ss.ChessRook: ImageVector
    get() = _ChessRook ?: UXIcon(name = "ChessRook") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 12f)
                verticalLineToRelative(2f)
                lineTo(11f, 14f)
                lineTo(11f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
                moveTo(0f, 9f)
                lineTo(0f, 0f)
                lineTo(6f, 0f)
                lineTo(6f, 4f)
                lineTo(9f, 4f)
                lineTo(9f, 0f)
                horizontalLineToRelative(6f)
                lineTo(15f, 4f)
                horizontalLineToRelative(3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(6f)
                lineTo(24f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                verticalLineToRelative(8f)
                lineTo(3f, 20f)
                lineTo(3f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 9f)
                close()
                moveTo(9f, 16f)
                horizontalLineToRelative(6f)
                lineTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                close()
                moveTo(1f, 22f)
                verticalLineToRelative(2f)
                lineTo(23f, 24f)
                lineTo(23f, 22f)
                close()
            }
        }.also { _ChessRook = it}
