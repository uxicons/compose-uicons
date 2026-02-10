package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinBeamSweat: ImageVector? = null

val Icons.Rs.GrinBeamSweat: ImageVector
    get() = _GrinBeamSweat ?: UXIcon(name = "GrinBeamSweat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                lineTo(5f, 11f)
                curveTo(5f, 9.11f, 6.23f, 7f, 8f, 7f)
                reflectiveCurveToRelative(3f, 2.11f, 3f, 4f)
                lineTo(9f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveTo(7f, 9.95f, 7f, 11f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.05f, 0.68f, -2f, 1f, -2f)
                reflectiveCurveToRelative(1f, 0.95f, 1f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.89f, -1.23f, -4f, -3f, -4f)
                reflectiveCurveTo(13f, 9.11f, 13f, 11f)
                close()
                moveTo(12.01f, 19f)
                curveToRelative(3.34f, 0f, 5.38f, -2.72f, 6f, -5f)
                arcTo(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -1f)
                curveTo(6.62f, 16.28f, 8.67f, 19f, 12.01f, 19f)
                close()
                moveTo(20.5f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 4.5f)
                curveTo(23f, 2.46f, 20.5f, 0f, 20.5f, 0f)
                reflectiveCurveTo(18f, 2.51f, 18f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 7f)
                close()
                moveTo(23.3f, 8f)
                arcToRelative(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.8f, 0.89f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.24f, -5.92f)
                arcToRelative(8.61f, 8.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, -1.82f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(11.89f, 11.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.3f, 8f)
                close()
            }
        }.also { _GrinBeamSweat = it}
