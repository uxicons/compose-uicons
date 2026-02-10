package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmClock: ImageVector? = null

val Icons.Sr.AlarmClock: ImageVector
    get() = _AlarmClock ?: UXIcon(name = "AlarmClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.79f, -2.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcToRelative(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.79f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 4.5f)
                arcToRelative(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.79f, -2.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcToRelative(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.79f, 4.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.32f, 20.18f)
                arcToRelative(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.32f, -18.12f)
                verticalLineToRelative(-1.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1.05f)
                arcToRelative(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.32f, 18.12f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.68f, 2.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, -1.23f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.2f, -0.06f)
                arcToRelative(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.39f, 0f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.18f, 0.06f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.12f, 1.23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.68f, -2.82f)
                close()
                moveTo(15.71f, 15.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.29f, -0.71f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(4.59f)
                lineToRelative(2.71f, 2.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                close()
            }
        }.also { _AlarmClock = it}
