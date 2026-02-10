package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneHangup: ImageVector? = null

val Icons.Rc.CirclePhoneHangup: ImageVector
    get() = _CirclePhoneHangup ?: UXIcon(name = "CirclePhoneHangup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 12f)
                curveToRelative(0f, 9.75f, 5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveToRelative(-5.88f, -11f, -11f, -11f)
                reflectiveCurveToRelative(-11f, 1.25f, -11f, 11f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -7.47f, 3.6f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                reflectiveCurveToRelative(-3.6f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -1.53f, -9f, -9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.11f, 15.18f)
                curveToRelative(-0.82f, -0.44f, -1.34f, -1.28f, -1.36f, -2.2f)
                lineToRelative(-0.0f, -0.14f)
                curveToRelative(-0.46f, -0.22f, -1.24f, -0.38f, -1.75f, -0.39f)
                curveToRelative(-0.53f, 0.01f, -1.3f, 0.15f, -1.75f, 0.37f)
                verticalLineToRelative(0.14f)
                curveToRelative(-0.01f, 0.92f, -0.52f, 1.76f, -1.34f, 2.2f)
                curveToRelative(-0.72f, 0.38f, -1.57f, 0.38f, -2.28f, 0.01f)
                curveToRelative(-0.82f, -0.42f, -1.33f, -1.26f, -1.32f, -2.14f)
                curveToRelative(-0.01f, -0.08f, -0.16f, -1.92f, 1.44f, -3.02f)
                curveToRelative(1.47f, -0.99f, 3.69f, -1.45f, 5.25f, -1.47f)
                curveToRelative(1.54f, 0.04f, 3.77f, 0.5f, 5.24f, 1.52f)
                curveToRelative(1.52f, 1.06f, 1.48f, 2.77f, 1.47f, 3.0f)
                curveToRelative(0.01f, 0.92f, -0.49f, 1.75f, -1.31f, 2.17f)
                curveToRelative(-0.71f, 0.36f, -1.56f, 0.35f, -2.29f, -0.04f)
                close()
            }
        }.also { _CirclePhoneHangup = it}
