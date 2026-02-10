package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabletAndroidAlt: ImageVector? = null

val Icons.Br.TabletAndroidAlt: ImageVector
    get() = _TabletAndroidAlt ?: UXIcon(name = "TabletAndroidAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.5f, 0f)
            lineTo(7.5f, 0f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(22f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(7.5f, 3f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(10.5f)
            lineTo(5f, 16f)
            lineTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(5.05f, 19f)
            horizontalLineToRelative(4.95f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
            close()
            moveTo(16.5f, 21f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(4.95f)
            curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
            close()
        }
    }.also { _TabletAndroidAlt = it }
