package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Ss.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(9.36f)
                arcTo(3.27f, 3.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.16f, 6.3f)
                curveTo(7.12f, 5.23f, 9.11f, 3.93f, 9.9f, 0.76f)
                lineTo(10.09f, 0f)
                horizontalLineToRelative(0.78f)
                curveTo(21.87f, 0f, 22f, 9.9f, 22f, 10f)
                verticalLineTo(20f)
                horizontalLineTo(5.24f)
                curveTo(7.39f, 18.05f, 10.19f, 14.86f, 11f, 11f)
                close()
                moveTo(1f, 22f)
                verticalLineToRelative(2f)
                horizontalLineTo(23f)
                verticalLineTo(22f)
                close()
            }
        }.also { _ChessKnight = it}
