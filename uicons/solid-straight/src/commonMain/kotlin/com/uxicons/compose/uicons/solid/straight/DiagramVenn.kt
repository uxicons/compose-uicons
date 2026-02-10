package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramVenn: ImageVector? = null

val Icons.Ss.DiagramVenn: ImageVector
    get() = _DiagramVenn ?: UXIcon(name = "DiagramVenn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4f)
                curveToRelative(-1.46f, 0f, -2.82f, 0.4f, -4f, 1.08f)
                curveToRelative(-1.18f, -0.68f, -2.54f, -1.08f, -4f, -1.08f)
                curveTo(3.59f, 4f, 0f, 7.59f, 0f, 12f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                curveToRelative(1.46f, 0f, 2.82f, -0.4f, 4f, -1.08f)
                curveToRelative(1.18f, 0.68f, 2.54f, 1.08f, 4f, 1.08f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                close()
                moveTo(10.81f, 15f)
                horizontalLineToRelative(2.38f)
                curveToRelative(-0.32f, 0.55f, -0.72f, 1.04f, -1.19f, 1.46f)
                curveToRelative(-0.47f, -0.42f, -0.87f, -0.91f, -1.19f, -1.46f)
                close()
                moveTo(10f, 12f)
                curveToRelative(0f, -0.34f, 0.04f, -0.67f, 0.09f, -1f)
                horizontalLineToRelative(3.82f)
                curveToRelative(0.06f, 0.33f, 0.09f, 0.66f, 0.09f, 1f)
                reflectiveCurveToRelative(-0.04f, 0.67f, -0.09f, 1f)
                horizontalLineToRelative(-3.82f)
                curveToRelative(-0.06f, -0.33f, -0.09f, -0.66f, -0.09f, -1f)
                close()
                moveTo(12f, 7.54f)
                curveToRelative(0.47f, 0.42f, 0.87f, 0.91f, 1.19f, 1.46f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(0.32f, -0.55f, 0.72f, -1.04f, 1.19f, -1.46f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(0.8f, 0f, 1.56f, 0.16f, 2.26f, 0.44f)
                curveToRelative(-1.39f, 1.44f, -2.26f, 3.4f, -2.26f, 5.56f)
                reflectiveCurveToRelative(0.86f, 4.12f, 2.26f, 5.56f)
                curveToRelative(-0.7f, 0.28f, -1.46f, 0.44f, -2.26f, 0.44f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                close()
            }
        }.also { _DiagramVenn = it}
