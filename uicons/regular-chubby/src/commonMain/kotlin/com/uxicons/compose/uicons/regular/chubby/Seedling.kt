package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seedling: ImageVector? = null

val Icons.Rc.Seedling: ImageVector
    get() = _Seedling ?: UXIcon(name = "Seedling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.28f, 1.76f)
                curveToRelative(-1.08f, -1.08f, -2.96f, -0.75f, -4.28f, -0.41f)
                curveToRelative(-3.01f, 0.79f, -4.88f, 2.27f, -5.98f, 4.8f)
                curveToRelative(-1.11f, -2.52f, -2.97f, -4.01f, -5.98f, -4.8f)
                curveToRelative(-1.32f, -0.34f, -3.19f, -0.68f, -4.28f, 0.41f)
                curveToRelative(-1.08f, 1.08f, -0.75f, 2.96f, -0.41f, 4.28f)
                curveToRelative(0.96f, 3.69f, 2.94f, 5.67f, 6.63f, 6.63f)
                curveToRelative(1.03f, 0.27f, 2.19f, 0.33f, 3.02f, 0.34f)
                verticalLineToRelative(8.98f)
                curveToRelative(0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-8.98f)
                curveToRelative(0.83f, -0.01f, 2.01f, -0.07f, 3.06f, -0.34f)
                curveToRelative(3.69f, -0.96f, 5.67f, -2.94f, 6.63f, -6.63f)
                curveToRelative(0.34f, -1.32f, 0.68f, -3.19f, -0.41f, -4.28f)
                close()
                moveTo(3.28f, 5.53f)
                curveToRelative(-0.49f, -1.86f, -0.18f, -2.29f, -0.11f, -2.36f)
                curveToRelative(0.53f, -0.32f, 1.36f, -0.12f, 2.36f, 0.11f)
                curveToRelative(3.0f, 0.79f, 4.42f, 2.19f, 5.2f, 5.2f)
                curveToRelative(0.2f, 0.84f, 0.32f, 1.71f, 0.27f, 2.53f)
                curveToRelative(-0.71f, -0.01f, -1.69f, -0.06f, -2.51f, -0.28f)
                curveToRelative(-3.01f, -0.79f, -4.42f, -2.19f, -5.2f, -5.2f)
                close()
                moveTo(20.75f, 5.53f)
                curveToRelative(-0.78f, 3.01f, -2.19f, 4.42f, -5.2f, 5.2f)
                curveToRelative(-0.83f, 0.22f, -1.8f, 0.27f, -2.51f, 0.28f)
                curveToRelative(-0.05f, -0.82f, 0.06f, -1.69f, 0.27f, -2.53f)
                curveToRelative(0.79f, -3.01f, 2.19f, -4.42f, 5.2f, -5.2f)
                curveToRelative(1.0f, -0.23f, 1.83f, -0.43f, 2.36f, -0.11f)
                curveToRelative(0.07f, 0.07f, 0.38f, 0.49f, -0.11f, 2.36f)
                close()
            }
        }.also { _Seedling = it}
