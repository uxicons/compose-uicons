package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBoard: ImageVector? = null

val Icons.Bs.ChessBoard: ImageVector
    get() = _ChessBoard ?: UXIcon(name = "ChessBoard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                verticalLineToRelative(4f)
                lineTo(14f, 10f)
                lineTo(14f, 6f)
                close()
                moveTo(24f, 3.5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 0f)
                horizontalLineToRelative(17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 3.5f)
                close()
                moveTo(21f, 6f)
                lineTo(18f, 6f)
                lineTo(18f, 3f)
                lineTo(14f, 3f)
                lineTo(14f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 6f)
                lineTo(3f, 6f)
                verticalLineToRelative(4f)
                lineTo(6f, 10f)
                verticalLineToRelative(4f)
                lineTo(3f, 14f)
                verticalLineToRelative(4f)
                lineTo(6f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                lineTo(10f, 18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                lineTo(18f, 18f)
                horizontalLineToRelative(3f)
                lineTo(21f, 14f)
                lineTo(18f, 14f)
                lineTo(18f, 10f)
                horizontalLineToRelative(3f)
                close()
                moveTo(10f, 6f)
                lineTo(6f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(4f)
                lineTo(18f, 14f)
                lineTo(14f, 14f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(4f)
                lineTo(14f, 10f)
                lineTo(10f, 10f)
                close()
                moveTo(6f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                lineTo(10f, 14f)
                close()
            }
        }.also { _ChessBoard = it}
