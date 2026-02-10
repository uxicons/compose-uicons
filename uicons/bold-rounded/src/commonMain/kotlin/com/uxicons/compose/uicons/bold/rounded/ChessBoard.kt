package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBoard: ImageVector? = null

val Icons.Br.ChessBoard: ImageVector
    get() = _ChessBoard ?: UXIcon(name = "ChessBoard") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
            lineTo(5.5f, 0f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            lineTo(24f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
            close()
            moveTo(21f, 14f)
            verticalLineToRelative(4f)
            lineTo(18f, 18f)
            verticalLineToRelative(3f)
            lineTo(14f, 21f)
            lineTo(14f, 18f)
            lineTo(10f, 18f)
            verticalLineToRelative(3f)
            lineTo(6f, 21f)
            lineTo(6f, 18f)
            lineTo(3f, 18f)
            lineTo(3f, 14f)
            lineTo(6f, 14f)
            lineTo(6f, 10f)
            lineTo(3f, 10f)
            lineTo(3f, 6f)
            lineTo(6f, 6f)
            lineTo(6f, 3f)
            horizontalLineToRelative(4f)
            lineTo(10f, 6f)
            horizontalLineToRelative(4f)
            lineTo(14f, 3f)
            horizontalLineToRelative(4f)
            lineTo(18f, 6f)
            horizontalLineToRelative(3f)
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
    }.also { _ChessBoard = it }
