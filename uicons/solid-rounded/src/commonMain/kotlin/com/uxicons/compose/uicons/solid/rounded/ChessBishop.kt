package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBishop: ImageVector? = null

val Icons.Sr.ChessBishop: ImageVector
    get() = _ChessBishop ?: UXIcon(name = "ChessBishop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                curveToRelative(0f, -2.25f, -1.38f, -4.61f, -3.02f, -6.62f)
                lineToRelative(-5.22f, 6.26f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.54f, -1.28f)
                lineToRelative(5.42f, -6.5f)
                arcToRelative(36.11f, 36.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.23f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.81f, 3.6f)
                curveTo(8.81f, 4.99f, 3f, 9.51f, 3f, 15f)
                arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.36f, 7f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(17.64f)
                arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
                close()
            }
        }.also { _ChessBishop = it}
