package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MedicalStar: ImageVector? = null

val Icons.Br.MedicalStar: ImageVector
    get() = _MedicalStar ?: UXIcon(name = "MedicalStar") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.19f, 18.27f)
            curveToRelative(-0.28f, 0.46f, -0.78f, 0.72f, -1.28f, 0.72f)
            curveToRelative(-0.27f, 0f, -0.54f, -0.07f, -0.78f, -0.22f)
            lineToRelative(-6.67f, -4.08f)
            verticalLineToRelative(7.82f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-7.82f)
            lineToRelative(-6.67f, 4.09f)
            curveToRelative(-0.24f, 0.15f, -0.52f, 0.22f, -0.78f, 0.22f)
            curveToRelative(-0.51f, 0f, -1.0f, -0.26f, -1.28f, -0.72f)
            curveToRelative(-0.43f, -0.71f, -0.21f, -1.63f, 0.5f, -2.06f)
            lineToRelative(6.87f, -4.2f)
            lineTo(2.22f, 7.8f)
            curveToRelative(-0.71f, -0.43f, -0.93f, -1.36f, -0.5f, -2.06f)
            curveToRelative(0.43f, -0.71f, 1.36f, -0.93f, 2.06f, -0.5f)
            lineToRelative(6.67f, 4.09f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(7.82f)
            lineToRelative(6.67f, -4.08f)
            curveToRelative(0.7f, -0.43f, 1.63f, -0.21f, 2.06f, 0.5f)
            reflectiveCurveToRelative(0.21f, 1.63f, -0.5f, 2.06f)
            lineToRelative(-6.87f, 4.2f)
            lineToRelative(6.87f, 4.2f)
            curveToRelative(0.71f, 0.43f, 0.93f, 1.36f, 0.5f, 2.06f)
            close()
        }
    }.also { _MedicalStar = it }
