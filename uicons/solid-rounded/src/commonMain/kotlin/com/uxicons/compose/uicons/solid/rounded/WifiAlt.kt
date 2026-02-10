package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiAlt: ImageVector? = null

val Icons.Sr.WifiAlt: ImageVector
    get() = _WifiAlt ?: UXIcon(name = "WifiAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveTo(20.54f, 20.88f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.07f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.41f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                close()
                moveTo(23.36f, 18.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.73f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.41f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.9f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                close()
                moveTo(9.22f, 19.46f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.24f)
                arcToRelative(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.76f, -0.72f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.62f, -7.14f)
                arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.72f, -0.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.49f, 0.84f)
                arcToRelative(7.65f, 7.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 5.18f)
                arcToRelative(5.45f, 5.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.89f, 5.65f)
                arcToRelative(5.84f, 5.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 4.7f)
                horizontalLineToRelative(7.1f)
                curveToRelative(-1.67f, -1.65f, -3.3f, -3.27f, -3.56f, -3.54f)
                close()
            }
        }.also { _WifiAlt = it}
