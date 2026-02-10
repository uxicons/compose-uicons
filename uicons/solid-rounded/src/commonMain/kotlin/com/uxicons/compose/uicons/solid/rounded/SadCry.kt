package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadCry: ImageVector? = null

val Icons.Sr.SadCry: ImageVector
    get() = _SadCry ?: UXIcon(name = "SadCry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(0.34f, 0.03f, -4.35f, 15.05f, 5f, 21.73f)
                lineTo(5f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(7.9f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                lineTo(17f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(6.73f)
                curveTo(28.35f, 15.05f, 23.65f, 0.02f, 12f, 0f)
                close()
                moveTo(9f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                curveTo(5f, 9.11f, 6.23f, 7f, 8f, 7f)
                reflectiveCurveToRelative(3f, 2.11f, 3f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 11f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-2.63f, -0.07f, -2.63f, -5.93f, 0f, -6f)
                curveTo(14.63f, 14.07f, 14.63f, 19.93f, 12f, 20f)
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
        }.also { _SadCry = it}
