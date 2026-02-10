package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnightAlt: ImageVector? = null

val Icons.Rs.ChessKnightAlt: ImageVector
    get() = _ChessKnightAlt ?: UXIcon(name = "ChessKnightAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18.18f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -0.09f, -0.11f, -8.5f, -9.44f, -8.5f)
                horizontalLineTo(9.78f)
                lineTo(9.59f, 0.76f)
                curveTo(8.9f, 3.55f, 7.76f, 4.48f, 5.91f, 5.23f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8.03f)
                verticalLineTo(10f)
                horizontalLineToRelative(6.22f)
                arcToRelative(5.91f, 5.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.09f, 3.75f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 16.62f)
                verticalLineToRelative(1.56f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 21f)
                verticalLineToRelative(3f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 18.18f)
                close()
                moveTo(6.71f, 15.67f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.78f, -6.5f)
                lineTo(12.68f, 8f)
                horizontalLineTo(6f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, -0.91f)
                arcToRelative(7.21f, 7.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.65f, -5.06f)
                curveTo(17.88f, 2.44f, 18f, 8.25f, 18f, 8.5f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(16.62f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.71f, 15.67f)
                close()
                moveTo(20f, 22f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _ChessKnightAlt = it}
