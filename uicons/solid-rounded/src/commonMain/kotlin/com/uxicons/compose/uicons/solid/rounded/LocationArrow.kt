package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationArrow: ImageVector? = null

val Icons.Sr.LocationArrow: ImageVector
    get() = _LocationArrow ?: UXIcon(name = "LocationArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.6f, 24.0f)
                curveToRelative(-0.23f, 0f, -0.46f, -0.02f, -0.67f, -0.06f)
                curveToRelative(-1.47f, -0.27f, -2.95f, -1.46f, -2.95f, -3.53f)
                verticalLineToRelative(-6.39f)
                horizontalLineTo(3.6f)
                curveTo(1.52f, 14.01f, 0.33f, 12.53f, 0.06f, 11.06f)
                curveToRelative(-0.27f, -1.47f, 0.33f, -3.27f, 2.27f, -4.0f)
                lineTo(18.72f, 0.27f)
                curveToRelative(1.47f, -0.56f, 3.05f, -0.22f, 4.14f, 0.87f)
                curveToRelative(1.09f, 1.09f, 1.43f, 2.66f, 0.89f, 4.11f)
                lineToRelative(-6.83f, 16.46f)
                curveToRelative(-0.61f, 1.62f, -2.01f, 2.29f, -3.32f, 2.29f)
                close()
            }
        }.also { _LocationArrow = it}
