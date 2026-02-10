package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiAlt: ImageVector? = null

val Icons.Ss.WifiAlt: ImageVector
    get() = _WifiAlt ?: UXIcon(name = "WifiAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.64f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveTo(21.17f, 19.46f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.07f, 0f)
                lineToRelative(1.41f, 1.41f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                close()
                moveTo(24f, 16.64f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.73f, 0f)
                lineToRelative(1.42f, 1.41f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.9f, 0f)
                close()
                moveTo(8.44f, 16.64f)
                lineTo(9.86f, 15.22f)
                arcToRelative(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.14f, -1.18f)
                verticalLineToRelative(-0.04f)
                curveToRelative(0f, -3.74f, -2.62f, -5.97f, -6.21f, -6.79f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.79f, 1.79f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 10.33f)
                horizontalLineToRelative(9.18f)
                close()
            }
        }.also { _WifiAlt = it}
