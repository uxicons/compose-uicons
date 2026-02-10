package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWitch: ImageVector? = null

val Icons.Tr.HatWitch: ImageVector
    get() = _HatWitch ?: UXIcon(name = "HatWitch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 23f)
                horizontalLineToRelative(-1.08f)
                lineToRelative(-5.28f, -15.39f)
                curveToRelative(-0.2f, -0.59f, -0.11f, -1.25f, 0.25f, -1.77f)
                curveToRelative(0.37f, -0.53f, 0.97f, -0.84f, 1.62f, -0.84f)
                horizontalLineToRelative(3.81f)
                curveToRelative(0.5f, 0f, 0.93f, -0.3f, 1.11f, -0.77f)
                curveToRelative(0.18f, -0.47f, 0.05f, -0.98f, -0.39f, -1.36f)
                lineToRelative(-2.23f, -1.39f)
                curveToRelative(-1.84f, -1.04f, -3.43f, -1.49f, -5.29f, -1.49f)
                horizontalLineToRelative(-0.97f)
                curveToRelative(-3.34f, 0f, -6.32f, 2.13f, -7.4f, 5.29f)
                lineTo(1.6f, 23f)
                lineTo(0.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(23f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(8.59f, 5.62f)
                curveToRelative(0.94f, -2.76f, 3.54f, -4.62f, 6.45f, -4.62f)
                horizontalLineToRelative(0.97f)
                curveToRelative(1.68f, 0f, 3.12f, 0.41f, 4.78f, 1.34f)
                lineToRelative(2.14f, 1.33f)
                curveToRelative(0.08f, 0.07f, 0.07f, 0.16f, 0.05f, 0.21f)
                curveToRelative(-0.02f, 0.04f, -0.06f, 0.12f, -0.17f, 0.12f)
                horizontalLineToRelative(-3.81f)
                curveToRelative(-0.97f, 0f, -1.89f, 0.47f, -2.44f, 1.27f)
                curveToRelative(-0.54f, 0.78f, -0.68f, 1.77f, -0.37f, 2.67f)
                lineToRelative(5.17f, 15.06f)
                horizontalLineToRelative(-6.36f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                lineTo(2.65f, 23.0f)
                lineTo(8.59f, 5.62f)
                close()
                moveTo(14f, 23f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _HatWitch = it}
