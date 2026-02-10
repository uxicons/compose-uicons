package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vihara: ImageVector? = null

val Icons.Rs.Vihara: ImageVector
    get() = _Vihara ?: UXIcon(name = "Vihara") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 13.33f)
                verticalLineToRelative(-3.33f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(-2.72f, 0f, -3.99f, -5.9f, -4f, -5.95f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                reflectiveCurveToRelative(0f, -2f, 0f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.02f)
                curveToRelative(-0.01f, 0.05f, -1.21f, 5.98f, -4f, 5.98f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.08f)
                curveToRelative(-0.15f, 1.74f, -1.8f, 5.92f, -4f, 5.92f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -3.64f, -3.78f, -4f, -5.67f)
                close()
                moveTo(7.58f, 4f)
                horizontalLineToRelative(8.85f)
                curveToRelative(0.29f, 0.98f, 0.91f, 2.66f, 1.96f, 4f)
                lineTo(5.62f, 8f)
                curveToRelative(1.05f, -1.34f, 1.66f, -3.02f, 1.96f, -4f)
                close()
                moveTo(18f, 10f)
                verticalLineToRelative(3f)
                lineTo(6f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                close()
                moveTo(3.62f, 19f)
                curveToRelative(1.05f, -1.34f, 1.67f, -3.02f, 1.96f, -4f)
                horizontalLineToRelative(12.78f)
                curveToRelative(0.3f, 0.97f, 0.93f, 2.66f, 1.99f, 4f)
                lineTo(3.62f, 19f)
                close()
            }
        }.also { _Vihara = it}
