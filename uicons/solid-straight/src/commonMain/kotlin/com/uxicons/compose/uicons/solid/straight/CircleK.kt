package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleK: ImageVector? = null

val Icons.Ss.CircleK: ImageVector
    get() = _CircleK ?: UXIcon(name = "CircleK") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17.25f, 18f)
                horizontalLineToRelative(-2.37f)
                lineToRelative(-2.83f, -5f)
                horizontalLineToRelative(-3.04f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2.85f)
                lineToRelative(3.45f, -5f)
                horizontalLineToRelative(2.45f)
                lineToRelative(-4f, 5.81f)
                lineToRelative(3.5f, 6.19f)
                close()
            }
        }.also { _CircleK = it}
