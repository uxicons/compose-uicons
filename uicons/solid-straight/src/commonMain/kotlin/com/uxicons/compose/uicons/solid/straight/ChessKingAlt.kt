package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKingAlt: ImageVector? = null

val Icons.Ss.ChessKingAlt: ImageVector
    get() = _ChessKingAlt ?: UXIcon(name = "ChessKingAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.39f, 8f)
                lineToRelative(1.5f, -3.33f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(0f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.63f, 0.85f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.22f, 1.9f)
                lineTo(7.61f, 8f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                close()
                moveTo(22f, 24f)
                horizontalLineTo(2f)
                verticalLineTo(23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(5.39f, 18f)
                arcToRelative(27.87f, 27.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.19f, -6f)
                horizontalLineToRelative(8.83f)
                arcToRelative(27.82f, 27.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.19f, 6f)
                close()
            }
        }.also { _ChessKingAlt = it}
