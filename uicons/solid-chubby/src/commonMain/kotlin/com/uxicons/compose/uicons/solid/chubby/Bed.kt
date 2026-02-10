package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bed: ImageVector? = null

val Icons.Sc.Bed: ImageVector
    get() = _Bed ?: UXIcon(name = "Bed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.15f, 11.81f)
                curveToRelative(-0.19f, -0.03f, -4.63f, -0.72f, -9.9f, -0.72f)
                curveToRelative(-3.39f, 0f, -6.46f, 0.29f, -8.25f, 0.5f)
                verticalLineTo(5.49f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(13.01f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.26f)
                curveToRelative(1.79f, 0.21f, 4.85f, 0.5f, 8.25f, 0.5f)
                curveToRelative(3.14f, 0f, 6f, -0.25f, 7.83f, -0.45f)
                verticalLineToRelative(0.12f)
                curveToRelative(0f, 0.81f, 0.65f, 1.46f, 1.46f, 1.46f)
                reflectiveCurveToRelative(1.46f, -0.65f, 1.46f, -1.46f)
                verticalLineToRelative(-5.61f)
                curveToRelative(0f, -0.5f, -0.36f, -0.92f, -0.85f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.25f, 9.09f)
                curveToRelative(5.7f, -0.03f, 10.51f, 0.81f, 10.65f, 0.85f)
                curveToRelative(-0.64f, -4.59f, -4.2f, -5.14f, -6.87f, -5.14f)
                curveToRelative(-1.17f, -0.01f, -3.96f, -0.0f, -5.62f, 1.92f)
                curveToRelative(-0.47f, -0.5f, -1.22f, -0.84f, -2.37f, -0.84f)
                curveToRelative(-2.59f, 0f, -3.13f, 1.72f, -3.13f, 3.16f)
                curveToRelative(0f, 0.14f, 0.01f, 0.29f, 0.02f, 0.44f)
                curveToRelative(1.87f, -0.19f, 4.47f, -0.37f, 7.33f, -0.39f)
                close()
            }
        }.also { _Bed = it}
