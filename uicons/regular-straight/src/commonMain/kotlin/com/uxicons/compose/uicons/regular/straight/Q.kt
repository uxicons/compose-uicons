package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Q: ImageVector? = null

val Icons.Rs.Q: ImageVector
    get() = _Q ?: UXIcon(name = "Q") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.96f, 22.55f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(1.15f, -1.63f, 1.83f, -3.62f, 1.83f, -5.76f)
                verticalLineToRelative(-4f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                curveToRelative(2.65f, 0f, 5.07f, -1.04f, 6.86f, -2.73f)
                lineToRelative(2.69f, 2.69f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                verticalLineToRelative(-4f)
                curveTo(4f, 5.59f, 7.59f, 2f, 12f, 2f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.59f, -0.47f, 3.07f, -1.27f, 4.32f)
                lineToRelative(-2.28f, -2.28f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.41f, 2.41f)
                curveToRelative(-1.43f, 1.33f, -3.34f, 2.14f, -5.44f, 2.14f)
                close()
            }
        }.also { _Q = it}
