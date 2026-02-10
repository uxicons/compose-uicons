package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hiking: ImageVector? = null

val Icons.Rs.Hiking: ImageVector
    get() = _Hiking ?: UXIcon(name = "Hiking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.48f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.98f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.48f, 2.5f)
                close()
                moveTo(20.98f, 7f)
                lineTo(20.98f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(18.98f, 12f)
                lineTo(15.36f, 12f)
                lineToRelative(-0.91f, -1.81f)
                lineToRelative(-0.79f, 4.03f)
                lineToRelative(-1.81f, -1.18f)
                lineToRelative(0.98f, -5.03f)
                curveToRelative(-0.03f, 0f, -1.96f, -0.01f, -1.96f, -0.01f)
                lineTo(9.84f, 13.37f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.44f, 1.03f)
                lineToRelative(4.71f, 3.06f)
                lineTo(14.98f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(12.98f, 18.54f)
                lineTo(9.19f, 16.08f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.74f, -0.69f)
                arcTo(3.3f, 3.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.47f, 16f)
                curveTo(4.8f, 16f, 3f, 14.75f, 3f, 12f)
                curveTo(3f, 8.64f, 6.04f, 6f, 9.91f, 6f)
                horizontalLineToRelative(2.83f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.68f, 1.66f)
                lineTo(16.6f, 10f)
                lineTo(18.98f, 10f)
                lineTo(18.98f, 7f)
                close()
                moveTo(7.91f, 12.78f)
                horizontalLineToRelative(0f)
                lineTo(8.82f, 8.1f)
                curveTo(6.8f, 8.48f, 5f, 9.87f, 5f, 12f)
                curveToRelative(0f, 1.9f, 1.22f, 2f, 1.47f, 2f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.91f, 12.78f)
                close()
                moveTo(7.94f, 17.64f)
                lineTo(6.85f, 24f)
                lineTo(8.9f, 24f)
                lineToRelative(0.85f, -5.17f)
                lineTo(8.1f, 17.76f)
                curveTo(8.04f, 17.72f, 7.99f, 17.68f, 7.94f, 17.64f)
                close()
            }
        }.also { _Hiking = it}
