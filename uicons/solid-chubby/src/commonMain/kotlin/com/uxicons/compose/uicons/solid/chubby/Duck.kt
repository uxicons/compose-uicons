package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duck: ImageVector? = null

val Icons.Sc.Duck: ImageVector
    get() = _Duck ?: UXIcon(name = "Duck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 18f)
                curveToRelative(0f, 0.88f, -0.12f, 1f, -1f, 1f)
                curveToRelative(-1.41f, 0f, -2.58f, -0.53f, -3.35f, -1f)
                curveToRelative(0.76f, -0.47f, 1.93f, -1f, 3.35f, -1f)
                curveToRelative(0.88f, 0f, 1f, 0.12f, 1f, 1f)
                close()
                moveTo(20.29f, 11.18f)
                curveToRelative(1.11f, 1.25f, 1.71f, 2.89f, 1.71f, 4.82f)
                curveToRelative(0f, 4.71f, -2.45f, 7f, -7.5f, 7f)
                horizontalLineToRelative(-2f)
                curveToRelative(-4.94f, 0f, -11.5f, -0.83f, -11.5f, -8f)
                curveToRelative(0f, -2.43f, 0.65f, -4.56f, 1.74f, -5.69f)
                curveToRelative(0.21f, -0.22f, 0.5f, -0.33f, 0.8f, -0.3f)
                curveToRelative(0.3f, 0.02f, 0.57f, 0.18f, 0.74f, 0.42f)
                curveToRelative(0.04f, 0.06f, 1.17f, 1.57f, 3.22f, 1.57f)
                curveToRelative(0.7f, 0f, 1.23f, -0.16f, 1.73f, -0.44f)
                curveToRelative(1.14f, 1.61f, 3.05f, 2.44f, 5.77f, 2.44f)
                curveToRelative(2.36f, 0f, 4.12f, -0.61f, 5.29f, -1.82f)
                close()
                moveTo(17f, 18f)
                curveToRelative(0f, -1.99f, -1.01f, -3f, -3f, -3f)
                curveToRelative(-3.38f, 0f, -5.61f, 2.2f, -5.71f, 2.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.09f, 0.09f, 2.33f, 2.29f, 5.71f, 2.29f)
                curveToRelative(1.99f, 0f, 3f, -1.01f, 3f, -3f)
                close()
                moveTo(22.73f, 5.32f)
                curveToRelative(-0.23f, -0.25f, -0.58f, -0.36f, -0.92f, -0.3f)
                curveToRelative(-1.16f, 0.22f, -1.23f, 0.23f, -1.86f, 0.19f)
                curveToRelative(-0.21f, -2.98f, -1.67f, -4.21f, -4.96f, -4.21f)
                curveToRelative(-3.57f, 0f, -5f, 1.43f, -5f, 5f)
                reflectiveCurveToRelative(1.43f, 5f, 5f, 5f)
                curveToRelative(2.01f, 0f, 3.33f, -0.47f, 4.1f, -1.51f)
                curveToRelative(2.02f, -0.36f, 3.44f, -1.56f, 3.86f, -3.24f)
                curveToRelative(0.09f, -0.33f, -0.01f, -0.68f, -0.24f, -0.93f)
                close()
            }
        }.also { _Duck = it}
