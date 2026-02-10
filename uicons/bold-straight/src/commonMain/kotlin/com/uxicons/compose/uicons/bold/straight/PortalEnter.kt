package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PortalEnter: ImageVector? = null

val Icons.Bs.PortalEnter: ImageVector
    get() = _PortalEnter ?: UXIcon(name = "PortalEnter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(4.39f, 17.03f)
                lineToRelative(-0.4f, 0.97f)
                lineTo(0f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                lineToRelative(0.89f, -2.16f)
                lineToRelative(-1.22f, -0.69f)
                curveToRelative(-0.5f, -0.31f, -0.92f, -0.7f, -1.28f, -1.12f)
                close()
                moveTo(21f, 0f)
                curveToRelative(-1.49f, 0f, -2.72f, 4.33f, -2.96f, 10f)
                horizontalLineToRelative(-3.36f)
                lineToRelative(-2.46f, -2.81f)
                curveToRelative(-0.67f, -0.76f, -1.62f, -1.19f, -2.63f, -1.19f)
                lineTo(2.82f, 6f)
                lineTo(0.61f, 11.44f)
                lineToRelative(2.78f, 1.13f)
                lineToRelative(1.45f, -3.56f)
                horizontalLineToRelative(1.67f)
                lineToRelative(-1.26f, 3.08f)
                curveToRelative(-0.65f, 1.57f, -0.07f, 3.38f, 1.43f, 4.32f)
                lineToRelative(4.33f, 2.47f)
                verticalLineToRelative(5.13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.87f)
                lineToRelative(-4.44f, -2.52f)
                lineToRelative(1.67f, -3.99f)
                lineToRelative(2.09f, 2.39f)
                horizontalLineToRelative(6.68f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.9f)
                curveToRelative(0.33f, 5.17f, 1.5f, 9f, 2.9f, 9f)
                curveToRelative(1.66f, 0f, 3f, -5.37f, 3f, -12f)
                reflectiveCurveTo(22.66f, 0f, 21f, 0f)
                close()
            }
        }.also { _PortalEnter = it}
