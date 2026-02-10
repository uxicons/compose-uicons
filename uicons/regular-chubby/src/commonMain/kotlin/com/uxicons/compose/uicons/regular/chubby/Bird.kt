package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bird: ImageVector? = null

val Icons.Rc.Bird: ImageVector
    get() = _Bird ?: UXIcon(name = "Bird") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(23f, 7f)
                curveToRelative(0f, 0.35f, -0.18f, 0.68f, -0.48f, 0.86f)
                curveToRelative(-0.38f, 0.23f, -0.86f, 0.48f, -1.52f, 0.68f)
                verticalLineToRelative(2.47f)
                curveToRelative(0f, 5.99f, -2.19f, 9.03f, -7.19f, 9.8f)
                curveToRelative(0.07f, 0.35f, 0.14f, 0.71f, 0.18f, 1.07f)
                curveToRelative(0.07f, 0.55f, -0.32f, 1.05f, -0.86f, 1.12f)
                curveToRelative(-0.54f, 0.07f, -1.05f, -0.31f, -1.12f, -0.86f)
                curveToRelative(-0.05f, -0.4f, -0.13f, -0.78f, -0.21f, -1.15f)
                curveToRelative(-0.26f, 0.01f, -0.52f, 0.02f, -0.8f, 0.02f)
                curveToRelative(-0.25f, 0f, -0.49f, -0.01f, -0.73f, -0.02f)
                curveToRelative(0.06f, 0.29f, 0.11f, 0.59f, 0.15f, 0.89f)
                curveToRelative(0.07f, 0.55f, -0.32f, 1.05f, -0.86f, 1.12f)
                curveToRelative(-0.54f, 0.07f, -1.05f, -0.31f, -1.12f, -0.86f)
                curveToRelative(-0.06f, -0.46f, -0.15f, -0.91f, -0.26f, -1.33f)
                curveToRelative(-4.99f, -0.77f, -7.17f, -3.82f, -7.17f, -9.79f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 2.3f, 0.7f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -0.7f, 3f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.15f, 1.85f, -6f, 6f, -6f)
                curveToRelative(3.58f, 0f, 5.44f, 1.39f, 5.89f, 4.43f)
                curveToRelative(0.71f, 0.2f, 1.23f, 0.47f, 1.63f, 0.71f)
                curveToRelative(0.3f, 0.18f, 0.48f, 0.51f, 0.48f, 0.86f)
                close()
                moveTo(19f, 7f)
                curveToRelative(0f, -3.03f, -0.97f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 0.97f, -4f, 4f)
                verticalLineToRelative(0.83f)
                curveToRelative(1.34f, 0.79f, 2f, 2.16f, 2f, 4.17f)
                curveToRelative(0f, 4.48f, -3.42f, 5f, -6f, 5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(3.38f, 0f, 4f, -1.01f, 4f, -3f)
                curveToRelative(0f, -0.79f, -0.13f, -1.33f, -0.33f, -1.72f)
                curveToRelative(-0.62f, 1.84f, -2.14f, 2.71f, -4.67f, 2.71f)
                curveToRelative(-1.21f, 0f, -2.19f, -0.2f, -2.96f, -0.61f)
                curveToRelative(0.33f, 4.85f, 2.54f, 6.61f, 7.96f, 6.61f)
                curveToRelative(5.91f, 0f, 8f, -2.09f, 8f, -8f)
                close()
            }
        }.also { _Bird = it}
