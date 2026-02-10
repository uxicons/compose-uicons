package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi2: ImageVector? = null

val Icons.Tr.Wifi2: ImageVector
    get() = _Wifi2 ?: UXIcon(name = "Wifi2") {
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
                moveTo(18.8f, 13.88f)
                curveToRelative(0.21f, -0.18f, 0.24f, -0.49f, 0.06f, -0.7f)
                curveToRelative(-0.16f, -0.19f, -0.32f, -0.37f, -0.5f, -0.54f)
                curveToRelative(-3.51f, -3.51f, -9.22f, -3.51f, -12.73f, 0f)
                curveToRelative(-0.17f, 0.17f, -0.34f, 0.36f, -0.5f, 0.54f)
                curveToRelative(-0.18f, 0.21f, -0.15f, 0.53f, 0.06f, 0.7f)
                curveToRelative(0.21f, 0.18f, 0.53f, 0.15f, 0.71f, -0.06f)
                curveToRelative(0.14f, -0.16f, 0.29f, -0.33f, 0.44f, -0.48f)
                curveToRelative(3.12f, -3.12f, 8.19f, -3.12f, 11.31f, 0f)
                curveToRelative(0.16f, 0.16f, 0.3f, 0.32f, 0.44f, 0.48f)
                curveToRelative(0.1f, 0.12f, 0.24f, 0.18f, 0.38f, 0.18f)
                curveToRelative(0.11f, 0f, 0.23f, -0.04f, 0.32f, -0.12f)
                close()
            }
        }.also { _Wifi2 = it}
