package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Power: ImageVector? = null

val Icons.Sr.Power: ImageVector
    get() = _Power ?: UXIcon(name = "Power", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(320.12f, 82.11f)
                lineTo(320.12f, 82.11f)
                curveToRelative(0.14f, 8.67f, 5.41f, 16.43f, 13.42f, 19.75f)
                curveToRelative(71.67f, 31.53f, 117.01f, 103.43f, 114.58f, 181.7f)
                curveToRelative(-1.72f, 106.04f, -89.08f, 190.6f, -195.12f, 188.88f)
                curveToRelative(-106.04f, -1.72f, -190.61f, -89.08f, -188.88f, -195.12f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(0.1f, -76.01f, 45.03f, -144.8f, 114.58f, -175.45f)
                curveToRelative(8.01f, -3.34f, 13.28f, -11.12f, 13.42f, -19.8f)
                lineToRelative(0f, 0f)
                curveToRelative(0.02f, -11.78f, -9.52f, -21.35f, -21.3f, -21.37f)
                curveToRelative(-2.74f, -0f, -5.47f, 0.52f, -8.01f, 1.55f)
                curveTo(43.9f, 113.82f, -10.7f, 252.01f, 40.85f, 370.92f)
                reflectiveCurveTo(230.59f, 544.43f, 349.49f, 492.88f)
                curveToRelative(118.91f, -51.55f, 173.51f, -189.74f, 121.96f, -308.65f)
                curveToRelative(-23.7f, -54.66f, -67.3f, -98.26f, -121.96f, -121.96f)
                curveToRelative(-10.91f, -4.44f, -23.36f, 0.8f, -27.8f, 11.72f)
                curveTo(320.64f, 76.57f, 320.11f, 79.33f, 320.12f, 82.11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(256.12f, 0f)
                lineTo(256.12f, 0f)
                curveToRelative(11.78f, 0f, 21.33f, 9.55f, 21.33f, 21.33f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                lineToRelative(0f, 0f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                verticalLineToRelative(-128f)
                curveTo(234.79f, 9.55f, 244.34f, 0f, 256.12f, 0f)
                close()
            }
        }.also { _Power = it}
