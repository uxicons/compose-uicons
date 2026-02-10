package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Iron: ImageVector? = null

val Icons.Sr.Iron: ImageVector
    get() = _Iron ?: UXIcon(name = "Iron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7f)
                curveToRelative(2.97f, 0f, 5.44f, 2.17f, 5.92f, 5f)
                lineTo(10.46f, 9f)
                curveTo(5.27f, 9f, 0.91f, 12.71f, 0.08f, 17.88f)
                curveToRelative(-0.08f, 0.45f, -0.31f, 1.82f, 0.62f, 2.92f)
                curveToRelative(0.68f, 0.8f, 1.77f, 1.21f, 3.26f, 1.21f)
                horizontalLineToRelative(15.04f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                close()
                moveTo(12.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Iron = it}
