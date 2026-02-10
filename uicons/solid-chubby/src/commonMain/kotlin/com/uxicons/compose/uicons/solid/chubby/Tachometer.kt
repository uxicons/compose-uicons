package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tachometer: ImageVector? = null

val Icons.Sc.Tachometer: ImageVector
    get() = _Tachometer ?: UXIcon(name = "Tachometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.8f)
                curveTo(6.88f, 1.8f, 1f, 3.05f, 1f, 12.8f)
                curveToRelative(0f, 3.87f, 0.9f, 6.63f, 2.75f, 8.44f)
                curveToRelative(0.12f, 0.12f, 0.28f, 0.21f, 0.44f, 0.25f)
                curveToRelative(0.11f, 0.03f, 2.76f, 0.71f, 7.81f, 0.71f)
                reflectiveCurveToRelative(7.68f, -0.69f, 7.79f, -0.71f)
                curveToRelative(0.17f, -0.04f, 0.32f, -0.13f, 0.44f, -0.25f)
                curveToRelative(1.86f, -1.81f, 2.77f, -4.57f, 2.77f, -8.44f)
                curveTo(23f, 3.05f, 17.12f, 1.8f, 12f, 1.8f)
                close()
                moveTo(16.69f, 9.59f)
                lineToRelative(-2.59f, 2.52f)
                curveToRelative(0.07f, 0.21f, 0.11f, 0.44f, 0.11f, 0.68f)
                curveToRelative(0f, 1.22f, -0.99f, 2.21f, -2.21f, 2.21f)
                reflectiveCurveToRelative(-2.21f, -0.99f, -2.21f, -2.21f)
                reflectiveCurveToRelative(0.99f, -2.21f, 2.21f, -2.21f)
                curveToRelative(0.24f, 0f, 0.48f, 0.04f, 0.7f, 0.11f)
                lineToRelative(2.6f, -2.54f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.38f, 1.41f, 0.02f)
                curveToRelative(0.39f, 0.4f, 0.38f, 1.03f, -0.02f, 1.41f)
                close()
            }
        }.also { _Tachometer = it}
