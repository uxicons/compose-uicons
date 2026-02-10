package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Euro: ImageVector? = null

val Icons.Rs.Euro: ImageVector
    get() = _Euro ?: UXIcon(name = "Euro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.4f, 15f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.05f)
                curveToRelative(-0.03f, -0.33f, -0.05f, -0.66f, -0.05f, -1f)
                reflectiveCurveToRelative(0.02f, -0.67f, 0.05f, -1f)
                horizontalLineToRelative(-2.05f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.4f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.86f, -4.64f)
                lineToRelative(-1.54f, 1.27f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17.25f, 3.36f)
                horizontalLineToRelative(11.54f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11.95f)
                arcToRelative(9.83f, 9.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(11.95f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11.54f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 3.36f)
                lineToRelative(1.54f, 1.27f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20.86f, -4.64f)
                close()
            }
        }.also { _Euro = it}
