package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEmpty: ImageVector? = null

val Icons.Sr.PlateEmpty: ImageVector
    get() = _PlateEmpty ?: UXIcon(name = "PlateEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.86f, 19f)
                horizontalLineToRelative(-3.72f)
                curveToRelative(-2.37f, 0f, -4.65f, -0.92f, -6.27f, -2.53f)
                curveToRelative(-1.72f, -1.71f, -3f, -3.9f, -3.71f, -6.32f)
                curveToRelative(-0.36f, -1.23f, -0.13f, -2.53f, 0.64f, -3.55f)
                curveToRelative(0.76f, -1.02f, 1.93f, -1.6f, 3.2f, -1.6f)
                horizontalLineToRelative(15.99f)
                curveToRelative(1.27f, 0f, 2.44f, 0.58f, 3.2f, 1.6f)
                curveToRelative(0.77f, 1.02f, 1.0f, 2.32f, 0.64f, 3.55f)
                curveToRelative(-0.71f, 2.42f, -1.99f, 4.61f, -3.71f, 6.32f)
                curveToRelative(-1.62f, 1.61f, -3.9f, 2.53f, -6.27f, 2.53f)
                close()
            }
        }.also { _PlateEmpty = it}
