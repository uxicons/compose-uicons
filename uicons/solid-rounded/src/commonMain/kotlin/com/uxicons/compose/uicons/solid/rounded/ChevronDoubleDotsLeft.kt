package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsLeft: ImageVector? = null

val Icons.Sr.ChevronDoubleDotsLeft: ImageVector
    get() = _ChevronDoubleDotsLeft ?: UXIcon(name = "ChevronDoubleDotsLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 12f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(17.5f, 10.5f)
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
                moveTo(12.29f, 4.03f)
                lineTo(7.16f, 9.21f)
                curveToRelative(-1.53f, 1.47f, -1.53f, 4.11f, -0.0f, 5.58f)
                lineToRelative(5.14f, 5.18f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.4f, 1.41f, 0.01f)
                reflectiveCurveToRelative(0.4f, -1.02f, 0.01f, -1.41f)
                lineToRelative(-5.14f, -5.18f)
                curveToRelative(-0.76f, -0.73f, -0.76f, -2.03f, 0.0f, -2.75f)
                lineToRelative(5.14f, -5.18f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.01f)
                close()
                moveTo(2.57f, 13.38f)
                curveToRelative(-0.76f, -0.73f, -0.76f, -2.03f, 0.0f, -2.75f)
                lineToRelative(8.14f, -8.19f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-8.13f, 8.18f)
                curveToRelative(-1.53f, 1.47f, -1.53f, 4.11f, -0.0f, 5.58f)
                lineToRelative(8.14f, 8.18f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                close()
            }
        }.also { _ChevronDoubleDotsLeft = it}
