package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellHeart: ImageVector? = null

val Icons.Bs.DumbbellHeart: ImageVector
    get() = _DumbbellHeart ?: UXIcon(name = "DumbbellHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                lineTo(6f, 19f)
                verticalLineToRelative(5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-2f)
                lineTo(1f, 22f)
                verticalLineToRelative(-3f)
                lineTo(0f, 19f)
                verticalLineToRelative(-3f)
                lineTo(1f, 16f)
                verticalLineToRelative(-3f)
                lineTo(3f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(12f, 10.8f)
                reflectiveCurveToRelative(6f, -4.04f, 6f, -7.5f)
                curveToRelative(0f, -1.82f, -1.34f, -3.3f, -3f, -3.3f)
                reflectiveCurveToRelative(-3f, 1.48f, -3f, 3.3f)
                curveToRelative(0f, -1.82f, -1.34f, -3.3f, -3f, -3.3f)
                reflectiveCurveToRelative(-3f, 1.48f, -3f, 3.3f)
                curveToRelative(0f, 3.46f, 6f, 7.5f, 6f, 7.5f)
                close()
            }
        }.also { _DumbbellHeart = it}
