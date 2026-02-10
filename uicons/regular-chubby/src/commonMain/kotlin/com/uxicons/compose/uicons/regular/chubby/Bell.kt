package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bell: ImageVector? = null

val Icons.Rc.Bell: ImageVector
    get() = _Bell ?: UXIcon(name = "Bell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.1f, 13.08f)
                curveToRelative(-0.2f, -0.43f, -0.43f, -0.88f, -0.69f, -1.34f)
                curveToRelative(-0.23f, -0.41f, -0.34f, -0.9f, -0.34f, -1.43f)
                horizontalLineToRelative(0f)
                curveToRelative(0.01f, -1.13f, -0.07f, -2.28f, -0.22f, -3.41f)
                curveToRelative(-0.43f, -3.26f, -3.49f, -5.91f, -6.91f, -5.91f)
                curveToRelative(-3.32f, 0f, -6.38f, 2.65f, -6.81f, 5.91f)
                curveToRelative(-0.15f, 1.13f, -0.22f, 2.28f, -0.22f, 3.41f)
                curveToRelative(0.0f, 0.52f, -0.11f, 1.02f, -0.34f, 1.43f)
                curveToRelative(-0.25f, 0.46f, -0.48f, 0.91f, -0.69f, 1.34f)
                curveToRelative(-0.5f, 1.06f, -0.54f, 2.25f, -0.11f, 3.33f)
                curveToRelative(0.43f, 1.09f, 1.26f, 1.93f, 2.34f, 2.37f)
                curveToRelative(0.67f, 0.27f, 1.38f, 0.5f, 2.3f, 0.66f)
                curveToRelative(0.02f, 1.97f, 1.61f, 3.56f, 3.58f, 3.56f)
                reflectiveCurveToRelative(3.56f, -1.59f, 3.58f, -3.55f)
                curveToRelative(0.91f, -0.16f, 1.62f, -0.38f, 2.31f, -0.66f)
                curveToRelative(1.08f, -0.44f, 1.91f, -1.28f, 2.33f, -2.37f)
                curveToRelative(0.42f, -1.09f, 0.38f, -2.27f, -0.11f, -3.33f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-0.79f, 0f, -1.44f, -0.58f, -1.56f, -1.35f)
                curveToRelative(0.47f, 0.03f, 0.99f, 0.04f, 1.56f, 0.04f)
                reflectiveCurveToRelative(1.09f, -0.01f, 1.56f, -0.04f)
                curveToRelative(-0.12f, 0.76f, -0.77f, 1.34f, -1.56f, 1.34f)
                close()
                moveTo(18.35f, 15.69f)
                curveToRelative(-0.22f, 0.57f, -0.66f, 1.01f, -1.22f, 1.24f)
                curveToRelative(-1.16f, 0.47f, -2.42f, 0.76f, -5.13f, 0.76f)
                curveToRelative(-2.69f, 0f, -3.96f, -0.29f, -5.12f, -0.76f)
                curveToRelative(-0.57f, -0.23f, -1.0f, -0.67f, -1.23f, -1.24f)
                curveToRelative(-0.23f, -0.57f, -0.2f, -1.2f, 0.06f, -1.75f)
                curveToRelative(0.19f, -0.4f, 0.4f, -0.81f, 0.63f, -1.23f)
                curveToRelative(0.39f, -0.71f, 0.59f, -1.54f, 0.59f, -2.4f)
                curveToRelative(-0.01f, -1.04f, 0.06f, -2.09f, 0.2f, -3.13f)
                curveToRelative(0.3f, -2.26f, 2.51f, -4.17f, 4.92f, -4.17f)
                curveToRelative(2.32f, 0f, 4.53f, 1.91f, 4.83f, 4.17f)
                curveToRelative(0.14f, 1.04f, 0.2f, 2.09f, 0.2f, 3.13f)
                curveToRelative(-0.01f, 0.86f, 0.2f, 1.7f, 0.59f, 2.4f)
                curveToRelative(0.23f, 0.42f, 0.45f, 0.83f, 0.63f, 1.23f)
                curveToRelative(0.26f, 0.56f, 0.28f, 1.18f, 0.06f, 1.75f)
                close()
            }
        }.also { _Bell = it}
