package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsUp: ImageVector? = null

val Icons.Br.ChevronDoubleDotsUp: ImageVector
    get() = _ChevronDoubleDotsUp ?: UXIcon(name = "ChevronDoubleDotsUp") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.5f, 14.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(12f, 17f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(15.18f, 8.32f)
            curveToRelative(-0.85f, -0.85f, -1.98f, -1.32f, -3.18f, -1.32f)
            reflectiveCurveToRelative(-2.33f, 0.47f, -3.17f, 1.31f)
            lineToRelative(-4.38f, 4.33f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
            curveToRelative(0.58f, 0.59f, 1.53f, 0.59f, 2.12f, 0.01f)
            lineToRelative(4.39f, -4.33f)
            curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.13f, 0.01f)
            lineToRelative(4.38f, 4.33f)
            curveToRelative(0.59f, 0.58f, 1.54f, 0.58f, 2.12f, -0.01f)
            curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
            close()
            moveTo(22.56f, 8.62f)
            lineTo(15.18f, 1.32f)
            curveToRelative(-0.85f, -0.85f, -1.98f, -1.32f, -3.18f, -1.32f)
            reflectiveCurveToRelative(-2.33f, 0.47f, -3.18f, 1.31f)
            lineToRelative(-7.38f, 7.32f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
            reflectiveCurveToRelative(1.53f, 0.59f, 2.12f, 0.01f)
            lineToRelative(7.38f, -7.32f)
            curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0.01f)
            lineToRelative(7.38f, 7.31f)
            curveToRelative(0.59f, 0.58f, 1.54f, 0.58f, 2.12f, -0.01f)
            curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
            close()
        }
    }.also { _ChevronDoubleDotsUp = it }
