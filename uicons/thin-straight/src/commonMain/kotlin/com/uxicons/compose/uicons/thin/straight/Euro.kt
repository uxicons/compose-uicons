package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Euro: ImageVector? = null

val Icons.Ts.Euro: ImageVector
    get() = _Euro ?: UXIcon(name = "Euro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 23f)
                curveToRelative(-5.03f, 0f, -9.28f, -3.39f, -10.58f, -8f)
                horizontalLineToRelative(12.58f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3.18f)
                curveToRelative(-0.12f, -0.65f, -0.18f, -1.32f, -0.18f, -2f)
                reflectiveCurveToRelative(0.06f, -1.35f, 0.18f, -2f)
                horizontalLineToRelative(12.82f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3.42f)
                curveTo(4.72f, 4.39f, 8.97f, 1f, 14f, 1f)
                curveToRelative(3.29f, 0f, 6.39f, 1.46f, 8.49f, 4f)
                lineToRelative(0.77f, -0.64f)
                curveTo(20.97f, 1.59f, 17.59f, 0f, 14f, 0f)
                curveTo(8.42f, 0f, 3.71f, 3.83f, 2.38f, 9f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.17f)
                curveToRelative(-0.11f, 0.65f, -0.17f, 1.32f, -0.17f, 2f)
                reflectiveCurveToRelative(0.06f, 1.35f, 0.17f, 2f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.38f)
                curveToRelative(1.34f, 5.17f, 6.04f, 9f, 11.62f, 9f)
                curveToRelative(3.59f, 0f, 6.97f, -1.59f, 9.26f, -4.36f)
                lineToRelative(-0.77f, -0.64f)
                curveToRelative(-2.1f, 2.54f, -5.19f, 4f, -8.49f, 4f)
                close()
            }
        }.also { _Euro = it}
