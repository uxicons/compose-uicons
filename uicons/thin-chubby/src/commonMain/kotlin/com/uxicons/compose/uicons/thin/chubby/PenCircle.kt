package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenCircle: ImageVector? = null

val Icons.Tc.PenCircle: ImageVector
    get() = _PenCircle ?: UXIcon(name = "PenCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.3f, 6.73f)
                curveToRelative(-0.98f, -0.97f, -2.56f, -0.98f, -3.53f, -0.01f)
                lineToRelative(-6.42f, 6.41f)
                curveToRelative(-0.78f, 0.77f, -1.24f, 1.81f, -1.29f, 2.92f)
                lineToRelative(-0.06f, 1.43f)
                curveToRelative(-0.02f, 0.28f, 0.24f, 0.54f, 0.52f, 0.52f)
                lineToRelative(1.44f, -0.06f)
                curveToRelative(1.11f, -0.05f, 2.15f, -0.5f, 2.93f, -1.28f)
                lineToRelative(6.41f, -6.41f)
                curveToRelative(0.93f, -0.82f, 0.92f, -2.7f, -0.0f, -3.52f)
                close()
                moveTo(16.61f, 9.54f)
                lineTo(10.19f, 15.95f)
                curveToRelative(-0.6f, 0.6f, -1.41f, 0.95f, -2.27f, 0.99f)
                lineToRelative(-0.89f, 0.04f)
                lineToRelative(0.04f, -0.88f)
                curveToRelative(0.04f, -0.85f, 0.39f, -1.66f, 0.99f, -2.25f)
                lineToRelative(6.42f, -6.41f)
                curveToRelative(0.58f, -0.58f, 1.52f, -0.57f, 2.11f, -0.0f)
                curveToRelative(0.54f, 0.45f, 0.56f, 1.64f, 0.03f, 2.11f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.2f, 0f, -10f, -2.8f, -10f, -10f)
                reflectiveCurveToRelative(2.8f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.8f, 10f, 10f)
                reflectiveCurveToRelative(-2.8f, 10f, -10f, 10f)
                close()
            }
        }.also { _PenCircle = it}
