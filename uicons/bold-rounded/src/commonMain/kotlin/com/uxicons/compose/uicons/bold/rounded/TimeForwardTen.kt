package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeForwardTen: ImageVector? = null

val Icons.Br.TimeForwardTen: ImageVector
    get() = _TimeForwardTen ?: UXIcon(name = "TimeForwardTen") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 11f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
            verticalLineToRelative(5f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
            verticalLineToRelative(-5f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
            close()
            moveTo(21f, 20f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            verticalLineToRelative(-5f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.29f, 2.71f)
            lineToRelative(-1.32f, 1.32f)
            arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -19.47f, 13.78f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.62f, -1.46f)
            arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.71f, -10.19f)
            lineToRelative(-1.13f, 1.13f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 1.71f)
            horizontalLineToRelative(4.59f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
            verticalLineToRelative(-4.59f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, -0.71f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.57f, 11.11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.64f, 0.33f)
            lineToRelative(-3.75f, 3.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(1.19f, -1.19f)
            verticalLineToRelative(6.38f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-10f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.93f, -1.39f)
            close()
        }
    }.also { _TimeForwardTen = it }
