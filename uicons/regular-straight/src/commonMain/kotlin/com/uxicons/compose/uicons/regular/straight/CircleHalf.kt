package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHalf: ImageVector? = null

val Icons.Rs.CircleHalf: ImageVector
    get() = _CircleHalf ?: UXIcon(name = "CircleHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                horizontalLineToRelative(-1f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                horizontalLineToRelative(1f)
                verticalLineTo(24f)
                close()
                moveTo(11f, 2.05f)
                curveTo(5.95f, 2.55f, 2f, 6.82f, 2f, 12f)
                reflectiveCurveToRelative(3.95f, 9.45f, 9f, 9.95f)
                verticalLineTo(2.05f)
                close()
            }
        }.also { _CircleHalf = it}
