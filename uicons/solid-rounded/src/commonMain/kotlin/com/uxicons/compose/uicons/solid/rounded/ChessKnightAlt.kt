package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnightAlt: ImageVector? = null

val Icons.Sr.ChessKnightAlt: ImageVector
    get() = _ChessKnightAlt ?: UXIcon(name = "ChessKnightAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 20f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                close()
                moveTo(5.97f, 10f)
                horizontalLineToRelative(4.25f)
                arcToRelative(5.68f, 5.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.18f, 3.42f)
                arcTo(5.08f, 5.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                horizontalLineTo(20f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -0.08f, -0.1f, -7.96f, -8.54f, -8.5f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.41f, 1.39f)
                arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, 3.85f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8.03f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.97f, 10f)
                close()
            }
        }.also { _ChessKnightAlt = it}
