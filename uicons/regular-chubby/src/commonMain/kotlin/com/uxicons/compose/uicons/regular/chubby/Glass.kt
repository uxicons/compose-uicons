package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glass: ImageVector? = null

val Icons.Rc.Glass: ImageVector
    get() = _Glass ?: UXIcon(name = "Glass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.18f, 1.85f)
                curveToRelative(-0.17f, -0.04f, -4.31f, -0.85f, -9.19f, -0.85f)
                reflectiveCurveTo(2.99f, 1.82f, 2.81f, 1.85f)
                curveToRelative(-0.51f, 0.1f, -0.85f, 0.57f, -0.8f, 1.09f)
                lineToRelative(2.03f, 18.33f)
                curveToRelative(0.04f, 0.37f, 0.28f, 0.69f, 0.63f, 0.82f)
                curveToRelative(0.09f, 0.04f, 2.35f, 0.9f, 7.32f, 0.9f)
                reflectiveCurveToRelative(7.23f, -0.87f, 7.32f, -0.9f)
                curveToRelative(0.34f, -0.14f, 0.59f, -0.45f, 0.63f, -0.82f)
                lineTo(21.98f, 2.94f)
                curveToRelative(0.06f, -0.52f, -0.29f, -0.99f, -0.8f, -1.09f)
                close()
                moveTo(18.04f, 20.4f)
                curveToRelative(-0.89f, 0.23f, -2.84f, 0.6f, -6.04f, 0.6f)
                reflectiveCurveToRelative(-5.15f, -0.38f, -6.04f, -0.6f)
                lineToRelative(-1.2f, -10.83f)
                lineTo(15.3f, 9.57f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(4.54f, 7.57f)
                lineToRelative(-0.43f, -3.91f)
                curveToRelative(1.46f, -0.24f, 4.53f, -0.66f, 7.89f, -0.66f)
                reflectiveCurveToRelative(6.43f, 0.42f, 7.89f, 0.66f)
                lineToRelative(-1.85f, 16.74f)
                close()
            }
        }.also { _Glass = it}
