package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cubes: ImageVector? = null

val Icons.Sc.Cubes: ImageVector
    get() = _Cubes ?: UXIcon(name = "Cubes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.08f, 3.54f)
                curveToRelative(1.42f, -1.27f, 3.0f, -2.12f, 4.7f, -2.51f)
                curveToRelative(0.15f, -0.04f, 0.3f, -0.04f, 0.45f, 0f)
                curveToRelative(1.7f, 0.4f, 3.27f, 1.24f, 4.7f, 2.51f)
                curveToRelative(-1.5f, 1.47f, -3.15f, 2.47f, -4.92f, 2.93f)
                curveToRelative(-1.78f, -0.46f, -3.42f, -1.46f, -4.92f, -2.93f)
                close()
                moveTo(11f, 8.26f)
                curveToRelative(-1.8f, -0.55f, -3.48f, -1.54f, -5f, -2.96f)
                verticalLineToRelative(4.44f)
                curveToRelative(-1.51f, 0.48f, -2.91f, 1.36f, -4.18f, 2.56f)
                curveToRelative(1.56f, 1.61f, 3.3f, 2.67f, 5.17f, 3.16f)
                curveToRelative(1.45f, -0.38f, 2.79f, -1.19f, 4.02f, -2.39f)
                verticalLineToRelative(-4.8f)
                close()
                moveTo(18f, 9.74f)
                verticalLineToRelative(-4.43f)
                curveToRelative(-1.52f, 1.42f, -3.2f, 2.4f, -5f, 2.96f)
                verticalLineToRelative(4.8f)
                curveToRelative(1.22f, 1.21f, 2.57f, 2.01f, 4.02f, 2.39f)
                curveToRelative(1.87f, -0.49f, 3.61f, -1.55f, 5.17f, -3.16f)
                curveToRelative(-1.28f, -1.2f, -2.67f, -2.08f, -4.18f, -2.56f)
                close()
                moveTo(6f, 17.26f)
                curveToRelative(-1.8f, -0.55f, -3.48f, -1.54f, -5f, -2.96f)
                verticalLineToRelative(4.7f)
                curveToRelative(0f, 0.26f, 0.1f, 0.5f, 0.28f, 0.69f)
                curveToRelative(1.42f, 1.49f, 3.0f, 2.52f, 4.72f, 3.07f)
                close()
                moveTo(18f, 17.26f)
                verticalLineToRelative(5.5f)
                curveToRelative(1.72f, -0.55f, 3.31f, -1.58f, 4.72f, -3.07f)
                curveToRelative(0.18f, -0.19f, 0.28f, -0.43f, 0.28f, -0.69f)
                verticalLineToRelative(-4.7f)
                curveToRelative(-1.52f, 1.42f, -3.2f, 2.4f, -5f, 2.96f)
                close()
                moveTo(16f, 17.24f)
                curveToRelative(-1.43f, -0.46f, -2.78f, -1.23f, -4f, -2.34f)
                curveToRelative(-1.22f, 1.11f, -2.57f, 1.88f, -4f, 2.34f)
                verticalLineToRelative(5.5f)
                curveToRelative(1.43f, -0.46f, 2.78f, -1.23f, 4f, -2.34f)
                curveToRelative(1.22f, 1.11f, 2.57f, 1.88f, 4f, 2.34f)
                close()
            }
        }.also { _Cubes = it}
