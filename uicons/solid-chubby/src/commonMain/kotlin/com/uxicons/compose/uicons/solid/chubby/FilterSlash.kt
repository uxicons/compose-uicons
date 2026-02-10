package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterSlash: ImageVector? = null

val Icons.Sc.FilterSlash: ImageVector
    get() = _FilterSlash ?: UXIcon(name = "FilterSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 22.56f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-19.0f, -19f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
                reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
                lineToRelative(0.17f, 0.17f)
                curveToRelative(1.84f, -0.28f, 5.05f, -0.69f, 8.27f, -0.69f)
                curveToRelative(5.05f, 0f, 9.99f, 0.98f, 10.2f, 1.02f)
                curveToRelative(0.54f, 0.11f, 0.89f, 0.64f, 0.78f, 1.18f)
                curveToRelative(-0.1f, 0.47f, -0.51f, 0.8f, -0.98f, 0.8f)
                curveToRelative(0f, 0.26f, 0f, 0.6f, -0.0f, 1.01f)
                curveToRelative(0f, 0.02f, -0.06f, 2.09f, -0.46f, 2.92f)
                curveToRelative(-1.2f, 2.47f, -2.79f, 4.58f, -5.07f, 6.5f)
                lineToRelative(6.09f, 6.09f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
                close()
                moveTo(2.46f, 7.93f)
                curveToRelative(1.38f, 2.87f, 3.26f, 5.13f, 6.12f, 7.37f)
                lineToRelative(0.42f, 0.32f)
                verticalLineToRelative(3.39f)
                curveToRelative(0f, 0.2f, 0.06f, 0.39f, 0.17f, 0.56f)
                curveToRelative(1.04f, 1.57f, 2.65f, 2.77f, 4.52f, 3.39f)
                curveToRelative(0.62f, 0.23f, 1.33f, -0.29f, 1.32f, -0.95f)
                verticalLineToRelative(-2.05f)
                lineToRelative(-12.77f, -12.77f)
                curveToRelative(0.06f, 0.29f, 0.13f, 0.56f, 0.23f, 0.76f)
                close()
            }
        }.also { _FilterSlash = it}
