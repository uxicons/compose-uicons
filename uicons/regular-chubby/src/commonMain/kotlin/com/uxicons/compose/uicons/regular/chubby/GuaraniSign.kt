package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GuaraniSign: ImageVector? = null

val Icons.Rc.GuaraniSign: ImageVector
    get() = _GuaraniSign ?: UXIcon(name = "GuaraniSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 11f)
                horizontalLineToRelative(-5.49f)
                curveToRelative(0.05f, -2.42f, 0.25f, -4.46f, 0.46f, -5.96f)
                curveToRelative(3.1f, 0.17f, 4.79f, 1.18f, 5.53f, 3.29f)
                curveToRelative(0.18f, 0.52f, 0.75f, 0.8f, 1.27f, 0.61f)
                reflectiveCurveToRelative(0.8f, -0.75f, 0.61f, -1.27f)
                curveToRelative(-1.25f, -3.59f, -4.39f, -4.45f, -7.09f, -4.63f)
                curveToRelative(0.1f, -0.51f, 0.17f, -0.79f, 0.17f, -0.8f)
                curveToRelative(0.13f, -0.54f, -0.19f, -1.08f, -0.73f, -1.21f)
                curveToRelative(-0.54f, -0.14f, -1.08f, 0.19f, -1.21f, 0.73f)
                curveToRelative(-0.01f, 0.05f, -0.12f, 0.49f, -0.26f, 1.26f)
                curveToRelative(-5.78f, 0.21f, -8.27f, 2.92f, -8.27f, 8.98f)
                reflectiveCurveToRelative(2.49f, 8.77f, 8.27f, 8.98f)
                curveToRelative(0.14f, 0.77f, 0.25f, 1.21f, 0.26f, 1.26f)
                curveToRelative(0.13f, 0.54f, 0.69f, 0.86f, 1.21f, 0.73f)
                curveToRelative(0.54f, -0.13f, 0.86f, -0.68f, 0.73f, -1.21f)
                curveToRelative(-0.0f, -0.01f, -0.07f, -0.29f, -0.17f, -0.8f)
                curveToRelative(3.48f, -0.21f, 7.09f, -1.43f, 7.69f, -6.85f)
                curveToRelative(0.07f, -2.01f, -0.96f, -3.13f, -2.99f, -3.11f)
                close()
                moveTo(5f, 12f)
                curveToRelative(0f, -4.8f, 1.58f, -6.72f, 5.95f, -6.97f)
                curveToRelative(-0.23f, 1.76f, -0.45f, 4.14f, -0.45f, 6.97f)
                reflectiveCurveToRelative(0.22f, 5.21f, 0.45f, 6.97f)
                curveToRelative(-4.37f, -0.25f, -5.95f, -2.17f, -5.95f, -6.97f)
                close()
                moveTo(12.97f, 18.98f)
                curveToRelative(-0.21f, -1.5f, -0.42f, -3.55f, -0.46f, -5.97f)
                horizontalLineToRelative(5.49f)
                curveToRelative(0.86f, 0f, 0.99f, 0.12f, 1f, 0.94f)
                curveToRelative(-0.4f, 3.42f, -2.06f, 4.84f, -6.03f, 5.03f)
                close()
            }
        }.also { _GuaraniSign = it}
