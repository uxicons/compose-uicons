package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileBeam: ImageVector? = null

val Icons.Rr.SmileBeam: ImageVector
    get() = _SmileBeam ?: UXIcon(name = "SmileBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                curveTo(5f, 9.11f, 6.23f, 7f, 8f, 7f)
                reflectiveCurveToRelative(3f, 2.11f, 3f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                close()
                moveTo(19f, 11f)
                curveToRelative(0f, -1.89f, -1.23f, -4f, -3f, -4f)
                reflectiveCurveToRelative(-3f, 2.11f, -3f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                curveToRelative(0f, -1.05f, 0.68f, -2f, 1f, -2f)
                reflectiveCurveToRelative(1f, 0.95f, 1f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                curveTo(-3.9f, 0.6f, -3.89f, 23.4f, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                curveTo(-1.25f, 21.5f, -1.24f, 2.5f, 12f, 2f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                close()
                moveTo(17.67f, 15.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.33f, -1.49f)
                arcToRelative(6.36f, 6.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.67f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.33f, 1.49f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.67f, 15.75f)
                close()
            }
        }.also { _SmileBeam = it}
