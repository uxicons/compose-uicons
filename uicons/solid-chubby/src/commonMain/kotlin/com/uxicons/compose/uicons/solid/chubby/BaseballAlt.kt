package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BaseballAlt: ImageVector? = null

val Icons.Sc.BaseballAlt: ImageVector
    get() = _BaseballAlt ?: UXIcon(name = "BaseballAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.32f, 17.09f)
                curveToRelative(-1.04f, 1.04f, -1.89f, 2.69f, -0.0f, 4.57f)
                curveToRelative(0.76f, 0.76f, 1.5f, 1.12f, 2.27f, 1.12f)
                curveToRelative(0.79f, 0f, 1.54f, -0.37f, 2.3f, -1.13f)
                curveToRelative(1.04f, -1.04f, 1.89f, -2.68f, 0f, -4.57f)
                curveToRelative(-1.52f, -1.52f, -3.07f, -1.5f, -4.57f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.58f, 2.4f)
                lineToRelative(-0.0f, -0.0f)
                curveToRelative(-1.62f, -1.62f, -4.17f, -1.86f, -6.06f, -0.57f)
                lineToRelative(-0.04f, 0.03f)
                curveToRelative(-3.38f, 2.3f, -6.1f, 5.46f, -7.87f, 9.14f)
                lineToRelative(-0.36f, 0.76f)
                lineToRelative(5.01f, 5.01f)
                lineToRelative(0.71f, -0.34f)
                curveToRelative(3.71f, -1.78f, 6.9f, -4.54f, 9.2f, -7.96f)
                curveToRelative(1.28f, -1.9f, 1.03f, -4.45f, -0.58f, -6.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.15f, 16.01f)
                curveToRelative(-0.56f, -0.26f, -1.24f, -0.16f, -1.69f, 0.3f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.0f, 2.12f)
                lineToRelative(4.12f, 4.13f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.46f, -0.46f, 0.56f, -1.13f, 0.3f, -1.68f)
                curveToRelative(1.07f, -0.78f, 2.0f, -1.73f, 2.74f, -2.83f)
                lineToRelative(-4.78f, -4.78f)
                curveToRelative(-1.09f, 0.74f, -2.04f, 1.67f, -2.82f, 2.74f)
                close()
            }
        }.also { _BaseballAlt = it}
