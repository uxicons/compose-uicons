package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugAlt: ImageVector? = null

val Icons.Rc.MugAlt: ImageVector
    get() = _MugAlt ?: UXIcon(name = "MugAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.62f, 5.79f)
                lineToRelative(0.32f, -2.55f)
                curveToRelative(0.07f, -0.52f, -0.28f, -1f, -0.79f, -1.1f)
                curveToRelative(-0.15f, -0.03f, -3.83f, -0.77f, -8.15f, -0.77f)
                reflectiveCurveToRelative(-7.99f, 0.73f, -8.15f, 0.77f)
                curveToRelative(-0.51f, 0.1f, -0.86f, 0.58f, -0.79f, 1.1f)
                lineToRelative(1.8f, 14.42f)
                curveToRelative(0.04f, 0.36f, 0.28f, 0.67f, 0.62f, 0.81f)
                curveToRelative(0.08f, 0.03f, 2.1f, 0.82f, 6.52f, 0.82f)
                reflectiveCurveToRelative(6.44f, -0.78f, 6.52f, -0.82f)
                curveToRelative(0.34f, -0.14f, 0.58f, -0.44f, 0.62f, -0.81f)
                lineToRelative(0.38f, -3.03f)
                reflectiveCurveToRelative(0.01f, 0f, 0.01f, 0f)
                curveToRelative(2.46f, 0f, 4.47f, -2.01f, 4.47f, -4.49f)
                curveToRelative(0f, -2.1f, -1.41f, -3.87f, -3.38f, -4.35f)
                close()
                moveTo(11.0f, 17.28f)
                curveToRelative(-2.74f, 0f, -4.44f, -0.32f, -5.24f, -0.52f)
                lineTo(4.16f, 3.93f)
                curveToRelative(1.33f, -0.21f, 3.95f, -0.57f, 6.84f, -0.57f)
                reflectiveCurveToRelative(5.51f, 0.35f, 6.84f, 0.57f)
                lineToRelative(-1.6f, 12.83f)
                curveToRelative(-0.8f, 0.2f, -2.5f, 0.52f, -5.24f, 0.52f)
                close()
                moveTo(18.77f, 12.62f)
                lineToRelative(0.6f, -4.82f)
                curveToRelative(0.96f, 0.34f, 1.63f, 1.26f, 1.63f, 2.34f)
                curveToRelative(0f, 1.29f, -0.98f, 2.35f, -2.23f, 2.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.0f, 20.63f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(20.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _MugAlt = it}
