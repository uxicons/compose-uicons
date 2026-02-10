package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampStreet: ImageVector? = null

val Icons.Tr.LampStreet: ImageVector
    get() = _LampStreet ?: UXIcon(name = "LampStreet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.86f, 12.71f)
                curveToRelative(-1.18f, -3.29f, -4.33f, -5.53f, -7.92f, -5.7f)
                curveToRelative(-0.49f, -3.97f, -3.89f, -7.01f, -7.94f, -7.01f)
                curveTo(3.59f, 0f, 0f, 3.59f, 0f, 8f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                curveToRelative(3.5f, 0f, 6.45f, 2.6f, 6.93f, 6.02f)
                curveToRelative(-3.54f, 0.22f, -6.62f, 2.45f, -7.79f, 5.7f)
                curveToRelative(-0.26f, 0.73f, -0.15f, 1.53f, 0.31f, 2.18f)
                curveToRelative(0.49f, 0.69f, 1.29f, 1.11f, 2.16f, 1.11f)
                horizontalLineToRelative(3.4f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.4f)
                curveToRelative(0.86f, 0f, 1.67f, -0.41f, 2.16f, -1.11f)
                curveToRelative(0.46f, -0.65f, 0.57f, -1.44f, 0.31f, -2.18f)
                close()
                moveTo(17f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(22.74f, 14.32f)
                curveToRelative(-0.3f, 0.43f, -0.8f, 0.68f, -1.34f, 0.68f)
                horizontalLineToRelative(-11.79f)
                curveToRelative(-0.54f, 0f, -1.04f, -0.26f, -1.34f, -0.68f)
                curveToRelative(-0.27f, -0.38f, -0.33f, -0.84f, -0.18f, -1.27f)
                curveToRelative(1.08f, -3.01f, 4.08f, -5.04f, 7.42f, -5.05f)
                curveToRelative(3.35f, 0f, 6.33f, 2.03f, 7.42f, 5.05f)
                curveToRelative(0.15f, 0.42f, 0.09f, 0.89f, -0.18f, 1.27f)
                close()
            }
        }.also { _LampStreet = it}
