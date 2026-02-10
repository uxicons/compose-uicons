package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsRight: ImageVector? = null

val Icons.Rs.ChevronDoubleDotsRight: ImageVector
    get() = _ChevronDoubleDotsRight ?: UXIcon(name = "ChevronDoubleDotsRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(1.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 12f)
                curveToRelative(0f, -0.56f, -0.22f, -1.09f, -0.59f, -1.47f)
                lineToRelative(-6.68f, -7.09f)
                lineToRelative(-1.46f, 1.37f)
                lineToRelative(6.78f, 7.17f)
                lineToRelative(-6.78f, 7.21f)
                lineToRelative(1.46f, 1.37f)
                lineToRelative(6.65f, -7.07f)
                curveToRelative(0.4f, -0.4f, 0.62f, -0.93f, 0.62f, -1.49f)
                close()
                moveTo(23.4f, 10.53f)
                lineTo(14.23f, 0.81f)
                lineTo(12.77f, 2.19f)
                lineTo(22.05f, 11.99f)
                lineTo(12.77f, 21.81f)
                lineTo(14.23f, 23.19f)
                lineTo(23.38f, 13.49f)
                curveToRelative(0.4f, -0.4f, 0.62f, -0.92f, 0.62f, -1.49f)
                reflectiveCurveToRelative(-0.22f, -1.09f, -0.6f, -1.47f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _ChevronDoubleDotsRight = it}
