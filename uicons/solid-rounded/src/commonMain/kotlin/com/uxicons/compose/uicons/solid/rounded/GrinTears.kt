package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTears: ImageVector? = null

val Icons.Sr.GrinTears: ImageVector
    get() = _GrinTears ?: UXIcon(name = "GrinTears") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.38f, 16.38f)
                arcTo(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12.69f)
                arcTo(0.64f, 0.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.69f, 12f)
                curveToRelative(1.19f, 0.13f, 3.54f, 0.63f, 4.12f, 2.04f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -23.63f, 0f)
                curveToRelative(0.59f, -1.4f, 2.94f, -1.91f, 4.12f, -2.04f)
                arcTo(0.64f, 0.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12.69f)
                curveTo(4.88f, 14.62f, 3.51f, 18.23f, 0.93f, 16.63f)
                curveToRelative(4.05f, 9.77f, 18.1f, 9.77f, 22.15f, 0f)
                arcTo(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.38f, 16.38f)
                close()
                moveTo(5f, 10f)
                curveToRelative(0.25f, -5.29f, 5.75f, -5.28f, 6f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 10f)
                close()
                moveTo(17.84f, 15.54f)
                arcTo(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                arcToRelative(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.85f, -3.46f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 14.02f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcToRelative(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -0.98f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.84f, 15.54f)
                close()
                moveTo(18f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                curveToRelative(0f, -1.89f, 1.23f, -4f, 3f, -4f)
                reflectiveCurveToRelative(3f, 2.11f, 3f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11f)
                close()
            }
        }.also { _GrinTears = it}
