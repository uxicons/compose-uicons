package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperSlash: ImageVector? = null

val Icons.Br.ToiletPaperSlash: ImageVector
    get() = _ToiletPaperSlash ?: UXIcon(name = "ToiletPaperSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.12f, 16f)
            horizontalLineToRelative(1.88f)
            curveToRelative(2.21f, 0f, 4f, -3.58f, 4f, -8f)
            curveTo(24f, 3.79f, 22.37f, 0.34f, 20.3f, 0.03f)
            curveToRelative(-0.1f, -0.02f, -0.2f, -0.03f, -0.3f, -0.03f)
            lineTo(7.5f, 0f)
            curveToRelative(-1.34f, 0f, -2.58f, 0.66f, -3.54f, 1.83f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            reflectiveCurveTo(-0.15f, 1.98f, 0.44f, 2.56f)
            lineToRelative(21f, 21f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(-5.44f, -5.44f)
            close()
            moveTo(20f, 5.5f)
            curveToRelative(0.55f, 0f, 1f, 1.12f, 1f, 2.5f)
            reflectiveCurveToRelative(-0.45f, 2.5f, -1f, 2.5f)
            reflectiveCurveToRelative(-1f, -1.12f, -1f, -2.5f)
            reflectiveCurveToRelative(0.45f, -2.5f, 1f, -2.5f)
            close()
            moveTo(16f, 8f)
            verticalLineToRelative(5.88f)
            lineTo(6.09f, 3.97f)
            curveToRelative(0.43f, -0.61f, 0.94f, -0.97f, 1.41f, -0.97f)
            horizontalLineToRelative(9.38f)
            curveToRelative(-0.55f, 1.37f, -0.88f, 3.11f, -0.88f, 5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.15f, 20.91f)
            curveToRelative(-0.21f, 0.06f, -0.43f, 0.09f, -0.65f, 0.09f)
            horizontalLineTo(3.15f)
            curveToRelative(-0.09f, 0f, -0.15f, -0.07f, -0.15f, -0.15f)
            curveToRelative(0f, -0.07f, 0.09f, -0.13f, 0.17f, -0.17f)
            curveToRelative(1.47f, -0.59f, 1.97f, -2.08f, 1.83f, -3.28f)
            verticalLineToRelative(-6.9f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7.42f)
            curveToRelative(-1.22f, 0.51f, -2f, 1.65f, -2f, 2.93f)
            curveToRelative(0f, 1.74f, 1.42f, 3.15f, 3.15f, 3.15f)
            horizontalLineToRelative(10.35f)
            curveToRelative(0.48f, 0f, 0.97f, -0.06f, 1.43f, -0.19f)
            curveToRelative(0.8f, -0.22f, 1.27f, -1.04f, 1.06f, -1.84f)
            reflectiveCurveToRelative(-1.04f, -1.27f, -1.84f, -1.06f)
            close()
        }
    }.also { _ToiletPaperSlash = it }
