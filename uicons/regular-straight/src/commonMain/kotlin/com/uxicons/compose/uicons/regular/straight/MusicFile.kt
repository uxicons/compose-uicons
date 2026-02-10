package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicFile: ImageVector? = null

val Icons.Rs.MusicFile: ImageVector
    get() = _MusicFile ?: UXIcon(name = "MusicFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.41f, 0f)
                horizontalLineToRelative(-9.41f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-16.41f)
                close()
                moveTo(15f, 3.41f)
                lineTo(18.59f, 7f)
                horizontalLineToRelative(-3.59f)
                close()
                moveTo(4f, 22f)
                verticalLineToRelative(-19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(13f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.5f, -2.5f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.05f)
                verticalLineToRelative(-2.05f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
            }
        }.also { _MusicFile = it}
