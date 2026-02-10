package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PortalExit: ImageVector? = null

val Icons.Ss.PortalExit: ImageVector
    get() = _PortalExit ?: UXIcon(name = "PortalExit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21.57f, 11f)
                lineToRelative(-2.13f, -3.55f)
                curveToRelative(-0.54f, -0.9f, -1.52f, -1.45f, -2.57f, -1.45f)
                horizontalLineToRelative(-7.48f)
                lineToRelative(-2.28f, 4.55f)
                lineToRelative(1.79f, 0.9f)
                lineToRelative(1.72f, -3.45f)
                horizontalLineToRelative(1.84f)
                lineToRelative(-1.75f, 4.27f)
                curveToRelative(-0.55f, 1.35f, -0.06f, 2.89f, 1.17f, 3.67f)
                lineToRelative(4.12f, 2.6f)
                verticalLineToRelative(5.45f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.55f)
                lineToRelative(-2.67f, -1.69f)
                lineToRelative(2.82f, -6.57f)
                lineToRelative(2.29f, 3.81f)
                horizontalLineToRelative(3.56f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.44f)
                close()
                moveTo(9.82f, 16.8f)
                lineToRelative(-0.49f, 1.2f)
                horizontalLineToRelative(-5.33f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.1f, -1.52f, 0.13f, -2.96f, 0.13f, -4f)
                curveToRelative(0f, -3.61f, -0.29f, -12f, -3f, -12f)
                reflectiveCurveTo(0f, 8.39f, 0f, 12f)
                reflectiveCurveToRelative(0.29f, 12f, 3f, 12f)
                curveToRelative(1.24f, 0f, 1.97f, -1.75f, 2.4f, -4f)
                horizontalLineToRelative(5.27f)
                lineToRelative(0.8f, -1.94f)
                lineToRelative(-0.67f, -0.42f)
                curveToRelative(-0.37f, -0.24f, -0.69f, -0.53f, -0.98f, -0.84f)
                close()
            }
        }.also { _PortalExit = it}
