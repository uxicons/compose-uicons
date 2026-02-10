package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleThreeQuarters: ImageVector? = null

val Icons.Rs.CircleThreeQuarters: ImageVector
    get() = _CircleThreeQuarters ?: UXIcon(name = "CircleThreeQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                horizontalLineToRelative(1f)
                verticalLineTo(11f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                close()
                moveTo(11f, 2.05f)
                curveTo(5.95f, 2.55f, 2f, 6.82f, 2f, 12f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                curveToRelative(5.18f, 0f, 9.45f, -3.95f, 9.95f, -9f)
                horizontalLineTo(11f)
                verticalLineTo(2.05f)
                close()
            }
        }.also { _CircleThreeQuarters = it}
