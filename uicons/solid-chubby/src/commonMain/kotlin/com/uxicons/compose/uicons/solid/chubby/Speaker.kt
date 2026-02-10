package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Speaker: ImageVector? = null

val Icons.Sc.Speaker: ImageVector
    get() = _Speaker ?: UXIcon(name = "Speaker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.39f, 2.94f)
                curveToRelative(-0.07f, -0.33f, -0.3f, -0.59f, -0.61f, -0.72f)
                curveToRelative(-0.13f, -0.05f, -3.17f, -1.22f, -6.77f, -1.22f)
                reflectiveCurveToRelative(-6.64f, 1.17f, -6.77f, 1.22f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.39f, -0.61f, 0.72f)
                curveToRelative(-0.04f, 0.16f, -0.86f, 3.97f, -0.86f, 9.06f)
                curveToRelative(0f, 5.13f, 0.82f, 8.91f, 0.86f, 9.06f)
                curveToRelative(0.07f, 0.33f, 0.3f, 0.59f, 0.61f, 0.72f)
                curveToRelative(0.13f, 0.05f, 3.17f, 1.22f, 6.77f, 1.22f)
                reflectiveCurveToRelative(6.64f, -1.17f, 6.77f, -1.22f)
                curveToRelative(0.31f, -0.12f, 0.54f, -0.39f, 0.61f, -0.72f)
                curveToRelative(0.04f, -0.16f, 0.86f, -3.97f, 0.86f, -9.06f)
                curveToRelative(0f, -5.13f, -0.82f, -8.91f, -0.86f, -9.06f)
                close()
                moveTo(12f, 4.28f)
                curveToRelative(1.51f, 0f, 2.37f, 0.86f, 2.37f, 2.37f)
                reflectiveCurveToRelative(-0.86f, 2.37f, -2.37f, 2.37f)
                reflectiveCurveToRelative(-2.37f, -0.86f, -2.37f, -2.37f)
                reflectiveCurveToRelative(0.86f, -2.37f, 2.37f, -2.37f)
                close()
                moveTo(12f, 19.72f)
                curveToRelative(-3.04f, 0f, -4.51f, -1.49f, -4.51f, -4.56f)
                reflectiveCurveToRelative(1.48f, -4.56f, 4.51f, -4.56f)
                reflectiveCurveToRelative(4.51f, 1.49f, 4.51f, 4.56f)
                reflectiveCurveToRelative(-1.48f, 4.56f, -4.51f, 4.56f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12.61f)
                curveToRelative(-1.67f, 0f, -2.51f, 0.4f, -2.51f, 2.56f)
                curveToRelative(0f, 2.17f, 0.81f, 2.56f, 2.51f, 2.56f)
                curveToRelative(1.67f, 0f, 2.51f, -0.4f, 2.51f, -2.56f)
                curveToRelative(0f, -2.17f, -0.81f, -2.56f, -2.51f, -2.56f)
                close()
                moveTo(12f, 16.67f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Speaker = it}
