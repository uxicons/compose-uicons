package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKingAlt: ImageVector? = null

val Icons.Sr.ChessKingAlt: ImageVector
    get() = _ChessKingAlt ?: UXIcon(name = "ChessKingAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8f)
                lineTo(7.4f, 8f)
                reflectiveCurveTo(6.31f, 6.32f, 6.29f, 6.28f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                horizontalLineToRelative(2f)
                lineTo(11f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(13f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.71f, 4.28f)
                curveTo(17.7f, 6.32f, 16.61f, 8f, 16.61f, 8f)
                lineTo(17f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(7f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
                close()
                moveTo(20f, 20f)
                lineTo(4f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                lineTo(20f, 24f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                close()
                moveTo(16.41f, 12f)
                lineTo(7.59f, 12f)
                arcToRelative(27.85f, 27.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, 6f)
                lineTo(18.61f, 18f)
                arcTo(27.75f, 27.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.41f, 12f)
                close()
            }
        }.also { _ChessKingAlt = it}
