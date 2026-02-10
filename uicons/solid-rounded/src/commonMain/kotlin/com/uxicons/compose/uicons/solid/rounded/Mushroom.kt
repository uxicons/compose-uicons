package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mushroom: ImageVector? = null

val Icons.Sr.Mushroom: ImageVector
    get() = _Mushroom ?: UXIcon(name = "Mushroom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.23f, 15.37f)
                arcTo(18.97f, 18.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 19f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 19f)
                arcToRelative(19.02f, 19.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.77f, -3.63f)
                curveTo(10.84f, 13.62f, 13.16f, 13.62f, 16.23f, 15.37f)
                close()
                moveTo(21.05f, 14.98f)
                close()
                moveTo(24f, 11.33f)
                curveTo(24f, 5.08f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.08f, 0f, 11.33f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.95f, 2.9f)
                curveToRelative(1.66f, 1.49f, 3.6f, 0.5f, 5.62f, -0.5f)
                arcTo(12.75f, 12.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                curveToRelative(3.17f, -0.1f, 6.19f, 2.76f, 9.05f, 2.98f)
                curveTo(23.12f, 14.95f, 24f, 13.48f, 24f, 11.33f)
                close()
            }
        }.also { _Mushroom = it}
