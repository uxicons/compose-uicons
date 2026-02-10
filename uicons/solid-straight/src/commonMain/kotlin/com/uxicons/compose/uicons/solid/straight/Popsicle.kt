package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Popsicle: ImageVector? = null

val Icons.Ss.Popsicle: ImageVector
    get() = _Popsicle ?: UXIcon(name = "Popsicle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(7.04f, 0f, 3f, 4.04f, 3f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-12f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                close()
                moveTo(11f, 19f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Popsicle = it}
