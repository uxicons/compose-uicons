package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Turntable: ImageVector? = null

val Icons.Sc.Turntable: ImageVector
    get() = _Turntable ?: UXIcon(name = "Turntable") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 9f)
                curveToRelative(-2.3f, 0f, -3f, 0.7f, -3f, 3f)
                reflectiveCurveToRelative(0.7f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -0.7f, 3f, -3f)
                reflectiveCurveToRelative(-0.7f, -3f, -3f, -3f)
                close()
                moveTo(10f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(21.96f, 3.84f)
                curveToRelative(-0.09f, -0.3f, -0.31f, -0.54f, -0.61f, -0.65f)
                curveToRelative(-0.13f, -0.05f, -3.24f, -1.19f, -9.35f, -1.19f)
                reflectiveCurveToRelative(-9.22f, 1.14f, -9.35f, 1.19f)
                curveToRelative(-0.29f, 0.11f, -0.52f, 0.35f, -0.61f, 0.65f)
                curveToRelative(-0.04f, 0.14f, -1.04f, 3.57f, -1.04f, 8.16f)
                reflectiveCurveToRelative(1.0f, 8.02f, 1.04f, 8.16f)
                curveToRelative(0.09f, 0.3f, 0.31f, 0.54f, 0.61f, 0.65f)
                curveToRelative(0.13f, 0.05f, 3.24f, 1.19f, 9.35f, 1.19f)
                reflectiveCurveToRelative(9.22f, -1.14f, 9.35f, -1.19f)
                curveToRelative(0.29f, -0.11f, 0.52f, -0.35f, 0.61f, -0.65f)
                curveToRelative(0.04f, -0.14f, 1.04f, -3.57f, 1.04f, -8.16f)
                reflectiveCurveToRelative(-1.0f, -8.02f, -1.04f, -8.16f)
                close()
                moveTo(10f, 17f)
                curveToRelative(-3.41f, 0f, -5f, -1.59f, -5f, -5f)
                reflectiveCurveToRelative(1.59f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.59f, 5f, 5f)
                reflectiveCurveToRelative(-1.59f, 5f, -5f, 5f)
                close()
                moveTo(17.89f, 17.45f)
                curveToRelative(-0.25f, 0.5f, -0.86f, 0.69f, -1.34f, 0.45f)
                curveToRelative(-0.49f, -0.25f, -0.69f, -0.85f, -0.45f, -1.34f)
                curveToRelative(1.1f, -2.2f, 1.01f, -5.12f, 0.93f, -7.69f)
                curveToRelative(-0.02f, -0.65f, -0.04f, -1.27f, -0.04f, -1.86f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.57f, 0.02f, 1.17f, 0.04f, 1.8f)
                curveToRelative(0.09f, 2.81f, 0.18f, 6.0f, -1.14f, 8.65f)
                close()
            }
        }.also { _Turntable = it}
