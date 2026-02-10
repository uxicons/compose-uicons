package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golf: ImageVector? = null

val Icons.Rs.Golf: ImageVector
    get() = _Golf ?: UXIcon(name = "Golf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                arcToRelative(20.38f, 20.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0.39f)
                verticalLineToRelative(-2.34f)
                lineToRelative(6.92f, -3.49f)
                lineToRelative(-5.88f, -4.26f)
                lineToRelative(-0.13f, -0.09f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.9f, 1.79f)
                verticalLineToRelative(8.91f)
                curveToRelative(-3.61f, 1.2f, -6f, 3.45f, -6f, 6.09f)
                curveToRelative(0f, 3.92f, 5.27f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.08f, 12f, -7f)
                reflectiveCurveToRelative(-5.27f, -7f, -12f, -7f)
                close()
                moveTo(8f, 2.02f)
                lineTo(11.09f, 4.25f)
                lineTo(8f, 5.81f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.42f, 0f, -10f, -2.29f, -10f, -5f)
                curveToRelative(0f, -1.59f, 1.59f, -3.04f, 4f, -3.96f)
                verticalLineToRelative(3.96f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.56f)
                arcToRelative(18.27f, 18.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -0.44f)
                curveToRelative(5.42f, 0f, 10f, 2.29f, 10f, 5f)
                reflectiveCurveToRelative(-4.58f, 5f, -10f, 5f)
                close()
                moveTo(17f, 17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
            }
        }.also { _Golf = it}
