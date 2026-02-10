package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rainbow: ImageVector? = null

val Icons.Rs.Rainbow: ImageVector
    get() = _Rainbow ?: UXIcon(name = "Rainbow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                lineTo(22f, 21f)
                lineTo(22f, 15f)
                curveTo(21.45f, 1.73f, 2.55f, 1.74f, 2f, 15f)
                verticalLineToRelative(6f)
                lineTo(0f, 21f)
                lineTo(0f, 15f)
                curveTo(0.66f, -0.92f, 23.34f, -0.91f, 24f, 15f)
                close()
                moveTo(20f, 15f)
                curveTo(19.6f, 4.4f, 4.4f, 4.41f, 4f, 15f)
                verticalLineToRelative(6f)
                lineTo(6f, 21f)
                lineTo(6f, 15f)
                curveToRelative(0.25f, -7.93f, 11.75f, -7.93f, 12f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                lineTo(10f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Rainbow = it}
