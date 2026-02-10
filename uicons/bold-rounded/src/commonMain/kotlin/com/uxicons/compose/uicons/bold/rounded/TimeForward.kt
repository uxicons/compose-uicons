package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeForward: ImageVector? = null

val Icons.Br.TimeForward: ImageVector
    get() = _TimeForward ?: UXIcon(name = "TimeForward") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.56f, 11f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.57f, 1.43f)
            arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.15f, -7.27f)
            lineToRelative(-1.13f, 1.13f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 1.71f)
            horizontalLineToRelative(4.59f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
            verticalLineToRelative(-4.59f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, -0.71f)
            lineToRelative(-1.33f, 1.33f)
            arcToRelative(11.98f, 11.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.03f, 9.53f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.43f, -1.57f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11.5f, 7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            verticalLineToRelative(4.29f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.59f, 1.41f)
            lineToRelative(1.79f, 1.79f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            lineToRelative(-1.5f, -1.5f)
            verticalLineToRelative(-3.88f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
        }
    }.also { _TimeForward = it }
