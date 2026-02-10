package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spa: ImageVector? = null

val Icons.Br.Spa: ImageVector
    get() = _Spa ?: UXIcon(name = "Spa") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.54f, 14.01f)
            arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 11f)
            curveToRelative(0f, -2.38f, -1.94f, -4f, -5.45f, -4.66f)
            arcTo(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 4.5f)
            curveTo(17f, 1.77f, 14.45f, 0f, 10.5f, 0f)
            reflectiveCurveTo(4f, 1.77f, 4f, 4.5f)
            arcTo(3.79f, 3.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.26f, 7.37f)
            arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
            arcToRelative(3.84f, 3.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 2.78f)
            curveTo(1.8f, 14.5f, 0f, 15.86f, 0f, 18.5f)
            curveTo(0f, 24f, 7.81f, 24f, 12f, 24f)
            reflectiveCurveToRelative(12f, 0f, 12f, -5.5f)
            curveTo(24f, 16.12f, 22.54f, 14.78f, 20.54f, 14.01f)
            close()
            moveTo(19f, 11f)
            curveToRelative(0f, 0.97f, -2.28f, 2f, -6.5f, 2f)
            curveTo(8.55f, 13f, 6f, 12.21f, 6f, 11f)
            reflectiveCurveToRelative(2.55f, -2f, 6.5f, -2f)
            curveTo(16.72f, 9f, 19f, 10.03f, 19f, 11f)
            close()
            moveTo(10.5f, 3f)
            curveToRelative(1.69f, 0f, 3.5f, 0.47f, 3.5f, 1.5f)
            reflectiveCurveTo(12.19f, 6f, 10.5f, 6f)
            reflectiveCurveTo(7f, 5.53f, 7f, 4.5f)
            reflectiveCurveTo(8.81f, 3f, 10.5f, 3f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-6.22f, 0f, -9f, -0.77f, -9f, -2.5f)
            reflectiveCurveTo(5.78f, 16f, 12f, 16f)
            reflectiveCurveToRelative(9f, 0.77f, 9f, 2.5f)
            reflectiveCurveTo(18.23f, 21f, 12f, 21f)
            close()
        }
    }.also { _Spa = it }
