package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinAlt: ImageVector? = null

val Icons.Rs.GrinAlt: ImageVector
    get() = _GrinAlt ?: UXIcon(name = "GrinAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(7f, 9.5f)
                curveTo(7f, 8.12f, 7.67f, 7f, 8.5f, 7f)
                reflectiveCurveTo(10f, 8.12f, 10f, 9.5f)
                reflectiveCurveTo(9.33f, 12f, 8.5f, 12f)
                reflectiveCurveTo(7f, 10.88f, 7f, 9.5f)
                close()
                moveTo(14f, 9.5f)
                curveToRelative(0f, -1.38f, 0.67f, -2.5f, 1.5f, -2.5f)
                reflectiveCurveTo(17f, 8.12f, 17f, 9.5f)
                reflectiveCurveTo(16.33f, 12f, 15.5f, 12f)
                reflectiveCurveTo(14f, 10.88f, 14f, 9.5f)
                close()
                moveTo(12f, 15f)
                arcToRelative(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.01f, -1f)
                curveToRelative(-0.61f, 2.28f, -2.66f, 5f, -6f, 5f)
                reflectiveCurveTo(6.62f, 16.28f, 6f, 14f)
                arcTo(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                close()
            }
        }.also { _GrinAlt = it}
