package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Avocado: ImageVector? = null

val Icons.Ts.Avocado: ImageVector
    get() = _Avocado ?: UXIcon(name = "Avocado") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveToRelative(-2.28f, 0f, -4f, -1.67f, -4f, -3.88f)
                curveToRelative(0f, -2.98f, 2.06f, -6.12f, 4f, -6.12f)
                reflectiveCurveToRelative(4f, 3.15f, 4f, 6.12f)
                curveToRelative(0f, 2.21f, -1.72f, 3.88f, -4f, 3.88f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-1.13f, 0f, -3f, 2.48f, -3f, 5.12f)
                curveToRelative(0f, 1.67f, 1.26f, 2.88f, 3f, 2.88f)
                reflectiveCurveToRelative(3f, -1.21f, 3f, -2.88f)
                curveToRelative(0f, -2.64f, -1.87f, -5.12f, -3f, -5.12f)
                close()
                moveTo(12f, 24f)
                curveToRelative(-5.51f, 0f, -10f, -4.05f, -10f, -9.03f)
                curveTo(2f, 5.29f, 8.61f, 0f, 12f, 0f)
                curveToRelative(2.59f, 0f, 4.6f, 1.53f, 5.37f, 4.09f)
                curveToRelative(0.55f, 1.84f, 1.45f, 3.59f, 2.67f, 5.2f)
                curveToRelative(1.46f, 1.93f, 1.96f, 3.36f, 1.96f, 5.69f)
                curveToRelative(0f, 4.98f, -4.49f, 9.03f, -10f, 9.03f)
                close()
                moveTo(12f, 1f)
                curveTo(9.31f, 1f, 3f, 5.75f, 3f, 14.97f)
                curveToRelative(0f, 4.42f, 4.04f, 8.03f, 9f, 8.03f)
                reflectiveCurveToRelative(9f, -3.6f, 9f, -8.03f)
                curveToRelative(0f, -2.1f, -0.43f, -3.34f, -1.75f, -5.08f)
                curveToRelative(-1.29f, -1.7f, -2.25f, -3.56f, -2.83f, -5.51f)
                curveToRelative(-0.65f, -2.15f, -2.25f, -3.38f, -4.41f, -3.38f)
                close()
            }
        }.also { _Avocado = it}
