package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmClock: ImageVector? = null

val Icons.Br.AlarmClock: ImageVector
    get() = _AlarmClock ?: UXIcon(name = "AlarmClock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.5f, 2.12f)
            verticalLineToRelative(-0.61f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(0.61f)
            arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.21f, 17.57f)
            arcToRelative(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.29f, 2.81f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(0.64f, 0.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.46f, -0.68f)
            arcToRelative(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.09f, 0f)
            arcToRelative(0.64f, 0.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.46f, 0.68f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.29f, -2.81f)
            arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.21f, -17.57f)
            close()
            moveTo(4f, 13f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 8f)
            arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            arcToRelative(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.46f, -4.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(3.04f, 4.5f)
            arcToRelative(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, -1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.46f, 4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.53f, 12.38f)
            verticalLineToRelative(-3.88f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            verticalLineToRelative(4.29f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.59f, 1.41f)
            lineToRelative(1.79f, 1.79f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            close()
        }
    }.also { _AlarmClock = it }
