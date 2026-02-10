package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gym: ImageVector? = null

val Icons.Sr.Gym: ImageVector
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
            }
        }.also { _Gym = it}
