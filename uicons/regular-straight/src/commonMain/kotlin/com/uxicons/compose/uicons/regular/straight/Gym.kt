package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gym: ImageVector? = null

val Icons.Rs.Gym: ImageVector
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
                moveTo(9.95f, 21.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.42f, 0f)
                lineToRelative(-6.24f, -6.24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(7.66f, 7.66f)
                close()
                moveTo(21.71f, 9.95f)
                lineTo(20.29f, 11.36f)
                lineTo(12.64f, 3.71f)
                lineTo(14.05f, 2.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.42f, 0f)
                lineToRelative(6.24f, 6.24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                close()
            }
        }.also { _Gym = it}
