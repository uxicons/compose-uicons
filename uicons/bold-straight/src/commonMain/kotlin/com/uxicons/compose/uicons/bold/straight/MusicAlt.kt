package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicAlt: ImageVector? = null

val Icons.Bs.MusicAlt: ImageVector
    get() = _MusicAlt ?: UXIcon(name = "MusicAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.73f, 0.81f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, -0.75f)
                lineToRelative(-12f, 2.25f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.85f, 3.44f)
                verticalLineToRelative(10.39f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -0.14f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                verticalLineToRelative(-9.2f)
                lineToRelative(13f, -2.44f)
                verticalLineToRelative(4.78f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 3.86f)
                verticalLineToRelative(-13.5f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.27f, -2.69f)
                close()
                moveTo(8f, 7.75f)
                verticalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.41f, -0.49f)
                lineToRelative(12f, -2.25f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.59f, 0.49f)
                verticalLineToRelative(1.81f)
                close()
            }
        }.also { _MusicAlt = it}
