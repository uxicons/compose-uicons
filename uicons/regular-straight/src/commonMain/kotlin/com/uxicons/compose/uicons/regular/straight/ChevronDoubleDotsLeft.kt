package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsLeft: ImageVector? = null

val Icons.Rs.ChevronDoubleDotsLeft: ImageVector
    get() = _ChevronDoubleDotsLeft ?: UXIcon(name = "ChevronDoubleDotsLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.23f, 4.81f)
                lineToRelative(-6.78f, 7.21f)
                lineToRelative(6.78f, 7.16f)
                lineToRelative(-1.46f, 1.37f)
                lineToRelative(-6.68f, -7.09f)
                curveToRelative(-0.38f, -0.37f, -0.59f, -0.9f, -0.59f, -1.47f)
                reflectiveCurveToRelative(0.22f, -1.09f, 0.62f, -1.49f)
                lineToRelative(6.66f, -7.07f)
                close()
                moveTo(11.23f, 2.19f)
                lineTo(9.77f, 0.81f)
                lineTo(0.62f, 10.51f)
                curveToRelative(-0.82f, 0.82f, -0.82f, 2.15f, -0.02f, 2.95f)
                lineToRelative(9.18f, 9.72f)
                lineToRelative(1.45f, -1.37f)
                lineToRelative(-9.29f, -9.81f)
                close()
                moveTo(17.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(11f, 12f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(22.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ChevronDoubleDotsLeft = it}
