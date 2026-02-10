package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Br.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.29f, 10.35f)
            arcToRelative(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.48f, -2.54f)
            arcTo(38.73f, 38.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 7.03f)
            lineTo(13.5f, 5f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-1f)
            lineTo(13.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            lineTo(10.5f, 2f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1f)
            lineTo(10.5f, 7.03f)
            arcToRelative(38.76f, 38.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.31f, 0.78f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.92f, 6.87f)
            lineTo(2.6f, 21f)
            lineTo(2.5f, 21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(19f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-0.1f)
            lineToRelative(2.35f, -6.39f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.29f, 10.35f)
            close()
            moveTo(20.91f, 13.64f)
            lineTo(18.21f, 21f)
            lineTo(5.79f, 21f)
            lineTo(3.11f, 13.7f)
            arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.2f, -1.85f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.52f, -1.11f)
            arcTo(36.51f, 36.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
            arcToRelative(36.48f, 36.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.16f, 0.74f)
            arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.52f, 1.11f)
            arcTo(2.26f, 2.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.91f, 13.64f)
            close()
        }
    }.also { _ChessKing = it }
