package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pi: ImageVector? = null

val Icons.Bs.Pi: ImageVector
    get() = _Pi ?: UXIcon(name = "Pi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 3f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineTo(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 5.2f, -3.34f, 8.36f, -3.48f, 8.49f)
                lineToRelative(-2.04f, -2.2f)
                curveToRelative(0.02f, -0.02f, 2.52f, -2.44f, 2.52f, -6.29f)
                verticalLineTo(3f)
                curveToRelative(-3.8f, 0f, -4.0f, 3.33f, -4f, 3.99f)
                lineToRelative(-3f, 0.02f)
                curveToRelative(-0.0f, -0.31f, 0.03f, -3.11f, 2.02f, -5.13f)
                curveTo(3.26f, 0.64f, 4.94f, 0f, 7f, 0f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Pi = it}
