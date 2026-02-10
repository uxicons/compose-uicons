package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kickstarter: ImageVector? = null

val Icons.Brand.Kickstarter: ImageVector
    get() = _Kickstarter ?: UXIcon(name = "Kickstarter") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.75f, 12.01f)
            lineToRelative(2.18f, -2.17f)
            curveToRelative(2.26f, -2.25f, 2.26f, -5.9f, 0f, -8.15f)
            curveToRelative(-2.26f, -2.25f, -5.94f, -2.25f, -8.2f, 0f)
            lineToRelative(-0.8f, 0.79f)
            curveTo(10.88f, 0.98f, 9.15f, 0f, 7.17f, 0f)
            curveTo(3.97f, 0f, 1.37f, 2.58f, 1.37f, 5.76f)
            verticalLineToRelative(12.48f)
            curveTo(1.37f, 21.42f, 3.97f, 24f, 7.17f, 24f)
            curveToRelative(1.98f, 0f, 3.71f, -0.98f, 4.77f, -2.48f)
            lineToRelative(0.8f, 0.79f)
            curveToRelative(2.26f, 2.25f, 5.94f, 2.25f, 8.2f, 0f)
            curveToRelative(2.26f, -2.25f, 2.26f, -5.9f, 0f, -8.15f)
            lineTo(18.75f, 12.01f)
            lineTo(18.75f, 12.01f)
            close()
        }
    }.also { _Kickstarter = it }
