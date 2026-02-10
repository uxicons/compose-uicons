package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi: ImageVector? = null

val Icons.Tr.Wifi: ImageVector
    get() = _Wifi ?: UXIcon(name = "Wifi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(18.81f, 13.88f)
                curveToRelative(0.21f, -0.18f, 0.23f, -0.5f, 0.05f, -0.71f)
                curveToRelative(-0.16f, -0.18f, -0.32f, -0.37f, -0.5f, -0.54f)
                curveToRelative(-1.7f, -1.7f, -3.96f, -2.64f, -6.36f, -2.64f)
                reflectiveCurveToRelative(-4.66f, 0.94f, -6.36f, 2.64f)
                curveToRelative(-0.17f, 0.17f, -0.34f, 0.35f, -0.5f, 0.54f)
                curveToRelative(-0.18f, 0.21f, -0.16f, 0.53f, 0.05f, 0.71f)
                curveToRelative(0.21f, 0.18f, 0.53f, 0.16f, 0.71f, -0.05f)
                curveToRelative(0.14f, -0.17f, 0.29f, -0.33f, 0.44f, -0.48f)
                curveToRelative(1.51f, -1.51f, 3.52f, -2.34f, 5.66f, -2.34f)
                reflectiveCurveToRelative(4.15f, 0.83f, 5.66f, 2.34f)
                curveToRelative(0.16f, 0.16f, 0.3f, 0.32f, 0.44f, 0.48f)
                curveToRelative(0.1f, 0.12f, 0.24f, 0.17f, 0.38f, 0.17f)
                curveToRelative(0.12f, 0f, 0.23f, -0.04f, 0.33f, -0.12f)
                close()
                moveTo(23.84f, 8.98f)
                curveToRelative(0.21f, -0.19f, 0.22f, -0.5f, 0.04f, -0.71f)
                curveToRelative(-0.18f, -0.2f, -0.37f, -0.39f, -0.56f, -0.59f)
                curveToRelative(-3.02f, -3.02f, -7.04f, -4.69f, -11.31f, -4.69f)
                reflectiveCurveTo(3.71f, 4.66f, 0.69f, 7.69f)
                curveToRelative(-0.19f, 0.19f, -0.38f, 0.39f, -0.56f, 0.59f)
                curveToRelative(-0.19f, 0.21f, -0.17f, 0.52f, 0.04f, 0.71f)
                curveToRelative(0.21f, 0.18f, 0.52f, 0.17f, 0.71f, -0.04f)
                curveToRelative(0.17f, -0.19f, 0.34f, -0.37f, 0.52f, -0.55f)
                curveToRelative(2.83f, -2.83f, 6.6f, -4.39f, 10.61f, -4.39f)
                reflectiveCurveToRelative(7.77f, 1.56f, 10.61f, 4.39f)
                curveToRelative(0.18f, 0.18f, 0.35f, 0.36f, 0.52f, 0.55f)
                curveToRelative(0.1f, 0.11f, 0.23f, 0.17f, 0.37f, 0.17f)
                curveToRelative(0.12f, 0f, 0.24f, -0.04f, 0.33f, -0.13f)
                close()
            }
        }.also { _Wifi = it}
