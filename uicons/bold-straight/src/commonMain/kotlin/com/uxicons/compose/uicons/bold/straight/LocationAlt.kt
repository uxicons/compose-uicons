package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationAlt: ImageVector? = null

val Icons.Bs.LocationAlt: ImageVector
    get() = _LocationAlt ?: UXIcon(name = "LocationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.07f, 2.94f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14.13f, 14.15f)
                lineToRelative(4f, 3.91f)
                horizontalLineToRelative(-3.94f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.94f)
                lineToRelative(4.01f, -3.92f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -14.14f)
                close()
                moveTo(16.96f, 14.94f)
                lineTo(12f, 19.8f)
                lineTo(7.05f, 14.96f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.91f, -0.01f)
                close()
                moveTo(7f, 7.08f)
                verticalLineToRelative(6.23f)
                lineToRelative(5f, 2.5f)
                lineToRelative(5f, -2.5f)
                verticalLineToRelative(-6.23f)
                lineToRelative(-5f, -2.5f)
                close()
                moveTo(12f, 12.46f)
                lineTo(10f, 11.46f)
                verticalLineToRelative(-2.7f)
                lineToRelative(2f, 1f)
                lineToRelative(2f, -1f)
                verticalLineToRelative(2.7f)
                close()
            }
        }.also { _LocationAlt = it}
