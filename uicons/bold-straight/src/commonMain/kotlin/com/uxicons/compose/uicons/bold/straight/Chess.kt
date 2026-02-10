package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chess: ImageVector? = null

val Icons.Bs.Chess: ImageVector
    get() = _Chess ?: UXIcon(name = "Chess") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.18f, 20.1f)
                arcTo(108.04f, 108.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 8f)
                lineToRelative(0f, -1.46f)
                lineTo(10.88f, 4.4f)
                arcToRelative(1.64f, 1.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.26f, -1.64f)
                arcTo(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.97f, 2f)
                horizontalLineTo(8.03f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2f)
                horizontalLineToRelative(-1f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, 0.76f)
                arcToRelative(1.64f, 1.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 1.65f)
                lineTo(3f, 6.53f)
                verticalLineTo(8f)
                arcTo(107.75f, 107.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.86f, 20.08f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.5f)
                verticalLineTo(24f)
                horizontalLineTo(13f)
                verticalLineTo(22.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.18f, 20.1f)
                close()
                moveTo(7.04f, 9.5f)
                curveToRelative(0.15f, 3.34f, 0.71f, 7.71f, 1.1f, 10.5f)
                horizontalLineTo(4.9f)
                curveToRelative(0.38f, -2.79f, 0.92f, -7.16f, 1.06f, -10.5f)
                close()
                moveTo(22f, 20.05f)
                verticalLineTo(13f)
                horizontalLineToRelative(1f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineToRelative(2f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineToRelative(2f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.76f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 22.5f)
                verticalLineTo(24f)
                horizontalLineToRelative(9f)
                verticalLineTo(22.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20.05f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineTo(16f)
                close()
            }
        }.also { _Chess = it}
