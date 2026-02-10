package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicFile: ImageVector? = null

val Icons.Ss.MusicFile: ImageVector
    get() = _MusicFile ?: UXIcon(name = "MusicFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                verticalLineToRelative(-4.41f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(3.05f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.05f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.5f, 2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _MusicFile = it}
