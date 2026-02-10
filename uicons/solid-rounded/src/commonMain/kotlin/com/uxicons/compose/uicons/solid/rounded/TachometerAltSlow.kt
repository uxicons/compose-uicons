package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlow: ImageVector? = null

val Icons.Sr.TachometerAltSlow: ImageVector
    get() = _TachometerAltSlow ?: UXIcon(name = "TachometerAltSlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.61f, 21.55f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, 22.98f)
                horizontalLineToRelative(9.77f)
                arcToRelative(4.84f, 4.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, -1.29f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.62f, 1.06f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.01f, 20.5f)
                close()
                moveTo(16.62f, 18.23f)
                curveTo(21.45f, 14.08f, 18.36f, 5.91f, 12f, 5.98f)
                curveToRelative(-0.99f, -0.14f, -2.54f, 0.87f, -2.97f, -0.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.72f, -1.22f)
                curveToRelative(9.1f, -2.31f, 15.23f, 9.25f, 8.19f, 15.47f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, -1.5f)
                close()
                moveTo(10f, 12.98f)
                arcToRelative(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, -0.51f)
                lineTo(6.29f, 8.69f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.71f, 7.27f)
                lineToRelative(3.78f, 3.78f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, 12.98f)
                close()
                moveTo(3f, 12.98f)
                arcToRelative(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.28f, -2.25f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.94f, 0.5f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.16f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 1.5f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12.98f)
                close()
            }
        }.also { _TachometerAltSlow = it}
