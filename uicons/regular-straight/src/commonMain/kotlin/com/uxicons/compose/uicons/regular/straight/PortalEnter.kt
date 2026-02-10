package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PortalEnter: ImageVector? = null

val Icons.Rs.PortalEnter: ImageVector
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
                moveTo(21f, 0f)
                curveToRelative(-2.48f, 0f, -2.93f, 7.04f, -2.99f, 11f)
                horizontalLineToRelative(-1.45f)
                lineToRelative(-2.13f, -3.5f)
                curveToRelative(-0.54f, -0.9f, -1.52f, -1.45f, -2.57f, -1.45f)
                lineTo(3.38f, 6.05f)
                lineToRelative(-2.28f, 4.55f)
                lineToRelative(1.79f, 0.9f)
                lineToRelative(1.72f, -3.45f)
                horizontalLineToRelative(2.84f)
                lineToRelative(-1.75f, 4.27f)
                curveToRelative(-0.55f, 1.35f, -0.06f, 2.9f, 1.17f, 3.67f)
                lineToRelative(4.12f, 2.6f)
                verticalLineToRelative(5.45f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.55f)
                lineToRelative(-5.05f, -3.19f)
                curveToRelative(-0.41f, -0.26f, -0.57f, -0.77f, -0.39f, -1.22f)
                lineToRelative(2.06f, -5.03f)
                horizontalLineToRelative(1.88f)
                lineToRelative(-2.01f, 4.87f)
                lineToRelative(1.72f, 1.08f)
                lineToRelative(1.95f, -4.74f)
                lineToRelative(2.28f, 3.74f)
                horizontalLineToRelative(4.56f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.85f, 0.54f, -8.02f, 1f, -9.39f)
                curveToRelative(0.46f, 1.37f, 1f, 4.54f, 1f, 9.39f)
                reflectiveCurveToRelative(-0.54f, 8.02f, -1f, 9.39f)
                curveToRelative(-0.36f, -1.07f, -0.76f, -3.22f, -0.93f, -6.39f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.18f, 3.95f, 0.83f, 9f, 2.93f, 9f)
                curveToRelative(2.71f, 0f, 3f, -8.39f, 3f, -12f)
                reflectiveCurveToRelative(-0.29f, -12f, -3f, -12f)
                close()
            }
        }.also { _PortalEnter = it}
