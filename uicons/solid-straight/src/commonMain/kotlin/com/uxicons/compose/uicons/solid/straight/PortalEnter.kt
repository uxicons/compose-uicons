package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PortalEnter: ImageVector? = null

val Icons.Ss.PortalEnter: ImageVector
    get() = _PortalEnter ?: UXIcon(name = "PortalEnter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 2.55f)
                curveTo(10.5f, 1.17f, 11.62f, 0.05f, 13f, 0.05f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(4.83f, 16.85f)
                lineToRelative(-0.49f, 1.2f)
                lineTo(0f, 18.05f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.67f)
                lineToRelative(0.8f, -1.94f)
                lineToRelative(-0.67f, -0.42f)
                curveToRelative(-0.37f, -0.24f, -0.69f, -0.53f, -0.98f, -0.84f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 3.61f, -0.29f, 12f, -3f, 12f)
                curveToRelative(-2.1f, 0f, -2.75f, -5.05f, -2.93f, -9f)
                horizontalLineToRelative(1.93f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.56f)
                lineToRelative(-2.3f, -3.77f)
                lineToRelative(-2.84f, 6.57f)
                lineToRelative(2.69f, 1.7f)
                verticalLineToRelative(6.55f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.45f)
                lineToRelative(-4.12f, -2.6f)
                curveToRelative(-1.23f, -0.78f, -1.73f, -2.32f, -1.17f, -3.67f)
                lineToRelative(1.75f, -4.27f)
                horizontalLineToRelative(-2.84f)
                lineToRelative(-1.72f, 3.45f)
                lineToRelative(-1.79f, -0.9f)
                lineToRelative(2.28f, -4.55f)
                horizontalLineToRelative(8.48f)
                curveToRelative(1.05f, 0f, 2.03f, 0.56f, 2.57f, 1.45f)
                lineToRelative(2.13f, 3.5f)
                horizontalLineToRelative(1.45f)
                curveToRelative(0.06f, -3.96f, 0.51f, -11f, 2.99f, -11f)
                curveToRelative(2.71f, 0f, 3f, 8.39f, 3f, 12f)
                close()
            }
        }.also { _PortalEnter = it}
