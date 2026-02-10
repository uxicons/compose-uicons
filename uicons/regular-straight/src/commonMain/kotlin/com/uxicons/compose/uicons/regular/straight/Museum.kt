package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Museum: ImageVector? = null

val Icons.Rs.Museum: ImageVector
    get() = _Museum ?: UXIcon(name = "Museum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.0f)
                verticalLineToRelative(-3.09f)
                curveToRelative(0f, -1.1f, -0.6f, -2.11f, -1.56f, -2.63f)
                lineToRelative(-9.0f, -4.91f)
                curveToRelative(-0.9f, -0.49f, -1.97f, -0.49f, -2.87f, 0f)
                lineToRelative(-9f, 4.91f)
                curveToRelative(-0.96f, 0.53f, -1.56f, 1.53f, -1.56f, 2.63f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11f)
                close()
                moveTo(2f, 7.91f)
                curveToRelative(0f, -0.37f, 0.2f, -0.7f, 0.52f, -0.88f)
                lineToRelative(9f, -4.91f)
                curveToRelative(0.3f, -0.16f, 0.66f, -0.16f, 0.96f, 0f)
                lineToRelative(9f, 4.91f)
                curveToRelative(0.32f, 0.18f, 0.52f, 0.51f, 0.52f, 0.88f)
                verticalLineToRelative(1.09f)
                horizontalLineToRelative(-20f)
                close()
                moveTo(14f, 11.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(5f, 11.0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(19f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(3f)
                close()
                moveTo(13.5f, 6.0f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Museum = it}
