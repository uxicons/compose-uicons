package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsUp: ImageVector? = null

val Icons.Ss.ChevronDoubleDotsUp: ImageVector
    get() = _ChevronDoubleDotsUp ?: UXIcon(name = "ChevronDoubleDotsUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 12.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(10.53f, 6.1f)
                lineTo(3.44f, 12.77f)
                lineTo(4.81f, 14.23f)
                lineTo(11.98f, 7.45f)
                lineTo(19.19f, 14.23f)
                lineTo(20.56f, 12.77f)
                lineTo(13.49f, 6.12f)
                curveToRelative(-0.79f, -0.8f, -2.2f, -0.77f, -2.95f, -0.02f)
                close()
                moveTo(13.48f, 0.62f)
                curveToRelative(-0.82f, -0.82f, -2.15f, -0.82f, -2.95f, -0.02f)
                lineToRelative(-9.72f, 9.18f)
                lineToRelative(1.37f, 1.45f)
                lineToRelative(9.82f, -9.29f)
                lineToRelative(9.81f, 9.29f)
                lineToRelative(1.37f, -1.45f)
                close()
            }
        }.also { _ChevronDoubleDotsUp = it}
