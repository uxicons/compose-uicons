package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pacifier: ImageVector? = null

val Icons.Bs.Pacifier: ImageVector
    get() = _Pacifier ?: UXIcon(name = "Pacifier") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                curveToRelative(-3.35f, 0f, -6.63f, -1.16f, -9.45f, -3.06f)
                curveToRelative(0.99f, -0.57f, 2.08f, -0.96f, 3.15f, -1.34f)
                curveToRelative(1.64f, -0.58f, 3.19f, -1.12f, 4.35f, -2.28f)
                curveToRelative(2.59f, -2.59f, 2.59f, -6.79f, 0f, -9.38f)
                curveToRelative(-2.59f, -2.59f, -6.79f, -2.59f, -9.38f, 0f)
                curveToRelative(-1.16f, 1.16f, -1.71f, 2.71f, -2.28f, 4.35f)
                curveToRelative(-0.38f, 1.07f, -0.76f, 2.17f, -1.34f, 3.15f)
                curveToRelative(-1.9f, -2.83f, -3.06f, -6.1f, -3.06f, -9.45f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 3.23f, 0.92f, 6.41f, 2.49f, 9.28f)
                curveToRelative(-3.16f, 0.88f, -5.49f, 3.78f, -5.49f, 7.22f)
                curveToRelative(0f, 4.14f, 3.36f, 7.5f, 7.5f, 7.5f)
                curveToRelative(3.44f, 0f, 6.34f, -2.33f, 7.22f, -5.49f)
                curveToRelative(2.87f, 1.57f, 6.05f, 2.49f, 9.28f, 2.49f)
                close()
                moveTo(13.23f, 7.29f)
                curveToRelative(0.48f, -1.37f, 0.89f, -2.55f, 1.57f, -3.23f)
                curveToRelative(1.42f, -1.42f, 3.72f, -1.42f, 5.14f, 0f)
                reflectiveCurveToRelative(1.42f, 3.72f, 0f, 5.14f)
                curveToRelative(-0.68f, 0.68f, -1.86f, 1.09f, -3.23f, 1.57f)
                curveToRelative(-1.49f, 0.52f, -3.13f, 1.11f, -4.63f, 2.2f)
                curveToRelative(-0.36f, -0.34f, -0.72f, -0.69f, -1.06f, -1.06f)
                curveToRelative(1.09f, -1.49f, 1.68f, -3.14f, 2.2f, -4.63f)
                close()
                moveTo(7.5f, 21f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -2.4f, 1.89f, -4.35f, 4.26f, -4.48f)
                curveToRelative(1.34f, 1.78f, 2.93f, 3.38f, 4.71f, 4.71f)
                curveToRelative(-0.12f, 2.37f, -2.08f, 4.26f, -4.48f, 4.26f)
                close()
            }
        }.also { _Pacifier = it}
