package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Sr.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.33f, 10.22f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.27f, -2.39f)
                arcTo(40.27f, 40.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7.02f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                horizontalLineToRelative(2f)
                verticalLineTo(7.02f)
                arcToRelative(40.27f, 40.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.06f, 0.82f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, 14.27f)
                lineTo(3.09f, 22f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-0.09f)
                lineToRelative(2.86f, -7.77f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.33f, 10.22f)
                close()
            }
        }.also { _ChessKing = it}
