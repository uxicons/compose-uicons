package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueenAlt: ImageVector? = null

val Icons.Sr.ChessQueenAlt: ImageVector
    get() = _ChessQueenAlt ?: UXIcon(name = "ChessQueenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 20f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                close()
                moveTo(7f, 8f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(15.52f)
                lineToRelative(1.71f, -2.95f)
                arcToRelative(1.42f, 1.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.41f, -1.72f)
                arcToRelative(1.39f, 1.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.7f, -0.07f)
                lineToRelative(-1.11f, 0.6f)
                lineTo(12.93f, 0.45f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.74f, 0.5f)
                lineTo(9.72f, 1.85f)
                lineTo(8.67f, 1.3f)
                arcTo(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.51f, 3.09f)
                lineTo(8.2f, 6f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 8f)
                close()
                moveTo(18.67f, 18f)
                arcTo(44.87f, 44.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.3f, 10f)
                horizontalLineTo(7.7f)
                arcToRelative(44.87f, 44.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.37f, 8f)
                close()
            }
        }.also { _ChessQueenAlt = it}
