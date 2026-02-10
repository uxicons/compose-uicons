package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarMechanic: ImageVector? = null

val Icons.Ss.CarMechanic: ImageVector
    get() = _CarMechanic ?: UXIcon(name = "CarMechanic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.73f, 13.23f)
                curveToRelative(0.12f, 0.25f, 0.22f, 0.51f, 0.33f, 0.77f)
                lineTo(1.94f, 14f)
                curveToRelative(0.11f, -0.26f, 0.2f, -0.52f, 0.33f, -0.77f)
                lineTo(4.55f, 8.66f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 7f)
                horizontalLineToRelative(9.53f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.68f, 1.66f)
                close()
                moveTo(21f, 2f)
                horizontalLineToRelative(2.82f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.63f, 0f)
                lineTo(5.82f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.18f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 4f)
                lineTo(0.18f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.82f, 4f)
                lineTo(18.18f, 4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 0f)
                lineTo(21f, 4f)
                close()
                moveTo(22.7f, 16f)
                arcToRelative(11.96f, 11.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.3f, 2.6f)
                lineTo(23f, 22f)
                lineTo(21f, 22f)
                verticalLineToRelative(2f)
                lineTo(16f, 24f)
                lineTo(16f, 22f)
                lineTo(8f, 22f)
                verticalLineToRelative(2f)
                lineTo(3f, 24f)
                lineTo(3f, 22f)
                lineTo(1f, 22f)
                lineTo(1f, 18.6f)
                arcTo(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.29f, 16f)
                close()
                moveTo(18f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20f)
                close()
                moveTo(6f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                close()
            }
        }.also { _CarMechanic = it}
