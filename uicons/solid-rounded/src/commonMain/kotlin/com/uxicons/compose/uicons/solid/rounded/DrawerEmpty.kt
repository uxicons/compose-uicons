package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawerEmpty: ImageVector? = null

val Icons.Sr.DrawerEmpty: ImageVector
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
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5.01f, 24f)
                curveTo(2.24f, 24f, 0.0f, 21.76f, 0.01f, 18.99f)
                lineToRelative(0.01f, -4.99f)
                lineTo(24f, 14f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _DrawerEmpty = it}
