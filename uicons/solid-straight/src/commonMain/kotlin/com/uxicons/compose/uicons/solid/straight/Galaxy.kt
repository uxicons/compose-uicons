package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Galaxy: ImageVector? = null

val Icons.Ss.Galaxy: ImageVector
    get() = _Galaxy ?: UXIcon(name = "Galaxy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 14.54f)
                curveToRelative(-0.0f, -3.99f, -2.62f, -7.62f, -6.5f, -8.57f)
                curveToRelative(-1.31f, -0.32f, -2.58f, -0.33f, -3.76f, -0.09f)
                curveToRelative(-0.43f, 0.09f, -0.77f, -0.33f, -0.64f, -0.75f)
                curveToRelative(0.63f, -2.01f, 1.79f, -3.78f, 3.33f, -5.14f)
                horizontalLineToRelative(-1.9f)
                curveToRelative(-3.99f, 0.0f, -7.62f, 2.62f, -8.57f, 6.5f)
                curveToRelative(-0.32f, 1.31f, -0.33f, 2.58f, -0.09f, 3.75f)
                curveToRelative(0.09f, 0.43f, -0.33f, 0.77f, -0.75f, 0.64f)
                curveToRelative(-2.01f, -0.63f, -3.78f, -1.79f, -5.14f, -3.33f)
                verticalLineToRelative(1.9f)
                curveToRelative(0.0f, 3.99f, 2.62f, 7.62f, 6.5f, 8.57f)
                curveToRelative(1.31f, 0.32f, 2.58f, 0.33f, 3.76f, 0.09f)
                curveToRelative(0.43f, -0.09f, 0.77f, 0.33f, 0.64f, 0.75f)
                curveToRelative(-0.63f, 2.01f, -1.79f, 3.78f, -3.33f, 5.14f)
                horizontalLineToRelative(1.9f)
                curveToRelative(3.99f, -0.0f, 7.62f, -2.62f, 8.57f, -6.5f)
                curveToRelative(0.32f, -1.31f, 0.33f, -2.58f, 0.09f, -3.76f)
                curveToRelative(-0.09f, -0.43f, 0.33f, -0.77f, 0.75f, -0.64f)
                curveToRelative(2.01f, 0.63f, 3.78f, 1.79f, 5.14f, 3.33f)
                verticalLineToRelative(-1.9f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Galaxy = it}
