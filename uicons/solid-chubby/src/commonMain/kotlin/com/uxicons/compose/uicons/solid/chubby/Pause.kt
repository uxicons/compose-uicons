package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pause: ImageVector? = null

val Icons.Sc.Pause: ImageVector
    get() = _Pause ?: UXIcon(name = "Pause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.26f, 1.92f)
                curveToRelative(-0.14f, -0.09f, -1.41f, -0.92f, -2.96f, -0.92f)
                reflectiveCurveToRelative(-2.82f, 0.82f, -2.96f, 0.92f)
                curveToRelative(-0.25f, 0.17f, -0.41f, 0.45f, -0.44f, 0.75f)
                curveToRelative(-0.0f, 0.04f, -0.32f, 4.08f, -0.32f, 9.33f)
                curveToRelative(0f, 5.29f, 0.31f, 9.29f, 0.32f, 9.33f)
                curveToRelative(0.02f, 0.3f, 0.19f, 0.58f, 0.44f, 0.75f)
                curveToRelative(0.14f, 0.09f, 1.41f, 0.92f, 2.96f, 0.92f)
                reflectiveCurveToRelative(2.82f, -0.82f, 2.96f, -0.92f)
                curveToRelative(0.25f, -0.17f, 0.41f, -0.45f, 0.44f, -0.75f)
                curveToRelative(0.0f, -0.04f, 0.32f, -4.08f, 0.32f, -9.33f)
                curveToRelative(0f, -5.29f, -0.31f, -9.29f, -0.32f, -9.33f)
                curveToRelative(-0.02f, -0.3f, -0.19f, -0.58f, -0.44f, -0.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.1f, 2.67f)
                curveToRelative(-0.02f, -0.3f, -0.19f, -0.58f, -0.44f, -0.75f)
                curveToRelative(-0.14f, -0.09f, -1.41f, -0.92f, -2.96f, -0.92f)
                reflectiveCurveToRelative(-2.82f, 0.82f, -2.96f, 0.92f)
                curveToRelative(-0.25f, 0.17f, -0.41f, 0.45f, -0.44f, 0.75f)
                curveToRelative(-0.0f, 0.04f, -0.32f, 4.08f, -0.32f, 9.33f)
                curveToRelative(0f, 5.29f, 0.31f, 9.29f, 0.32f, 9.33f)
                curveToRelative(0.02f, 0.3f, 0.19f, 0.58f, 0.44f, 0.75f)
                curveToRelative(0.14f, 0.09f, 1.41f, 0.92f, 2.96f, 0.92f)
                reflectiveCurveToRelative(2.82f, -0.82f, 2.96f, -0.92f)
                curveToRelative(0.25f, -0.17f, 0.41f, -0.45f, 0.44f, -0.75f)
                curveToRelative(0.0f, -0.04f, 0.32f, -4.08f, 0.32f, -9.33f)
                curveToRelative(0f, -5.29f, -0.31f, -9.29f, -0.32f, -9.33f)
                close()
            }
        }.also { _Pause = it}
