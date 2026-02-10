package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PortalExit: ImageVector? = null

val Icons.Bs.PortalExit: ImageVector
    get() = _PortalExit ?: UXIcon(name = "PortalExit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19.32f, 13f)
                horizontalLineToRelative(4.68f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.32f)
                lineToRelative(-2.46f, -2.81f)
                curveToRelative(-0.67f, -0.76f, -1.62f, -1.19f, -2.63f, -1.19f)
                horizontalLineToRelative(-6.57f)
                lineToRelative(-2.4f, 5.39f)
                lineToRelative(2.74f, 1.22f)
                lineToRelative(1.6f, -3.61f)
                horizontalLineToRelative(1.53f)
                lineToRelative(-1.26f, 3.08f)
                curveToRelative(-0.65f, 1.57f, -0.07f, 3.38f, 1.43f, 4.32f)
                lineToRelative(4.33f, 2.47f)
                verticalLineToRelative(5.13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.87f)
                lineToRelative(-4.44f, -2.52f)
                lineToRelative(1.67f, -3.99f)
                lineToRelative(2.09f, 2.39f)
                close()
                moveTo(10.39f, 17.03f)
                lineToRelative(-0.4f, 0.97f)
                horizontalLineToRelative(-5.99f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.83f)
                curveToRelative(0.11f, -1.25f, 0.17f, -2.6f, 0.17f, -4f)
                curveTo(6f, 5.37f, 4.66f, 0f, 3f, 0f)
                reflectiveCurveTo(0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(1.34f, 12f, 3f, 12f)
                curveToRelative(0.77f, 0f, 1.47f, -1.16f, 2f, -3.07f)
                verticalLineToRelative(0.07f)
                horizontalLineToRelative(7f)
                lineToRelative(0.89f, -2.16f)
                lineToRelative(-1.22f, -0.69f)
                curveToRelative(-0.5f, -0.31f, -0.92f, -0.7f, -1.28f, -1.12f)
                close()
            }
        }.also { _PortalExit = it}
