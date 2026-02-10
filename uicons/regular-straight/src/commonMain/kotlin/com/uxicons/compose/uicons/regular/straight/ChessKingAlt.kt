package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKingAlt: ImageVector? = null

val Icons.Rs.ChessKingAlt: ImageVector
    get() = _ChessKingAlt ?: UXIcon(name = "ChessKingAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                horizontalLineToRelative(-0.39f)
                arcToRelative(25.37f, 25.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.53f, -8f)
                lineTo(18f, 10f)
                lineTo(18f, 8f)
                lineTo(16.39f, 8f)
                lineToRelative(1.5f, -3.33f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 2f)
                lineTo(8f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.63f, 0.85f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.22f, 1.9f)
                lineTo(7.61f, 8f)
                lineTo(6f, 8f)
                verticalLineToRelative(2f)
                lineTo(7.92f, 10f)
                arcToRelative(25.37f, 25.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.53f, 8f)
                lineTo(5f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                lineTo(22f, 24f)
                lineTo(22f, 21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
                close()
                moveTo(8f, 4f)
                horizontalLineToRelative(8.03f)
                lineTo(14.19f, 8f)
                lineTo(9.81f, 8f)
                close()
                moveTo(9.93f, 10f)
                horizontalLineToRelative(4.14f)
                arcToRelative(25.78f, 25.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.31f, 8f)
                lineTo(7.62f, 18f)
                arcTo(25.78f, 25.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.93f, 10f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                lineTo(4f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(19f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _ChessKingAlt = it}
