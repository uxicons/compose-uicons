package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Box: ImageVector? = null

val Icons.Sr.Box: ImageVector
    get() = _Box ?: UXIcon(name = "Box", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(405.33f, 0.05f)
                horizontalLineTo(106.67f)
                curveTo(47.76f, 0.05f, 0f, 47.81f, 0f, 106.72f)
                lineToRelative(0f, 0f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(384f)
                curveToRelative(33.69f, 0.41f, 61.81f, -25.62f, 64f, -59.24f)
                curveTo(514.57f, 52.56f, 468.89f, 2.72f, 409.98f, 0.15f)
                curveTo(408.43f, 0.09f, 406.88f, 0.05f, 405.33f, 0.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(469.33f, 213.38f)
                horizontalLineTo(42.67f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                verticalLineToRelative(170.67f)
                curveTo(21.4f, 464.27f, 69.12f, 511.98f, 128f, 512.05f)
                horizontalLineToRelative(256f)
                curveToRelative(58.88f, -0.07f, 106.6f, -47.79f, 106.67f, -106.67f)
                verticalLineTo(234.72f)
                curveTo(490.67f, 222.94f, 481.11f, 213.38f, 469.33f, 213.38f)
                close()
                moveTo(320f, 320.05f)
                horizontalLineTo(192f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                reflectiveCurveToRelative(9.55f, -21.33f, 21.33f, -21.33f)
                horizontalLineToRelative(128f)
                curveToRelative(11.78f, 0f, 21.33f, 9.55f, 21.33f, 21.33f)
                reflectiveCurveTo(331.78f, 320.05f, 320f, 320.05f)
                close()
            }
        }.also { _Box = it}
