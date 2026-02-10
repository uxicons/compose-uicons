package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileBeam: ImageVector? = null

val Icons.Rs.SmileBeam: ImageVector
    get() = _SmileBeam ?: UXIcon(name = "SmileBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.34f, 14.25f)
                lineToRelative(1.33f, 1.49f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                arcToRelative(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.67f, -2.25f)
                lineToRelative(1.33f, -1.49f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcTo(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.34f, 14.25f)
                close()
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 22f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                close()
                moveTo(8f, 9f)
                curveToRelative(0.32f, 0f, 1f, 0.95f, 1f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.89f, -1.23f, -4f, -3f, -4f)
                reflectiveCurveTo(5f, 9.11f, 5f, 11f)
                lineTo(7f, 11f)
                curveTo(7f, 9.95f, 7.68f, 9f, 8f, 9f)
                close()
                moveTo(16f, 7f)
                curveToRelative(-1.77f, 0f, -3f, 2.11f, -3f, 4f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.05f, 0.68f, -2f, 1f, -2f)
                reflectiveCurveToRelative(1f, 0.95f, 1f, 2f)
                horizontalLineToRelative(2f)
                curveTo(19f, 9.11f, 17.77f, 7f, 16f, 7f)
                close()
            }
        }.also { _SmileBeam = it}
