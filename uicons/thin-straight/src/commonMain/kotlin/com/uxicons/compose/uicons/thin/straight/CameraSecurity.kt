package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraSecurity: ImageVector? = null

val Icons.Ts.CameraSecurity: ImageVector
    get() = _CameraSecurity ?: UXIcon(name = "CameraSecurity") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(6.01f)
                curveToRelative(-1.01f, 0.88f, -1.73f, 2.08f, -2.0f, 3.4f)
                lineToRelative(-0.12f, 0.6f)
                horizontalLineToRelative(12.22f)
                lineToRelative(-0.12f, -0.6f)
                curveToRelative(-0.27f, -1.32f, -0.99f, -2.52f, -2.0f, -3.4f)
                horizontalLineToRelative(6.01f)
                lineTo(22.0f, 2.5f)
                close()
                moveTo(16.85f, 23f)
                lineTo(7.15f, 23f)
                curveToRelative(0.43f, -1.27f, 1.36f, -2.35f, 2.57f, -2.96f)
                lineToRelative(-0.02f, -0.04f)
                horizontalLineToRelative(4.6f)
                lineToRelative(-0.02f, 0.04f)
                curveToRelative(1.21f, 0.61f, 2.14f, 1.69f, 2.57f, 2.96f)
                close()
                moveTo(21f, 19f)
                lineTo(3f, 19f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(12f, 4f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _CameraSecurity = it}
