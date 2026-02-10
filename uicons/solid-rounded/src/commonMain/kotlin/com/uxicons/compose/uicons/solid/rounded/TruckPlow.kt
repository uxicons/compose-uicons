package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPlow: ImageVector? = null

val Icons.Sr.TruckPlow: ImageVector
    get() = _TruckPlow ?: UXIcon(name = "TruckPlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.69f, 22.74f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -0.06f)
                arcTo(8.67f, 8.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 16.82f)
                lineTo(20f, 16f)
                lineTo(18f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(2f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                lineTo(0f, 15f)
                arcToRelative(3.85f, 3.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                lineTo(14f, 11f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.87f, 3f)
                lineTo(20f, 14f)
                verticalLineToRelative(-0.82f)
                arcToRelative(8.66f, 8.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.27f, -5.86f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.48f, 1.35f)
                arcTo(6.67f, 6.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13.18f)
                verticalLineToRelative(3.64f)
                arcToRelative(6.67f, 6.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, 4.51f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.69f, 22.74f)
                close()
                moveTo(14.87f, 9.06f)
                lineTo(11.44f, 4.14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.34f, 2f)
                lineTo(6.5f, 2f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.5f)
                lineTo(4f, 9f)
                lineTo(14f, 9f)
                arcTo(6.08f, 6.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.87f, 9.06f)
                close()
                moveTo(2.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(11.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
            }
        }.also { _TruckPlow = it}
