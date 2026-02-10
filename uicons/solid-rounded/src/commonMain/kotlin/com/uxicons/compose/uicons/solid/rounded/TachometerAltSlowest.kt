package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlowest: ImageVector? = null

val Icons.Sr.TachometerAltSlowest: ImageVector
    get() = _TachometerAltSlowest ?: UXIcon(name = "TachometerAltSlowest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 13f)
                arcToRelative(11.88f, 11.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.76f, 8.71f)
                arcTo(4.84f, 4.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.11f, 23f)
                lineTo(16.88f, 23f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.51f, -1.43f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 13f)
                close()
                moveTo(5.11f, 14.88f)
                lineTo(10.02f, 12.76f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.79f, 1.84f)
                lineTo(5.9f, 16.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.79f, -1.84f)
                close()
                moveTo(3.07f, 11.88f)
                arcTo(8.92f, 8.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.64f, 6.64f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.36f, 19.36f)
                curveToRelative(-0.13f, 0.13f, -0.27f, 0.26f, -0.41f, 0.39f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, -1.5f)
                curveToRelative(0.11f, -0.1f, 0.22f, -0.2f, 0.32f, -0.3f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.9f, -9.9f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 4.08f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.99f, -0.25f)
                close()
            }
        }.also { _TachometerAltSlowest = it}
