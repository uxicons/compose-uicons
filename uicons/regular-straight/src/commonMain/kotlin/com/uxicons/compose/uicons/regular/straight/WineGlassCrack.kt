package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassCrack: ImageVector? = null

val Icons.Rs.WineGlassCrack: ImageVector
    get() = _WineGlassCrack ?: UXIcon(name = "WineGlassCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 9f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 9f)
                curveToRelative(0f, 3.52f, 2.61f, 6.44f, 6f, 6.93f)
                verticalLineToRelative(6.07f)
                lineTo(7f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6.07f)
                curveToRelative(3.39f, -0.49f, 6f, -3.41f, 6f, -6.93f)
                close()
                moveTo(7f, 9f)
                lineTo(7f, 2f)
                horizontalLineToRelative(3.52f)
                lineToRelative(-2f, 5f)
                horizontalLineToRelative(4f)
                lineToRelative(-1.45f, 3.63f)
                lineToRelative(1.86f, 0.74f)
                lineToRelative(2.55f, -6.37f)
                horizontalLineToRelative(-4f)
                lineToRelative(1.2f, -3f)
                horizontalLineToRelative(4.32f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
            }
        }.also { _WineGlassCrack = it}
