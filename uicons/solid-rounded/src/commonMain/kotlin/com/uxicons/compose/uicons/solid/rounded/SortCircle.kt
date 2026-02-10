package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircle: ImageVector? = null

val Icons.Sr.SortCircle: ImageVector
    get() = _SortCircle ?: UXIcon(name = "SortCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17.76f, 14.52f)
                lineToRelative(-4.61f, 4.5f)
                curveToRelative(-0.64f, 0.64f, -1.66f, 0.64f, -2.3f, 0f)
                lineToRelative(-4.61f, -4.5f)
                curveToRelative(-0.57f, -0.56f, -0.17f, -1.52f, 0.62f, -1.52f)
                horizontalLineToRelative(10.27f)
                curveToRelative(0.8f, 0f, 1.19f, 0.97f, 0.62f, 1.52f)
                close()
                moveTo(17.14f, 11f)
                lineTo(6.86f, 11f)
                curveToRelative(-0.8f, 0f, -1.19f, -0.97f, -0.62f, -1.52f)
                lineToRelative(4.61f, -4.5f)
                curveToRelative(0.64f, -0.64f, 1.66f, -0.64f, 2.3f, 0f)
                lineToRelative(4.61f, 4.5f)
                curveToRelative(0.57f, 0.56f, 0.17f, 1.52f, -0.62f, 1.52f)
                close()
            }
        }.also { _SortCircle = it}
