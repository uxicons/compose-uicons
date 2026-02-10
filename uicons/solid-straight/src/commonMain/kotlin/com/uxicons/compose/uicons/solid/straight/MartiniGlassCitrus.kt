package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MartiniGlassCitrus: ImageVector? = null

val Icons.Ss.MartiniGlassCitrus: ImageVector
    get() = _MartiniGlassCitrus ?: UXIcon(name = "MartiniGlassCitrus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.46f, 8.48f)
                curveToRelative(0.98f, -0.89f, 1.54f, -2.15f, 1.54f, -3.48f)
                verticalLineToRelative(-1f)
                lineTo(-0.0f, 4f)
                verticalLineToRelative(1f)
                curveTo(-0.0f, 6.32f, 0.56f, 7.59f, 1.54f, 8.48f)
                lineToRelative(7.46f, 6.78f)
                verticalLineToRelative(6.74f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6.74f)
                lineToRelative(7.46f, -6.78f)
                close()
                moveTo(23.88f, 4.72f)
                curveToRelative(0.81f, 3.88f, -2.13f, 7.3f, -5.87f, 7.3f)
                curveToRelative(-0.15f, 0f, -0.3f, -0.01f, -0.44f, -0.02f)
                lineToRelative(2.24f, -2.04f)
                horizontalLineToRelative(0f)
                curveToRelative(1.39f, -1.27f, 2.19f, -3.07f, 2.19f, -4.96f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-5.46f)
                curveToRelative(1.36f, -1.51f, 3.46f, -2.34f, 5.74f, -1.87f)
                reflectiveCurveToRelative(4.13f, 2.31f, 4.61f, 4.59f)
                close()
            }
        }.also { _MartiniGlassCitrus = it}
