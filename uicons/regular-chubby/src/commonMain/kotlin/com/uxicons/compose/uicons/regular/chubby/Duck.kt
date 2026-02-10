package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duck: ImageVector? = null

val Icons.Rc.Duck: ImageVector
    get() = _Duck ?: UXIcon(name = "Duck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 13f)
                curveToRelative(-3.38f, 0f, -5.61f, 2.2f, -5.71f, 2.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.09f, 0.09f, 2.33f, 2.29f, 5.71f, 2.29f)
                curveToRelative(1.99f, 0f, 3f, -1.01f, 3f, -3f)
                reflectiveCurveToRelative(-1.01f, -3f, -3f, -3f)
                close()
                moveTo(14f, 17f)
                curveToRelative(-1.41f, 0f, -2.58f, -0.53f, -3.35f, -1f)
                curveToRelative(0.76f, -0.47f, 1.93f, -1f, 3.35f, -1f)
                curveToRelative(0.88f, 0f, 1f, 0.12f, 1f, 1f)
                reflectiveCurveToRelative(-0.12f, 1f, -1f, 1f)
                close()
                moveTo(22.73f, 5.32f)
                curveToRelative(-0.23f, -0.25f, -0.58f, -0.36f, -0.92f, -0.3f)
                curveToRelative(-1.18f, 0.22f, -1.23f, 0.23f, -1.9f, 0.19f)
                curveToRelative(-0.38f, -2.86f, -2.13f, -4.21f, -5.42f, -4.21f)
                curveToRelative(-3.75f, 0f, -5.5f, 1.75f, -5.5f, 5.5f)
                curveToRelative(0f, 1.53f, 0.31f, 2.72f, 0.91f, 3.6f)
                curveToRelative(-0.74f, 0.59f, -1.4f, 0.9f, -2.41f, 0.9f)
                curveToRelative(-2.06f, 0f, -3.18f, -1.51f, -3.22f, -1.57f)
                curveToRelative(-0.17f, -0.24f, -0.44f, -0.4f, -0.74f, -0.42f)
                curveToRelative(-0.3f, -0.02f, -0.59f, 0.09f, -0.8f, 0.3f)
                curveToRelative(-1.09f, 1.13f, -1.74f, 3.26f, -1.74f, 5.69f)
                curveToRelative(0f, 7.17f, 6.56f, 8f, 11.5f, 8f)
                horizontalLineToRelative(2f)
                curveToRelative(5.05f, 0f, 7.5f, -2.29f, 7.5f, -7f)
                curveToRelative(0f, -2.54f, -1.04f, -4.58f, -2.93f, -5.88f)
                curveToRelative(0.15f, -0.22f, 0.28f, -0.46f, 0.39f, -0.71f)
                curveToRelative(1.85f, -0.46f, 3.1f, -1.57f, 3.51f, -3.16f)
                curveToRelative(0.09f, -0.33f, -0.01f, -0.68f, -0.24f, -0.93f)
                close()
                moveTo(14.5f, 3f)
                curveToRelative(2.65f, 0f, 3.5f, 0.85f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-0.85f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -0.85f, -3.5f, -3.5f)
                reflectiveCurveToRelative(0.85f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(14.5f, 21f)
                horizontalLineToRelative(-2f)
                curveToRelative(-8.35f, 0f, -9.5f, -2.88f, -9.5f, -6f)
                curveToRelative(0f, -1.32f, 0.23f, -2.54f, 0.62f, -3.42f)
                curveToRelative(0.81f, 0.67f, 2.11f, 1.42f, 3.88f, 1.42f)
                curveToRelative(1.89f, 0f, 3.05f, -0.79f, 3.98f, -1.59f)
                curveToRelative(0.81f, 0.38f, 1.8f, 0.59f, 3.02f, 0.59f)
                curveToRelative(1.18f, 0f, 2.13f, -0.19f, 2.92f, -0.55f)
                curveToRelative(1.68f, 0.9f, 2.58f, 2.46f, 2.58f, 4.54f)
                curveToRelative(0f, 3.55f, -1.59f, 5f, -5.5f, 5f)
                close()
            }
        }.also { _Duck = it}
