package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stretcher: ImageVector? = null

val Icons.Ts.Stretcher: ImageVector
    get() = _Stretcher ?: UXIcon(name = "Stretcher") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.7f, 11f)
                horizontalLineToRelative(2.3f)
                verticalLineToRelative(-1f)
                lineTo(7.27f, 10f)
                lineTo(0.84f, 0.05f)
                lineTo(0f, 0.59f)
                lineToRelative(6.73f, 10.41f)
                horizontalLineToRelative(2.58f)
                lineToRelative(5.46f, 5.11f)
                lineToRelative(-3.69f, 3.45f)
                curveToRelative(-0.43f, -0.35f, -0.98f, -0.56f, -1.57f, -0.56f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.42f, -0.1f, -0.82f, -0.29f, -1.17f)
                lineToRelative(3.79f, -3.54f)
                lineToRelative(3.79f, 3.54f)
                curveToRelative(-0.18f, 0.35f, -0.29f, 0.74f, -0.29f, 1.17f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.6f, 0f, -1.14f, 0.21f, -1.57f, 0.56f)
                lineToRelative(-3.69f, -3.45f)
                lineToRelative(5.46f, -5.11f)
                close()
                moveTo(9.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10.77f, 11f)
                horizontalLineToRelative(9.46f)
                lineToRelative(-4.73f, 4.42f)
                lineToRelative(-4.73f, -4.42f)
                close()
            }
        }.also { _Stretcher = it}
