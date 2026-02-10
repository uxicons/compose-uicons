package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stretcher: ImageVector? = null

val Icons.Rs.Stretcher: ImageVector
    get() = _Stretcher ?: UXIcon(name = "Stretcher") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.39f, 11f)
                horizontalLineToRelative(2.61f)
                verticalLineToRelative(-2f)
                lineTo(7.55f, 9f)
                lineTo(1.84f, 0.04f)
                lineTo(0.16f, 1.12f)
                lineToRelative(6.29f, 9.88f)
                horizontalLineToRelative(2.16f)
                lineToRelative(4.91f, 4.5f)
                lineToRelative(-4.04f, 3.7f)
                curveToRelative(-0.3f, -0.13f, -0.63f, -0.2f, -0.98f, -0.2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.29f, -0.06f, -0.57f, -0.15f, -0.83f)
                lineToRelative(4.15f, -3.81f)
                lineToRelative(4.15f, 3.81f)
                curveToRelative(-0.09f, 0.26f, -0.15f, 0.54f, -0.15f, 0.84f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.07f, -0.98f, 0.2f)
                lineToRelative(-4.04f, -3.7f)
                lineToRelative(4.91f, -4.5f)
                close()
                moveTo(11.57f, 11f)
                horizontalLineToRelative(6.86f)
                lineToRelative(-3.43f, 3.14f)
                lineToRelative(-3.43f, -3.14f)
                close()
            }
        }.also { _Stretcher = it}
