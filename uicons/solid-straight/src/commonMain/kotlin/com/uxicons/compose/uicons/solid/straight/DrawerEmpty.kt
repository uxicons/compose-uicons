package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawerEmpty: ImageVector? = null

val Icons.Ss.DrawerEmpty: ImageVector
    get() = _DrawerEmpty ?: UXIcon(name = "DrawerEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.81f, 12f)
                lineTo(5.2f, 12f)
                lineToRelative(0.73f, -5f)
                horizontalLineToRelative(12.16f)
                lineToRelative(0.72f, 5f)
                close()
                moveTo(5.99f, 5f)
                horizontalLineToRelative(12.01f)
                lineTo(18f, 0f)
                lineTo(5.99f, 0f)
                lineToRelative(-0.01f, 5f)
                close()
                moveTo(20f, 7f)
                lineToRelative(0.83f, 5f)
                horizontalLineToRelative(2.96f)
                lineToRelative(-1.97f, -9.66f)
                curveToRelative(-0.23f, -1.0f, -0.93f, -1.77f, -1.83f, -2.12f)
                lineTo(20f, 7f)
                close()
                moveTo(3.17f, 12f)
                lineToRelative(0.83f, -5f)
                lineTo(4f, 0.22f)
                curveToRelative(-0.9f, 0.36f, -1.6f, 1.14f, -1.83f, 2.13f)
                lineTo(0.18f, 12f)
                lineTo(3.17f, 12f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(10f)
                lineTo(0f, 24f)
                lineTo(0.02f, 14f)
                lineTo(24f, 14f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _DrawerEmpty = it}
