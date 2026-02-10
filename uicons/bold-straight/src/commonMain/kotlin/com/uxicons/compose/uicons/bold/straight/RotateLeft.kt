package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateLeft: ImageVector? = null

val Icons.Bs.RotateLeft: ImageVector
    get() = _RotateLeft ?: UXIcon(name = "RotateLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 12.04f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3.04f, 12f, 3.04f)
                curveToRelative(-2.39f, 0f, -4.68f, 0.98f, -6.35f, 2.65f)
                lineToRelative(2.35f, 2.35f)
                horizontalLineTo(2.09f)
                curveToRelative(-0.6f, 0f, -1.09f, -0.49f, -1.09f, -1.09f)
                verticalLineTo(1.04f)
                lineTo(3.53f, 3.57f)
                curveTo(5.76f, 1.34f, 8.81f, 0.04f, 12f, 0.04f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                curveTo(5.38f, 24.04f, 0f, 18.66f, 0f, 12.04f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _RotateLeft = it}
