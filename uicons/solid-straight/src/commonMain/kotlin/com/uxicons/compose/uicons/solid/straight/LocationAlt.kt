package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationAlt: ImageVector? = null

val Icons.Ss.LocationAlt: ImageVector
    get() = _LocationAlt ?: UXIcon(name = "LocationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 10.01f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17.07f, -7.07f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, 14.15f)
                lineToRelative(5.03f, 4.92f)
                horizontalLineToRelative(-4.96f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.96f)
                lineToRelative(5.03f, -4.92f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.93f, -7.07f)
                close()
                moveTo(17f, 12.62f)
                lineTo(12f, 15.12f)
                lineTo(7f, 12.62f)
                verticalLineToRelative(-6.24f)
                lineToRelative(5f, -2.5f)
                lineToRelative(5f, 2.5f)
                close()
                moveTo(12f, 9f)
                lineTo(15f, 7.5f)
                verticalLineToRelative(3.88f)
                lineToRelative(-3f, 1.5f)
                lineToRelative(-3f, -1.5f)
                verticalLineToRelative(-3.88f)
                close()
            }
        }.also { _LocationAlt = it}
