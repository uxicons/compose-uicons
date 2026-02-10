package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassAlt: ImageVector? = null

val Icons.Ss.CompassAlt: ImageVector
    get() = _CompassAlt ?: UXIcon(name = "CompassAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.05f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 2.05f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(2.95f)
                curveToRelative(-0.48f, 5.27f, -4.68f, 9.47f, -9.95f, 9.95f)
                verticalLineToRelative(-2.95f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.95f)
                curveToRelative(-5.27f, -0.48f, -9.47f, -4.68f, -9.95f, -9.95f)
                horizontalLineToRelative(2.95f)
                verticalLineToRelative(-2f)
                lineTo(1.05f, 12f)
                curveTo(1.52f, 6.73f, 5.73f, 2.53f, 11f, 2.05f)
                verticalLineToRelative(2.95f)
                horizontalLineToRelative(2f)
                lineTo(13f, 2.05f)
                curveToRelative(5.27f, 0.48f, 9.47f, 4.68f, 9.95f, 9.95f)
                horizontalLineToRelative(-2.95f)
                verticalLineToRelative(2f)
                close()
                moveTo(17.46f, 18.46f)
                lineToRelative(-3.0f, -7.98f)
                lineToRelative(-7.91f, -2.92f)
                lineToRelative(2.92f, 7.91f)
                lineToRelative(7.98f, 3.0f)
                close()
                moveTo(9.94f, 10.94f)
                lineToRelative(1.1f, 2.97f)
                lineToRelative(3f, 1.13f)
                lineToRelative(-1.13f, -3f)
                lineToRelative(-2.97f, -1.1f)
                close()
            }
        }.also { _CompassAlt = it}
