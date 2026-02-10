package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shovel: ImageVector? = null

val Icons.Sr.Shovel: ImageVector
    get() = _Shovel ?: UXIcon(name = "Shovel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.71f, 17.71f)
                lineToRelative(3.68f, -3.68f)
                lineToRelative(1.19f, 1.19f)
                curveToRelative(0.61f, 0.61f, 0.94f, 1.41f, 0.94f, 2.27f)
                reflectiveCurveToRelative(-0.33f, 1.66f, -0.94f, 2.27f)
                lineToRelative(-1.61f, 1.61f)
                curveToRelative(-1.7f, 1.7f, -3.96f, 2.64f, -6.36f, 2.64f)
                horizontalLineToRelative(-1.11f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-1.11f)
                curveToRelative(0f, -2.4f, 0.94f, -4.67f, 2.64f, -6.36f)
                lineToRelative(1.61f, -1.61f)
                curveToRelative(1.21f, -1.21f, 3.33f, -1.21f, 4.54f, 0f)
                lineToRelative(1.19f, 1.19f)
                lineToRelative(-3.68f, 3.68f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                close()
                moveTo(23.71f, 5.79f)
                lineTo(18.21f, 0.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.04f, 2.04f)
                lineToRelative(-8.86f, 8.86f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(8.86f, -8.86f)
                lineToRelative(2.04f, 2.04f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _Shovel = it}
