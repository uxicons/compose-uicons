package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicAlt: ImageVector? = null

val Icons.Br.MusicAlt: ImageVector
    get() = _MusicAlt ?: UXIcon(name = "MusicAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.37f, 1.04f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.7f, -0.96f)
            lineToRelative(-9.19f, 1.72f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.49f, 5.41f)
            verticalLineToRelative(8.94f)
            arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -0.14f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
            verticalLineToRelative(-8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.22f, -1.47f)
            lineToRelative(11.18f, -2.1f)
            arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.41f, 0.11f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, 0.39f)
            verticalLineToRelative(4.22f)
            arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 3.86f)
            verticalLineToRelative(-12.5f)
            arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.63f, -3.46f)
            close()
            moveTo(19.86f, 5.48f)
            lineTo(8.67f, 7.58f)
            arcToRelative(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.67f, 0.19f)
            verticalLineToRelative(-0.56f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.04f, -2.46f)
            lineToRelative(9.19f, -1.72f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.78f, 1.47f)
            verticalLineToRelative(0.98f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.15f, 0.0f)
            close()
        }
    }.also { _MusicAlt = it }
