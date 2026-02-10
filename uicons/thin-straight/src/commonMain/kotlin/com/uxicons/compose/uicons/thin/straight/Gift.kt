package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gift: ImageVector? = null

val Icons.Ts.Gift: ImageVector
    get() = _Gift ?: UXIcon(name = "Gift") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.42f)
                curveToRelative(2.23f, -1.15f, 3.92f, -3.24f, 3.92f, -6f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 3.22f, -2.74f, 5.37f, -5.67f, 5.88f)
                curveToRelative(0.76f, -0.88f, 1.67f, -2.27f, 1.67f, -3.88f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.61f, 0.91f, 3f, 1.67f, 3.88f)
                curveToRelative(-2.93f, -0.51f, -5.67f, -2.66f, -5.67f, -5.88f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 2.76f, 1.69f, 4.85f, 3.92f, 6f)
                lineTo(2.5f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.72f, -1.37f, 3.23f, -2f, 3.83f)
                curveToRelative(-0.63f, -0.6f, -2f, -2.11f, -2f, -3.83f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(1f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(4f)
                lineTo(1f, 12f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(3f, 13f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(10f)
                lineTo(3f, 23f)
                verticalLineToRelative(-10f)
                close()
                moveTo(21f, 23f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(10f)
                close()
                moveTo(23f, 12f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _Gift = it}
