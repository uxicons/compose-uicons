package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKingAlt: ImageVector? = null

val Icons.Rr.ChessKingAlt: ImageVector
    get() = _ChessKingAlt ?: UXIcon(name = "ChessKingAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                horizontalLineToRelative(-0.39f)
                arcToRelative(25.31f, 25.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.53f, -8f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-0.39f)
                reflectiveCurveTo(17.7f, 6.32f, 17.71f, 6.28f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.29f, 6.28f)
                curveTo(6.31f, 6.32f, 7.4f, 8f, 7.4f, 8f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(0.93f)
                arcToRelative(25.33f, 25.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.53f, 8f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                close()
                moveTo(8.07f, 5.37f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.93f, 1.37f)
                lineTo(14.22f, 8f)
                horizontalLineTo(9.78f)
                close()
                moveTo(9.94f, 10f)
                horizontalLineToRelative(4.13f)
                arcToRelative(25.75f, 25.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.32f, 8f)
                horizontalLineTo(7.62f)
                arcTo(25.75f, 25.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.94f, 10f)
                close()
                moveTo(19f, 22f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _ChessKingAlt = it}
