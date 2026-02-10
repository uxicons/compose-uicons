package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MegaphoneMagnifyingGlass: ImageVector? = null

val Icons.Ss.MegaphoneMagnifyingGlass: ImageVector
    get() = _MegaphoneMagnifyingGlass ?: UXIcon(name = "MegaphoneMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8.15f)
                verticalLineToRelative(2.69f)
                curveToRelative(-0.53f, -0.21f, -1.18f, -0.34f, -2f, -0.34f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.76f, 0f, 1.43f, -0.12f, 2f, -0.35f)
                close()
                moveTo(23.96f, 22.54f)
                lineTo(22.54f, 23.96f)
                lineTo(16.32f, 17.74f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0.0f, -10f, -4.49f, -10f, -10.0f)
                reflectiveCurveToRelative(4.49f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(6.22f, 6.22f)
                close()
                moveTo(15f, 9.5f)
                curveToRelative(0f, -0.65f, -0.42f, -1.2f, -1f, -1.41f)
                verticalLineToRelative(-3.09f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(-0.51f, 0.89f, -0.68f, 1.46f, -2.38f, 1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.46f, 0.16f, 0.88f, 0.42f, 1.22f)
                lineToRelative(1.71f, 4.27f)
                horizontalLineToRelative(0.46f)
                curveToRelative(0.48f, 0f, 0.92f, -0.24f, 1.18f, -0.64f)
                reflectiveCurveToRelative(0.3f, -0.9f, 0.11f, -1.34f)
                lineToRelative(-0.55f, -1.5f)
                horizontalLineToRelative(1.67f)
                curveToRelative(2.17f, 0.14f, 1.76f, 0.66f, 2.35f, 1.5f)
                horizontalLineToRelative(1.66f)
                verticalLineToRelative(-3.09f)
                curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
                close()
            }
        }.also { _MegaphoneMagnifyingGlass = it}
