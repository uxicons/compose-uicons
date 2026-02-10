package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltAverage: ImageVector? = null

val Icons.Rs.TachometerAltAverage: ImageVector
    get() = _TachometerAltAverage ?: UXIcon(name = "TachometerAltAverage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(0.37f, 0.98f, -4.41f, 16.17f, 5.11f, 22.82f)
                lineTo(5.37f, 23f)
                lineTo(18.63f, 23f)
                lineToRelative(0.26f, -0.18f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                close()
                moveTo(17.99f, 21f)
                lineTo(6.01f, 21f)
                curveTo(-1.63f, 15.32f, 2.47f, 2.98f, 12f, 3f)
                curveTo(21.53f, 2.98f, 25.63f, 15.32f, 17.99f, 21f)
                close()
                moveTo(14f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -1.73f)
                lineTo(11f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.27f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                close()
                moveTo(9f, 5.54f)
                lineTo(9f, 7.78f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, 9.44f)
                lineToRelative(-1.4f, 1.43f)
                curveTo(2.31f, 14.82f, 3.86f, 7.49f, 9f, 5.54f)
                close()
                moveTo(19.95f, 12.94f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.41f, 5.71f)
                lineToRelative(-1.4f, -1.43f)
                arcTo(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 7.78f)
                lineTo(15f, 5.54f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.95f, 12.94f)
                close()
            }
        }.also { _TachometerAltAverage = it}
