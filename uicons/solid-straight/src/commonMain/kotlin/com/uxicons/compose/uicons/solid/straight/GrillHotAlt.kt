package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrillHotAlt: ImageVector? = null

val Icons.Ss.GrillHotAlt: ImageVector
    get() = _GrillHotAlt ?: UXIcon(name = "GrillHotAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 4f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(17f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                lineTo(17f, 0f)
                close()
                moveTo(9f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                lineTo(9f, 0f)
                close()
                moveTo(17.85f, 17.47f)
                lineToRelative(3.27f, 6.53f)
                horizontalLineToRelative(-2.24f)
                lineToRelative(-1f, -2f)
                horizontalLineToRelative(-7.93f)
                curveToRelative(0.02f, -0.17f, 0.05f, -0.33f, 0.05f, -0.5f)
                curveToRelative(0f, -0.53f, -0.11f, -1.03f, -0.28f, -1.5f)
                horizontalLineToRelative(7.16f)
                lineToRelative(-1f, -2f)
                horizontalLineToRelative(-7.76f)
                lineToRelative(-0.86f, 1.72f)
                curveToRelative(0.46f, 0.45f, 0.74f, 1.08f, 0.74f, 1.78f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.34f, 1.05f, -2.44f, 2.38f, -2.5f)
                lineToRelative(0.77f, -1.54f)
                curveTo(2.38f, 15.36f, 0f, 11.35f, 0f, 7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 4.35f, -2.38f, 8.36f, -6.15f, 10.47f)
                close()
            }
        }.also { _GrillHotAlt = it}
