package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationArrow: ImageVector? = null

val Icons.Ss.LocationArrow: ImageVector
    get() = _LocationArrow ?: UXIcon(name = "LocationArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.89f, 24.0f)
                curveToRelative(-0.17f, 0f, -0.35f, -0.02f, -0.52f, -0.05f)
                curveToRelative(-1.4f, -0.24f, -2.37f, -1.41f, -2.37f, -2.83f)
                verticalLineToRelative(-7.13f)
                horizontalLineTo(2.87f)
                curveToRelative(-1.42f, 0f, -2.58f, -0.98f, -2.83f, -2.37f)
                curveToRelative(-0.24f, -1.4f, 0.51f, -2.71f, 1.84f, -3.19f)
                lineTo(24.03f, -0.01f)
                lineToRelative(-8.47f, 22.14f)
                curveToRelative(-0.42f, 1.15f, -1.47f, 1.88f, -2.67f, 1.88f)
                close()
            }
        }.also { _LocationArrow = it}
