package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnightAlt: ImageVector? = null

val Icons.Bs.ChessKnightAlt: ImageVector
    get() = _ChessKnightAlt ?: UXIcon(name = "ChessKnightAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19.34f)
                verticalLineTo(8.46f)
                curveTo(20f, 5.54f, 18.05f, 0f, 10.66f, 0f)
                horizontalLineTo(9.49f)
                lineTo(9.21f, 1.14f)
                curveToRelative(-0.59f, 2.37f, -1.51f, 3.13f, -3.1f, 3.77f)
                arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8f)
                verticalLineToRelative(2f)
                horizontalLineTo(9.61f)
                arcToRelative(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.85f, 4.19f)
                arcTo(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 17.23f)
                verticalLineToRelative(2.11f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 22.5f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(22.5f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 19.34f)
                close()
                moveTo(7.27f, 16.79f)
                curveToRelative(1.57f, -0.91f, 5.27f, -3.53f, 5.73f, -8.14f)
                lineTo(13.16f, 7f)
                horizontalLineToRelative(-4.5f)
                arcTo(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.76f, 3.06f)
                arcTo(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 8.46f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(17.23f)
                arcTo(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.27f, 16.79f)
                close()
            }
        }.also { _ChessKnightAlt = it}
