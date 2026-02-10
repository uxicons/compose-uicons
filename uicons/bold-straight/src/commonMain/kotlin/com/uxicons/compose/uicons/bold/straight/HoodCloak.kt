package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoodCloak: ImageVector? = null

val Icons.Bs.HoodCloak: ImageVector
    get() = _HoodCloak ?: UXIcon(name = "HoodCloak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                curveToRelative(0f, 5.32f, 5.82f, 9.98f, 6.07f, 10.18f)
                lineToRelative(0.93f, 0.73f)
                lineToRelative(0.93f, -0.73f)
                curveToRelative(0.25f, -0.2f, 6.07f, -4.86f, 6.07f, -10.18f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(12.0f, 20.01f)
                curveToRelative(-1.62f, -1.54f, -4.0f, -4.37f, -4.0f, -7.01f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 2.62f, -2.38f, 5.46f, -4.0f, 7.01f)
                close()
                moveTo(21.76f, 21f)
                horizontalLineToRelative(2.26f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7.92f)
                lineToRelative(1.69f, -2.37f)
                curveToRelative(2.49f, -3.48f, 3.39f, -6.31f, 3.21f, -10.06f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.06f, -1.36f, -0.43f, -2.66f, -1.07f, -3.86f)
                curveToRelative(-0.6f, -1.12f, -0.34f, -3.05f, 0.08f, -4.74f)
                curveToRelative(-2.5f, -0.03f, -6.69f, -0.05f, -8.45f, 0.04f)
                curveToRelative(-4.55f, 0.22f, -8.29f, 3.95f, -8.53f, 8.48f)
                curveToRelative(-0.2f, 3.79f, 0.7f, 6.63f, 3.21f, 10.13f)
                lineToRelative(1.69f, 2.37f)
                lineTo(0f, 24.0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.26f)
                curveTo(0.49f, 17.88f, -0.17f, 14.93f, 0.02f, 11.34f)
                curveTo(0.33f, 5.29f, 5.33f, 0.31f, 11.4f, 0.01f)
                curveToRelative(2.67f, -0.13f, 10.3f, -0.02f, 10.62f, -0.01f)
                lineToRelative(2.06f, 0.03f)
                lineToRelative(-0.67f, 1.95f)
                curveToRelative(-0.6f, 1.76f, -1.0f, 3.84f, -0.84f, 4.36f)
                curveToRelative(0.82f, 1.51f, 1.3f, 3.21f, 1.4f, 4.99f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.19f, 3.59f, -0.48f, 6.54f, -2.24f, 9.66f)
                close()
            }
        }.also { _HoodCloak = it}
