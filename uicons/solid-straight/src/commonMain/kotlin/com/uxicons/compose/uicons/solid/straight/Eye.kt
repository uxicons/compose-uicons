package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eye: ImageVector? = null

val Icons.Ss.Eye: ImageVector
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
                moveTo(12f, 18f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, -6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                moveToRelative(-4f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
            }
        }.also { _Eye = it}
