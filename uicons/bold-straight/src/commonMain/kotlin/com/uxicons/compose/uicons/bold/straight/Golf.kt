package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golf: ImageVector? = null

val Icons.Bs.Golf: ImageVector
    get() = _Golf ?: UXIcon(name = "Golf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                arcToRelative(21.7f, 21.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0.21f)
                verticalLineToRelative(-3.19f)
                lineToRelative(5f, -2.52f)
                lineToRelative(-6f, -4.37f)
                arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 1.39f)
                verticalLineToRelative(9.36f)
                curveToRelative(-3.64f, 1.18f, -6f, 3.42f, -6f, 6.12f)
                curveToRelative(0f, 3.99f, 5.16f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.01f, 12f, -7f)
                reflectiveCurveToRelative(-5.16f, -7f, -12f, -7f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.15f, 0f, -9f, -2.11f, -9f, -4f)
                curveToRelative(0f, -1.02f, 1.14f, -2.11f, 3f, -2.9f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.75f)
                arcToRelative(17.71f, 17.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -0.25f)
                curveToRelative(5.15f, 0f, 9f, 2.11f, 9f, 4f)
                reflectiveCurveToRelative(-3.85f, 4f, -9f, 4f)
                close()
                moveTo(17f, 17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
            }
        }.also { _Golf = it}
