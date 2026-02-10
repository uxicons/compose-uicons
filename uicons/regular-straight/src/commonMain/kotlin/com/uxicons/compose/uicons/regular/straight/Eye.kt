package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eye: ImageVector? = null

val Icons.Rs.Eye: ImageVector
    get() = _Eye ?: UXIcon(name = "Eye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.82f, 11.18f)
                verticalLineToRelative(0f)
                curveTo(22.94f, 9.26f, 19.5f, 3f, 12f, 3f)
                reflectiveCurveTo(1.06f, 9.26f, 0.18f, 11.18f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.64f)
                curveTo(1.06f, 14.74f, 4.5f, 21f, 12f, 21f)
                reflectiveCurveToRelative(10.94f, -6.26f, 11.82f, -8.18f)
                arcTo(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.82f, 11.18f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-6.31f, 0f, -9.25f, -5.37f, -10f, -6.99f)
                curveTo(2.75f, 10.37f, 5.69f, 5f, 12f, 5f)
                curveToRelative(6.29f, 0f, 9.24f, 5.34f, 10f, 7f)
                curveTo(21.24f, 13.66f, 18.29f, 19f, 12f, 19f)
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
