package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHalf: ImageVector? = null

val Icons.Ts.CircleHalf: ImageVector
    get() = _CircleHalf ?: UXIcon(name = "CircleHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                horizontalLineToRelative(-1f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                horizontalLineToRelative(1f)
                verticalLineTo(24f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                verticalLineTo(1f)
                close()
            }
        }.also { _CircleHalf = it}
