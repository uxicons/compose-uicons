package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsDown: ImageVector? = null

val Icons.Sr.ChevronDoubleDotsDown: ImageVector
    get() = _ChevronDoubleDotsDown ?: UXIcon(name = "ChevronDoubleDotsDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(12f, 8f)
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
                moveTo(9.21f, 16.84f)
                curveToRelative(1.47f, 1.53f, 4.11f, 1.53f, 5.58f, 0.0f)
                lineToRelative(5.18f, -5.14f)
                curveToRelative(0.39f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, -0.01f)
                lineToRelative(-5.18f, 5.14f)
                curveToRelative(-0.73f, 0.74f, -2.01f, 0.74f, -2.75f, -0.0f)
                lineToRelative(-5.18f, -5.14f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.01f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.01f, 1.41f)
                close()
                moveTo(22.98f, 13.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.4f, -1.41f, -0.0f)
                lineToRelative(-8.19f, 8.14f)
                curveToRelative(-0.73f, 0.74f, -2.02f, 0.74f, -2.75f, -0.0f)
                lineToRelative(-8.19f, -8.14f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(8.18f, 8.13f)
                curveToRelative(1.47f, 1.53f, 4.11f, 1.53f, 5.58f, 0.0f)
                lineToRelative(8.18f, -8.14f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                close()
            }
        }.also { _ChevronDoubleDotsDown = it}
