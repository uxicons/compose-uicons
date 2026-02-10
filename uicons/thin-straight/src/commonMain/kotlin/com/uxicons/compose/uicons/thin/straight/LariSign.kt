package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LariSign: ImageVector? = null

val Icons.Ts.LariSign: ImageVector
    get() = _LariSign ?: UXIcon(name = "LariSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                horizontalLineTo(1f)
                verticalLineToRelative(-1f)
                horizontalLineTo(7.42f)
                curveToRelative(-3.79f, -1.74f, -6.42f, -5.57f, -6.42f, -10f)
                curveTo(1f, 7.97f, 4.39f, 3.72f, 9f, 2.42f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineTo(2.18f)
                curveToRelative(0.65f, -0.12f, 1.32f, -0.18f, 2f, -0.18f)
                reflectiveCurveToRelative(1.35f, 0.06f, 2f, 0.18f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineTo(2.42f)
                curveToRelative(4.61f, 1.31f, 8f, 5.56f, 8f, 10.58f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -4.47f, -2.95f, -8.26f, -7f, -9.54f)
                verticalLineTo(12f)
                horizontalLineToRelative(-1f)
                verticalLineTo(3.2f)
                curveToRelative(-0.65f, -0.13f, -1.32f, -0.2f, -2f, -0.2f)
                reflectiveCurveToRelative(-1.35f, 0.07f, -2f, 0.2f)
                verticalLineTo(12f)
                horizontalLineToRelative(-1f)
                verticalLineTo(3.46f)
                curveToRelative(-4.05f, 1.28f, -7f, 5.07f, -7f, 9.54f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                close()
            }
        }.also { _LariSign = it}
