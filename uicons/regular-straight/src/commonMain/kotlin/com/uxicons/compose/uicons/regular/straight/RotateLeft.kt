package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateLeft: ImageVector? = null

val Icons.Rs.RotateLeft: ImageVector
    get() = _RotateLeft ?: UXIcon(name = "RotateLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveToRelative(-2.98f, 0f, -5.82f, 1.11f, -8f, 3.06f)
                verticalLineTo(0f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4.86f)
                curveToRelative(1.87f, -1.9f, 4.44f, -3f, 7.14f, -3f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.51f, 2f, 12f)
                horizontalLineTo(0f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _RotateLeft = it}
