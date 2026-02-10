package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBishop: ImageVector? = null

val Icons.Bs.ChessBishop: ImageVector
    get() = _ChessBishop ?: UXIcon(name = "ChessBishop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                curveToRelative(0f, -4.96f, -6.41f, -10.21f, -7.88f, -11.34f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.26f, -0.01f)
                curveTo(9.28f, 4.71f, 3f, 9.3f, 3f, 15f)
                arcToRelative(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.3f, 6f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(18.7f)
                arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
                close()
                moveTo(6f, 15f)
                curveToRelative(0f, -3.41f, 3.73f, -6.84f, 5.93f, -8.45f)
                arcToRelative(29.56f, 29.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.47f, 2.3f)
                lineToRelative(-3.38f, 4.22f)
                lineToRelative(2.34f, 1.88f)
                lineToRelative(3f, -3.75f)
                arcTo(7.21f, 7.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
                close()
            }
        }.also { _ChessBishop = it}
