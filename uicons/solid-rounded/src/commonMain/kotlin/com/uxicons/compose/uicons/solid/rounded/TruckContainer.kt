package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckContainer: ImageVector? = null

val Icons.Sr.TruckContainer: ImageVector
    get() = _TruckContainer ?: UXIcon(name = "TruckContainer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.94f, 20f)
                curveTo(5.53f, 23.95f, -0.53f, 23.95f, 0.06f, 20f)
                close()
                moveTo(22.63f, 7.74f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.84f, 5f)
                lineTo(16f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7.72f)
                curveTo(23.69f, 10.92f, 22.63f, 7.74f, 22.63f, 7.74f)
                close()
                moveTo(16f, 13f)
                verticalLineToRelative(3f)
                lineTo(1f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(20f, 18f)
                curveToRelative(2.74f, -0.03f, 4.3f, -2.42f, 4f, -5f)
                close()
                moveTo(6.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(15.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(14f, 5.5f)
                lineTo(14f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(1f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(0f, 5.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 1f)
                horizontalLineToRelative(5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5.5f)
                close()
                moveTo(4f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(8f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(12f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
            }
        }.also { _TruckContainer = it}
