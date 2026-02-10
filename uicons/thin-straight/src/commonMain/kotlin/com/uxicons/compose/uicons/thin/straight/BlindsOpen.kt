package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlindsOpen: ImageVector? = null

val Icons.Ts.BlindsOpen: ImageVector
    get() = _BlindsOpen ?: UXIcon(name = "BlindsOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(-1f)
                lineTo(19f, 5f)
                verticalLineToRelative(1f)
                close()
                moveTo(19f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(1f)
                lineTo(19f, 11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(1f)
                lineTo(19f, 16f)
                verticalLineToRelative(-1f)
                close()
                moveTo(0f, 21f)
                lineTo(17f, 21f)
                verticalLineToRelative(-1f)
                lineTo(0f, 20f)
                verticalLineToRelative(1f)
                close()
                moveTo(24f, 21.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
                lineTo(21f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(0f, 1f)
                lineTo(0f, 0f)
                lineTo(19.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(22f, 19.05f)
                curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
                close()
                moveTo(23f, 21.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _BlindsOpen = it}
