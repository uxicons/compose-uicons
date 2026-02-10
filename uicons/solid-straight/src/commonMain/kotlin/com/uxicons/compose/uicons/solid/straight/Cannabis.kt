package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cannabis: ImageVector? = null

val Icons.Ss.Cannabis: ImageVector
    get() = _Cannabis ?: UXIcon(name = "Cannabis") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17f)
                reflectiveCurveToRelative(-2.88f, 1.27f, -7f, 1.6f)
                curveToRelative(0.9f, 1.8f, 1f, 3.4f, 1f, 3.4f)
                curveToRelative(0f, 0f, -2.86f, -0.18f, -5f, -1.97f)
                verticalLineToRelative(-6.03f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.0f)
                curveToRelative(-2.14f, 1.81f, -5f, 2.0f, -5f, 2.0f)
                curveToRelative(0f, 0f, 0.04f, -1.67f, 1f, -3.53f)
                curveToRelative(-4.16f, -0.31f, -7f, -1.47f, -7f, -1.47f)
                curveToRelative(0f, 0f, 2.22f, -1.71f, 5.18f, -2.37f)
                curveTo(1.58f, 11.51f, 0f, 7f, 0f, 7f)
                curveToRelative(0f, 0f, 4.38f, 0.28f, 8.77f, 2.49f)
                curveToRelative(0.85f, -5.15f, 3.23f, -9.49f, 3.23f, -9.49f)
                curveToRelative(0f, 0f, 2.43f, 4.44f, 3.26f, 9.66f)
                curveToRelative(4.36f, -2.29f, 8.74f, -2.67f, 8.74f, -2.67f)
                curveToRelative(0f, 0f, -1.66f, 4.58f, -5.29f, 7.75f)
                curveToRelative(2.99f, 0.66f, 5.29f, 2.25f, 5.29f, 2.25f)
                close()
                moveTo(11f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Cannabis = it}
