package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eye: ImageVector? = null

val Icons.Rr.Eye: ImageVector
    get() = _Eye ?: UXIcon(name = "Eye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.27f, 9.42f)
                curveTo(21.72f, 6.89f, 18.19f, 2.65f, 12f, 2.65f)
                reflectiveCurveTo(2.28f, 6.89f, 0.73f, 9.42f)
                arcToRelative(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.16f)
                curveTo(2.28f, 17.11f, 5.81f, 21.34f, 12f, 21.34f)
                reflectiveCurveToRelative(9.72f, -4.24f, 11.27f, -6.76f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.27f, 9.42f)
                close()
                moveTo(21.57f, 13.53f)
                curveTo(20.23f, 15.7f, 17.22f, 19.34f, 12f, 19.34f)
                reflectiveCurveTo(3.77f, 15.7f, 2.43f, 13.53f)
                arcToRelative(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.07f)
                curveTo(3.77f, 8.3f, 6.78f, 4.66f, 12f, 4.66f)
                reflectiveCurveToRelative(8.23f, 3.64f, 9.57f, 5.81f)
                arcTo(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.57f, 13.53f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                close()
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
            }
        }.also { _Eye = it}
