package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueenAlt: ImageVector? = null

val Icons.Rs.ChessQueenAlt: ImageVector
    get() = _ChessQueenAlt ?: UXIcon(name = "ChessQueenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                horizontalLineToRelative(-0.32f)
                arcTo(43.96f, 43.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.07f, 8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(16.23f)
                lineToRelative(1.7f, -5.89f)
                lineTo(14.16f, 1.83f)
                lineTo(12f, 0.03f)
                lineToRelative(-2.16f, 1.8f)
                lineTo(6.08f, 0.11f)
                lineTo(7.78f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(7.92f)
                arcTo(44.02f, 44.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.32f, 18f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
                close()
                moveTo(9.2f, 3.73f)
                lineToRelative(0.95f, 0.44f)
                lineTo(12f, 2.63f)
                lineToRelative(1.84f, 1.54f)
                lineToRelative(0.95f, -0.44f)
                lineTo(14.14f, 6f)
                horizontalLineTo(9.86f)
                close()
                moveTo(9.93f, 8f)
                horizontalLineToRelative(4.13f)
                arcToRelative(43.09f, 43.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.48f, 10f)
                horizontalLineToRelative(-9.1f)
                arcTo(43.09f, 43.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.93f, 8f)
                close()
                moveTo(20f, 22f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _ChessQueenAlt = it}
