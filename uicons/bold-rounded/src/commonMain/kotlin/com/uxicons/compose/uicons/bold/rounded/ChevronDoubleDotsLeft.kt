package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsLeft: ImageVector? = null

val Icons.Br.ChevronDoubleDotsLeft: ImageVector
    get() = _ChevronDoubleDotsLeft ?: UXIcon(name = "ChevronDoubleDotsLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 12f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(18.5f, 10.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(22.5f, 10.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(10.44f, 13.06f)
            curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
            reflectiveCurveToRelative(0.16f, -0.78f, 0.45f, -1.07f)
            lineToRelative(4.33f, -4.38f)
            curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
            curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.01f)
            lineToRelative(-4.32f, 4.37f)
            curveToRelative(-0.85f, 0.85f, -1.32f, 1.98f, -1.32f, 3.18f)
            reflectiveCurveToRelative(0.47f, 2.33f, 1.31f, 3.17f)
            lineToRelative(4.33f, 4.38f)
            curveToRelative(0.58f, 0.59f, 1.53f, 0.59f, 2.12f, 0.01f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.53f, 0.01f, -2.12f)
            lineToRelative(-4.33f, -4.39f)
            close()
            moveTo(3.44f, 13.06f)
            curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
            reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
            lineToRelative(7.31f, -7.38f)
            curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
            reflectiveCurveToRelative(-1.54f, -0.58f, -2.12f, 0.01f)
            lineToRelative(-7.3f, 7.37f)
            curveToRelative(-0.85f, 0.85f, -1.32f, 1.98f, -1.32f, 3.18f)
            reflectiveCurveToRelative(0.47f, 2.33f, 1.31f, 3.18f)
            lineToRelative(7.32f, 7.38f)
            curveToRelative(0.58f, 0.59f, 1.53f, 0.59f, 2.12f, 0.01f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.53f, 0.01f, -2.12f)
            close()
        }
    }.also { _ChevronDoubleDotsLeft = it }
