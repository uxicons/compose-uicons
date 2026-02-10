package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seedling: ImageVector? = null

val Icons.Ts.Seedling: ImageVector
    get() = _Seedling ?: UXIcon(name = "Seedling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 0.47f)
                lineToRelative(-0.03f, -0.48f)
                lineToRelative(-0.48f, 0.01f)
                curveToRelative(-7.78f, 0.13f, -10.51f, 5.89f, -11.46f, 9.54f)
                curveTo(11.05f, 5.89f, 8.31f, 0.13f, 0.54f, 0f)
                lineTo(0.06f, -0.01f)
                lineToRelative(-0.03f, 0.48f)
                curveToRelative(-0.22f, 4.06f, 0.78f, 7.22f, 2.99f, 9.39f)
                curveToRelative(2.9f, 2.86f, 6.99f, 3.13f, 8.46f, 3.13f)
                curveToRelative(0.01f, 0f, 0.01f, 0f, 0.01f, 0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.01f, 0f, 0.01f, 0f, 0.01f, 0f)
                curveToRelative(1.47f, 0f, 5.56f, -0.28f, 8.46f, -3.13f)
                curveToRelative(2.21f, -2.17f, 3.22f, -5.33f, 2.99f, -9.39f)
                close()
                moveTo(3.72f, 9.15f)
                curveTo(1.81f, 7.28f, 0.9f, 4.54f, 1.01f, 1.02f)
                curveToRelative(8.8f, 0.44f, 10.23f, 8.79f, 10.45f, 10.98f)
                curveToRelative(-1.35f, -0.01f, -5.13f, -0.28f, -7.74f, -2.85f)
                close()
                moveTo(20.28f, 9.15f)
                curveToRelative(-2.6f, 2.56f, -6.39f, 2.84f, -7.74f, 2.85f)
                curveToRelative(0.23f, -2.19f, 1.66f, -10.54f, 10.45f, -10.98f)
                curveToRelative(0.1f, 3.52f, -0.81f, 6.25f, -2.71f, 8.13f)
                close()
            }
        }.also { _Seedling = it}
