package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sickle: ImageVector? = null

val Icons.Ts.Sickle: ImageVector
    get() = _Sickle ?: UXIcon(name = "Sickle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 0f)
                curveTo(6.71f, 0f, 2f, 4.71f, 2f, 10.5f)
                curveToRelative(0f, 2.86f, 1.18f, 5.57f, 3.24f, 7.55f)
                lineToRelative(-3.73f, 3.73f)
                lineToRelative(2.21f, 2.21f)
                lineToRelative(5.6f, -5.6f)
                lineToRelative(-1.78f, -1.78f)
                curveToRelative(-0.36f, -0.82f, -0.54f, -1.86f, -0.54f, -3.11f)
                curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
                curveToRelative(3.59f, 0f, 6.69f, 2.56f, 7.36f, 6.09f)
                lineToRelative(0.1f, 0.41f)
                horizontalLineToRelative(0.84f)
                lineToRelative(0.07f, -0.42f)
                curveToRelative(0.09f, -0.59f, 0.13f, -1.09f, 0.13f, -1.58f)
                curveTo(23f, 4.71f, 18.29f, 0f, 12.5f, 0f)
                close()
                moveTo(3.72f, 22.58f)
                lineToRelative(-0.79f, -0.79f)
                lineToRelative(4.19f, -4.19f)
                lineToRelative(0.79f, 0.79f)
                lineToRelative(-4.19f, 4.19f)
                close()
                moveTo(14.5f, 5f)
                curveToRelative(-4.69f, 0f, -8.5f, 3.81f, -8.5f, 8.5f)
                curveToRelative(0f, 1.27f, 0.17f, 2.37f, 0.52f, 3.27f)
                lineToRelative(-0.58f, 0.58f)
                curveToRelative(-1.87f, -1.79f, -2.94f, -4.26f, -2.94f, -6.85f)
                curveTo(3f, 5.26f, 7.26f, 1f, 12.5f, 1f)
                curveToRelative(4.86f, 0f, 8.89f, 3.67f, 9.44f, 8.39f)
                curveToRelative(-1.46f, -2.65f, -4.28f, -4.39f, -7.44f, -4.39f)
                close()
            }
        }.also { _Sickle = it}
