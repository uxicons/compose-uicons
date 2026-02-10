package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueenAlt: ImageVector? = null

val Icons.Bs.ChessQueenAlt: ImageVector
    get() = _ChessQueenAlt ?: UXIcon(name = "ChessQueenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.06f, 19.05f)
                arcTo(62.44f, 62.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.23f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(15.62f)
                lineTo(17f, 1f)
                lineTo(14.29f, 2.46f)
                lineTo(12f, 0f)
                lineTo(9.71f, 2.46f)
                lineTo(7f, 1f)
                lineTo(8.38f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(7.77f)
                arcTo(62.44f, 62.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.94f, 19.05f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 22.5f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(22.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.06f, 19.05f)
                close()
                moveTo(13.2f, 9f)
                arcToRelative(58.94f, 58.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.65f, 10f)
                horizontalLineTo(8.14f)
                arcTo(58.94f, 58.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.8f, 9f)
                close()
            }
        }.also { _ChessQueenAlt = it}
