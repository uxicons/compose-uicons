package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rainbow: ImageVector? = null

val Icons.Bs.Rainbow: ImageVector
    get() = _Rainbow ?: UXIcon(name = "Rainbow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                lineTo(21f, 21f)
                lineTo(21f, 15f)
                curveTo(20.53f, 3.07f, 3.47f, 3.08f, 3f, 15f)
                verticalLineToRelative(6f)
                lineTo(0f, 21f)
                lineTo(0f, 15f)
                curveTo(0.66f, -0.92f, 23.34f, -0.91f, 24f, 15f)
                close()
                moveTo(19f, 15f)
                curveTo(18.67f, 5.73f, 5.33f, 5.74f, 5f, 15f)
                verticalLineToRelative(6f)
                lineTo(8f, 21f)
                lineTo(8f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                close()
                moveTo(14f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _Rainbow = it}
