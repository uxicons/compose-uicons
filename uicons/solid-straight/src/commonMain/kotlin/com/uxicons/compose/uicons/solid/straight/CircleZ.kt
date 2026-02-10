package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleZ: ImageVector? = null

val Icons.Ss.CircleZ: ImageVector
    get() = _CircleZ ?: UXIcon(name = "CircleZ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-8.36f)
                curveToRelative(-0.66f, 0f, -1.26f, -0.4f, -1.51f, -1.01f)
                curveToRelative(-0.25f, -0.61f, -0.12f, -1.31f, 0.35f, -1.78f)
                lineToRelative(7.02f, -7.2f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.36f)
                curveToRelative(0.66f, 0f, 1.26f, 0.4f, 1.51f, 1.01f)
                curveToRelative(0.25f, 0.61f, 0.12f, 1.31f, -0.35f, 1.78f)
                lineToRelative(-7.02f, 7.2f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _CircleZ = it}
