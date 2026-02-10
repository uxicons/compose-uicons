package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsbPendrive: ImageVector? = null

val Icons.Sc.UsbPendrive: ImageVector
    get() = _UsbPendrive ?: UXIcon(name = "UsbPendrive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.58f, 10.35f)
                curveToRelative(-0.11f, -0.28f, -0.34f, -0.48f, -0.62f, -0.56f)
                curveToRelative(-0.11f, -0.03f, -2.79f, -0.77f, -5.95f, -0.77f)
                reflectiveCurveToRelative(-5.84f, 0.74f, -5.95f, 0.77f)
                curveToRelative(-0.28f, 0.08f, -0.52f, 0.29f, -0.62f, 0.56f)
                curveToRelative(-0.03f, 0.08f, -0.75f, 1.96f, -0.75f, 5.81f)
                curveToRelative(0f, 3.77f, 3.29f, 6.84f, 7.32f, 6.84f)
                reflectiveCurveToRelative(7.32f, -3.07f, 7.32f, -6.84f)
                curveToRelative(0f, -3.85f, -0.72f, -5.73f, -0.75f, -5.81f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.84f, 7.7f)
                curveToRelative(-0.09f, -4.08f, -0.54f, -5.31f, -0.63f, -5.53f)
                curveToRelative(-0.11f, -0.25f, -0.32f, -0.44f, -0.59f, -0.52f)
                curveToRelative(-0.09f, -0.03f, -2.17f, -0.65f, -4.62f, -0.65f)
                reflectiveCurveToRelative(-4.54f, 0.62f, -4.62f, 0.65f)
                curveToRelative(-0.26f, 0.08f, -0.47f, 0.26f, -0.58f, 0.51f)
                curveToRelative(-0.1f, 0.21f, -0.55f, 1.42f, -0.64f, 5.55f)
                curveToRelative(1.07f, -0.25f, 3.31f, -0.68f, 5.84f, -0.68f)
                reflectiveCurveToRelative(4.77f, 0.43f, 5.84f, 0.68f)
                close()
                moveTo(14.28f, 3.06f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(9.72f, 6.06f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _UsbPendrive = it}
