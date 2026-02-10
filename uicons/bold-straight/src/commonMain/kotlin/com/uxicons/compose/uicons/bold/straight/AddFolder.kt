package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddFolder: ImageVector? = null

val Icons.Bs.AddFolder: ImageVector
    get() = _AddFolder ?: UXIcon(name = "AddFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 12.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(5.35f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.65f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(21f, 20f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _AddFolder = it}
