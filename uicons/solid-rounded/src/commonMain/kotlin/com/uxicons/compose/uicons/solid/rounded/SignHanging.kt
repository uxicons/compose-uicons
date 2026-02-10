package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignHanging: ImageVector? = null

val Icons.Sr.SignHanging: ImageVector
    get() = _SignHanging ?: UXIcon(name = "SignHanging") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4.42f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(5f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineTo(23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.42f)
                curveToRelative(-1.76f, 0.77f, -3f, 2.54f, -3f, 4.58f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.05f, -1.24f, -3.81f, -3f, -4.58f)
                close()
                moveTo(9f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                close()
            }
        }.also { _SignHanging = it}
