package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Features: ImageVector? = null

val Icons.Rs.Features: ImageVector
    get() = _Features ?: UXIcon(name = "Features") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.92f)
                lineToRelative(-3.3f, 1.91f)
                lineToRelative(1.33f, 4.03f)
                lineToRelative(-0.75f, 0.52f)
                lineToRelative(-3.26f, -2.52f)
                lineToRelative(-3.27f, 2.53f)
                lineToRelative(-0.72f, -0.54f)
                lineToRelative(1.3f, -4.08f)
                lineToRelative(-3.32f, -1.85f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(4.35f)
                lineToRelative(1.18f, -4.5f)
                horizontalLineToRelative(0.97f)
                lineToRelative(1.18f, 4.5f)
                horizontalLineToRelative(4.33f)
                verticalLineToRelative(0.92f)
                close()
                moveTo(5f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(12f, 9f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(11.13f)
                curveToRelative(-0.92f, 0.51f, -1.72f, 1.19f, -2.37f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(17.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3.07f)
                curveToRelative(0.33f, 0.04f, 0.66f, 0.07f, 1f, 0.07f)
                reflectiveCurveToRelative(0.67f, -0.03f, 1f, -0.07f)
                verticalLineToRelative(3.07f)
                close()
                moveTo(20f, 20f)
                lineTo(7f, 20f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.54f, -0.12f, 1.04f, -0.34f, 1.5f)
                horizontalLineToRelative(12.34f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Features = it}
