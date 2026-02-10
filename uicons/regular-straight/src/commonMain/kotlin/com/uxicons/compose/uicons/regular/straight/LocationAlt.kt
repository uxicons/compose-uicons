package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationAlt: ImageVector? = null

val Icons.Rs.LocationAlt: ImageVector
    get() = _LocationAlt ?: UXIcon(name = "LocationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0.01f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.06f, 17.08f)
                lineToRelative(5.03f, 4.92f)
                horizontalLineToRelative(-4.96f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.96f)
                lineToRelative(5.03f, -4.92f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.07f, -17.07f)
                close()
                moveTo(17.66f, 15.65f)
                lineTo(12f, 21.2f)
                lineTo(6.34f, 15.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, -0.01f)
                close()
                moveTo(7f, 6.38f)
                verticalLineToRelative(6.24f)
                lineToRelative(5f, 2.5f)
                lineToRelative(5f, -2.5f)
                verticalLineToRelative(-6.24f)
                lineToRelative(-5f, -2.5f)
                close()
                moveTo(15f, 11.38f)
                lineTo(12f, 12.88f)
                lineTo(9f, 11.38f)
                verticalLineToRelative(-3.76f)
                lineToRelative(0.12f, -0.06f)
                lineToRelative(2.88f, 1.44f)
                lineToRelative(2.88f, -1.44f)
                lineToRelative(0.12f, 0.06f)
                close()
            }
        }.also { _LocationAlt = it}
