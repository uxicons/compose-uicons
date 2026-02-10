package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DivingGoogles: ImageVector? = null

val Icons.Sr.DivingGoogles: ImageVector
    get() = _DivingGoogles ?: UXIcon(name = "DivingGoogles") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, -0.01f)
                curveToRelative(-6.62f, 0f, -12.0f, 5.39f, -12.0f, 12.01f)
                verticalLineToRelative(6.0f)
                curveToRelative(-0.05f, 2.37f, 1.23f, 4.3f, 2.6f, 4.95f)
                curveToRelative(0.79f, 0.47f, 1.42f, 0.85f, 2.88f, 1.01f)
                curveToRelative(2.01f, 0.23f, 3.87f, -0.67f, 4.83f, -2.15f)
                curveToRelative(0.27f, -0.4f, 0.85f, -0.78f, 1.69f, -0.81f)
                curveToRelative(0.93f, 0.03f, 1.43f, 0.44f, 1.77f, 0.9f)
                curveToRelative(0.88f, 1.26f, 2.41f, 2.08f, 4.14f, 2.08f)
                curveToRelative(1.41f, 0.01f, 2.72f, -0.51f, 3.5f, -1.04f)
                curveToRelative(1.36f, -0.65f, 2.65f, -2.58f, 2.6f, -4.95f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -6.62f, -5.38f, -12.01f, -12.0f, -12.01f)
                close()
                moveTo(22f, 16.3f)
                curveToRelative(-1.06f, -0.65f, -2.56f, -1.29f, -4.33f, -1.29f)
                curveToRelative(-1.36f, 0f, -2.66f, 0.57f, -3.54f, 1.57f)
                curveToRelative(-0.21f, 0.23f, -0.39f, 0.49f, -0.54f, 0.75f)
                curveToRelative(-0.12f, 0.25f, -0.9f, 0.68f, -1.58f, 0.68f)
                curveToRelative(-0.66f, 0f, -1.44f, -0.42f, -1.58f, -0.68f)
                curveToRelative(-0.15f, -0.26f, -0.33f, -0.52f, -0.54f, -0.75f)
                curveToRelative(-0.89f, -1.0f, -2.18f, -1.57f, -3.54f, -1.57f)
                curveToRelative(-1.77f, 0f, -3.27f, 0.64f, -4.33f, 1.29f)
                verticalLineToRelative(-4.29f)
                curveToRelative(0f, -5.52f, 4.49f, -10.01f, 10f, -10.01f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10.01f)
                close()
            }
        }.also { _DivingGoogles = it}
