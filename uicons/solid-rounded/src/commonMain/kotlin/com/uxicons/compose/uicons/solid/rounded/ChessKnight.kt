package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Sr.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.09f, -0.11f, -9.09f, -9.57f, -9.99f)
                arcToRelative(2.84f, 2.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, 1.8f)
                curveToRelative(-0.99f, 2.47f, -2.89f, 3.58f, -5.42f, 4.5f)
                arcTo(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.36f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.64f, 12f)
                horizontalLineTo(9.82f)
                curveToRelative(-1.25f, 5.95f, -6.06f, 9.33f, -7.11f, 10f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.also { _ChessKnight = it}
