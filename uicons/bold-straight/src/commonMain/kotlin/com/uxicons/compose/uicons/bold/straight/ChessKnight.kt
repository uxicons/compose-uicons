package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Bs.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                lineToRelative(0f, -10.79f)
                arcToRelative(10.46f, 10.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.55f, -7.23f)
                curveTo(17.6f, 1f, 14.92f, 0f, 11.5f, 0f)
                horizontalLineTo(10.33f)
                lineToRelative(-0.28f, 1.14f)
                curveTo(9.38f, 3.8f, 7.31f, 5.04f, 4.41f, 6.09f)
                arcTo(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.5f)
                verticalLineTo(13f)
                horizontalLineTo(8.69f)
                arcTo(13.57f, 13.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.9f, 21f)
                horizontalLineTo(1f)
                verticalLineToRelative(3f)
                horizontalLineTo(24f)
                verticalLineTo(21f)
                close()
                moveTo(11.99f, 11.69f)
                lineTo(12.2f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(9.5f)
                arcToRelative(0.63f, 0.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, -0.59f)
                curveTo(8.25f, 7.89f, 11.24f, 6.4f, 12.58f, 3.04f)
                arcTo(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.24f, 5.01f)
                arcTo(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 10.11f)
                verticalLineTo(21f)
                horizontalLineTo(7.56f)
                arcTo(16.33f, 16.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.99f, 11.69f)
                close()
            }
        }.also { _ChessKnight = it}
