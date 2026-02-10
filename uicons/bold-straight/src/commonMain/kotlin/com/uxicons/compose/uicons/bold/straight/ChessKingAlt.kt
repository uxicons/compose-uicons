package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKingAlt: ImageVector? = null

val Icons.Bs.ChessKingAlt: ImageVector
    get() = _ChessKingAlt ?: UXIcon(name = "ChessKingAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.01f, 19.04f)
                arcTo(43.43f, 43.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.49f, 11f)
                lineTo(18f, 11f)
                lineTo(18f, 8f)
                lineTo(16.7f, 8f)
                lineToRelative(1.25f, -2.78f)
                arcTo(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.67f, 2f)
                lineTo(13.5f, 2f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2f)
                lineTo(8.33f, 2f)
                arcTo(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.05f, 5.22f)
                lineTo(7.3f, 8f)
                lineTo(6f, 8f)
                verticalLineToRelative(3f)
                lineTo(7.51f, 11f)
                arcToRelative(43.51f, 43.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.52f, 8.04f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 22.5f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 22.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.01f, 19.04f)
                close()
                moveTo(9.24f, 5f)
                horizontalLineToRelative(5.52f)
                lineTo(13.41f, 8f)
                lineTo(10.59f, 8f)
                close()
                moveTo(13.45f, 11f)
                arcToRelative(41.43f, 41.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.31f, 8f)
                lineTo(8.24f, 19f)
                arcToRelative(41.5f, 41.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.31f, -8f)
                close()
            }
        }.also { _ChessKingAlt = it}
