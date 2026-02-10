package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarGarage: ImageVector? = null

val Icons.Ss.CarGarage: ImageVector
    get() = _CarGarage ?: UXIcon(name = "CarGarage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.29f, 16f)
                arcTo(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 18.6f)
                lineTo(1f, 22f)
                lineTo(3f, 22f)
                verticalLineToRelative(2f)
                lineTo(8f, 24f)
                lineTo(8f, 22f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                lineTo(21f, 22f)
                horizontalLineToRelative(2f)
                lineTo(23f, 18.6f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, -2.6f)
                close()
                moveTo(18f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 18f)
                close()
                moveTo(6f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18f)
                close()
                moveTo(21.73f, 13.23f)
                curveToRelative(0.12f, 0.25f, 0.22f, 0.51f, 0.33f, 0.77f)
                lineTo(1.94f, 14f)
                curveToRelative(0.11f, -0.26f, 0.2f, -0.52f, 0.33f, -0.77f)
                lineTo(4.55f, 8.66f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 7f)
                horizontalLineToRelative(9.53f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.68f, 1.66f)
                close()
                moveTo(23.94f, 5.53f)
                lineTo(23.06f, 7.33f)
                lineTo(12.44f, 2.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.88f, 0f)
                lineTo(0.94f, 7.32f)
                lineTo(0.06f, 5.53f)
                lineTo(10.68f, 0.31f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.65f, 0f)
                close()
            }
        }.also { _CarGarage = it}
