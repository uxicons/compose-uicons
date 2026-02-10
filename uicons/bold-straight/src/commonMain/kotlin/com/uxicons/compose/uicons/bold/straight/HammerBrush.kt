package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HammerBrush: ImageVector? = null

val Icons.Bs.HammerBrush: ImageVector
    get() = _HammerBrush ?: UXIcon(name = "HammerBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.07f, 13.61f)
                lineToRelative(-2.5f, -1.25f)
                curveToRelative(0.57f, -2.61f, 0.93f, -5.5f, 0.93f, -6.36f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.85f, 0.36f, 3.75f, 0.93f, 6.36f)
                lineToRelative(-2.5f, 1.25f)
                curveToRelative(-1.19f, 0.6f, -1.94f, 1.8f, -1.94f, 3.13f)
                verticalLineToRelative(7.26f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-7.26f)
                curveToRelative(0f, -1.33f, -0.74f, -2.53f, -1.94f, -3.13f)
                close()
                moveTo(17.5f, 4.75f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                close()
                moveTo(17.44f, 21f)
                lineToRelative(-0.94f, -2.5f)
                lineToRelative(-0.94f, 2.5f)
                horizontalLineToRelative(-1.56f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.56f)
                close()
                moveTo(10f, 5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.98f)
                lineToRelative(0.48f, 14f)
                horizontalLineToRelative(-4f)
                lineToRelative(0.48f, -14f)
                lineTo(0f, 5f)
                verticalLineToRelative(-1f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                lineTo(10f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _HammerBrush = it}
