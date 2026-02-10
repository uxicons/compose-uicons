package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmClock: ImageVector? = null

val Icons.Rr.AlarmClock: ImageVector
    get() = _AlarmClock ?: UXIcon(name = "AlarmClock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.05f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(2.05f)
                arcTo(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.68f, 20.18f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, -1.23f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.2f, -0.06f)
                arcToRelative(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.39f, 0f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.18f, 0.06f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.68f, -2.82f)
                arcTo(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 2.05f)
                close()
                moveTo(3f, 13f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.21f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcTo(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.21f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4.5f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.79f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcTo(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11.59f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 0.71f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                close()
            }
        }.also { _AlarmClock = it}
