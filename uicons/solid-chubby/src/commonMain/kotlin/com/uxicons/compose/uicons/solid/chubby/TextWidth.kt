package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextWidth: ImageVector? = null

val Icons.Sc.TextWidth: ImageVector
    get() = _TextWidth ?: UXIcon(name = "TextWidth") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.0f, 5.39f)
                curveToRelative(0.09f, -1.25f, 0.4f, -2.42f, 0.41f, -2.46f)
                curveToRelative(0.12f, -0.47f, 0.47f, -0.85f, 0.92f, -1.02f)
                curveToRelative(0.1f, -0.04f, 2.44f, -0.91f, 6.67f, -0.91f)
                reflectiveCurveToRelative(6.57f, 0.87f, 6.67f, 0.91f)
                curveToRelative(0.45f, 0.17f, 0.79f, 0.55f, 0.92f, 1.02f)
                curveToRelative(0.01f, 0.05f, 0.32f, 1.21f, 0.41f, 2.46f)
                curveToRelative(0.06f, 0.83f, -0.56f, 1.54f, -1.39f, 1.6f)
                curveToRelative(-0.81f, 0.06f, -1.55f, -0.56f, -1.6f, -1.39f)
                curveToRelative(-0.03f, -0.39f, -0.09f, -0.78f, -0.14f, -1.1f)
                curveToRelative(-0.68f, -0.16f, -1.81f, -0.37f, -3.36f, -0.46f)
                verticalLineToRelative(10.46f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-10.46f)
                curveToRelative(-1.54f, 0.09f, -2.68f, 0.3f, -3.36f, 0.46f)
                curveToRelative(-0.06f, 0.32f, -0.12f, 0.71f, -0.14f, 1.1f)
                curveToRelative(-0.06f, 0.83f, -0.76f, 1.44f, -1.6f, 1.39f)
                curveToRelative(-0.83f, -0.06f, -1.45f, -0.78f, -1.39f, -1.6f)
                close()
                moveTo(22.8f, 18.4f)
                curveToRelative(-0.91f, -1.21f, -1.98f, -2.29f, -3.2f, -3.2f)
                curveToRelative(-0.62f, -0.5f, -1.63f, 0f, -1.6f, 0.8f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.03f, -0.8f, -0.98f, -1.3f, -1.6f, -0.8f)
                curveToRelative(-1.22f, 0.91f, -2.29f, 1.99f, -3.2f, 3.2f)
                curveToRelative(-0.27f, 0.35f, -0.27f, 0.84f, 0f, 1.2f)
                curveToRelative(0.91f, 1.21f, 1.99f, 2.29f, 3.2f, 3.2f)
                curveToRelative(0.62f, 0.5f, 1.63f, -0.0f, 1.6f, -0.8f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1.5f)
                curveToRelative(-0.03f, 0.8f, 0.98f, 1.3f, 1.6f, 0.8f)
                curveToRelative(1.21f, -0.91f, 2.29f, -1.99f, 3.2f, -3.2f)
                curveToRelative(0.27f, -0.36f, 0.27f, -0.84f, 0f, -1.2f)
                close()
            }
        }.also { _TextWidth = it}
