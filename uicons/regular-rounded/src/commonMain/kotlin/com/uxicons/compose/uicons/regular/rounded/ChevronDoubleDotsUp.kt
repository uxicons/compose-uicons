package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsUp: ImageVector? = null

val Icons.Rr.ChevronDoubleDotsUp: ImageVector
    get() = _ChevronDoubleDotsUp ?: UXIcon(name = "ChevronDoubleDotsUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 12.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12f, 16f)
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
                moveTo(14.79f, 7.16f)
                curveToRelative(-1.47f, -1.53f, -4.11f, -1.53f, -5.58f, -0.0f)
                lineToRelative(-5.18f, 5.14f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.02f, -0.01f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.4f, 1.41f, 0.01f)
                lineToRelative(5.18f, -5.14f)
                curveToRelative(0.73f, -0.73f, 2.02f, -0.74f, 2.75f, 0.0f)
                lineToRelative(5.18f, 5.14f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, -0.01f)
                reflectiveCurveToRelative(0.39f, -1.02f, -0.01f, -1.41f)
                close()
                moveTo(22.97f, 9.29f)
                lineTo(14.79f, 1.16f)
                curveToRelative(-1.47f, -1.53f, -4.11f, -1.53f, -5.58f, -0.0f)
                lineToRelative(-8.18f, 8.14f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, -0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(8.19f, -8.14f)
                curveToRelative(0.73f, -0.73f, 2.02f, -0.74f, 2.75f, 0.0f)
                lineToRelative(8.19f, 8.14f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, -0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.0f, -1.41f)
                close()
            }
        }.also { _ChevronDoubleDotsUp = it}
