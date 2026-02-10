package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExternalWorld: ImageVector? = null

val Icons.Bs.ExternalWorld: ImageVector
    get() = _ExternalWorld ?: UXIcon(name = "ExternalWorld") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.82f, -0.39f, 1.54f, -1f, 2f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.56f)
                lineToRelative(-3.16f, 3.58f)
                curveToRelative(-0.48f, 0.56f, -1.32f, 0.56f, -1.8f, 0f)
                lineToRelative(-3.16f, -3.58f)
                horizontalLineToRelative(2.56f)
                verticalLineToRelative(-4.5f)
                curveToRelative(-0.61f, -0.46f, -1f, -1.18f, -1f, -2f)
                close()
                moveTo(23f, 13f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 19.07f, 1f, 13f)
                curveTo(1f, 8.52f, 3.69f, 4.67f, 7.54f, 2.95f)
                curveToRelative(0.11f, 1.05f, 0.56f, 2.01f, 1.26f, 2.72f)
                curveToRelative(-2.37f, 1.04f, -4.13f, 3.2f, -4.64f, 5.8f)
                horizontalLineToRelative(3.31f)
                lineToRelative(2.28f, 2.58f)
                lineToRelative(0.06f, 0.42f)
                curveToRelative(0.34f, 2.25f, 1.36f, 4.2f, 2.18f, 5.47f)
                curveToRelative(0.82f, -1.27f, 1.84f, -3.23f, 2.18f, -5.47f)
                lineToRelative(0.06f, -0.43f)
                lineToRelative(2.29f, -2.57f)
                horizontalLineToRelative(3.31f)
                curveToRelative(-0.51f, -2.6f, -2.27f, -4.76f, -4.64f, -5.8f)
                curveToRelative(0.71f, -0.71f, 1.16f, -1.66f, 1.26f, -2.72f)
                curveToRelative(3.85f, 1.71f, 6.54f, 5.57f, 6.54f, 10.05f)
                close()
                moveTo(8.73f, 20.29f)
                curveToRelative(-0.84f, -1.55f, -1.66f, -3.56f, -1.93f, -5.82f)
                horizontalLineToRelative(-2.66f)
                curveToRelative(0.49f, 2.6f, 2.23f, 4.76f, 4.59f, 5.82f)
                close()
                moveTo(19.86f, 14.47f)
                horizontalLineToRelative(-2.66f)
                curveToRelative(-0.27f, 2.26f, -1.09f, 4.27f, -1.93f, 5.82f)
                curveToRelative(2.35f, -1.06f, 4.1f, -3.22f, 4.59f, -5.82f)
                close()
            }
        }.also { _ExternalWorld = it}
