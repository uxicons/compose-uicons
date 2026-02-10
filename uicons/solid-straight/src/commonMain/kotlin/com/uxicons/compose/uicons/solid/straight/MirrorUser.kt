package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MirrorUser: ImageVector? = null

val Icons.Ss.MirrorUser: ImageVector
    get() = _MirrorUser ?: UXIcon(name = "MirrorUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12.79f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-0.45f, 3.39f)
                curveToRelative(-0.2f, 1.49f, -1.48f, 2.61f, -2.97f, 2.61f)
                lineTo(2f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 0f)
                curveTo(2.27f, 0.64f, 4.29f, 2.0f, 5.78f, 3.97f)
                horizontalLineToRelative(0f)
                curveToRelative(1.49f, 1.84f, 2.98f, 6.06f, 4.22f, 8.82f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.84f, -2.58f, 12f, -6f, 12f)
                reflectiveCurveToRelative(-6f, -5.16f, -6f, -12f)
                reflectiveCurveTo(14.58f, 0f, 18f, 0f)
                reflectiveCurveToRelative(6f, 5.16f, 6f, 12f)
                close()
                moveTo(20.97f, 18.48f)
                curveToRelative(-0.06f, -0.11f, -0.1f, -0.22f, -0.12f, -0.34f)
                lineToRelative(-0.68f, -5.13f)
                horizontalLineToRelative(-1.99f)
                curveToRelative(0.95f, -2.17f, 2.08f, -4.87f, 3.1f, -6.5f)
                curveToRelative(-0.24f, -0.85f, -0.53f, -1.61f, -0.86f, -2.25f)
                curveToRelative(-1.53f, 1.8f, -3.04f, 5.64f, -4.34f, 8.54f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(2.33f)
                lineToRelative(0.45f, 3.39f)
                curveToRelative(0.11f, 0.83f, 0.55f, 1.54f, 1.19f, 2.02f)
                curveToRelative(0.34f, -0.53f, 0.65f, -1.18f, 0.92f, -1.93f)
                close()
            }
        }.also { _MirrorUser = it}
