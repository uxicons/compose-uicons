package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawerAlt: ImageVector? = null

val Icons.Ss.DrawerAlt: ImageVector
    get() = _DrawerAlt ?: UXIcon(name = "DrawerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 4f)
                lineTo(1.72f, 17.33f)
                curveToRelative(-0.37f, -0.1f, -0.73f, -0.29f, -1.02f, -0.58f)
                curveToRelative(-0.85f, -0.84f, -0.94f, -2.19f, -0.19f, -3.13f)
                lineToRelative(4.99f, -6.12f)
                lineToRelative(8f, -3.5f)
                close()
                moveTo(14.06f, 13f)
                lineToRelative(6.52f, -7.32f)
                lineToRelative(0.76f, -0.82f)
                curveToRelative(0.88f, -0.88f, 0.88f, -2.31f, 0f, -3.2f)
                curveToRelative(-0.88f, -0.88f, -2.31f, -0.88f, -3.2f, 0f)
                lineTo(2f, 19.8f)
                verticalLineToRelative(3.2f)
                horizontalLineToRelative(3.2f)
                lineToRelative(3.24f, -3.64f)
                curveToRelative(-0.17f, -0.34f, -0.3f, -0.7f, -0.37f, -1.08f)
                curveToRelative(-0.21f, -1.22f, 0.08f, -2.43f, 0.8f, -3.42f)
                curveToRelative(0.72f, -0.99f, 1.78f, -1.69f, 2.99f, -1.86f)
                horizontalLineToRelative(2.2f)
                close()
                moveTo(24f, 7.26f)
                lineToRelative(-1.51f, -0.69f)
                lineToRelative(-5.94f, 6.44f)
                lineToRelative(1.45f, -0.0f)
                lineToRelative(0.02f, 2f)
                horizontalLineToRelative(-5.52f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.94f, 0.02f, 1.88f, 0.13f, 2.77f, 0.35f)
                lineToRelative(0.9f, 0.22f)
                curveToRelative(1.14f, 0.28f, 2.31f, 0.42f, 3.48f, 0.42f)
                lineToRelative(1.35f, -0.01f)
                lineToRelative(-0.0f, -13.73f)
                close()
            }
        }.also { _DrawerAlt = it}
