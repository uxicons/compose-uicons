package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drawer: ImageVector? = null

val Icons.Ss.Drawer: ImageVector
    get() = _Drawer ?: UXIcon(name = "Drawer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 16f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                lineTo(4f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                lineTo(2f, 8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Drawer = it}
