package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gym: ImageVector? = null

val Icons.Ss.Gym: ImageVector
    get() = _Gym ?: UXIcon(name = "Gym") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 7.12f)
                lineToRelative(-2.41f, -2.42f)
                lineToRelative(2f, -2f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2.41f, -2.41f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineToRelative(-2.83f, 2.83f)
                lineToRelative(4.54f, 4.54f)
                lineToRelative(-6.1f, 6.1f)
                lineToRelative(-4.54f, -4.54f)
                lineToRelative(-2.83f, 2.83f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(2.41f, 2.42f)
                lineToRelative(-2f, 2f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2f, -2f)
                lineToRelative(2.41f, 2.41f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(2.83f, -2.83f)
                lineToRelative(-4.54f, -4.54f)
                lineToRelative(6.1f, -6.1f)
                lineToRelative(4.54f, 4.54f)
                lineToRelative(2.83f, -2.83f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                close()
            }
        }.also { _Gym = it}
