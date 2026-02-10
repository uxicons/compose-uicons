package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gym: ImageVector? = null

val Icons.Br.Gym: ImageVector
    get() = _Gym ?: UXIcon(name = "Gym") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.8f, 5.98f)
            lineToRelative(-1.33f, -1.33f)
            lineToRelative(1.09f, -1.09f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineToRelative(-1.09f, 1.09f)
            lineToRelative(-1.33f, -1.33f)
            arcToRelative(4.11f, 4.11f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.82f, 5.82f)
            lineToRelative(1.33f, 1.33f)
            lineToRelative(-5.18f, 5.19f)
            lineToRelative(-1.33f, -1.33f)
            arcToRelative(4.11f, 4.11f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.82f, 5.82f)
            lineToRelative(1.33f, 1.33f)
            lineToRelative(-1.09f, 1.09f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(1.09f, -1.09f)
            lineToRelative(1.33f, 1.33f)
            arcToRelative(4.11f, 4.11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.82f, -5.82f)
            lineToRelative(-1.33f, -1.33f)
            lineToRelative(5.19f, -5.19f)
            lineToRelative(1.32f, 1.33f)
            arcToRelative(4.11f, 4.11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.82f, -5.82f)
            close()
            moveTo(9.68f, 20.67f)
            arcToRelative(1.14f, 1.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, 0f)
            lineToRelative(-4.78f, -4.77f)
            arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, -1.57f)
            lineToRelative(4.78f, 4.78f)
            arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.57f)
            close()
            moveTo(20.68f, 9.67f)
            arcToRelative(1.14f, 1.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, 0f)
            lineToRelative(-4.78f, -4.77f)
            arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, -1.57f)
            lineToRelative(4.78f, 4.78f)
            arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.57f)
            close()
        }
    }.also { _Gym = it }
