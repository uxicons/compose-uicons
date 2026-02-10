package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleG: ImageVector? = null

val Icons.Bs.CircleG: ImageVector
    get() = _CircleG ?: UXIcon(name = "CircleG") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(17.0f, 11f)
                lineToRelative(-0.01f, 2.46f)
                curveToRelative(0.06f, 1.38f, -0.59f, 2.74f, -1.77f, 3.68f)
                curveToRelative(-0.92f, 0.73f, -2.06f, 1.11f, -3.22f, 1.11f)
                curveToRelative(-0.48f, 0f, -0.96f, -0.06f, -1.43f, -0.2f)
                curveToRelative(-2.1f, -0.58f, -3.57f, -2.5f, -3.57f, -4.67f)
                verticalLineToRelative(-2.72f)
                curveToRelative(0f, -1.29f, 0.55f, -2.57f, 1.5f, -3.49f)
                curveToRelative(0.99f, -0.96f, 2.3f, -1.48f, 3.67f, -1.42f)
                curveToRelative(1.6f, 0.05f, 3.09f, 0.83f, 3.99f, 2.1f)
                lineToRelative(-2.44f, 1.74f)
                curveToRelative(-0.36f, -0.51f, -0.98f, -0.82f, -1.65f, -0.84f)
                curveToRelative(-0.56f, -0.03f, -1.09f, 0.19f, -1.49f, 0.58f)
                curveToRelative(-0.38f, 0.36f, -0.59f, 0.85f, -0.59f, 1.34f)
                verticalLineToRelative(2.72f)
                curveToRelative(0f, 0.82f, 0.56f, 1.55f, 1.38f, 1.78f)
                curveToRelative(0.7f, 0.2f, 1.45f, 0.06f, 1.99f, -0.38f)
                curveToRelative(0.18f, -0.14f, 0.45f, -0.4f, 0.57f, -0.79f)
                horizontalLineToRelative(-1.93f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }.also { _CircleG = it}
