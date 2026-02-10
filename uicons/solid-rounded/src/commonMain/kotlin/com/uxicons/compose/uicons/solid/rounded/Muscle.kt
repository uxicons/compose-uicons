package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Muscle: ImageVector? = null

val Icons.Sr.Muscle: ImageVector
    get() = _Muscle ?: UXIcon(name = "Muscle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19.07f)
                curveToRelative(0f, 1.17f, -0.68f, 2.23f, -1.75f, 2.73f)
                curveToRelative(-1.99f, 0.93f, -5.58f, 2.2f, -10.25f, 2.2f)
                curveToRelative(-4.91f, 0f, -9.17f, -2.34f, -10.79f, -3.9f)
                curveTo(0.42f, 19.36f, -0.01f, 18.33f, -0.01f, 17.25f)
                curveTo(-0.01f, 13.64f, 0.41f, 5.57f, 6.29f, 1.05f)
                curveTo(6.29f, 1.05f, 7.5f, -0.02f, 9f, -0.02f)
                curveToRelative(1.54f, 0f, 2.56f, 0.79f, 2.93f, 1.62f)
                curveToRelative(0.2f, 0.45f, -0.04f, 0.97f, -0.49f, 1.15f)
                lineToRelative(-1.42f, 0.52f)
                lineToRelative(-0.02f, 0.53f)
                curveToRelative(-0.0f, 0.38f, -0.3f, 0.68f, -0.67f, 0.7f)
                lineToRelative(-2.15f, 0.65f)
                curveToRelative(-0.55f, 1.56f, 0.48f, 6.58f, -0.86f, 10.1f)
                curveToRelative(0.53f, -0.64f, 2.85f, -3.18f, 6.18f, -3.25f)
                curveToRelative(2.1f, -0.04f, 4.12f, 1.92f, 4.17f, 1.97f)
                curveToRelative(0.2f, 0.2f, 0.46f, 0.3f, 0.72f, 0.3f)
                curveToRelative(0.25f, 0f, 0.5f, -0.1f, 0.7f, -0.28f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.02f, -1.41f)
                curveToRelative(-0.05f, -0.05f, -0.58f, -0.59f, -1.43f, -1.17f)
                curveToRelative(0.88f, -0.72f, 2.06f, -1.43f, 3.32f, -1.43f)
                curveToRelative(0.45f, 0f, 0.88f, 0.02f, 1.3f, 0.06f)
                curveToRelative(1.54f, 0.13f, 2.7f, 1.44f, 2.7f, 2.99f)
                verticalLineToRelative(6.05f)
                close()
            }
        }.also { _Muscle = it}
