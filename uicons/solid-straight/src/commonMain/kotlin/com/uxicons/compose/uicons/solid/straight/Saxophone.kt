package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Saxophone: ImageVector? = null

val Icons.Ss.Saxophone: ImageVector
    get() = _Saxophone ?: UXIcon(name = "Saxophone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 0f)
                curveToRelative(-1.32f, 0f, -2.48f, 0.85f, -2.87f, 2.11f)
                curveToRelative(-0.07f, 0.23f, -0.15f, 0.5f, -0.24f, 0.78f)
                lineToRelative(-0.07f, -0.02f)
                curveToRelative(-0.77f, -0.24f, -1.34f, -0.42f, -1.75f, -0.55f)
                lineToRelative(-0.65f, 1.89f)
                curveToRelative(0.41f, 0.14f, 1.0f, 0.32f, 1.8f, 0.57f)
                lineToRelative(0.09f, 0.03f)
                curveToRelative(-0.23f, 0.78f, -0.48f, 1.62f, -0.73f, 2.51f)
                lineToRelative(-0.23f, -0.07f)
                curveToRelative(-0.78f, -0.24f, -1.36f, -0.42f, -1.76f, -0.56f)
                lineToRelative(-0.65f, 1.89f)
                curveToRelative(0.42f, 0.14f, 1.01f, 0.33f, 1.81f, 0.57f)
                lineToRelative(0.26f, 0.08f)
                curveToRelative(-0.26f, 0.89f, -0.52f, 1.78f, -0.77f, 2.65f)
                curveToRelative(-0.83f, 2.37f, -2.23f, 5.11f, -3.76f, 5.11f)
                curveToRelative(-1.33f, 0f, -1.49f, -1.06f, -1.5f, -1.5f)
                verticalLineToRelative(-2.49f)
                curveToRelative(0.01f, -0.47f, 0.17f, -2.01f, 2f, -2.01f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                curveToRelative(1.83f, 0f, 1.99f, 1.54f, 2f, 2.01f)
                lineToRelative(0.03f, 3.32f)
                curveToRelative(0f, 2.98f, 1.22f, 5.41f, 3.35f, 6.67f)
                curveToRelative(1.08f, 0.64f, 2.32f, 0.98f, 3.6f, 1.0f)
                curveToRelative(0.04f, 0f, 0.08f, 0f, 0.12f, 0f)
                curveToRelative(3.19f, 0f, 6.06f, -1.94f, 7.02f, -4.75f)
                curveToRelative(0.38f, -1.13f, 1.16f, -3.75f, 2.02f, -6.68f)
                curveToRelative(0.4f, -1.15f, 2.44f, -8.37f, 2.9f, -9.87f)
                curveToRelative(0.13f, -0.42f, 0.51f, -0.7f, 0.95f, -0.7f)
                horizontalLineToRelative(2.02f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2.02f)
                close()
            }
        }.also { _Saxophone = it}
