package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawnAlt: ImageVector? = null

val Icons.Ts.ChessPawnAlt: ImageVector
    get() = _ChessPawnAlt ?: UXIcon(name = "ChessPawnAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 19f)
                curveToRelative(-2.18f, 0f, -4.5f, -3.85f, -4.5f, -11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(0.84f, -0.73f, 1.38f, -1.8f, 1.38f, -3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.2f, 0.54f, 2.27f, 1.38f, 3f)
                horizontalLineToRelative(-2.38f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 7.14f, -2.32f, 11f, -4.5f, 11f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                lineTo(22f, 24f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9f, 4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
                moveTo(10f, 8f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 5.19f, 1.22f, 9.22f, 3.15f, 11f)
                lineTo(6.85f, 19f)
                curveToRelative(1.93f, -1.78f, 3.15f, -5.81f, 3.15f, -11f)
                close()
                moveTo(21f, 23f)
                lineTo(3f, 23f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _ChessPawnAlt = it}
