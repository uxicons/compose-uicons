package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scissors: ImageVector? = null

val Icons.Rs.Scissors: ImageVector
    get() = _Scissors ?: UXIcon(name = "Scissors") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 14f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.35f, 0.61f)
                lineToRelative(-3.35f, -4.01f)
                lineToRelative(7.47f, -8.96f)
                lineToRelative(-1.54f, -1.28f)
                lineToRelative(-7.23f, 8.68f)
                lineToRelative(-7.23f, -8.68f)
                lineToRelative(-1.54f, 1.28f)
                lineToRelative(7.47f, 8.96f)
                lineToRelative(-3.35f, 4.01f)
                arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.35f, -0.61f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 5f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.11f, -3.1f)
                lineToRelative(3.11f, -3.74f)
                lineToRelative(3.11f, 3.74f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.11f, 3.1f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, -5f)
                close()
                moveTo(5f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, -3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                close()
                moveTo(19f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, -3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                close()
            }
        }.also { _Scissors = it}
