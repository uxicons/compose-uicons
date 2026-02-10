package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenuBurger: ImageVector? = null

val Icons.Bs.MenuBurger: ImageVector
    get() = _MenuBurger ?: UXIcon(name = "MenuBurger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 10.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 3.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 17.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _MenuBurger = it}
