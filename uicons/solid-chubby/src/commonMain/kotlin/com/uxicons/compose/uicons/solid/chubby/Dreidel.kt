package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dreidel: ImageVector? = null

val Icons.Sc.Dreidel: ImageVector
    get() = _Dreidel ?: UXIcon(name = "Dreidel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.27f, 14.75f)
                curveToRelative(-0.5f, 0.12f, -1.01f, 0.18f, -1.53f, 0.18f)
                curveToRelative(-1.76f, 0f, -3.42f, -0.7f, -4.67f, -1.96f)
                lineToRelative(-0.94f, -0.94f)
                curveToRelative(-0.94f, 1.7f, -1.28f, 3.7f, -0.91f, 5.66f)
                lineToRelative(0.41f, 2.19f)
                curveToRelative(0.25f, 1.31f, 1.25f, 2.32f, 2.56f, 2.57f)
                lineToRelative(2.18f, 0.41f)
                curveToRelative(0.52f, 0.1f, 1.04f, 0.15f, 1.56f, 0.15f)
                curveToRelative(1.43f, 0f, 2.83f, -0.37f, 4.07f, -1.06f)
                lineToRelative(-0.94f, -0.94f)
                curveToRelative(-1.68f, -1.69f, -2.27f, -4.07f, -1.77f, -6.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.49f, 1.44f)
                curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.01f)
                lineToRelative(-4.78f, 4.81f)
                curveToRelative(-1.4f, -1.14f, -3.01f, -2.04f, -4.77f, -2.63f)
                curveToRelative(-0.36f, -0.12f, -0.75f, -0.03f, -1.02f, 0.24f)
                curveToRelative(0f, 0f, -6.42f, 6.46f, -6.49f, 6.54f)
                lineToRelative(1.17f, 1.17f)
                curveToRelative(0.88f, 0.89f, 2.04f, 1.37f, 3.26f, 1.37f)
                reflectiveCurveToRelative(2.39f, -0.49f, 3.28f, -1.38f)
                curveToRelative(0.0f, -0.0f, 0.0f, -0.0f, 0.01f, -0.01f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.02f, 0.02f, -0.03f)
                lineToRelative(2.21f, -2.22f)
                curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, -0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-2.21f, 2.22f)
                curveToRelative(-1.83f, 1.83f, -1.83f, 4.82f, 0f, 6.66f)
                lineToRelative(1.15f, 1.16f)
                curveToRelative(0.08f, -0.07f, 6.51f, -6.53f, 6.51f, -6.53f)
                curveToRelative(0.26f, -0.26f, 0.36f, -0.65f, 0.24f, -1.01f)
                curveToRelative(-0.58f, -1.78f, -1.48f, -3.42f, -2.65f, -4.84f)
                lineToRelative(4.79f, -4.82f)
                curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
                close()
            }
        }.also { _Dreidel = it}
