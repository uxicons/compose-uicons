package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicFile: ImageVector? = null

val Icons.Br.MusicFile: ImageVector
    get() = _MusicFile ?: UXIcon(name = "MusicFile") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 11.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(3f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, 0.3f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.97f, -3.3f)
            verticalLineToRelative(-0.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2.5f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
            close()
            moveTo(22f, 8.16f)
            verticalLineToRelative(10.34f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 5.5f)
            horizontalLineToRelative(-9f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, -5.5f)
            verticalLineToRelative(-13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, -5.5f)
            horizontalLineToRelative(6.34f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.89f, 1.61f)
            lineToRelative(2.66f, 2.66f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.61f, 3.89f)
            close()
            moveTo(19f, 18.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(-4f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-5.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2.5f)
            horizontalLineToRelative(9f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -2.5f)
            close()
        }
    }.also { _MusicFile = it }
