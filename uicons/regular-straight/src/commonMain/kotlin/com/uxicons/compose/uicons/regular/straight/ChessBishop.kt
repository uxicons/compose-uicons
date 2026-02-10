package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBishop: ImageVector? = null

val Icons.Rs.ChessBishop: ImageVector
    get() = _ChessBishop ?: UXIcon(name = "ChessBishop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                curveToRelative(0f, -4.69f, -5.98f, -9.86f, -7.85f, -11.37f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.81f, 3.6f)
                curveTo(8.81f, 4.99f, 3f, 9.51f, 3f, 15f)
                arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.36f, 7f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                horizontalLineTo(17.64f)
                arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
                close()
                moveTo(5f, 15f)
                curveToRelative(0f, -4.49f, 5.2f, -8.53f, 6.96f, -9.77f)
                arcToRelative(33.55f, 33.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.42f, 3.19f)
                lineToRelative(-3.96f, 4.95f)
                lineToRelative(1.56f, 1.25f)
                lineTo(16.7f, 9.98f)
                curveTo(18f, 11.64f, 19f, 13.43f, 19f, 15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15f)
                close()
            }
        }.also { _ChessBishop = it}
