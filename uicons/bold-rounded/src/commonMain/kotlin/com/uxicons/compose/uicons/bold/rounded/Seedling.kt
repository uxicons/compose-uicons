package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seedling: ImageVector? = null

val Icons.Br.Seedling: ImageVector
    get() = _Seedling ?: UXIcon(name = "Seedling") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.1f, 0.71f)
            curveToRelative(-0.58f, -0.53f, -1.36f, -0.78f, -2.14f, -0.69f)
            curveToRelative(-4.73f, 0.56f, -7.48f, 3.44f, -8.96f, 6.48f)
            curveTo(10.51f, 3.46f, 7.77f, 0.58f, 3.04f, 0.02f)
            curveToRelative(-0.78f, -0.09f, -1.56f, 0.16f, -2.14f, 0.69f)
            curveTo(0.31f, 1.25f, -0.02f, 2.01f, 0f, 2.81f)
            curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
            curveToRelative(0.09f, 3.38f, 1.19f, 6.07f, 3.28f, 7.99f)
            curveToRelative(2.36f, 2.16f, 5.39f, 2.76f, 7.22f, 2.91f)
            verticalLineToRelative(8.8f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-8.8f)
            curveToRelative(1.82f, -0.15f, 4.85f, -0.75f, 7.22f, -2.91f)
            curveToRelative(2.09f, -1.92f, 3.2f, -4.6f, 3.28f, -7.99f)
            curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
            curveToRelative(0.02f, -0.79f, -0.31f, -1.56f, -0.9f, -2.1f)
            close()
            moveTo(5.29f, 8.56f)
            curveToRelative(-1.4f, -1.29f, -2.17f, -3.14f, -2.28f, -5.52f)
            curveToRelative(5.12f, 0.78f, 6.75f, 5.17f, 7.26f, 7.62f)
            curveToRelative(-1.41f, -0.18f, -3.44f, -0.68f, -4.98f, -2.1f)
            close()
            moveTo(18.7f, 8.56f)
            curveToRelative(-1.54f, 1.42f, -3.57f, 1.92f, -4.98f, 2.1f)
            curveToRelative(0.51f, -2.46f, 2.14f, -6.84f, 7.26f, -7.62f)
            curveToRelative(-0.12f, 2.38f, -0.89f, 4.24f, -2.28f, 5.52f)
            close()
        }
    }.also { _Seedling = it }
