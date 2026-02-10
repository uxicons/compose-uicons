package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sr6: ImageVector? = null

val Icons.Sr.Sr6: ImageVector
    get() = _Sr6 ?: UXIcon(name = "Sr6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.01f, 16.13f)
                curveToRelative(0.19f, 4.25f, 3.46f, 7.67f, 7.6f, 7.86f)
                curveToRelative(2.14f, 0.1f, 4.22f, -0.65f, 5.81f, -2.1f)
                curveToRelative(1.59f, -1.46f, 2.5f, -3.45f, 2.58f, -5.6f)
                curveToRelative(0.07f, -2.1f, -0.74f, -4.2f, -2.23f, -5.77f)
                curveToRelative(-1.51f, -1.59f, -3.51f, -2.48f, -5.64f, -2.51f)
                curveToRelative(-2.11f, -0.02f, -4.2f, 0.78f, -5.74f, 2.3f)
                curveToRelative(-0.14f, 0.13f, -0.27f, 0.27f, -0.39f, 0.41f)
                verticalLineToRelative(-0.71f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                curveTo(8.49f, 0f, 4f, 4.49f, 4f, 10f)
                curveToRelative(0f, 0f, 0.0f, 6.09f, 0.01f, 6.13f)
                close()
                moveTo(12f, 10f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                close()
            }
        }.also { _Sr6 = it}
