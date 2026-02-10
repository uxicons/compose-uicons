package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHalf: ImageVector? = null

val Icons.Sc.CircleHalf: ImageVector
    get() = _CircleHalf ?: UXIcon(name = "CircleHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2f)
                verticalLineToRelative(20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-7.71f, 0f, -11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _CircleHalf = it}
