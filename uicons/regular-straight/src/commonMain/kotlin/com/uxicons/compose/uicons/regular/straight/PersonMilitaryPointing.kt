package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonMilitaryPointing: ImageVector? = null

val Icons.Rs.PersonMilitaryPointing: ImageVector
    get() = _PersonMilitaryPointing ?: UXIcon(name = "PersonMilitaryPointing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.97f, 20.98f)
                lineToRelative(-4.86f, -8.05f)
                curveToRelative(-0.72f, -1.19f, -2.03f, -1.93f, -3.43f, -1.93f)
                lineTo(0f, 11.0f)
                verticalLineToRelative(2f)
                lineTo(7.0f, 13.0f)
                lineToRelative(-0.04f, 11.0f)
                lineToRelative(2f, 0.01f)
                verticalLineToRelative(-0.0f)
                horizontalLineToRelative(8f)
                lineToRelative(1f, 0.0f)
                lineToRelative(0.03f, -9.06f)
                lineToRelative(4.27f, 7.07f)
                lineToRelative(1.71f, -1.03f)
                close()
                moveTo(15.99f, 14.71f)
                lineToRelative(-0.02f, 7.28f)
                horizontalLineToRelative(-5.87f)
                lineToRelative(5.9f, -7.28f)
                close()
                moveTo(14.81f, 13.0f)
                lineToRelative(-5.83f, 7.21f)
                lineToRelative(0.02f, -7.21f)
                horizontalLineToRelative(5.81f)
                close()
                moveTo(7.5f, 2.99f)
                verticalLineToRelative(2.51f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(16.5f, 3f)
                lineToRelative(0.44f, -0.83f)
                curveToRelative(0.27f, -0.79f, -0.29f, -1.61f, -1.12f, -1.66f)
                lineTo(8.74f, 0.0f)
                curveToRelative(-1.13f, -0.06f, -1.99f, 1.01f, -1.68f, 2.1f)
                lineToRelative(0.43f, 0.89f)
                close()
                moveTo(14.5f, 5.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _PersonMilitaryPointing = it}
