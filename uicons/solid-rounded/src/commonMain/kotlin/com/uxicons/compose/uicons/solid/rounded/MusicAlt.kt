package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicAlt: ImageVector? = null

val Icons.Sr.MusicAlt: ImageVector
    get() = _MusicAlt ?: UXIcon(name = "MusicAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.55f, 0.92f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.29f, -0.85f)
                lineToRelative(-9.18f, 1.72f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.08f, 4.91f)
                verticalLineToRelative(9.85f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -0.56f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                verticalLineToRelative(-9.12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.63f, -1.97f)
                lineToRelative(11.18f, -2.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.19f, 0.99f)
                verticalLineToRelative(5.76f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -0.56f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                verticalLineToRelative(-13f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.45f, -3.08f)
                close()
            }
        }.also { _MusicAlt = it}
