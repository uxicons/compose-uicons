package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketballHoop: ImageVector? = null

val Icons.Bs.BasketballHoop: ImageVector
    get() = _BasketballHoop ?: UXIcon(name = "BasketballHoop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                lineTo(24f, 4.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 0f)
                lineTo(4.5f, 0f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.5f)
                lineTo(0f, 18f)
                lineTo(5.7f, 18f)
                lineTo(6f, 20.59f)
                lineTo(6f, 24f)
                lineTo(9f, 24f)
                lineTo(9f, 22f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 22f)
                lineTo(15f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(18f, 20.81f)
                lineTo(18.32f, 18f)
                close()
                moveTo(3f, 15f)
                lineTo(3f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 3f)
                horizontalLineToRelative(15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4.5f)
                lineTo(21f, 15f)
                lineTo(18.67f, 15f)
                lineToRelative(0.35f, -3f)
                lineTo(5.01f, 12f)
                lineToRelative(0.35f, 3f)
                close()
                moveTo(15.19f, 19f)
                lineTo(8.84f, 19f)
                lineToRelative(-0.46f, -4f)
                lineTo(15.65f, 15f)
                close()
                moveTo(17f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 6f)
                lineTo(17f, 6f)
                close()
            }
        }.also { _BasketballHoop = it}
