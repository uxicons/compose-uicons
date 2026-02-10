package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueenAlt: ImageVector? = null

val Icons.Br.ChessQueenAlt: ImageVector
    get() = _ChessQueenAlt ?: UXIcon(name = "ChessQueenAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 20f)
            horizontalLineToRelative(-0.76f)
            arcTo(59.28f, 59.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.58f, 9f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 6f)
            horizontalLineToRelative(-0.45f)
            lineToRelative(1.85f, -3.19f)
            arcToRelative(1.13f, 1.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, -1.37f)
            lineTo(14.4f, 2.4f)
            lineTo(12.86f, 0.36f)
            arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.72f, 0f)
            lineTo(9.6f, 2.4f)
            lineTo(7.82f, 1.44f)
            arcToRelative(1.13f, 1.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, 1.37f)
            lineTo(7.95f, 6f)
            horizontalLineTo(7.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, 3f)
            arcTo(59.28f, 59.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.76f, 20f)
            horizontalLineTo(4f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            horizontalLineTo(20f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
            close()
            moveTo(10.43f, 9f)
            horizontalLineToRelative(3.14f)
            arcToRelative(56.84f, 56.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.52f, 11f)
            horizontalLineTo(7.92f)
            arcTo(56.84f, 56.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.43f, 9f)
            close()
        }
    }.also { _ChessQueenAlt = it }
