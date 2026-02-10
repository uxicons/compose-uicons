package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadLoaf: ImageVector? = null

val Icons.Sr.BreadLoaf: ImageVector
    get() = _BreadLoaf ?: UXIcon(name = "BreadLoaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 9.67f)
                curveTo(0.6f, 9.01f, -0.22f, 7.49f, 0.05f, 5.89f)
                curveToRelative(0.29f, -1.67f, 1.78f, -2.89f, 3.55f, -2.89f)
                lineTo(13.4f, 3f)
                curveToRelative(1.77f, 0f, 3.26f, 1.21f, 3.55f, 2.89f)
                curveToRelative(0.25f, 1.44f, -0.4f, 2.81f, -1.54f, 3.55f)
                curveToRelative(-0.27f, 0.17f, -0.41f, 0.49f, -0.41f, 0.8f)
                verticalLineToRelative(6.76f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(6f, 21f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-7.33f)
                close()
                moveTo(23.95f, 5.89f)
                curveToRelative(-0.29f, -1.67f, -1.78f, -2.89f, -3.55f, -2.89f)
                horizontalLineToRelative(-2.67f)
                curveToRelative(0.6f, 0.71f, 1.02f, 1.58f, 1.19f, 2.55f)
                curveToRelative(0.34f, 1.98f, -0.43f, 3.96f, -1.92f, 5.2f)
                verticalLineToRelative(6.25f)
                curveToRelative(0f, 1.54f, -0.58f, 2.94f, -1.54f, 4f)
                horizontalLineToRelative(2.54f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-7.33f)
                curveToRelative(1.4f, -0.66f, 2.22f, -2.18f, 1.95f, -3.78f)
                close()
            }
        }.also { _BreadLoaf = it}
