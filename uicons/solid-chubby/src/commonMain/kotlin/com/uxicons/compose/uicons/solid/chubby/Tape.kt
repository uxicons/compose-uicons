package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tape: ImageVector? = null

val Icons.Sc.Tape: ImageVector
    get() = _Tape ?: UXIcon(name = "Tape") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 14f)
                curveToRelative(-1.59f, 0f, -2f, -0.41f, -2f, -2f)
                reflectiveCurveToRelative(0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                reflectiveCurveToRelative(-0.41f, 2f, -2f, 2f)
                close()
                moveTo(21.91f, 20.94f)
                curveToRelative(0.12f, 0.01f, -4.33f, 1.05f, -11.03f, 1.05f)
                curveToRelative(-6.39f, 0f, -9.97f, -2.98f, -9.89f, -10.0f)
                curveToRelative(0f, -7.01f, 2.99f, -10.0f, 10f, -10.0f)
                reflectiveCurveToRelative(10f, 2.99f, 10f, 10f)
                curveToRelative(0f, 2.7f, -0.45f, 4.79f, -1.39f, 6.36f)
                curveToRelative(0.98f, -0.17f, 1.47f, -0.3f, 1.48f, -0.3f)
                curveToRelative(0.8f, -0.23f, 1.62f, 0.24f, 1.85f, 1.04f)
                curveToRelative(0.23f, 0.8f, -0.23f, 1.62f, -1.03f, 1.85f)
                close()
                moveTo(11f, 16f)
                curveToRelative(2.69f, 0f, 4f, -1.31f, 4f, -4f)
                reflectiveCurveToRelative(-1.31f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                close()
            }
        }.also { _Tape = it}
