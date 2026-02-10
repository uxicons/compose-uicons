package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawerEmpty: ImageVector? = null

val Icons.Rs.DrawerEmpty: ImageVector
    get() = _DrawerEmpty ?: UXIcon(name = "DrawerEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 19f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 13f)
                verticalLineToRelative(11f)
                lineTo(0f, 24f)
                lineTo(0.02f, 12.8f)
                lineTo(2.17f, 2.35f)
                curveTo(2.48f, 0.98f, 3.71f, 0f, 5.1f, 0f)
                horizontalLineToRelative(13.81f)
                curveToRelative(1.41f, 0f, 2.61f, 0.96f, 2.93f, 2.33f)
                lineToRelative(2.17f, 10.66f)
                close()
                moveTo(19f, 7.41f)
                lineToRelative(0.83f, 4.59f)
                horizontalLineToRelative(1.94f)
                lineToRelative(-1.9f, -9.24f)
                curveToRelative(-0.09f, -0.41f, -0.45f, -0.7f, -0.87f, -0.74f)
                lineTo(19.0f, 7.41f)
                close()
                moveTo(6.99f, 6f)
                horizontalLineToRelative(10.01f)
                lineTo(17f, 2f)
                lineTo(7.0f, 2f)
                lineToRelative(-0.01f, 4f)
                close()
                moveTo(6.2f, 12f)
                horizontalLineToRelative(11.61f)
                lineToRelative(-0.72f, -4f)
                lineTo(6.92f, 8f)
                lineToRelative(-0.73f, 4f)
                close()
                moveTo(2.23f, 12f)
                horizontalLineToRelative(1.94f)
                lineToRelative(0.83f, -4.59f)
                lineTo(5f, 2.02f)
                curveToRelative(-0.41f, 0.05f, -0.79f, 0.36f, -0.88f, 0.76f)
                lineToRelative(-1.89f, 9.22f)
                close()
                moveTo(22f, 14f)
                lineTo(2f, 14f)
                verticalLineToRelative(8f)
                lineTo(22f, 22f)
                lineTo(22f, 14f)
                close()
            }
        }.also { _DrawerEmpty = it}
