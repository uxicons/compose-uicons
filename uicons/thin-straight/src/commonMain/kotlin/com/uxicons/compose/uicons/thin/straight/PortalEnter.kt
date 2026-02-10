package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PortalEnter: ImageVector? = null

val Icons.Ts.PortalEnter: ImageVector
    get() = _PortalEnter ?: UXIcon(name = "PortalEnter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(11.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(5.2f, 17.65f)
                lineToRelative(0.51f, 0.3f)
                lineToRelative(-0.88f, 2.05f)
                lineTo(0f, 20f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.17f)
                lineToRelative(0.69f, -1.61f)
                curveToRelative(0.11f, 0.09f, 0.22f, 0.18f, 0.34f, 0.26f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 4.15f, -0.63f, 12f, -3f, 12f)
                curveToRelative(-2.03f, 0f, -2.78f, -5.74f, -2.96f, -10f)
                horizontalLineToRelative(0.99f)
                curveToRelative(0.22f, 5.83f, 1.35f, 9f, 1.96f, 9f)
                curveToRelative(0.68f, 0f, 2f, -3.88f, 2f, -11f)
                reflectiveCurveToRelative(-1.32f, -11f, -2f, -11f)
                reflectiveCurveToRelative(-2f, 3.88f, -2f, 11f)
                horizontalLineToRelative(-3.78f)
                lineToRelative(-2.57f, -4.27f)
                curveToRelative(-0.03f, -0.04f, -0.06f, -0.09f, -0.09f, -0.13f)
                lineToRelative(-3.06f, 7.15f)
                lineToRelative(-0.86f, -0.55f)
                lineToRelative(3.06f, -7.16f)
                curveToRelative(-0.11f, -0.03f, -0.23f, -0.04f, -0.34f, -0.04f)
                horizontalLineToRelative(-2.58f)
                lineToRelative(-2.61f, 6.24f)
                curveToRelative(-0.28f, 0.67f, -0.03f, 1.44f, 0.59f, 1.83f)
                lineToRelative(5.25f, 3.14f)
                verticalLineToRelative(5.78f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.22f)
                lineToRelative(-4.77f, -2.85f)
                curveToRelative(-1.04f, -0.66f, -1.45f, -1.94f, -0.99f, -3.07f)
                lineToRelative(2.45f, -5.86f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(-1.86f, 3.72f)
                lineToRelative(-0.9f, -0.45f)
                lineToRelative(2.14f, -4.28f)
                horizontalLineToRelative(8.17f)
                curveToRelative(0.87f, 0f, 1.69f, 0.46f, 2.14f, 1.21f)
                lineToRelative(2.28f, 3.79f)
                horizontalLineToRelative(2.23f)
                curveToRelative(0.09f, -4.29f, 0.8f, -11f, 2.99f, -11f)
                curveToRelative(2.37f, 0f, 3f, 7.85f, 3f, 12f)
                close()
            }
        }.also { _PortalEnter = it}
