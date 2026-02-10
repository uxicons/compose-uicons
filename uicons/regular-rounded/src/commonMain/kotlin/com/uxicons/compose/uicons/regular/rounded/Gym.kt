package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gym: ImageVector? = null

val Icons.Rr.Gym: ImageVector
    get() = _Gym ?: UXIcon(name = "Gym") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.94f, 6.84f)
                lineToRelative(-2.18f, -2.18f)
                lineToRelative(0.95f, -0.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, -1.41f)
                lineToRelative(-0.95f, 0.95f)
                lineToRelative(-2.18f, -2.18f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.11f, 0f)
                arcToRelative(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.11f)
                lineToRelative(2.18f, 2.18f)
                lineToRelative(-5.89f, 5.89f)
                lineToRelative(-2.18f, -2.18f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.11f, 0f)
                arcToRelative(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.11f)
                lineToRelative(2.18f, 2.18f)
                lineToRelative(-0.95f, 0.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(0.95f, -0.95f)
                lineToRelative(2.18f, 2.18f)
                arcToRelative(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, 0f)
                arcToRelative(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.11f)
                lineToRelative(-2.18f, -2.18f)
                lineToRelative(5.9f, -5.89f)
                lineToRelative(2.18f, 2.18f)
                arcToRelative(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, 0f)
                arcToRelative(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.11f)
                close()
                moveTo(11f, 20.39f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.47f, 1.14f)
                arcToRelative(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.28f, 0f)
                lineToRelative(-5.78f, -5.78f)
                arcToRelative(1.61f, 1.61f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.28f, -2.28f)
                lineToRelative(5.78f, 5.78f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.47f, 1.14f)
                close()
                moveTo(21.53f, 10.53f)
                arcToRelative(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.28f, 0f)
                lineToRelative(-5.78f, -5.78f)
                arcToRelative(1.61f, 1.61f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.28f, -2.28f)
                lineToRelative(5.78f, 5.78f)
                arcToRelative(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.28f)
                close()
            }
        }.also { _Gym = it}
