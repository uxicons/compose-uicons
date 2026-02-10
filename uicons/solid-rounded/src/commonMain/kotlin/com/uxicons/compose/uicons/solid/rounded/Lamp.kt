package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lamp: ImageVector? = null

val Icons.Sr.Lamp: ImageVector
    get() = _Lamp ?: UXIcon(name = "Lamp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 10.21f)
                lineToRelative(-0.78f, -6.09f)
                curveToRelative(-0.3f, -2.35f, -2.31f, -4.12f, -4.68f, -4.12f)
                horizontalLineTo(5.49f)
                curveTo(3.12f, 0f, 1.11f, 1.77f, 0.81f, 4.12f)
                lineTo(0.03f, 10.21f)
                curveToRelative(-0.15f, 1.21f, 0.22f, 2.43f, 1.03f, 3.35f)
                curveToRelative(0.81f, 0.92f, 1.97f, 1.44f, 3.19f, 1.44f)
                horizontalLineToRelative(6.75f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.83f, -1.54f, 1.99f, -2f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.62f, -1.29f, -2.94f, -2.9f, -3.0f)
                curveToRelative(-0.36f, -0.08f, -2.1f, -0.53f, -2.1f, -2.0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.74f)
                curveToRelative(1.22f, 0f, 2.38f, -0.53f, 3.19f, -1.44f)
                curveToRelative(0.81f, -0.92f, 1.18f, -2.14f, 1.03f, -3.35f)
                close()
            }
        }.also { _Lamp = it}
