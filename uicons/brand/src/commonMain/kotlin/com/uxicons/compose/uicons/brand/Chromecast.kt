package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chromecast: ImageVector? = null

val Icons.Brand.Chromecast: ImageVector
    get() = _Chromecast ?: UXIcon(name = "Chromecast") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.82f, 2.18f)
            horizontalLineTo(2.18f)
            curveTo(0.98f, 2.18f, 0f, 3.16f, 0f, 4.36f)
            verticalLineToRelative(3.27f)
            horizontalLineToRelative(2.18f)
            verticalLineTo(4.36f)
            horizontalLineToRelative(19.64f)
            verticalLineToRelative(15.27f)
            horizontalLineToRelative(-7.64f)
            verticalLineToRelative(2.18f)
            horizontalLineToRelative(7.64f)
            curveToRelative(1.2f, 0f, 2.18f, -0.98f, 2.18f, -2.18f)
            verticalLineTo(4.36f)
            curveTo(24f, 3.16f, 23.02f, 2.18f, 21.82f, 2.18f)
            close()
            moveTo(0f, 18.55f)
            verticalLineToRelative(3.27f)
            horizontalLineToRelative(3.27f)
            curveTo(3.27f, 20.01f, 1.81f, 18.55f, 0f, 18.55f)
            close()
            moveTo(0f, 14.18f)
            verticalLineToRelative(2.18f)
            curveToRelative(3.01f, 0f, 5.46f, 2.44f, 5.46f, 5.45f)
            horizontalLineToRelative(2.18f)
            curveTo(7.64f, 17.6f, 4.22f, 14.18f, 0f, 14.18f)
            close()
            moveTo(0f, 9.82f)
            verticalLineTo(12f)
            curveToRelative(5.42f, 0f, 9.82f, 4.4f, 9.82f, 9.82f)
            horizontalLineTo(12f)
            curveTo(12f, 15.19f, 6.62f, 9.82f, 0f, 9.82f)
            close()
        }
    }.also { _Chromecast = it }
