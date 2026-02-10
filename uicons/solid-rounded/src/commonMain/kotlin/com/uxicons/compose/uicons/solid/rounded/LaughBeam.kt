package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughBeam: ImageVector? = null

val Icons.Sr.LaughBeam: ImageVector
    get() = _LaughBeam ?: UXIcon(name = "LaughBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(6f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                curveTo(5f, 9.11f, 6.23f, 7f, 8f, 7f)
                reflectiveCurveToRelative(3f, 2.11f, 3f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                close()
                moveTo(16.95f, 15.29f)
                arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.9f, 0.01f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.01f, 14f)
                lineTo(15.99f, 14f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.95f, 15.29f)
                close()
                moveTo(18f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                curveToRelative(0f, -1.89f, 1.23f, -4f, 3f, -4f)
                reflectiveCurveToRelative(3f, 2.11f, 3f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                close()
            }
        }.also { _LaughBeam = it}
