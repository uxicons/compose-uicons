package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDown: ImageVector? = null

val Icons.Tr.ChevronDoubleDown: ImageVector
    get() = _ChevronDoubleDown ?: UXIcon(name = "ChevronDoubleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.15f, 11.97f)
                lineToRelative(-9.38f, 9.29f)
                curveToRelative(-0.94f, 0.94f, -2.59f, 0.95f, -3.54f, -0.0f)
                lineTo(0.85f, 11.97f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.0f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f)
                lineToRelative(9.38f, 9.29f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.02f, 2.48f, 1.02f)
                reflectiveCurveToRelative(1.81f, -0.36f, 2.47f, -1.02f)
                lineToRelative(9.38f, -9.29f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.0f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.15f, 1.64f)
                lineTo(13.06f, 11.56f)
                curveToRelative(-0.56f, 0.57f, -1.55f, 0.57f, -2.12f, -0.0f)
                lineTo(0.85f, 1.64f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                lineTo(10.23f, 12.27f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.76f, -0.73f)
                lineTo(23.85f, 2.36f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                close()
            }
        }.also { _ChevronDoubleDown = it}
