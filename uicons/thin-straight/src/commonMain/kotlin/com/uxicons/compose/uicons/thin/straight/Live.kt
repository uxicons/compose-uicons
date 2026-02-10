package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Live: ImageVector? = null

val Icons.Ts.Live: ImageVector
    get() = _Live ?: UXIcon(name = "Live") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(4f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(22f, 9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(9f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(16.72f, 8f)
                horizontalLineToRelative(-0.99f)
                lineToRelative(-1.72f, 6.18f)
                lineToRelative(-1.74f, -6.18f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(2.24f, 8f)
                horizontalLineToRelative(1.03f)
                lineToRelative(2.2f, -8f)
                close()
                moveTo(21.5f, 3f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.68f)
                curveToRelative(0.31f, -0.11f, 0.65f, -0.18f, 1f, -0.18f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                lineTo(1f, 20f)
                verticalLineToRelative(-5f)
                curveToRelative(-0.35f, 0f, -0.69f, -0.07f, -1f, -0.18f)
                verticalLineToRelative(6.18f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _Live = it}
