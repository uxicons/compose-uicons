package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraSecurity: ImageVector? = null

val Icons.Ss.CameraSecurity: ImageVector
    get() = _CameraSecurity ?: UXIcon(name = "CameraSecurity") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(-5.7f)
                curveToRelative(0.72f, 0.77f, 1.24f, 1.74f, 1.46f, 2.82f)
                lineToRelative(0.24f, 1.18f)
                lineTo(6f, 24f)
                lineToRelative(0.24f, -1.18f)
                curveToRelative(0.22f, -1.09f, 0.74f, -2.05f, 1.46f, -2.82f)
                lineTo(2f, 20f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(17f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _CameraSecurity = it}
