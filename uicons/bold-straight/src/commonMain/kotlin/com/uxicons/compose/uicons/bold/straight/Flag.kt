package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flag: ImageVector? = null

val Icons.Bs.Flag: ImageVector
    get() = _Flag ?: UXIcon(name = "Flag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 4f)
                verticalLineToRelative(-0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-12.5f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 3.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-14f)
                close()
                moveTo(3f, 3f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(21f, 15f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _Flag = it}
