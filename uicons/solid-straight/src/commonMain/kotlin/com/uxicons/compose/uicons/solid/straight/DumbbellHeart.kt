package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellHeart: ImageVector? = null

val Icons.Ss.DumbbellHeart: ImageVector
    get() = _DumbbellHeart ?: UXIcon(name = "DumbbellHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.08f, 3.95f)
                curveTo(5.08f, 1.82f, 6.64f, 0.1f, 8.58f, 0.1f)
                reflectiveCurveToRelative(3.5f, 1.72f, 3.5f, 3.85f)
                curveTo(12.08f, 1.82f, 13.64f, 0.1f, 15.58f, 0.1f)
                reflectiveCurveToRelative(3.5f, 1.72f, 3.5f, 3.85f)
                curveToRelative(0f, 4.03f, -7f, 8.75f, -7f, 8.75f)
                curveToRelative(0f, 0f, -7f, -4.72f, -7f, -8.75f)
                close()
                moveTo(24f, 17f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 17f)
                lineTo(6f, 17f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(20f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                close()
                moveTo(1f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(2f)
                lineTo(1f, 19f)
                verticalLineToRelative(3f)
                lineTo(3f, 22f)
                lineTo(3f, 14f)
                lineTo(1f, 14f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _DumbbellHeart = it}
