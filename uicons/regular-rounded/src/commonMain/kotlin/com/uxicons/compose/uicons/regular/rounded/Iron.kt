package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Iron: ImageVector? = null

val Icons.Rr.Iron: ImageVector
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
                moveTo(22f, 17f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3.96f, 20f)
                curveToRelative(-0.86f, 0f, -1.46f, -0.17f, -1.73f, -0.5f)
                curveToRelative(-0.32f, -0.39f, -0.21f, -1.04f, -0.16f, -1.35f)
                curveToRelative(0.66f, -4.14f, 4.19f, -7.15f, 8.39f, -7.15f)
                horizontalLineToRelative(11.54f)
                verticalLineToRelative(6f)
                close()
                moveTo(11f, 15.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Iron = it}
