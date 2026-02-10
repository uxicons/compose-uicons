package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hook: ImageVector? = null

val Icons.Ts.Hook: ImageVector
    get() = _Hook ?: UXIcon(name = "Hook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.93f, 8.55f)
                curveToRelative(-1.46f, -0.57f, -2.43f, -2.05f, -2.43f, -3.67f)
                verticalLineToRelative(-0.95f)
                curveToRelative(0.86f, -0.22f, 1.5f, -1f, 1.5f, -1.93f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.93f, 0.64f, 1.71f, 1.5f, 1.93f)
                verticalLineToRelative(0.95f)
                curveToRelative(0f, 2.03f, 1.23f, 3.88f, 3.07f, 4.61f)
                curveToRelative(2.69f, 1.06f, 4.43f, 3.62f, 4.43f, 6.51f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                curveToRelative(-3.52f, 0f, -6.44f, -2.61f, -6.93f, -6f)
                horizontalLineToRelative(2.14f)
                lineToRelative(-3.21f, -3.21f)
                verticalLineToRelative(2.21f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.31f, -1.99f, -6.23f, -5.07f, -7.45f)
                close()
                moveTo(11f, 2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _Hook = it}
