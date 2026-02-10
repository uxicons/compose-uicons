package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golf: ImageVector? = null

val Icons.Rr.Golf: ImageVector
    get() = _Golf ?: UXIcon(name = "Golf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                arcToRelative(20.29f, 20.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.02f, 0.4f)
                lineToRelative(-0.01f, -2.29f)
                lineToRelative(5.01f, -2.08f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, -3.4f)
                arcToRelative(0.84f, 0.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, -0.07f)
                lineToRelative(-4.26f, -2.36f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.9f, 1.79f)
                verticalLineToRelative(8.91f)
                curveToRelative(-3.61f, 1.2f, -6f, 3.45f, -6f, 6.09f)
                curveToRelative(0f, 3.92f, 5.27f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.08f, 12f, -7f)
                reflectiveCurveToRelative(-5.27f, -7f, -12f, -7f)
                close()
                moveTo(12.07f, 4.25f)
                lineTo(7.97f, 5.96f)
                lineTo(7.96f, 1.98f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.42f, 0f, -10f, -2.29f, -10f, -5f)
                curveToRelative(0f, -1.59f, 1.59f, -3.04f, 4f, -3.96f)
                verticalLineToRelative(3.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineToRelative(-0.01f, -4.56f)
                arcToRelative(18.24f, 18.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.01f, -0.44f)
                curveToRelative(5.42f, 0f, 10f, 2.29f, 10f, 5f)
                reflectiveCurveToRelative(-4.58f, 5f, -10f, 5f)
                close()
                moveTo(17f, 17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
            }
        }.also { _Golf = it}
