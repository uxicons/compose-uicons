package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleThreeQuarters: ImageVector? = null

val Icons.Bs.CircleThreeQuarters: ImageVector
    get() = _CircleThreeQuarters ?: UXIcon(name = "CircleThreeQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                horizontalLineToRelative(2f)
                verticalLineTo(10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                close()
                moveTo(11f, 3.06f)
                curveTo(6.51f, 3.55f, 3f, 7.38f, 3f, 12f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                curveToRelative(4.62f, 0f, 8.45f, -3.51f, 8.94f, -8f)
                horizontalLineTo(11f)
                verticalLineTo(3.06f)
                close()
            }
        }.also { _CircleThreeQuarters = it}
