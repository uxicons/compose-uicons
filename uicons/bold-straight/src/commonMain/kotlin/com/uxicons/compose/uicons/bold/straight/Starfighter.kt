package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Starfighter: ImageVector? = null

val Icons.Bs.Starfighter: ImageVector
    get() = _Starfighter ?: UXIcon(name = "Starfighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                verticalLineToRelative(7f)
                lineTo(16.86f, 13f)
                curveTo(16.53f, 7.84f, 15.46f, 0f, 12f, 0f)
                reflectiveCurveTo(7.47f, 7.84f, 7.14f, 13f)
                lineTo(3f, 13f)
                lineTo(3f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 19.62f)
                lineTo(7.38f, 24f)
                lineTo(10f, 24f)
                lineTo(10f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.68f)
                lineTo(21f, 19.64f)
                lineTo(21f, 21f)
                horizontalLineToRelative(3f)
                lineTo(24f, 6f)
                close()
                moveTo(7f, 17.25f)
                verticalLineToRelative(2.13f)
                lineTo(3.62f, 16f)
                horizontalLineToRelative(3.4f)
                curveTo(7f, 16.59f, 7f, 17.03f, 7f, 17.25f)
                close()
                moveTo(10f, 19f)
                lineTo(10f, 17.25f)
                arcTo(55.15f, 55.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.08f, 6.27f)
                arcToRelative(1.71f, 1.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, 0f)
                arcTo(55.15f, 55.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17.25f)
                lineTo(14f, 19f)
                close()
                moveTo(17f, 17.25f)
                curveToRelative(0f, -0.22f, 0f, -0.66f, -0.02f, -1.25f)
                horizontalLineToRelative(3.4f)
                lineTo(17f, 19.41f)
                close()
            }
        }.also { _Starfighter = it}
