package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guide: ImageVector? = null

val Icons.Ts.Guide: ImageVector
    get() = _Guide ?: UXIcon(name = "Guide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -0.34f, -0.04f, -0.67f, -0.09f, -1f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.85f)
                curveTo(11.32f, 1.67f, 9.11f, 0f, 6.5f, 0f)
                curveTo(3.19f, 0f, 0.5f, 2.69f, 0.5f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(6.5f, 1f)
                curveToRelative(2.04f, 0f, 3.8f, 1.24f, 4.58f, 3f)
                lineTo(1.92f, 4f)
                curveToRelative(0.77f, -1.76f, 2.53f, -3f, 4.58f, -3f)
                close()
                moveTo(1.6f, 5f)
                horizontalLineToRelative(9.8f)
                curveToRelative(0.07f, 0.32f, 0.1f, 0.66f, 0.1f, 1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveTo(1.5f, 8.76f, 1.5f, 6f)
                curveToRelative(0f, -0.34f, 0.04f, -0.68f, 0.1f, -1f)
                close()
                moveTo(12f, 17f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                close()
                moveTo(23.94f, 3.01f)
                lineToRelative(-4.85f, -3.01f)
                horizontalLineToRelative(-1.09f)
                verticalLineToRelative(9.75f)
                lineToRelative(-5.67f, 4.25f)
                lineTo(4f, 14f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8.67f)
                lineToRelative(6.33f, -4.75f)
                verticalLineToRelative(-4.27f)
                lineToRelative(4.94f, -2.98f)
                close()
                moveTo(22.02f, 2.99f)
                lineToRelative(-3.02f, 1.82f)
                lineTo(19f, 1.12f)
                lineToRelative(3.02f, 1.87f)
                close()
            }
        }.also { _Guide = it}
