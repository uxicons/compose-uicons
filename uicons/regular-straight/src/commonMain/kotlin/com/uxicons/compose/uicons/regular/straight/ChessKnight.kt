package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Rs.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.1f, -0.13f, -10f, -11.12f, -10f)
                horizontalLineToRelative(-0.78f)
                lineTo(9.9f, 0.76f)
                curveTo(9.11f, 3.93f, 7.12f, 5.23f, 4.16f, 6.3f)
                arcTo(3.27f, 3.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.36f)
                verticalLineTo(12f)
                horizontalLineTo(9.82f)
                curveToRelative(-1.25f, 5.95f, -6.06f, 9.33f, -7.11f, 10f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(23f)
                verticalLineTo(22f)
                close()
                moveTo(11.99f, 11.12f)
                lineTo(12.13f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(9.36f)
                arcToRelative(1.26f, 1.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.84f, -1.18f)
                curveTo(7.66f, 7.16f, 10.41f, 5.7f, 11.62f, 2.02f)
                curveTo(19.86f, 2.43f, 20f, 9.69f, 20f, 10f)
                verticalLineTo(22f)
                horizontalLineTo(6.01f)
                arcTo(17.51f, 17.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.99f, 11.12f)
                close()
            }
        }.also { _ChessKnight = it}
