package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CastleTower: ImageVector? = null

val Icons.Bs.CastleTower: ImageVector
    get() = _CastleTower ?: UXIcon(name = "CastleTower") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 21f)
                verticalLineToRelative(-21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-3f)
                close()
                moveTo(8f, 6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(13.5f, 9.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(13.5f, 16.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _CastleTower = it}
