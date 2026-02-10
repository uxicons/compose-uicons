package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mars: ImageVector? = null

val Icons.Bs.Mars: ImageVector
    get() = _Mars ?: UXIcon(name = "Mars", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(458.62f, 0.21f)
                horizontalLineTo(341.65f)
                verticalLineToRelative(63.8f)
                horizontalLineToRelative(61.23f)
                lineToRelative(-99.36f, 99.36f)
                curveToRelative(-86.39f, -61.47f, -206.26f, -41.28f, -267.73f, 45.11f)
                reflectiveCurveToRelative(-41.28f, 206.26f, 45.11f, 267.73f)
                curveToRelative(86.39f, 61.47f, 206.26f, 41.28f, 267.73f, -45.11f)
                curveToRelative(47.42f, -66.63f, 47.42f, -155.99f, 0f, -222.62f)
                lineToRelative(99.36f, -99.36f)
                verticalLineToRelative(61.23f)
                horizontalLineToRelative(63.8f)
                verticalLineTo(53.38f)
                curveTo(511.79f, 24.01f, 487.99f, 0.21f, 458.62f, 0.21f)
                close()
                moveTo(192.78f, 446.83f)
                curveToRelative(-70.47f, 0f, -127.61f, -57.13f, -127.61f, -127.61f)
                reflectiveCurveToRelative(57.13f, -127.61f, 127.61f, -127.61f)
                reflectiveCurveToRelative(127.61f, 57.13f, 127.61f, 127.61f)
                curveTo(320.31f, 389.67f, 263.22f, 446.76f, 192.78f, 446.83f)
                close()
            }
        }.also { _Mars = it}
