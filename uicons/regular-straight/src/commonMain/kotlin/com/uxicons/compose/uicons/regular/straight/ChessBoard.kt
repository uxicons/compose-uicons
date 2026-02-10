package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBoard: ImageVector? = null

val Icons.Rs.ChessBoard: ImageVector
    get() = _ChessBoard ?: UXIcon(name = "ChessBoard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
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
