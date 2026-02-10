package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueenAlt: ImageVector? = null

val Icons.Rr.ChessQueenAlt: ImageVector
    get() = _ChessQueenAlt ?: UXIcon(name = "ChessQueenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                horizontalLineToRelative(-0.32f)
                arcTo(44.01f, 44.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.07f, 8f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-0.47f)
                reflectiveCurveToRelative(1.28f, -2.21f, 1.29f, -2.25f)
                arcToRelative(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.86f, -2.4f)
                lineToRelative(-0.68f, 0.36f)
                reflectiveCurveTo(13.46f, 0.63f, 13.43f, 0.6f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.86f, 0f)
                curveToRelative(-0.03f, 0.03f, -0.85f, 1.11f, -0.85f, 1.11f)
                lineTo(9.04f, 1.35f)
                arcToRelative(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.86f, 2.4f)
                curveTo(6.19f, 3.79f, 7.47f, 6f, 7.47f, 6f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 8f)
                horizontalLineToRelative(0.93f)
                arcTo(44.08f, 44.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.32f, 18f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                close()
                moveTo(9.53f, 3.88f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.8f, 3.6f)
                lineTo(12f, 2.01f)
                lineTo(13.2f, 3.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.27f, 0.28f)
                lineToRelative(1.41f, -0.76f)
                lineTo(14.21f, 6f)
                horizontalLineTo(9.79f)
                lineTo(8.11f, 3.12f)
                close()
                moveTo(9.94f, 8f)
                horizontalLineToRelative(4.12f)
                arcToRelative(43.09f, 43.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.49f, 10f)
                horizontalLineToRelative(-9.1f)
                arcTo(43.09f, 43.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.94f, 8f)
                close()
                moveTo(19f, 22f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _ChessQueenAlt = it}
