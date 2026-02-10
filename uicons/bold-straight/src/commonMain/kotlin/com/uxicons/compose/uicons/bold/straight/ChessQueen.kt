package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueen: ImageVector? = null

val Icons.Bs.ChessQueen: ImageVector
    get() = _ChessQueen ?: UXIcon(name = "ChessQueen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.9f, 9f)
                horizontalLineTo(22f)
                curveToRelative(-0.19f, 0f, -0.38f, 0.01f, -0.57f, 0.03f)
                arcToRelative(10.77f, 10.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.56f, -4.88f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.73f, 0.02f)
                arcTo(11.18f, 11.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.62f, 9.03f)
                curveTo(2.42f, 9.01f, 2.21f, 9f, 2f, 9f)
                horizontalLineTo(0.1f)
                lineTo(2.97f, 21f)
                horizontalLineTo(1f)
                verticalLineToRelative(3f)
                horizontalLineTo(23f)
                verticalLineTo(21f)
                horizontalLineTo(21.03f)
                close()
                moveTo(12f, 7f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.3f, 2.83f)
                arcToRelative(6.34f, 6.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, 1.25f)
                arcToRelative(6.08f, 6.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.15f, 0f)
                arcTo(6.31f, 6.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.75f, 9.85f)
                arcTo(8.02f, 8.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                close()
                moveTo(3.98f, 12.34f)
                arcTo(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
                horizontalLineTo(9f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                horizontalLineToRelative(3f)
                arcToRelative(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.02f, -2.66f)
                lineTo(17.94f, 21f)
                horizontalLineTo(6.06f)
                close()
            }
        }.also { _ChessQueen = it}
