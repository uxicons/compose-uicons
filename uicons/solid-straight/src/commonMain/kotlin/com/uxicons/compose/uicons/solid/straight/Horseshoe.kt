package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Horseshoe: ImageVector? = null

val Icons.Ss.Horseshoe: ImageVector
    get() = _Horseshoe ?: UXIcon(name = "Horseshoe") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                curveToRelative(0f, -2.07f, -0.58f, -4.0f, -1.58f, -5.65f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.35f, -0.57f, -0.74f, -1.11f, -1.18f, -1.61f)
                curveTo(18.22f, 1.45f, 15.28f, 0f, 12f, 0f)
                curveTo(5.93f, 0f, 1f, 4.93f, 1f, 11f)
                curveToRelative(0f, 4.16f, 1.59f, 8.74f, 2.49f, 11f)
                horizontalLineToRelative(-1.49f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7.35f)
                reflectiveCurveToRelative(-2.35f, -9f, -2.35f, -13f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 4f, -2.2f, 13f, -2.2f, 13f)
                horizontalLineToRelative(7.2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.49f)
                curveToRelative(0.9f, -2.26f, 2.49f, -6.84f, 2.49f, -11f)
                close()
                moveTo(5f, 11f)
                lineTo(3f, 11f)
                curveToRelative(0f, -1.84f, 0.56f, -3.55f, 1.51f, -4.98f)
                lineToRelative(1.63f, 1.16f)
                curveToRelative(-0.72f, 1.1f, -1.14f, 2.41f, -1.14f, 3.82f)
                close()
                moveTo(11f, 4.08f)
                curveToRelative(-1.33f, 0.19f, -2.55f, 0.76f, -3.53f, 1.59f)
                lineToRelative(-1.66f, -1.19f)
                curveToRelative(1.39f, -1.32f, 3.19f, -2.21f, 5.19f, -2.43f)
                verticalLineToRelative(2.02f)
                close()
                moveTo(16.53f, 5.67f)
                curveToRelative(-0.98f, -0.84f, -2.2f, -1.4f, -3.53f, -1.59f)
                lineTo(13f, 2.06f)
                curveToRelative(2.0f, 0.22f, 3.81f, 1.11f, 5.19f, 2.43f)
                lineToRelative(-1.66f, 1.19f)
                close()
                moveTo(17.86f, 7.18f)
                lineToRelative(1.63f, -1.16f)
                curveToRelative(0.95f, 1.43f, 1.51f, 3.14f, 1.51f, 4.98f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.41f, -0.42f, -2.72f, -1.14f, -3.82f)
                close()
            }
        }.also { _Horseshoe = it}
