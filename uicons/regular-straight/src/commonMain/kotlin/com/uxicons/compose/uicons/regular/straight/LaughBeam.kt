package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughBeam: ImageVector? = null

val Icons.Rs.LaughBeam: ImageVector
    get() = _LaughBeam ?: UXIcon(name = "LaughBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0f, 2f, -2f, 5f, -4.99f, 5f)
                reflectiveCurveTo(7.05f, 16f, 7f, 14f)
                close()
                moveTo(7f, 11f)
                lineTo(5f, 11f)
                curveTo(5f, 9.11f, 6.23f, 7f, 8f, 7f)
                reflectiveCurveToRelative(3f, 2.11f, 3f, 4f)
                lineTo(9f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveTo(7f, 9.95f, 7f, 11f)
                close()
                moveTo(19f, 11f)
                lineTo(17f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                lineTo(13f, 11f)
                curveToRelative(0f, -1.89f, 1.23f, -4f, 3f, -4f)
                reflectiveCurveTo(19f, 9.11f, 19f, 11f)
                close()
            }
        }.also { _LaughBeam = it}
