package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarGarage: ImageVector? = null

val Icons.Rs.CarGarage: ImageVector
    get() = _CarGarage ?: UXIcon(name = "CarGarage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.45f, 8.66f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.76f, 7f)
                lineTo(7.24f, 7f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.55f, 8.66f)
                lineTo(2.27f, 13.23f)
                arcTo(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 18.6f)
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
                arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.27f, -5.37f)
                close()
                moveTo(6.35f, 9.56f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 9f)
                horizontalLineToRelative(9.53f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, 0.55f)
                lineTo(19.88f, 14f)
                lineTo(4.12f, 14f)
                close()
                moveTo(21f, 20f)
                lineTo(3f, 20f)
                lineTo(3f, 18.6f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.35f, 16f)
                lineTo(5f, 16f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(7f, 16f)
                lineTo(17f, 16f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(19f, 16f)
                horizontalLineToRelative(1.66f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18.6f)
                close()
                moveTo(23.94f, 5.53f)
                lineToRelative(-0.88f, 1.8f)
                lineTo(12.44f, 2.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.88f, 0f)
                lineTo(0.94f, 7.32f)
                lineTo(0.06f, 5.53f)
                lineTo(10.68f, 0.31f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.65f, 0f)
                close()
            }
        }.also { _CarGarage = it}
