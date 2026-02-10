package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawerEmpty: ImageVector? = null

val Icons.Ts.DrawerEmpty: ImageVector
    get() = _DrawerEmpty ?: UXIcon(name = "DrawerEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.99f, 13.41f)
                lineTo(21.84f, 1.95f)
                curveToRelative(-0.26f, -1.15f, -1.26f, -1.95f, -2.44f, -1.95f)
                lineTo(4.6f, 0f)
                curveToRelative(-1.13f, 0f, -2.18f, 0.83f, -2.44f, 1.96f)
                lineTo(0.01f, 13.41f)
                lineToRelative(-0.01f, 10.59f)
                lineTo(24f, 24f)
                lineToRelative(-0.01f, -10.59f)
                close()
                moveTo(20.86f, 2.15f)
                lineToRelative(2.04f, 10.85f)
                horizontalLineToRelative(-1.98f)
                lineToRelative(-0.93f, -6f)
                lineTo(20f, 1.14f)
                curveToRelative(0.42f, 0.18f, 0.76f, 0.55f, 0.86f, 1.01f)
                close()
                moveTo(19.0f, 6f)
                lineTo(5f, 6f)
                lineTo(5f, 1f)
                horizontalLineToRelative(14f)
                lineToRelative(0.0f, 5f)
                close()
                moveTo(5f, 7f)
                horizontalLineToRelative(14.01f)
                verticalLineToRelative(0.08f)
                reflectiveCurveToRelative(0.91f, 5.92f, 0.91f, 5.92f)
                lineTo(4.08f, 13f)
                lineToRelative(0.92f, -6f)
                close()
                moveTo(3.13f, 2.17f)
                curveToRelative(0.11f, -0.46f, 0.45f, -0.83f, 0.87f, -1.02f)
                lineToRelative(0.01f, 5.78f)
                lineToRelative(-0.94f, 6.08f)
                lineTo(1.1f, 13.0f)
                lineTo(3.13f, 2.17f)
                close()
                moveTo(1f, 23f)
                lineTo(1f, 14f)
                lineTo(23f, 14f)
                verticalLineToRelative(9f)
                lineTo(1f, 23f)
                close()
                moveTo(9f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _DrawerEmpty = it}
