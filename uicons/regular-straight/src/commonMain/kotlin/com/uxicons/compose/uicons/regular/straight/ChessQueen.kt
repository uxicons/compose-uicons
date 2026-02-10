package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueen: ImageVector? = null

val Icons.Rs.ChessQueen: ImageVector
    get() = _ChessQueen ?: UXIcon(name = "ChessQueen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                horizontalLineTo(22.74f)
                arcToRelative(8.41f, 8.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, 0.2f)
                arcToRelative(10.83f, 10.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.1f, -5.03f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.7f, 0.01f)
                arcToRelative(10.9f, 10.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.1f, 5.02f)
                arcTo(8.39f, 8.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.2f, 9f)
                horizontalLineTo(-0.06f)
                lineTo(2.99f, 22f)
                horizontalLineTo(1.97f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineTo(22f)
                horizontalLineTo(20.95f)
                close()
                moveTo(11.97f, 6f)
                arcTo(8.49f, 8.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9.92f)
                arcToRelative(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.02f, 1.78f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.03f, 0f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.94f, 9.93f)
                arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.97f, 6f)
                close()
                moveTo(2.49f, 11.12f)
                arcTo(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.97f, 15f)
                horizontalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.48f, -3.88f)
                lineTo(18.9f, 22f)
                horizontalLineTo(5.04f)
                close()
            }
        }.also { _ChessQueen = it}
