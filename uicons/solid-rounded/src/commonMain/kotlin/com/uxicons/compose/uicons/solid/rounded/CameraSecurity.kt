package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraSecurity: ImageVector? = null

val Icons.Sr.CameraSecurity: ImageVector
    get() = _CameraSecurity ?: UXIcon(name = "CameraSecurity") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(0.98f, 0.5f, 1.81f, 1.21f, 2.4f, 2.06f)
                curveToRelative(0.59f, 0.85f, -0.12f, 1.95f, -1.24f, 1.95f)
                lineTo(7.46f, 24f)
                curveToRelative(-1.13f, 0f, -1.84f, -1.1f, -1.24f, -1.95f)
                curveToRelative(0.59f, -0.85f, 1.42f, -1.56f, 2.4f, -2.06f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _CameraSecurity = it}
