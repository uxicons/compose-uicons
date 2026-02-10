package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueenAlt: ImageVector? = null

val Icons.Ss.ChessQueenAlt: ImageVector
    get() = _ChessQueenAlt ?: UXIcon(name = "ChessQueenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.23f, 6f)
                lineToRelative(1.7f, -5.89f)
                lineTo(14f, 2f)
                lineTo(12f, 0.03f)
                lineTo(10f, 2f)
                lineTo(6.08f, 0.11f)
                lineTo(7.78f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                close()
                moveTo(22f, 24f)
                horizontalLineTo(2f)
                verticalLineTo(23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(16.36f, 10f)
                arcToRelative(50.4f, 50.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.33f, 8f)
                horizontalLineTo(5.32f)
                arcToRelative(50.6f, 50.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.33f, -8f)
                close()
            }
        }.also { _ChessQueenAlt = it}
