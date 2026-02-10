package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicAlt: ImageVector? = null

val Icons.Ss.MusicAlt: ImageVector
    get() = _MusicAlt ?: UXIcon(name = "MusicAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.92f, 0.69f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.47f, -0.64f)
                lineToRelative(-12.0f, 2.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.45f, 2.95f)
                verticalLineToRelative(11.3f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -0.56f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                verticalLineToRelative(-10.58f)
                lineToRelative(14f, -2.62f)
                verticalLineToRelative(6.76f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -0.56f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.08f, -2.31f)
                close()
            }
        }.also { _MusicAlt = it}
