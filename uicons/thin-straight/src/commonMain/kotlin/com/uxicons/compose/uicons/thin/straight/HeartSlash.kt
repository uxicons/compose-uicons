package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartSlash: ImageVector? = null

val Icons.Ts.HeartSlash: ImageVector
    get() = _HeartSlash ?: UXIcon(name = "HeartSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.25f, 17.54f)
                curveToRelative(2.66f, -2.72f, 5.66f, -6.6f, 5.66f, -10.29f)
                curveToRelative(0f, -3.45f, -2.8f, -6.25f, -6.25f, -6.25f)
                curveToRelative(-2.5f, 0f, -4.78f, 1.85f, -5.75f, 4.36f)
                curveToRelative(-0.97f, -2.5f, -3.25f, -4.36f, -5.75f, -4.36f)
                curveToRelative(-1.23f, 0f, -2.4f, 0.37f, -3.41f, 1.04f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineTo(23.25f, 23.95f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-5.7f, -5.7f)
                close()
                moveTo(6.15f, 2f)
                curveToRelative(2.75f, 0f, 5.25f, 2.86f, 5.25f, 6f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -3.14f, 2.5f, -6f, 5.25f, -6f)
                curveToRelative(2.9f, 0f, 5.25f, 2.35f, 5.25f, 5.25f)
                curveToRelative(0f, 3.36f, -2.83f, 7.0f, -5.36f, 9.59f)
                lineTo(3.46f, 2.76f)
                curveToRelative(0.81f, -0.49f, 1.73f, -0.76f, 2.69f, -0.76f)
                close()
                moveTo(15.37f, 18.9f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(-1.61f, 1.43f, -3.05f, 2.51f, -3.88f, 3.11f)
                lineToRelative(-0.29f, 0.21f)
                lineToRelative(-0.29f, -0.21f)
                curveTo(9.66f, 21.32f, -0.1f, 14.01f, -0.1f, 7.25f)
                curveTo(-0.1f, 6.17f, 0.18f, 5.14f, 0.69f, 4.22f)
                lineToRelative(0.74f, 0.74f)
                curveToRelative(-0.34f, 0.7f, -0.52f, 1.48f, -0.52f, 2.29f)
                curveToRelative(0f, 4.77f, 5.86f, 10.71f, 11f, 14.44f)
                curveToRelative(0.83f, -0.6f, 2.08f, -1.56f, 3.46f, -2.79f)
                close()
            }
        }.also { _HeartSlash = it}
