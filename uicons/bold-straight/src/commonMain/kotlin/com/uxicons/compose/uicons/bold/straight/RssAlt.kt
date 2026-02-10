package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RssAlt: ImageVector? = null

val Icons.Bs.RssAlt: ImageVector
    get() = _RssAlt ?: UXIcon(name = "RssAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.99f, 21f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveTo(-0.01f, 22.66f, -0.01f, 21f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(-0.01f, 0f)
                verticalLineToRelative(3f)
                curveToRelative(11.58f, 0f, 21f, 9.42f, 21f, 21f)
                horizontalLineToRelative(3f)
                curveTo(23.99f, 10.77f, 13.23f, 0f, -0.01f, 0f)
                close()
                moveTo(-0.01f, 9f)
                verticalLineToRelative(3f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                horizontalLineToRelative(3f)
                curveTo(14.99f, 15.73f, 8.27f, 9f, -0.01f, 9f)
                close()
            }
        }.also { _RssAlt = it}
