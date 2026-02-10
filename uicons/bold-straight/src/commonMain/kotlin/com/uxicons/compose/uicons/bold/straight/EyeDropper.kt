package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeDropper: ImageVector? = null

val Icons.Bs.EyeDropper: ImageVector
    get() = _EyeDropper ?: UXIcon(name = "EyeDropper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.9f, 1.1f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.3f, 0f)
                lineToRelative(-2.49f, 2.48f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.84f, 0.07f)
                lineToRelative(-2.09f, 2.15f)
                lineToRelative(2.17f, 2.17f)
                lineToRelative(-8.19f, 8.19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.85f, 4.39f)
                lineToRelative(-1.32f, 1.32f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.32f, -1.32f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.39f, -0.85f)
                lineToRelative(8.19f, -8.19f)
                lineToRelative(2.17f, 2.17f)
                lineToRelative(2.15f, -2.09f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, -4.84f)
                lineToRelative(2.48f, -2.49f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.3f)
                close()
                moveTo(5.71f, 19.71f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.41f)
                lineToRelative(8.19f, -8.19f)
                lineToRelative(1.42f, 1.42f)
                close()
                moveTo(20.78f, 4.28f)
                lineTo(18.29f, 6.77f)
                arcToRelative(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.75f, 3.16f)
                lineToRelative(-2.47f, -2.47f)
                arcToRelative(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.16f, -1.75f)
                lineToRelative(2.49f, -2.49f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 1.06f)
                close()
            }
        }.also { _EyeDropper = it}
