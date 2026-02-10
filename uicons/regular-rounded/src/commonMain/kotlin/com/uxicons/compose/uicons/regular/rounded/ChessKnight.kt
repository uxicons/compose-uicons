package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Rr.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.09f, -0.11f, -9.09f, -9.57f, -9.99f)
                arcToRelative(2.84f, 2.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, 1.8f)
                curveToRelative(-0.99f, 2.47f, -2.89f, 3.58f, -5.42f, 4.5f)
                arcTo(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.36f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.64f, 12f)
                horizontalLineTo(9.82f)
                curveToRelative(-1.24f, 5.93f, -6.03f, 9.31f, -7.1f, 10f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(11.99f, 11.12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 10f)
                horizontalLineTo(4.64f)
                arcTo(0.65f, 0.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 9.36f)
                arcToRelative(1.23f, 1.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -1.16f)
                curveToRelative(2.51f, -0.9f, 5.26f, -2.27f, 6.6f, -5.63f)
                arcTo(0.86f, 0.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.24f, 2f)
                arcTo(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10f)
                verticalLineTo(22f)
                horizontalLineTo(6.01f)
                arcTo(17.52f, 17.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.99f, 11.12f)
                close()
            }
        }.also { _ChessKnight = it}
