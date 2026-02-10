package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramVenn: ImageVector? = null

val Icons.Bs.DiagramVenn: ImageVector
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
                moveTo(11f, 12f)
                curveToRelative(0f, -1.12f, 0.37f, -2.16f, 1f, -3f)
                curveToRelative(0.63f, 0.84f, 1f, 1.87f, 1f, 3f)
                reflectiveCurveToRelative(-0.37f, 2.16f, -1f, 3f)
                curveToRelative(-0.63f, -0.84f, -1f, -1.87f, -1f, -3f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(0.55f, 0f, 1.07f, 0.09f, 1.57f, 0.25f)
                curveToRelative(-0.98f, 1.33f, -1.57f, 2.97f, -1.57f, 4.75f)
                reflectiveCurveToRelative(0.58f, 3.42f, 1.57f, 4.75f)
                curveToRelative(-0.49f, 0.16f, -1.02f, 0.25f, -1.57f, 0.25f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                close()
            }
        }.also { _DiagramVenn = it}
