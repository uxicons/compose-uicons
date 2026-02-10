package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSeatReclined: ImageVector? = null

val Icons.Ss.PersonSeatReclined: ImageVector
    get() = _PersonSeatReclined ?: UXIcon(name = "PersonSeatReclined") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.65f, 19f)
                lineToRelative(1f, 2f)
                horizontalLineToRelative(-6.79f)
                curveToRelative(-3.28f, 0f, -6.16f, -2.33f, -6.84f, -5.53f)
                lineTo(0.19f, 7f)
                horizontalLineToRelative(2.05f)
                lineToRelative(1.73f, 8.05f)
                curveToRelative(0.49f, 2.29f, 2.55f, 3.95f, 4.89f, 3.95f)
                horizontalLineToRelative(5.79f)
                close()
                moveTo(20.62f, 22f)
                lineToRelative(-3.5f, -7f)
                horizontalLineToRelative(-8.17f)
                curveToRelative(-0.47f, 0f, -0.89f, -0.34f, -0.98f, -0.8f)
                lineToRelative(-0.44f, -2.2f)
                horizontalLineToRelative(7.47f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7.87f)
                lineToRelative(-0.6f, -3f)
                horizontalLineToRelative(-2.04f)
                lineToRelative(1.52f, 7.59f)
                curveToRelative(0.28f, 1.4f, 1.52f, 2.41f, 2.94f, 2.41f)
                horizontalLineToRelative(6.93f)
                lineToRelative(3.5f, 7f)
                horizontalLineToRelative(3.62f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.38f)
                close()
                moveTo(5.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(6.88f, 0f, 5.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _PersonSeatReclined = it}
