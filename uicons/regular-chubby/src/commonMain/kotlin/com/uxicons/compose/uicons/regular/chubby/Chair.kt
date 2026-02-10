package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chair: ImageVector? = null

val Icons.Rc.Chair: ImageVector
    get() = _Chair ?: UXIcon(name = "Chair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.99f, 17.33f)
                curveToRelative(-0.24f, -1.43f, -0.91f, -3.0f, -2.49f, -4.15f)
                curveToRelative(0.2f, -0.98f, 0.29f, -2.09f, 0.29f, -3.39f)
                curveToRelative(0f, -6f, -2.16f, -8.79f, -6.79f, -8.79f)
                reflectiveCurveToRelative(-6.79f, 2.79f, -6.79f, 8.79f)
                curveToRelative(0f, 1.3f, 0.09f, 2.41f, 0.29f, 3.39f)
                curveToRelative(-1.58f, 1.15f, -2.24f, 2.72f, -2.48f, 4.14f)
                curveToRelative(-0.05f, 0.29f, 0.03f, 0.59f, 0.22f, 0.81f)
                curveToRelative(0.19f, 0.23f, 0.47f, 0.35f, 0.77f, 0.35f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.29f, 0f, 0.57f, -0.13f, 0.76f, -0.35f)
                reflectiveCurveToRelative(0.27f, -0.52f, 0.22f, -0.81f)
                close()
                moveTo(16.79f, 9.79f)
                curveToRelative(0f, 0.89f, -0.05f, 1.7f, -0.15f, 2.41f)
                curveToRelative(-0.49f, -0.18f, -1.03f, -0.33f, -1.63f, -0.45f)
                verticalLineToRelative(-7.99f)
                curveToRelative(1.06f, 0.83f, 1.79f, 2.54f, 1.79f, 6.02f)
                close()
                moveTo(13f, 3.04f)
                verticalLineToRelative(8.48f)
                curveToRelative(-0.32f, -0.02f, -0.65f, -0.03f, -1f, -0.03f)
                reflectiveCurveToRelative(-0.68f, 0.01f, -1f, 0.03f)
                verticalLineToRelative(-8.48f)
                curveToRelative(0.33f, -0.04f, 0.67f, -0.05f, 1f, -0.05f)
                curveToRelative(0.34f, 0f, 0.67f, 0.01f, 1f, 0.04f)
                close()
                moveTo(7.21f, 9.79f)
                curveToRelative(0f, -3.43f, 0.74f, -5.14f, 1.79f, -5.98f)
                verticalLineToRelative(7.95f)
                curveToRelative(-0.6f, 0.12f, -1.14f, 0.27f, -1.64f, 0.45f)
                curveToRelative(-0.1f, -0.71f, -0.15f, -1.52f, -0.15f, -2.41f)
                close()
                moveTo(12f, 13.5f)
                curveToRelative(4.63f, 0f, 6.15f, 1.69f, 6.7f, 3f)
                horizontalLineToRelative(-13.39f)
                curveToRelative(0.55f, -1.31f, 2.07f, -3f, 6.7f, -3f)
                close()
            }
        }.also { _Chair = it}
