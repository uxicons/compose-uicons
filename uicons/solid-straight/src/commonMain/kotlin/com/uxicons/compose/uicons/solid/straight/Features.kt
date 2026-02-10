package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Features: ImageVector? = null

val Icons.Ss.Features: ImageVector
    get() = _Features ?: UXIcon(name = "Features") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 19f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(6.24f, 24f)
                curveToRelative(0.48f, -0.72f, 0.76f, -1.58f, 0.76f, -2.5f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(18.02f, 9.86f)
                lineToRelative(3.26f, 2.52f)
                lineToRelative(0.75f, -0.52f)
                lineToRelative(-1.33f, -4.03f)
                lineToRelative(3.3f, -1.91f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(-4.33f)
                lineToRelative(-1.18f, -4.5f)
                horizontalLineToRelative(-0.97f)
                lineToRelative(-1.18f, 4.5f)
                horizontalLineToRelative(-4.35f)
                verticalLineToRelative(0.92f)
                lineToRelative(3.32f, 1.85f)
                lineToRelative(-1.3f, 4.08f)
                lineToRelative(0.72f, 0.54f)
                lineToRelative(3.27f, -2.53f)
                close()
                moveTo(10.58f, 10f)
                horizontalLineToRelative(-6.58f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.06f)
                curveToRelative(-0.04f, -0.33f, -0.06f, -0.66f, -0.06f, -1f)
                reflectiveCurveToRelative(0.02f, -0.67f, 0.06f, -1f)
                horizontalLineToRelative(-6.06f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.58f)
                curveTo(11.27f, 2.3f, 12.53f, 0.89f, 14.12f, 0.0f)
                curveToRelative(-0.04f, -0.0f, -0.08f, -0.0f, -0.12f, -0.0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(18.36f)
                curveToRelative(0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f)
                curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2.06f)
                curveToRelative(-2.92f, -0.36f, -5.35f, -2.3f, -6.42f, -4.94f)
                close()
                moveTo(9f, 14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Features = it}
