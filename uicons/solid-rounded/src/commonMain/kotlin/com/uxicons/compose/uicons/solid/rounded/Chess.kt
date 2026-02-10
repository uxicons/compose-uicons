package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chess: ImageVector? = null

val Icons.Sr.Chess: ImageVector
    get() = _Chess ?: UXIcon(name = "Chess") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 20f)
                horizontalLineTo(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                horizontalLineTo(0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                close()
                moveTo(11.75f, 5.71f)
                curveToRelative(-0.02f, 0.04f, -1.03f, 1.6f, -1.03f, 1.6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.72f, -1.69f)
                reflectiveCurveTo(2.27f, 5.75f, 2.25f, 5.71f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.6f, 2f)
                horizontalLineTo(6.01f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineTo(2f)
                horizontalLineTo(9.4f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.35f, 3.71f)
                close()
                moveTo(22f, 20f)
                horizontalLineTo(15.46f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4f)
                horizontalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                arcTo(1.95f, 1.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                close()
                moveTo(11.74f, 18f)
                arcToRelative(46.7f, 46.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.53f, -7f)
                horizontalLineTo(3.79f)
                arcToRelative(46.25f, 46.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.53f, 7f)
                close()
                moveTo(14f, 10.73f)
                verticalLineTo(18f)
                horizontalLineToRelative(8f)
                verticalLineTo(10.73f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 9f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 10.73f)
                close()
            }
        }.also { _Chess = it}
