package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Waffle: ImageVector? = null

val Icons.Ss.Waffle: ImageVector
    get() = _Waffle ?: UXIcon(name = "Waffle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(20.48f, 20.48f)
                curveToRelative(-2.34f, 2.34f, -5.41f, 3.51f, -8.48f, 3.51f)
                reflectiveCurveToRelative(-6.15f, -1.17f, -8.48f, -3.51f)
                curveTo(-1.16f, 15.81f, -1.16f, 8.19f, 3.52f, 3.52f)
                curveTo(8.19f, -1.17f, 15.81f, -1.16f, 20.48f, 3.52f)
                curveToRelative(4.68f, 4.68f, 4.68f, 12.29f, 0f, 16.97f)
                close()
                moveTo(19f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Waffle = it}
