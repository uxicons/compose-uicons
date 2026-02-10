package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Checkbox: ImageVector? = null

val Icons.Sr.Checkbox: ImageVector
    get() = _Checkbox ?: UXIcon(name = "Checkbox", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(405.33f, 0f)
                horizontalLineTo(106.67f)
                curveTo(47.79f, 0.07f, 0.07f, 47.79f, 0f, 106.67f)
                verticalLineToRelative(298.67f)
                curveTo(0.07f, 464.21f, 47.79f, 511.93f, 106.67f, 512f)
                horizontalLineToRelative(298.67f)
                curveTo(464.21f, 511.93f, 511.93f, 464.21f, 512f, 405.33f)
                verticalLineTo(106.67f)
                curveTo(511.93f, 47.79f, 464.21f, 0.07f, 405.33f, 0f)
                close()
                moveTo(426.67f, 172.35f)
                lineTo(229.25f, 369.77f)
                curveToRelative(-16.66f, 16.67f, -43.67f, 16.67f, -60.34f, 0.01f)
                curveToRelative(-0f, -0f, -0.01f, -0.01f, -0.01f, -0.01f)
                lineToRelative(-83.56f, -83.54f)
                curveToRelative(-8.35f, -8.35f, -8.35f, -21.88f, 0f, -30.23f)
                reflectiveCurveToRelative(21.88f, -8.35f, 30.23f, 0f)
                lineToRelative(83.54f, 83.54f)
                lineToRelative(197.44f, -197.42f)
                curveToRelative(8.35f, -8.32f, 21.86f, -8.29f, 30.18f, 0.05f)
                curveTo(435.04f, 150.52f, 435.01f, 164.03f, 426.67f, 172.35f)
                close()
            }
        }.also { _Checkbox = it}
