package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinBeam: ImageVector? = null

val Icons.Sr.GrinBeam: ImageVector
    get() = _GrinBeam ?: UXIcon(name = "GrinBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(5f, 11f)
                curveToRelative(0.25f, -5.29f, 5.75f, -5.28f, 6f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11f)
                close()
                moveTo(17.84f, 15.54f)
                arcTo(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                arcToRelative(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.85f, -3.46f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 14.02f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcToRelative(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -0.98f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.84f, 15.54f)
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
        }.also { _GrinBeam = it}
