package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddFolder: ImageVector? = null

val Icons.Rs.AddFolder: ImageVector
    get() = _AddFolder ?: UXIcon(name = "AddFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(2f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-9.24f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-4.76f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                close()
                moveTo(22f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _AddFolder = it}
