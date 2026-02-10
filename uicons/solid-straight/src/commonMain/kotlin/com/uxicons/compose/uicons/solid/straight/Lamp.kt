package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lamp: ImageVector? = null

val Icons.Ss.Lamp: ImageVector
    get() = _Lamp ?: UXIcon(name = "Lamp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.11f, 18.0f)
                curveToRelative(-0.36f, -0.08f, -2.1f, -0.53f, -2.1f, -2.0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(11.0f)
                lineToRelative(-2.03f, -12.48f)
                curveToRelative(-0.24f, -1.46f, -1.48f, -2.52f, -2.96f, -2.52f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.48f, 0f, -2.72f, 1.06f, -2.96f, 2.52f)
                lineTo(0.0f, 15f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.83f, -1.54f, 1.99f, -2f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.62f, -1.29f, -2.94f, -2.9f, -3.0f)
                close()
            }
        }.also { _Lamp = it}
