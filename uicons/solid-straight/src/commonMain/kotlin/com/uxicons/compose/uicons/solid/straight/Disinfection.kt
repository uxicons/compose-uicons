package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Disinfection: ImageVector? = null

val Icons.Ss.Disinfection: ImageVector
    get() = _Disinfection ?: UXIcon(name = "Disinfection") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(22.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(10f, 10.22f)
                verticalLineToRelative(6.59f)
                lineToRelative(2f, 1.1f)
                verticalLineToRelative(6.09f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.91f)
                lineToRelative(-3.93f, -2.16f)
                curveToRelative(-0.8f, -0.44f, -1.4f, -1.12f, -1.75f, -1.93f)
                horizontalLineToRelative(-1.82f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.83f)
                curveToRelative(0f, -1.62f, 1.22f, -3.08f, 2.84f, -3.17f)
                curveToRelative(1.73f, -0.09f, 3.16f, 1.28f, 3.16f, 3.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.18f)
                curveToRelative(0.02f, 0.02f, 0.04f, 0.04f, 0.06f, 0.06f)
                lineToRelative(2.39f, 2.76f)
                horizontalLineToRelative(2.54f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.46f)
                lineToRelative(-1.54f, -1.78f)
                close()
                moveTo(2.96f, 24f)
                horizontalLineToRelative(2.03f)
                lineToRelative(1.03f, -4.82f)
                lineToRelative(-1.82f, -1.0f)
                close()
            }
        }.also { _Disinfection = it}
