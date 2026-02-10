package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarSide: ImageVector? = null

val Icons.Ss.CarSide: ImageVector
    get() = _CarSide ?: UXIcon(name = "CarSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9f)
                lineTo(1.66f, 9f)
                lineTo(3.58f, 3.94f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.38f, 2f)
                lineTo(9f, 2f)
                close()
                moveTo(11f, 9f)
                horizontalLineToRelative(8.82f)
                lineTo(15.84f, 3.29f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.38f, 2f)
                lineTo(11f, 2f)
                close()
                moveTo(24f, 14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(3f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(4f)
                lineTo(24f, 18f)
                close()
                moveTo(7.94f, 20f)
                curveToRelative(0.59f, 3.95f, -5.47f, 3.95f, -4.88f, 0f)
                close()
                moveTo(16.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
            }
        }.also { _CarSide = it}
