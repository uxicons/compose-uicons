package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seedling: ImageVector? = null

val Icons.Bs.Seedling: ImageVector
    get() = _Seedling ?: UXIcon(name = "Seedling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 1.42f)
                lineToRelative(-0.08f, -1.44f)
                lineToRelative(-1.44f, 0.02f)
                curveToRelative(-5.63f, 0.09f, -8.81f, 3.17f, -10.45f, 6.48f)
                curveTo(10.36f, 3.17f, 7.18f, 0.09f, 1.55f, 0f)
                lineTo(0.11f, -0.02f)
                lineTo(0.03f, 1.42f)
                curveToRelative(-0.22f, 3.92f, 0.78f, 7.0f, 2.98f, 9.17f)
                curveToRelative(2.39f, 2.36f, 5.59f, 2.98f, 7.49f, 3.13f)
                verticalLineToRelative(10.28f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-10.28f)
                curveToRelative(1.9f, -0.15f, 5.09f, -0.77f, 7.49f, -3.13f)
                curveToRelative(2.2f, -2.17f, 3.2f, -5.25f, 2.98f, -9.17f)
                close()
                moveTo(5.1f, 8.44f)
                curveToRelative(-1.27f, -1.26f, -1.97f, -3.05f, -2.09f, -5.32f)
                curveToRelative(5.12f, 0.79f, 6.74f, 5.13f, 7.25f, 7.55f)
                curveToRelative(-1.46f, -0.17f, -3.61f, -0.69f, -5.17f, -2.24f)
                close()
                moveTo(18.89f, 8.44f)
                curveToRelative(-1.56f, 1.54f, -3.71f, 2.07f, -5.17f, 2.24f)
                curveToRelative(0.51f, -2.43f, 2.14f, -6.76f, 7.25f, -7.55f)
                curveToRelative(-0.11f, 2.27f, -0.81f, 4.05f, -2.09f, 5.32f)
                close()
            }
        }.also { _Seedling = it}
