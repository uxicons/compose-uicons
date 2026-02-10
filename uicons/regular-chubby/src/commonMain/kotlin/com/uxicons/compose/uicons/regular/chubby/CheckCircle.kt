package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckCircle: ImageVector? = null

val Icons.Rc.CheckCircle: ImageVector
    get() = _CheckCircle ?: UXIcon(name = "CheckCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.3f, 9.54f)
                curveToRelative(-1.31f, 2.05f, -3.18f, 4.63f, -6.0f, 6.32f)
                curveToRelative(-0.32f, 0.2f, -0.73f, 0.19f, -1.05f, -0.01f)
                curveToRelative(-1.52f, -0.96f, -2.66f, -2.0f, -3.59f, -3.25f)
                curveToRelative(-0.33f, -0.44f, -0.24f, -1.07f, 0.2f, -1.4f)
                curveToRelative(0.44f, -0.33f, 1.07f, -0.24f, 1.4f, 0.2f)
                curveToRelative(0.67f, 0.91f, 1.49f, 1.68f, 2.54f, 2.4f)
                curveToRelative(2.16f, -1.46f, 3.64f, -3.51f, 4.82f, -5.35f)
                curveToRelative(0.3f, -0.47f, 0.92f, -0.6f, 1.38f, -0.3f)
                curveToRelative(0.47f, 0.3f, 0.6f, 0.92f, 0.3f, 1.38f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -6.56f, -2.44f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.44f, -9f, 9f)
                reflectiveCurveToRelative(2.44f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -2.44f, 9f, -9f)
                close()
            }
        }.also { _CheckCircle = it}
