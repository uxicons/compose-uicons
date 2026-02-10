package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eyeshadow: ImageVector? = null

val Icons.Ss.Eyeshadow: ImageVector
    get() = _Eyeshadow ?: UXIcon(name = "Eyeshadow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.78f, 13.22f)
                curveToRelative(-1.52f, -1.52f, -0.6f, -4.91f, 0.92f, -6.44f)
                curveToRelative(1.52f, -1.52f, 3.07f, -0.6f, 4.6f, 0.92f)
                reflectiveCurveToRelative(2.44f, 3.07f, 0.92f, 4.6f)
                reflectiveCurveToRelative(-4.91f, 2.44f, -6.44f, 0.92f)
                close()
                moveTo(17.14f, 8.01f)
                lineTo(22.02f, 2.29f)
                lineTo(19.73f, 0f)
                lineTo(13.92f, 4.82f)
                curveToRelative(0.57f, 0.36f, 1.16f, 0.83f, 1.8f, 1.47f)
                curveToRelative(0.61f, 0.61f, 1.07f, 1.17f, 1.43f, 1.72f)
                close()
                moveTo(17.95f, 10f)
                curveToRelative(0.21f, 1.34f, -0.24f, 2.64f, -1.32f, 3.71f)
                curveToRelative(-1.04f, 1.04f, -2.64f, 1.85f, -4.26f, 2.15f)
                curveToRelative(-0.48f, 0.09f, -0.95f, 0.14f, -1.4f, 0.14f)
                curveToRelative(-1.45f, 0f, -2.7f, -0.47f, -3.6f, -1.37f)
                curveToRelative(-1.11f, -1.11f, -1.55f, -2.74f, -1.29f, -4.63f)
                horizontalLineToRelative(-6.08f)
                verticalLineToRelative(1.62f)
                curveToRelative(0.43f, 0.92f, 1.27f, 2.68f, 3.26f, 4.69f)
                lineToRelative(-2.67f, 3.33f)
                lineToRelative(1.56f, 1.25f)
                lineToRelative(2.62f, -3.28f)
                curveToRelative(0.63f, 0.47f, 1.33f, 0.9f, 2.1f, 1.26f)
                lineToRelative(-1.33f, 3.88f)
                lineToRelative(1.89f, 0.65f)
                lineToRelative(1.32f, -3.85f)
                curveToRelative(0.7f, 0.19f, 1.44f, 0.33f, 2.24f, 0.39f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.05f)
                curveToRelative(0.79f, -0.06f, 1.54f, -0.2f, 2.24f, -0.39f)
                lineToRelative(1.32f, 3.85f)
                lineToRelative(1.89f, -0.65f)
                lineToRelative(-1.33f, -3.88f)
                curveToRelative(0.77f, -0.36f, 1.47f, -0.79f, 2.1f, -1.26f)
                lineToRelative(2.62f, 3.28f)
                lineToRelative(1.56f, -1.25f)
                lineToRelative(-2.67f, -3.33f)
                curveToRelative(1.99f, -2.02f, 2.83f, -3.78f, 3.26f, -4.69f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(-6.05f)
                close()
            }
        }.also { _Eyeshadow = it}
