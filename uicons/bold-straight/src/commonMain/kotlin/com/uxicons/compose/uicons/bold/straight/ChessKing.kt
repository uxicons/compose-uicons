package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Bs.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.6f, 9.85f)
                arcToRelative(3.37f, 3.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.01f, -1.66f)
                arcTo(36.83f, 36.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 7.03f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(2f)
                horizontalLineTo(13.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(7.03f)
                arcTo(36.83f, 36.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.41f, 8.19f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.26f, 4.27f)
                lineTo(2.82f, 21f)
                horizontalLineTo(1f)
                verticalLineToRelative(3f)
                horizontalLineTo(23f)
                verticalLineTo(21f)
                horizontalLineTo(21.18f)
                lineToRelative(2.67f, -8.55f)
                arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.6f, 9.85f)
                close()
                moveTo(5.96f, 21f)
                lineTo(3.02f, 11.57f)
                arcToRelative(0.42f, 0.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.03f, -0.32f)
                arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, -0.19f)
                arcTo(35.47f, 35.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcToRelative(35.45f, 35.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.72f, 1.06f)
                arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, 0.19f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.03f, 0.31f)
                lineTo(18.04f, 21f)
                close()
            }
        }.also { _ChessKing = it}
