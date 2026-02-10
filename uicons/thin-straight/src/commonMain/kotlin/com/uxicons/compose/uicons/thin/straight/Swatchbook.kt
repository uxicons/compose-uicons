package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swatchbook: ImageVector? = null

val Icons.Ts.Swatchbook: ImageVector
    get() = _Swatchbook ?: UXIcon(name = "Swatchbook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(10f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 0f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(6.93f)
                lineToRelative(4.9f, -4.9f)
                lineToRelative(7.07f, 7.07f)
                lineToRelative(-4.9f, 4.9f)
                horizontalLineToRelative(6.93f)
                close()
                moveTo(9.95f, 19.71f)
                lineToRelative(10.61f, -10.61f)
                lineToRelative(-5.66f, -5.66f)
                lineToRelative(-4.9f, 4.9f)
                verticalLineToRelative(10.66f)
                curveToRelative(0f, 0.24f, -0.02f, 0.48f, -0.05f, 0.71f)
                close()
                moveTo(1f, 6f)
                horizontalLineToRelative(8f)
                lineTo(9f, 1f)
                lineTo(1f, 1f)
                verticalLineToRelative(5f)
                close()
                moveTo(1f, 12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5f)
                lineTo(1f, 7f)
                verticalLineToRelative(5f)
                close()
                moveTo(9f, 19f)
                verticalLineToRelative(-6f)
                lineTo(1f, 13f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(23f, 15f)
                horizontalLineToRelative(-6.93f)
                lineToRelative(-7.54f, 7.54f)
                curveToRelative(-0.17f, 0.17f, -0.35f, 0.32f, -0.54f, 0.46f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-8f)
                close()
            }
        }.also { _Swatchbook = it}
