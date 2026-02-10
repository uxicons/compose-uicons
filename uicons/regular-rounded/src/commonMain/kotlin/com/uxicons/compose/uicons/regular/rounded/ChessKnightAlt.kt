package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnightAlt: ImageVector? = null

val Icons.Rr.ChessKnightAlt: ImageVector
    get() = _ChessKnightAlt ?: UXIcon(name = "ChessKnightAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18.17f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -0.08f, -0.1f, -7.96f, -8.54f, -8.5f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.41f, 1.39f)
                arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, 3.85f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8.03f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.97f, 10f)
                horizontalLineToRelative(4.25f)
                arcToRelative(5.68f, 5.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.18f, 3.42f)
                arcTo(5.08f, 5.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                verticalLineToRelative(0.17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 24f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -5.83f)
                close()
                moveTo(7.86f, 15.24f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.62f, -6.08f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 8f)
                lineTo(6f, 8.03f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, -0.94f)
                arcTo(7.33f, 7.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.34f, 2f)
                arcTo(6.61f, 6.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8.5f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.86f, 15.24f)
                close()
                moveTo(19f, 22f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _ChessKnightAlt = it}
