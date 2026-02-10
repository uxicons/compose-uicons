package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tape: ImageVector? = null

val Icons.Rc.Tape: ImageVector
    get() = _Tape ?: UXIcon(name = "Tape") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                curveToRelative(0f, -2.69f, -1.31f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.31f, 4f, -4f)
                close()
                moveTo(9f, 12f)
                curveToRelative(0f, -1.59f, 0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                reflectiveCurveToRelative(-0.41f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.41f, -2f, -2f)
                close()
                moveTo(22.96f, 19.73f)
                curveToRelative(-0.15f, -0.53f, -0.7f, -0.84f, -1.23f, -0.69f)
                curveToRelative(-0.02f, 0.01f, -1.02f, 0.28f, -3.05f, 0.53f)
                curveToRelative(1.59f, -1.62f, 2.32f, -4.11f, 2.32f, -7.57f)
                curveToRelative(0f, -7.01f, -2.99f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 2.99f, -10f, 10.0f)
                reflectiveCurveToRelative(2.99f, 10f, 10f, 10f)
                curveToRelative(7.55f, 0f, 11.13f, -1.0f, 11.28f, -1.04f)
                curveToRelative(0.53f, -0.15f, 0.84f, -0.7f, 0.69f, -1.23f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -5.91f, 2.09f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 2.09f, 8f, 8f)
                reflectiveCurveToRelative(-2.09f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -2.09f, -8f, -8f)
                close()
            }
        }.also { _Tape = it}
