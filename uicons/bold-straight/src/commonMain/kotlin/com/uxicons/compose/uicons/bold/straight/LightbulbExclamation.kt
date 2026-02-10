package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightbulbExclamation: ImageVector? = null

val Icons.Bs.LightbulbExclamation: ImageVector
    get() = _LightbulbExclamation ?: UXIcon(name = "LightbulbExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.99f, 2.29f)
                curveTo(16.08f, 0.58f, 13.52f, -0.23f, 10.95f, 0.06f)
                curveTo(6.9f, 0.52f, 3.58f, 3.78f, 3.07f, 7.83f)
                curveToRelative(-0.36f, 2.83f, 0.86f, 6.01f, 3.11f, 8.1f)
                curveToRelative(1.17f, 1.09f, 1.82f, 2.47f, 1.82f, 3.87f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4.05f)
                curveToRelative(0f, -1.42f, 0.83f, -3.22f, 1.93f, -4.19f)
                curveToRelative(1.95f, -1.71f, 3.07f, -4.17f, 3.07f, -6.76f)
                curveToRelative(0f, -2.56f, -1.1f, -5.01f, -3.01f, -6.71f)
                close()
                moveTo(15.95f, 13.51f)
                curveToRelative(-1.28f, 1.12f, -2.25f, 2.78f, -2.69f, 4.49f)
                horizontalLineToRelative(-2.47f)
                curveToRelative(-0.38f, -1.58f, -1.26f, -3.06f, -2.56f, -4.27f)
                curveToRelative(-1.24f, -1.15f, -2.45f, -3.38f, -2.17f, -5.53f)
                curveToRelative(0.34f, -2.69f, 2.55f, -4.86f, 5.24f, -5.17f)
                curveToRelative(1.74f, -0.2f, 3.41f, 0.33f, 4.7f, 1.48f)
                curveToRelative(1.27f, 1.14f, 2.0f, 2.77f, 2.0f, 4.48f)
                curveToRelative(0f, 1.73f, -0.74f, 3.37f, -2.04f, 4.51f)
                close()
                moveTo(10.5f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                close()
                moveTo(10.5f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _LightbulbExclamation = it}
