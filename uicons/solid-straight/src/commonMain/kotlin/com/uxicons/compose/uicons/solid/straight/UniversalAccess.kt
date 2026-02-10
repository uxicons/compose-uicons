package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UniversalAccess: ImageVector? = null

val Icons.Ss.UniversalAccess: ImageVector
    get() = _UniversalAccess ?: UXIcon(name = "UniversalAccess") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(15.92f, 18.6f)
                lineToRelative(-1.83f, 0.8f)
                lineToRelative(-1.92f, -4.4f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-1.92f, 4.4f)
                lineToRelative(-1.83f, -0.8f)
                lineToRelative(1.92f, -4.4f)
                verticalLineToRelative(-3.53f)
                lineToRelative(-4.37f, -1.75f)
                lineToRelative(0.74f, -1.86f)
                lineToRelative(4.82f, 1.93f)
                horizontalLineToRelative(1.62f)
                lineToRelative(4.82f, -1.93f)
                lineToRelative(0.74f, 1.86f)
                lineToRelative(-4.37f, 1.75f)
                verticalLineToRelative(3.53f)
                lineToRelative(1.92f, 4.4f)
                close()
            }
        }.also { _UniversalAccess = it}
