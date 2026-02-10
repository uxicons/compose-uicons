package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBoard: ImageVector? = null

val Icons.Sr.ChessBoard: ImageVector
    get() = _ChessBoard ?: UXIcon(name = "ChessBoard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 0f)
                close()
                moveTo(22f, 14f)
                verticalLineToRelative(4f)
                lineTo(18f, 18f)
                verticalLineToRelative(4f)
                lineTo(14f, 22f)
                lineTo(14f, 18f)
                lineTo(10f, 18f)
                verticalLineToRelative(4f)
                lineTo(6f, 22f)
                lineTo(6f, 18f)
                lineTo(2f, 18f)
                lineTo(2f, 14f)
                lineTo(6f, 14f)
                lineTo(6f, 10f)
                lineTo(2f, 10f)
                lineTo(2f, 6f)
                lineTo(6f, 6f)
                lineTo(6f, 2f)
                horizontalLineToRelative(4f)
                lineTo(10f, 6f)
                horizontalLineToRelative(4f)
                lineTo(14f, 2f)
                horizontalLineToRelative(4f)
                lineTo(18f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                lineTo(18f, 10f)
                verticalLineToRelative(4f)
                close()
                moveTo(10f, 10f)
                lineTo(6f, 10f)
                lineTo(6f, 6f)
                horizontalLineToRelative(4f)
                close()
                moveTo(14f, 10f)
                lineTo(14f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(10f, 14f)
                verticalLineToRelative(4f)
                lineTo(6f, 18f)
                lineTo(6f, 14f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                lineTo(14f, 18f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                lineTo(10f, 14f)
                close()
            }
        }.also { _ChessBoard = it}
