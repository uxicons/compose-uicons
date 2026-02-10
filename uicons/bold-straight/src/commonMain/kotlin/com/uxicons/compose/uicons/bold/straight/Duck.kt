package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duck: ImageVector? = null

val Icons.Bs.Duck: ImageVector
    get() = _Duck ?: UXIcon(name = "Duck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.5f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-2.16f, -0.93f)
                curveToRelative(-0.65f, -2.9f, -3.25f, -5.08f, -6.34f, -5.08f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0f, 1.16f, 0.31f, 2.26f, 0.85f, 3.2f)
                curveToRelative(-1.48f, 1.49f, -3.96f, 3.41f, -4.86f, 3.41f)
                curveToRelative(-0.19f, -0.06f, -0.68f, -0.71f, -1.01f, -1.15f)
                lineToRelative(-1.79f, -2.28f)
                lineToRelative(-1.06f, 2.19f)
                curveToRelative(-1.5f, 3.11f, -1.52f, 6.11f, -0.05f, 8.46f)
                curveToRelative(1.46f, 2.33f, 4.27f, 3.66f, 7.7f, 3.66f)
                horizontalLineToRelative(6.61f)
                curveToRelative(2.77f, 0f, 5.28f, -1.43f, 6.56f, -3.73f)
                curveToRelative(0.66f, -1.19f, 1.01f, -2.44f, 1.04f, -3.73f)
                curveToRelative(0.05f, -2.31f, -1.24f, -4.5f, -2.45f, -5.95f)
                curveToRelative(0.5f, -0.61f, 0.89f, -1.32f, 1.14f, -2.09f)
                lineToRelative(2.31f, -0.99f)
                close()
                moveTo(15.5f, 3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(20f, 16.47f)
                curveToRelative(-0.02f, 0.8f, -0.24f, 1.58f, -0.66f, 2.34f)
                curveToRelative(-0.75f, 1.35f, -2.27f, 2.19f, -3.94f, 2.19f)
                horizontalLineToRelative(-6.61f)
                curveToRelative(-2.42f, 0f, -4.25f, -0.8f, -5.16f, -2.25f)
                curveToRelative(-0.57f, -0.91f, -0.75f, -2.04f, -0.54f, -3.3f)
                curveToRelative(0.52f, 0.4f, 1.13f, 0.67f, 1.92f, 0.67f)
                curveToRelative(2.14f, 0f, 5.11f, -2.44f, 6.88f, -4.22f)
                curveToRelative(1.04f, 0.7f, 2.28f, 1.11f, 3.62f, 1.11f)
                curveToRelative(0.95f, 0f, 1.86f, -0.21f, 2.68f, -0.58f)
                curveToRelative(0.89f, 1.05f, 1.85f, 2.64f, 1.82f, 4.04f)
                close()
                moveTo(16.25f, 16.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-3.25f, 0f, -5.25f, -1.5f, -5.25f, -1.5f)
                curveToRelative(0f, 0f, 3f, -3.5f, 5.25f, -3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _Duck = it}
