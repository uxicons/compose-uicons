package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VanFront: ImageVector? = null

val Icons.Sr.VanFront: ImageVector
    get() = _VanFront ?: UXIcon(name = "VanFront") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-20f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.64f, 0.5f, -1f, 1f, -1f)
                horizontalLineToRelative(1.43f)
                lineToRelative(0.34f, -3.97f)
                curveToRelative(0.19f, -2.17f, 1.74f, -3.95f, 3.87f, -4.44f)
                curveToRelative(3.39f, -0.78f, 7.32f, -0.78f, 10.71f, 0f)
                curveToRelative(2.13f, 0.49f, 3.68f, 2.28f, 3.87f, 4.45f)
                lineToRelative(0.34f, 3.97f)
                horizontalLineToRelative(1.43f)
                curveToRelative(0.5f, 0f, 1f, 0.51f, 1f, 1f)
                close()
                moveTo(2f, 14f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
                horizontalLineToRelative(-10.1f)
                curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(17f, 18f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(4f, 18f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _VanFront = it}
