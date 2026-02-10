package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Surfing: ImageVector? = null

val Icons.Sr.Surfing: ImageVector
    get() = _Surfing ?: UXIcon(name = "Surfing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0.01f)
                curveToRelative(-3.81f, 0f, -8.12f, 2.04f, -11.54f, 5.45f)
                arcToRelative(38.47f, 38.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.14f, 11.85f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 4.24f)
                lineToRelative(14.26f, -14.26f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-14.26f, 14.26f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0.71f)
                arcToRelative(38.33f, 38.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.85f, -8.14f)
                curveToRelative(3.41f, -3.41f, 5.45f, -7.73f, 5.45f, -11.54f)
                arcToRelative(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.99f, -3.99f)
                close()
            }
        }.also { _Surfing = it}
