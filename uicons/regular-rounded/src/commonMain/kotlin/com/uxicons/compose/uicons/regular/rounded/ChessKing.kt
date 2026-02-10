package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Rr.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.33f, 10.22f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.27f, -2.39f)
                arcTo(40.14f, 40.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7.01f)
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
                verticalLineTo(7.01f)
                arcToRelative(40.14f, 40.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.06f, 0.82f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, 14.27f)
                lineTo(3.09f, 22f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(4.48f)
                quadToRelative(0.04f, 0f, 0.08f, 0f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-0.09f)
                lineToRelative(2.86f, -7.77f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.33f, 10.22f)
                close()
                moveTo(21.88f, 13.58f)
                lineTo(18.78f, 22f)
                horizontalLineTo(5.22f)
                lineTo(2.14f, 13.62f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.37f, 9.79f)
                arcTo(38.17f, 38.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                arcToRelative(38.17f, 38.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.63f, 0.79f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.6f, 11.22f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.88f, 13.58f)
                close()
            }
        }.also { _ChessKing = it}
