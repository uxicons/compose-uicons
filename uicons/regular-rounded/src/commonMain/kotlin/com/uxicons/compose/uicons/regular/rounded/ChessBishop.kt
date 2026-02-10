package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBishop: ImageVector? = null

val Icons.Rr.ChessBishop: ImageVector
    get() = _ChessBishop ?: UXIcon(name = "ChessBishop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 22f)
                horizontalLineTo(17.65f)
                arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
                curveToRelative(0f, -4.68f, -5.96f, -9.85f, -7.85f, -11.37f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.8f, 3.6f)
                curveTo(8.79f, 5.01f, 3f, 9.53f, 3f, 15f)
                arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, 7f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(5f, 15f)
                curveToRelative(0f, -4.49f, 5.2f, -8.53f, 6.96f, -9.77f)
                arcToRelative(33.42f, 33.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, 3.17f)
                lineToRelative(-4.13f, 4.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.54f, 1.28f)
                lineTo(16.68f, 9.95f)
                curveTo(18f, 11.62f, 19f, 13.42f, 19f, 15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15f)
                close()
            }
        }.also { _ChessBishop = it}
