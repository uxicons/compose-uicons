package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlowest: ImageVector? = null

val Icons.Rr.TachometerAltSlowest: ImageVector
    get() = _TachometerAltSlowest ?: UXIcon(name = "TachometerAltSlowest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.9f, 11.44f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.05f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 17.66f)
                arcTo(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.11f, 23f)
                lineTo(16.88f, 23f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.51f, -1.43f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.9f, 11.44f)
                close()
                moveTo(18.99f, 20.14f)
                arcTo(3.0f, 3.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.88f, 21f)
                lineTo(7.11f, 21f)
                arcToRelative(2.86f, 2.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.98f, -0.74f)
                arcTo(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.34f, 5.54f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.65f, 14.6f)
                close()
                moveTo(20f, 13f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.41f, 5.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.4f, -1.43f)
                curveTo(20.04f, 13.68f, 17.27f, 6.9f, 12f, 7f)
                arcToRelative(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.94f, 5.14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.98f, -0.28f)
                curveTo(5.77f, 2.13f, 19.73f, 3.11f, 20f, 13f)
                close()
                moveTo(14f, 13f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.18f, 1.61f)
                lineTo(5.95f, 16.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.8f, -1.83f)
                lineToRelative(4.87f, -2.14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                close()
            }
        }.also { _TachometerAltSlowest = it}
