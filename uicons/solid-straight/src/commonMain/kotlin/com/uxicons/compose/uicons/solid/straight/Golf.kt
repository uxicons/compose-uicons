package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golf: ImageVector? = null

val Icons.Ss.Golf: ImageVector
    get() = _Golf ?: UXIcon(name = "Golf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(-0.69f, 0f, -1.35f, 0.04f, -2f, 0.1f)
                verticalLineToRelative(6.9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8.95f)
                lineToRelative(6.92f, -3.49f)
                lineToRelative(-6.01f, -4.35f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.9f, 1.79f)
                verticalLineToRelative(8.92f)
                curveToRelative(-3.61f, 1.19f, -6f, 3.44f, -6f, 6.08f)
                curveToRelative(0f, 3.92f, 5.27f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.08f, 12f, -7f)
                reflectiveCurveToRelative(-5.27f, -7f, -12f, -7f)
                close()
                moveTo(15f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                close()
            }
        }.also { _Golf = it}
