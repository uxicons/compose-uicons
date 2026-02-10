package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartGlasses: ImageVector? = null

val Icons.Bs.SmartGlasses: ImageVector
    get() = _SmartGlasses ?: UXIcon(name = "SmartGlasses") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 5f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineToRelative(1.16f, 10.5f)
                horizontalLineToRelative(8.21f)
                lineToRelative(2.63f, -4.6f)
                lineToRelative(2.63f, 4.6f)
                horizontalLineToRelative(8.21f)
                curveToRelative(0.01f, -0.18f, 1.17f, -10.34f, 1.16f, -10.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.16f, 16f)
                horizontalLineToRelative(-3.79f)
                lineToRelative(-2.1f, -3.68f)
                curveToRelative(-0.46f, -0.81f, -1.33f, -1.32f, -2.27f, -1.32f)
                reflectiveCurveToRelative(-1.8f, 0.5f, -2.27f, 1.32f)
                lineToRelative(-2.1f, 3.68f)
                horizontalLineToRelative(-3.78f)
                lineToRelative(-0.67f, -6f)
                horizontalLineToRelative(4.82f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.26f, 0f, 0.47f, 0.2f, 0.5f, 0.44f)
                close()
            }
        }.also { _SmartGlasses = it}
