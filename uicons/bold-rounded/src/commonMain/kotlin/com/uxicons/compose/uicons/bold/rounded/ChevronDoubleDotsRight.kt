package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsRight: ImageVector? = null

val Icons.Br.ChevronDoubleDotsRight: ImageVector
    get() = _ChevronDoubleDotsRight ?: UXIcon(name = "ChevronDoubleDotsRight") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.5f, 13.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(5.5f, 10.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(1.5f, 10.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(17f, 12f)
            curveToRelative(0f, -1.2f, -0.47f, -2.33f, -1.31f, -3.17f)
            lineToRelative(-4.33f, -4.38f)
            curveToRelative(-0.58f, -0.59f, -1.53f, -0.59f, -2.12f, -0.01f)
            curveToRelative(-0.59f, 0.58f, -0.6f, 1.53f, -0.01f, 2.12f)
            lineToRelative(4.33f, 4.39f)
            curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
            reflectiveCurveToRelative(-0.16f, 0.78f, -0.45f, 1.07f)
            lineToRelative(-4.33f, 4.38f)
            curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0.01f, 2.12f)
            curveToRelative(0.59f, 0.58f, 1.54f, 0.58f, 2.12f, -0.01f)
            lineToRelative(4.32f, -4.37f)
            curveToRelative(0.85f, -0.85f, 1.32f, -1.98f, 1.32f, -3.18f)
            close()
            moveTo(22.69f, 8.82f)
            lineTo(15.37f, 1.44f)
            curveToRelative(-0.58f, -0.59f, -1.53f, -0.59f, -2.12f, -0.01f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
            lineToRelative(7.32f, 7.38f)
            curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
            reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
            lineToRelative(-7.31f, 7.38f)
            curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0.01f, 2.12f)
            curveToRelative(0.59f, 0.58f, 1.54f, 0.58f, 2.12f, -0.01f)
            lineToRelative(7.31f, -7.37f)
            curveToRelative(0.85f, -0.85f, 1.32f, -1.98f, 1.32f, -3.18f)
            reflectiveCurveToRelative(-0.47f, -2.33f, -1.31f, -3.18f)
            close()
        }
    }.also { _ChevronDoubleDotsRight = it }
