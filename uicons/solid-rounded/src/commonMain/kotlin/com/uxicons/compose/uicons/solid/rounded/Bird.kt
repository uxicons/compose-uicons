package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bird: ImageVector? = null

val Icons.Sr.Bird: ImageVector
    get() = _Bird ?: UXIcon(name = "Bird") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.5f, 17f)
                horizontalLineToRelative(-1.71f)
                curveToRelative(-1.13f, -1.73f, -1.79f, -3.79f, -1.79f, -6f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                curveToRelative(0.73f, 0f, 1.41f, -0.21f, 2f, -0.56f)
                verticalLineToRelative(2.06f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(24f, 7.25f)
                curveToRelative(0f, 0.46f, -0.27f, 0.87f, -0.69f, 1.04f)
                lineToRelative(-1.31f, 0.56f)
                verticalLineToRelative(2.14f)
                curveToRelative(0f, 5.02f, -3.39f, 9.26f, -8f, 10.57f)
                verticalLineToRelative(1.43f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.05f)
                curveToRelative(-0.33f, 0.03f, -0.66f, 0.05f, -1f, 0.05f)
                reflectiveCurveToRelative(-0.67f, -0.02f, -1f, -0.05f)
                verticalLineToRelative(1.05f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.43f)
                curveToRelative(-1.72f, -0.49f, -3.26f, -1.38f, -4.53f, -2.57f)
                horizontalLineToRelative(0.03f)
                curveToRelative(3.59f, 0f, 6.5f, -2.91f, 6.5f, -6.5f)
                verticalLineToRelative(-6.26f)
                curveTo(10f, 3.0f, 12.46f, 0.17f, 15.69f, 0.01f)
                curveToRelative(3.33f, -0.17f, 6.1f, 2.38f, 6.3f, 5.63f)
                lineToRelative(1.33f, 0.57f)
                curveToRelative(0.42f, 0.18f, 0.69f, 0.59f, 0.69f, 1.04f)
                close()
                moveTo(18f, 5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Bird = it}
