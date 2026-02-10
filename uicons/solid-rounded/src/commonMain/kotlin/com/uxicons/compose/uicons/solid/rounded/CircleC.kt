package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleC: ImageVector? = null

val Icons.Sr.CircleC: ImageVector
    get() = _CircleC ?: UXIcon(name = "CircleC") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(16.01f, 16.65f)
                curveToRelative(-0.83f, 0.97f, -2.31f, 1.6f, -3.76f, 1.6f)
                horizontalLineToRelative(-0.46f)
                curveToRelative(-2.78f, 0f, -5.05f, -2.28f, -5.05f, -5.09f)
                verticalLineToRelative(-2.32f)
                curveToRelative(0f, -2.81f, 2.27f, -5.09f, 5.05f, -5.09f)
                horizontalLineToRelative(0.46f)
                curveToRelative(1.49f, 0f, 2.9f, 0.71f, 3.8f, 1.9f)
                curveToRelative(0.33f, 0.44f, 0.24f, 1.07f, -0.2f, 1.4f)
                curveToRelative(-0.44f, 0.33f, -1.07f, 0.24f, -1.4f, -0.2f)
                curveToRelative(-0.51f, -0.68f, -1.35f, -1.1f, -2.2f, -1.1f)
                horizontalLineToRelative(-0.46f)
                curveToRelative(-1.71f, 0f, -3.05f, 1.36f, -3.05f, 3.09f)
                verticalLineToRelative(2.32f)
                curveToRelative(0f, 1.73f, 1.34f, 3.09f, 3.05f, 3.09f)
                horizontalLineToRelative(0.46f)
                curveToRelative(0.86f, 0f, 1.78f, -0.37f, 2.24f, -0.9f)
                curveToRelative(0.36f, -0.42f, 0.99f, -0.47f, 1.41f, -0.11f)
                curveToRelative(0.42f, 0.36f, 0.47f, 0.99f, 0.11f, 1.41f)
                close()
            }
        }.also { _CircleC = it}
