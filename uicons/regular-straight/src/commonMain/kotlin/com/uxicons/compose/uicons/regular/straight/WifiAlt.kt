package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiAlt: ImageVector? = null

val Icons.Rs.WifiAlt: ImageVector
    get() = _WifiAlt ?: UXIcon(name = "WifiAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveTo(15.54f, 19.46f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.07f, 0f)
                lineToRelative(1.41f, 1.41f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                close()
                moveTo(18.36f, 16.64f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.73f, 0f)
                lineToRelative(1.41f, 1.41f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.9f, 0f)
                close()
                moveTo(17.79f, 7.21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.79f, 1.79f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 10.33f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0f, -0.05f, 0.01f, -0.1f, 0.02f, -0.16f)
                lineToRelative(-1.84f, -1.84f)
                horizontalLineToRelative(-1.67f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.87f, -6.87f)
                lineToRelative(1.4f, -0.36f)
                lineToRelative(0.03f, -0.02f)
                lineToRelative(-0.88f, -1.19f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.18f, -3.56f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.94f, -0.8f)
                lineToRelative(0.1f, 0.76f)
                lineToRelative(0.76f, 0.1f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.1f, 11.86f)
                lineToRelative(-1.92f, 1.92f)
                curveToRelative(0f, 0.05f, 0.02f, 0.1f, 0.02f, 0.16f)
                horizontalLineToRelative(1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.79f, -15.79f)
                close()
            }
        }.also { _WifiAlt = it}
