package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smartphone: ImageVector? = null

val Icons.Sc.Smartphone: ImageVector
    get() = _Smartphone ?: UXIcon(name = "Smartphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13.44f)
                curveToRelative(3.52f, 0f, 6.68f, -0.39f, 7.84f, -0.55f)
                curveToRelative(0.01f, -0.29f, 0.01f, -0.59f, 0.01f, -0.89f)
                curveToRelative(0f, -5.13f, -0.78f, -8.9f, -0.81f, -9.05f)
                curveToRelative(-0.07f, -0.32f, -0.29f, -0.59f, -0.6f, -0.72f)
                curveToRelative(-0.12f, -0.05f, -3.02f, -1.23f, -6.44f, -1.23f)
                curveToRelative(-3.36f, 0f, -6.31f, 1.17f, -6.44f, 1.22f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.4f, -0.6f, 0.73f)
                curveToRelative(-0.03f, 0.16f, -0.81f, 4.0f, -0.81f, 9.05f)
                curveToRelative(0f, 0.3f, 0.0f, 0.59f, 0.01f, 0.89f)
                curveToRelative(1.19f, 0.16f, 4.44f, 0.55f, 7.84f, 0.55f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.44f)
                curveToRelative(-3.27f, 0f, -6.32f, -0.34f, -7.77f, -0.52f)
                curveToRelative(0.2f, 3.55f, 0.7f, 6.01f, 0.72f, 6.14f)
                curveToRelative(0.07f, 0.33f, 0.3f, 0.6f, 0.61f, 0.73f)
                curveToRelative(0.13f, 0.05f, 3.13f, 1.22f, 6.43f, 1.22f)
                curveToRelative(3.42f, 0f, 6.32f, -1.18f, 6.44f, -1.23f)
                curveToRelative(0.31f, -0.13f, 0.53f, -0.4f, 0.6f, -0.72f)
                curveToRelative(0.03f, -0.13f, 0.53f, -2.57f, 0.73f, -6.13f)
                curveToRelative(-1.42f, 0.19f, -4.41f, 0.52f, -7.77f, 0.52f)
                close()
                moveTo(13.14f, 19.89f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Smartphone = it}
