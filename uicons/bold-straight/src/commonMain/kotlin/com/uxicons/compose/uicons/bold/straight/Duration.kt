package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duration: ImageVector? = null

val Icons.Bs.Duration: ImageVector
    get() = _Duration ?: UXIcon(name = "Duration") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 17f)
                horizontalLineToRelative(-7f)
                reflectiveCurveToRelative(0f, -0.41f, 0f, -0.91f)
                curveToRelative(0f, -1.9f, 1.21f, -3.27f, 2.22f, -4.09f)
                curveToRelative(-1.01f, -0.82f, -2.22f, -2.19f, -2.22f, -4.09f)
                curveToRelative(0f, -0.5f, 0.4f, -0.91f, 0.89f, -0.91f)
                horizontalLineToRelative(5.22f)
                curveToRelative(0.49f, 0f, 0.89f, 0.41f, 0.89f, 0.91f)
                curveToRelative(0f, 1.9f, -1.2f, 3.27f, -2.21f, 4.09f)
                curveToRelative(1.01f, 0.82f, 2.21f, 2.2f, 2.21f, 4.09f)
                curveToRelative(0f, 0.5f, 0f, 0.91f, 0f, 0.91f)
                close()
                moveTo(7.13f, 4.43f)
                lineToRelative(-1.62f, -2.52f)
                curveToRelative(-0.96f, 0.62f, -1.83f, 1.37f, -2.58f, 2.24f)
                lineToRelative(2.27f, 1.97f)
                curveToRelative(0.56f, -0.65f, 1.22f, -1.22f, 1.94f, -1.68f)
                close()
                moveTo(12f, 3f)
                lineTo(12f, 0f)
                curveToRelative(-1.15f, 0f, -2.29f, 0.16f, -3.38f, 0.48f)
                lineToRelative(0.84f, 2.88f)
                curveToRelative(0.82f, -0.24f, 1.67f, -0.36f, 2.54f, -0.36f)
                close()
                moveTo(3.09f, 13.28f)
                lineToRelative(-2.97f, 0.42f)
                curveToRelative(0.16f, 1.14f, 0.48f, 2.24f, 0.96f, 3.28f)
                lineToRelative(2.73f, -1.25f)
                curveToRelative(-0.36f, -0.78f, -0.6f, -1.61f, -0.72f, -2.46f)
                close()
                moveTo(3.81f, 8.26f)
                lineToRelative(-2.73f, -1.25f)
                curveToRelative(-0.48f, 1.04f, -0.8f, 2.15f, -0.96f, 3.28f)
                lineToRelative(2.97f, 0.42f)
                curveToRelative(0.12f, -0.85f, 0.36f, -1.68f, 0.72f, -2.46f)
                close()
                moveTo(19.97f, 3.03f)
                lineToRelative(2.03f, -2.03f)
                horizontalLineToRelative(-4.91f)
                curveToRelative(-0.6f, 0f, -1.09f, 0.49f, -1.09f, 1.09f)
                verticalLineToRelative(4.91f)
                lineToRelative(1.84f, -1.84f)
                curveToRelative(1.99f, 1.7f, 3.16f, 4.19f, 3.16f, 6.84f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                curveToRelative(-2.56f, 0f, -5.0f, -1.09f, -6.71f, -3f)
                lineToRelative(-2.23f, 2.0f)
                curveToRelative(2.27f, 2.54f, 5.54f, 4f, 8.94f, 4f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -3.45f, -1.49f, -6.71f, -4.03f, -8.97f)
                close()
            }
        }.also { _Duration = it}
