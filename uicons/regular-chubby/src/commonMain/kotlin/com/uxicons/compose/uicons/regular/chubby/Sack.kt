package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Rc.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.62f, 11.57f)
                curveToRelative(-1.5f, -2.6f, -3.59f, -4.38f, -5.97f, -5.14f)
                curveToRelative(0.69f, -0.66f, 1.46f, -1.6f, 2.22f, -2.93f)
                curveToRelative(0.26f, -0.46f, 0.12f, -1.04f, -0.31f, -1.33f)
                curveToRelative(-0.07f, -0.05f, -1.78f, -1.17f, -4.55f, -1.17f)
                reflectiveCurveToRelative(-4.48f, 1.12f, -4.55f, 1.17f)
                curveToRelative(-0.44f, 0.29f, -0.57f, 0.87f, -0.31f, 1.33f)
                curveToRelative(0.76f, 1.33f, 1.53f, 2.27f, 2.22f, 2.93f)
                curveToRelative(-2.37f, 0.76f, -4.47f, 2.54f, -5.97f, 5.14f)
                curveToRelative(-1.23f, 2.15f, -1.61f, 4.51f, -1.07f, 6.67f)
                curveToRelative(0.85f, 3.38f, 3.66f, 4.76f, 9.69f, 4.76f)
                reflectiveCurveToRelative(8.84f, -1.38f, 9.69f, -4.76f)
                curveToRelative(0.54f, -2.15f, 0.16f, -4.52f, -1.07f, -6.67f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.09f, 0f, 1.96f, 0.22f, 2.56f, 0.43f)
                curveToRelative(-1.1f, 1.61f, -2.1f, 2.26f, -2.56f, 2.49f)
                curveToRelative(-0.46f, -0.23f, -1.46f, -0.88f, -2.56f, -2.49f)
                curveToRelative(0.6f, -0.21f, 1.47f, -0.43f, 2.56f, -0.43f)
                close()
                moveTo(19.75f, 17.75f)
                curveToRelative(-0.4f, 1.57f, -1.35f, 3.25f, -7.75f, 3.25f)
                reflectiveCurveToRelative(-7.35f, -1.68f, -7.75f, -3.25f)
                curveToRelative(-0.42f, -1.65f, -0.11f, -3.49f, 0.86f, -5.18f)
                curveToRelative(0.98f, -1.7f, 3.18f, -4.56f, 6.88f, -4.56f)
                reflectiveCurveToRelative(5.9f, 2.86f, 6.88f, 4.56f)
                curveToRelative(0.97f, 1.69f, 1.28f, 3.54f, 0.86f, 5.18f)
                close()
            }
        }.also { _Sack = it}
