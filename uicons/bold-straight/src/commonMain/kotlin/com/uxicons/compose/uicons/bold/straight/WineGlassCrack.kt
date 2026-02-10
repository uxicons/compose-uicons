package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassCrack: ImageVector? = null

val Icons.Bs.WineGlassCrack: ImageVector
    get() = _WineGlassCrack ?: UXIcon(name = "WineGlassCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 0f)
                lineTo(4f, 10f)
                curveToRelative(0f, 3.9f, 2.8f, 7.15f, 6.5f, 7.86f)
                verticalLineToRelative(3.14f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.14f)
                curveToRelative(3.7f, -0.7f, 6.5f, -3.96f, 6.5f, -7.86f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                lineTo(7f, 3f)
                horizontalLineToRelative(3.29f)
                lineToRelative(-2f, 5f)
                horizontalLineToRelative(3f)
                lineToRelative(-1.18f, 2.94f)
                lineToRelative(2.79f, 1.11f)
                lineToRelative(2.82f, -7.06f)
                horizontalLineToRelative(-3f)
                lineToRelative(0.8f, -2f)
                horizontalLineToRelative(3.48f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _WineGlassCrack = it}
