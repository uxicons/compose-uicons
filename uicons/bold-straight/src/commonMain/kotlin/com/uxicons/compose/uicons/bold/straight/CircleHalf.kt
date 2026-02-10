package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHalf: ImageVector? = null

val Icons.Bs.CircleHalf: ImageVector
    get() = _CircleHalf ?: UXIcon(name = "CircleHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                horizontalLineToRelative(-2f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                horizontalLineToRelative(2f)
                verticalLineTo(24f)
                close()
                moveTo(11f, 3.06f)
                curveTo(6.51f, 3.55f, 3f, 7.38f, 3f, 12f)
                reflectiveCurveToRelative(3.51f, 8.45f, 8f, 8.94f)
                verticalLineTo(3.06f)
                close()
            }
        }.also { _CircleHalf = it}
