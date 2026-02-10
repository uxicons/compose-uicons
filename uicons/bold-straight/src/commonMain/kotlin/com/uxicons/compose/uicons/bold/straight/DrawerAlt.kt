package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawerAlt: ImageVector? = null

val Icons.Bs.DrawerAlt: ImageVector
    get() = _DrawerAlt ?: UXIcon(name = "DrawerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.96f, 8.71f)
                lineToRelative(1.39f, -1.64f)
                curveToRelative(0.2f, -0.2f, 0.36f, -0.43f, 0.51f, -0.66f)
                lineToRelative(2.15f, 0.85f)
                verticalLineToRelative(3.09f)
                lineToRelative(-4.04f, -1.64f)
                close()
                moveTo(24.0f, 17.99f)
                lineToRelative(-1.36f, 0.01f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.96f, 0f, -1.92f, -0.12f, -2.85f, -0.35f)
                lineToRelative(-0.89f, -0.22f)
                curveToRelative(-1.17f, -0.29f, -2.38f, -0.4f, -3.58f, -0.43f)
                lineToRelative(-4.3f, 0.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.45f)
                lineToRelative(5.31f, -6.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                reflectiveCurveToRelative(-2.23f, -0.85f, -3.09f, 0f)
                lineTo(3f, 18.91f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(2.46f, -2.9f)
                curveToRelative(0.72f, 0.56f, 1.63f, 0.9f, 2.6f, 0.9f)
                horizontalLineToRelative(0.01f)
                lineToRelative(4.16f, -0.01f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.96f, 0f, 1.92f, 0.12f, 2.85f, 0.35f)
                lineToRelative(0.88f, 0.22f)
                curveToRelative(1.17f, 0.29f, 2.38f, 0.44f, 3.58f, 0.44f)
                horizontalLineToRelative(0.01f)
                lineToRelative(1.37f, -0.01f)
                lineToRelative(-0.01f, -3f)
                close()
                moveTo(5.53f, 7.5f)
                lineToRelative(-0.03f, -0.0f)
                lineTo(0.51f, 13.62f)
                curveToRelative(-0.75f, 0.94f, -0.67f, 2.29f, 0.19f, 3.13f)
                curveToRelative(0.3f, 0.29f, 0.65f, 0.48f, 1.02f, 0.58f)
                lineTo(12.78f, 4.27f)
                lineToRelative(-7.25f, 3.23f)
                close()
            }
        }.also { _DrawerAlt = it}
