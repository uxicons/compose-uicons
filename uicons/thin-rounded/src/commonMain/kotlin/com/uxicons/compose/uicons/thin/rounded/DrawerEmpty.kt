package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawerEmpty: ImageVector? = null

val Icons.Tr.DrawerEmpty: ImageVector
    get() = _DrawerEmpty ?: UXIcon(name = "DrawerEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.79f, 12.31f)
                lineToRelative(-1.67f, -8.66f)
                curveToRelative(-0.41f, -2.11f, -2.27f, -3.65f, -4.42f, -3.65f)
                lineTo(6.3f, 0.0f)
                curveTo(4.15f, 0f, 2.29f, 1.53f, 1.88f, 3.65f)
                lineTo(0.21f, 12.31f)
                curveToRelative(-0.14f, 0.76f, -0.21f, 1.53f, -0.21f, 2.31f)
                verticalLineToRelative(4.88f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-4.88f)
                curveToRelative(0f, -0.78f, -0.07f, -1.55f, -0.21f, -2.31f)
                close()
                moveTo(21.13f, 3.84f)
                lineToRelative(1.67f, 8.66f)
                curveToRelative(0.03f, 0.17f, 0.05f, 0.34f, 0.07f, 0.5f)
                horizontalLineToRelative(-1.95f)
                lineToRelative(-0.93f, -6f)
                lineTo(20f, 1.88f)
                curveToRelative(0.57f, 0.5f, 0.98f, 1.18f, 1.13f, 1.96f)
                close()
                moveTo(5f, 7f)
                horizontalLineToRelative(14.01f)
                lineToRelative(0.91f, 6f)
                lineTo(4.08f, 13f)
                lineToRelative(0.92f, -6f)
                close()
                moveTo(17.7f, 1f)
                curveToRelative(0.46f, 0f, 0.9f, 0.1f, 1.3f, 0.26f)
                lineToRelative(0.01f, 4.74f)
                lineTo(5f, 6f)
                lineTo(5f, 1.26f)
                curveToRelative(0.41f, -0.16f, 0.84f, -0.26f, 1.3f, -0.26f)
                horizontalLineToRelative(11.39f)
                close()
                moveTo(2.87f, 3.84f)
                curveToRelative(0.15f, -0.79f, 0.57f, -1.46f, 1.14f, -1.96f)
                lineToRelative(0.01f, 5.05f)
                lineToRelative(-0.94f, 6.08f)
                lineTo(1.13f, 13f)
                curveToRelative(0.02f, -0.17f, 0.04f, -0.34f, 0.07f, -0.5f)
                lineTo(2.87f, 3.84f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-4.88f)
                curveToRelative(0f, -0.2f, 0.02f, -0.41f, 0.03f, -0.62f)
                lineTo(22.97f, 14f)
                curveToRelative(0.01f, 0.2f, 0.03f, 0.41f, 0.03f, 0.62f)
                verticalLineToRelative(4.88f)
                close()
                moveTo(15f, 18.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _DrawerEmpty = it}
