package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatSanta: ImageVector? = null

val Icons.Ts.HatSanta: ImageVector
    get() = _HatSanta ?: UXIcon(name = "HatSanta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.93f, 18.04f)
                curveToRelative(-0.39f, -2.97f, -1.12f, -5.67f, -2.15f, -8.07f)
                curveToRelative(0.07f, 0.0f, 0.14f, 0.02f, 0.22f, 0.02f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                curveToRelative(-0.24f, 0f, -0.46f, 0.03f, -0.69f, 0.07f)
                curveToRelative(-1.19f, -1.13f, -3.8f, -2.07f, -5.81f, -2.07f)
                curveTo(8.94f, 0f, 3.67f, 5.59f, 2.06f, 18.04f)
                curveToRelative(-1.17f, 0.21f, -2.06f, 1.23f, -2.06f, 2.46f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.23f, -0.89f, -2.25f, -2.07f, -2.46f)
                close()
                moveTo(23f, 6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(13.5f, 1f)
                curveToRelative(1.69f, 0f, 3.62f, 0.7f, 4.7f, 1.45f)
                curveToRelative(-1.3f, 0.66f, -2.2f, 2.0f, -2.2f, 3.55f)
                curveToRelative(0f, 1.71f, 1.08f, 3.16f, 2.6f, 3.73f)
                curveToRelative(1.13f, 2.42f, 1.9f, 5.2f, 2.32f, 8.27f)
                lineTo(3.08f, 18f)
                curveTo(4.63f, 6.33f, 9.53f, 1f, 13.5f, 1f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                reflectiveCurveToRelative(0f, -2.5f, 0f, -2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _HatSanta = it}
