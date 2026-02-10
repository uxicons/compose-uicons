package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsDown: ImageVector? = null

val Icons.Br.ChevronDoubleDotsDown: ImageVector
    get() = _ChevronDoubleDotsDown ?: UXIcon(name = "ChevronDoubleDotsDown") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.5f, 9.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(12f, 7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(12f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(8.82f, 15.68f)
            curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
            reflectiveCurveToRelative(2.33f, -0.47f, 3.17f, -1.31f)
            lineToRelative(4.38f, -4.33f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.53f, 0.01f, -2.12f)
            curveToRelative(-0.58f, -0.59f, -1.53f, -0.6f, -2.12f, -0.01f)
            lineToRelative(-4.39f, 4.33f)
            curveToRelative(-0.57f, 0.57f, -1.55f, 0.57f, -2.13f, -0.01f)
            lineToRelative(-4.38f, -4.33f)
            curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.01f)
            curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0.01f, 2.12f)
            lineToRelative(4.37f, 4.32f)
            close()
            moveTo(22.57f, 13.25f)
            curveToRelative(-0.58f, -0.59f, -1.53f, -0.59f, -2.12f, -0.01f)
            lineToRelative(-7.38f, 7.32f)
            curveToRelative(-0.57f, 0.57f, -1.55f, 0.57f, -2.12f, -0.01f)
            lineToRelative(-7.38f, -7.31f)
            curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.01f)
            curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0.01f, 2.12f)
            lineToRelative(7.37f, 7.31f)
            curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
            reflectiveCurveToRelative(2.33f, -0.47f, 3.18f, -1.31f)
            lineToRelative(7.38f, -7.32f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.53f, 0.01f, -2.12f)
            close()
        }
    }.also { _ChevronDoubleDotsDown = it }
