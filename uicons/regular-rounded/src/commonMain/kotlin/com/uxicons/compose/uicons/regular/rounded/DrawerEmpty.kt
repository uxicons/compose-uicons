package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawerEmpty: ImageVector? = null

val Icons.Rr.DrawerEmpty: ImageVector
    get() = _DrawerEmpty ?: UXIcon(name = "DrawerEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.81f, 11.99f)
                lineToRelative(-1.67f, -8.01f)
                curveToRelative(-0.39f, -1.86f, -1.81f, -3.29f, -3.58f, -3.78f)
                curveToRelative(-0.16f, -0.12f, -1.14f, -0.2f, -1.32f, -0.2f)
                lineTo(6.75f, -0f)
                curveToRelative(-0.18f, 0f, -1.16f, 0.08f, -1.32f, 0.2f)
                curveToRelative(-1.77f, 0.49f, -3.19f, 1.92f, -3.58f, 3.78f)
                lineTo(0.19f, 11.99f)
                curveToRelative(-0.12f, 0.6f, -0.19f, 1.22f, -0.19f, 1.84f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5.17f)
                curveToRelative(0f, -0.61f, -0.06f, -1.23f, -0.19f, -1.84f)
                close()
                moveTo(20.18f, 4.39f)
                lineToRelative(1.59f, 7.61f)
                horizontalLineToRelative(-1.94f)
                lineToRelative(-0.83f, -4.59f)
                lineTo(19.0f, 2.58f)
                curveToRelative(0.59f, 0.43f, 1.03f, 1.06f, 1.19f, 1.81f)
                close()
                moveTo(17f, 6f)
                lineTo(7f, 6f)
                lineTo(7f, 2f)
                horizontalLineToRelative(10f)
                lineTo(17f, 6f)
                close()
                moveTo(6.92f, 8f)
                horizontalLineToRelative(10.15f)
                lineToRelative(0.73f, 4f)
                lineTo(6.2f, 12f)
                lineToRelative(0.73f, -4f)
                close()
                moveTo(3.81f, 4.39f)
                curveToRelative(0.16f, -0.75f, 0.59f, -1.38f, 1.19f, -1.81f)
                lineTo(5f, 7.41f)
                lineToRelative(-0.83f, 4.59f)
                horizontalLineToRelative(-1.94f)
                lineToRelative(1.59f, -7.61f)
                close()
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-5f)
                lineTo(22f, 14f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(15f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _DrawerEmpty = it}
