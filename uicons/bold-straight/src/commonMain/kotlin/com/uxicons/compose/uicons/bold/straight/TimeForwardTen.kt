package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeForwardTen: ImageVector? = null

val Icons.Bs.TimeForwardTen: ImageVector
    get() = _TimeForwardTen ?: UXIcon(name = "TimeForwardTen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.47f, 3.53f)
                arcToRelative(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.64f, 14.81f)
                lineToRelative(2.19f, -2.19f)
                arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.98f, -13.15f)
                arcToRelative(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.35f, 2.65f)
                lineToRelative(-2.35f, 2.35f)
                horizontalLineToRelative(5.91f)
                arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.09f, -1.09f)
                verticalLineToRelative(-5.91f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 24f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                verticalLineToRelative(-5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                close()
                moveTo(20f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 24f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.88f)
                lineToRelative(-1.69f, 1.69f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.56f, 1.06f)
                close()
            }
        }.also { _TimeForwardTen = it}
