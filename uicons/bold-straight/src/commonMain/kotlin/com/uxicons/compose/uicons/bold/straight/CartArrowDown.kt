package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartArrowDown: ImageVector? = null

val Icons.Bs.CartArrowDown: ImageVector
    get() = _CartArrowDown ?: UXIcon(name = "CartArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.79f, 13.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(3.79f, -3.71f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2f)
                horizontalLineToRelative(-3f)
                verticalLineTo(10f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, 3.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.03f)
                lineToRelative(-1.94f, 7f)
                horizontalLineTo(7.41f)
                curveToRelative(-0.25f, 0f, -0.46f, -0.19f, -0.5f, -0.43f)
                lineToRelative(-0.88f, -6.57f)
                horizontalLineToRelative(2.97f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.37f)
                lineToRelative(-0.26f, -1.96f)
                curveToRelative(-0.23f, -1.73f, -1.72f, -3.04f, -3.47f, -3.04f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(1.9f)
                curveToRelative(0.25f, 0f, 0.46f, 0.19f, 0.5f, 0.43f)
                lineToRelative(1.54f, 11.53f)
                curveToRelative(0.23f, 1.73f, 1.72f, 3.04f, 3.47f, 3.04f)
                horizontalLineToRelative(12.97f)
                lineToRelative(3.6f, -13f)
                horizontalLineToRelative(-7.97f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 22f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 22f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
        }.also { _CartArrowDown = it}
