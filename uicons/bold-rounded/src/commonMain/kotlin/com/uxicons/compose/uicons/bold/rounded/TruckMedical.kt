package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckMedical: ImageVector? = null

val Icons.Br.TruckMedical: ImageVector
    get() = _TruckMedical ?: UXIcon(name = "TruckMedical") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13f, 10.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 10.27f)
            verticalLineToRelative(5.36f)
            curveToRelative(0f, 1.94f, -1.27f, 3.56f, -3.02f, 4.13f)
            curveToRelative(0.01f, 0.08f, 0.02f, 0.15f, 0.02f, 0.23f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            horizontalLineToRelative(-6f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            curveToRelative(0f, -0.08f, 0.01f, -0.15f, 0.02f, -0.23f)
            curveToRelative(-1.75f, -0.57f, -3.02f, -2.19f, -3.02f, -4.13f)
            lineTo(0f, 6.5f)
            curveTo(0f, 3.47f, 2.47f, 1f, 5.5f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(2.51f, 0f, 4.63f, 1.7f, 5.29f, 4f)
            horizontalLineToRelative(1.9f)
            curveToRelative(2.93f, 0f, 5.32f, 2.37f, 5.32f, 5.27f)
            close()
            moveTo(14f, 6.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(9.14f)
            curveToRelative(0f, 0.75f, 0.61f, 1.36f, 1.36f, 1.36f)
            horizontalLineToRelative(9.64f)
            lineTo(14f, 6.5f)
            close()
            moveTo(21f, 14f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2.64f)
            curveToRelative(0.75f, 0f, 1.36f, -0.61f, 1.36f, -1.36f)
            verticalLineToRelative(-1.64f)
            close()
            moveTo(21f, 10.27f)
            curveToRelative(0f, -1.27f, -1.02f, -2.27f, -2.32f, -2.27f)
            horizontalLineToRelative(-1.68f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-0.73f)
            close()
        }
    }.also { _TruckMedical = it }
