package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEating: ImageVector? = null

val Icons.Ss.PlateEating: ImageVector
    get() = _PlateEating ?: UXIcon(name = "PlateEating") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                curveToRelative(0f, 5.22f, 3.34f, 9.65f, 8f, 11.3f)
                verticalLineTo(15f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(8.82f)
                curveToRelative(0.65f, 0.11f, 1.32f, 0.18f, 2f, 0.18f)
                curveToRelative(1.41f, 0f, 2.75f, -0.25f, 4f, -0.7f)
                verticalLineToRelative(-4.51f)
                curveToRelative(-1.53f, -1.86f, -2.04f, -3.76f, -2.0f, -5.46f)
                curveToRelative(0.12f, -3.08f, 1.67f, -5.25f, 2.61f, -6.1f)
                curveToRelative(0.54f, -0.5f, 1.39f, -0.12f, 1.39f, 0.51f)
                verticalLineToRelative(14.64f)
                curveToRelative(3.58f, -2.08f, 6f, -5.94f, 6f, -10.38f)
                curveTo(24f, 5.37f, 18.63f, 0f, 12f, 0f)
                close()
            }
        }.also { _PlateEating = it}
