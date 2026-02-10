package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Analytics: ImageVector? = null

val Icons.Bs.Analytics: ImageVector
    get() = _Analytics ?: UXIcon(name = "Analytics") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(13.5f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                close()
                moveTo(18.5f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-18.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8f, 4.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(3f, 4.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(18f)
                close()
            }
        }.also { _Analytics = it}
