package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramVenn: ImageVector? = null

val Icons.Ts.DiagramVenn: ImageVector
    get() = _DiagramVenn ?: UXIcon(name = "DiagramVenn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4f)
                curveToRelative(-1.46f, 0f, -2.82f, 0.39f, -4f, 1.07f)
                curveToRelative(-1.18f, -0.68f, -2.54f, -1.07f, -4f, -1.07f)
                curveTo(3.59f, 4f, 0f, 7.59f, 0f, 12f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                curveToRelative(1.46f, 0f, 2.82f, -0.39f, 4f, -1.07f)
                curveToRelative(1.18f, 0.68f, 2.54f, 1.07f, 4f, 1.07f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                close()
                moveTo(13.74f, 8f)
                horizontalLineToRelative(-3.48f)
                curveToRelative(0.47f, -0.68f, 1.06f, -1.27f, 1.74f, -1.74f)
                curveToRelative(0.68f, 0.47f, 1.27f, 1.06f, 1.74f, 1.74f)
                close()
                moveTo(9.68f, 9f)
                horizontalLineToRelative(4.63f)
                curveToRelative(0.34f, 0.77f, 0.55f, 1.62f, 0.61f, 2.5f)
                horizontalLineToRelative(-5.89f)
                curveToRelative(0.06f, -0.89f, 0.29f, -1.73f, 0.66f, -2.5f)
                close()
                moveTo(14.92f, 12.5f)
                curveToRelative(-0.06f, 0.88f, -0.27f, 1.73f, -0.61f, 2.5f)
                horizontalLineToRelative(-4.63f)
                curveToRelative(-0.37f, -0.77f, -0.6f, -1.61f, -0.66f, -2.5f)
                horizontalLineToRelative(5.89f)
                close()
                moveTo(13.75f, 16f)
                curveToRelative(-0.47f, 0.68f, -1.06f, 1.27f, -1.74f, 1.74f)
                curveToRelative(-0.68f, -0.47f, -1.27f, -1.06f, -1.74f, -1.74f)
                horizontalLineToRelative(3.48f)
                close()
                moveTo(8.01f, 19f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                curveToRelative(1.1f, 0f, 2.14f, 0.25f, 3.06f, 0.71f)
                curveToRelative(-1.86f, 1.47f, -3.06f, 3.74f, -3.06f, 6.29f)
                reflectiveCurveToRelative(1.2f, 4.83f, 3.06f, 6.29f)
                curveToRelative(-0.93f, 0.45f, -1.97f, 0.71f, -3.06f, 0.71f)
                close()
            }
        }.also { _DiagramVenn = it}
