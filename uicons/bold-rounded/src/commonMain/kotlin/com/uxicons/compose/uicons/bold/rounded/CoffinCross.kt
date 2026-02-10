package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffinCross: ImageVector? = null

val Icons.Br.CoffinCross: ImageVector
    get() = _CoffinCross ?: UXIcon(name = "CoffinCross") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.39f, 6.43f)
            lineToRelative(-1.21f, -2.98f)
            curveToRelative(-0.85f, -2.1f, -2.87f, -3.45f, -5.15f, -3.45f)
            horizontalLineToRelative(-6.07f)
            curveToRelative(-2.28f, 0f, -4.3f, 1.35f, -5.15f, 3.45f)
            lineToRelative(-1.21f, 2.98f)
            curveToRelative(-0.65f, 1.6f, -0.79f, 3.33f, -0.41f, 5.01f)
            lineToRelative(1.85f, 8.26f)
            curveToRelative(0.57f, 2.53f, 2.79f, 4.3f, 5.41f, 4.3f)
            horizontalLineToRelative(5.06f)
            curveToRelative(2.62f, 0f, 4.84f, -1.77f, 5.41f, -4.3f)
            lineToRelative(1.85f, -8.26f)
            curveToRelative(0.38f, -1.68f, 0.24f, -3.41f, -0.41f, -5.01f)
            close()
            moveTo(18.87f, 10.78f)
            lineToRelative(-1.85f, 8.26f)
            curveToRelative(-0.26f, 1.15f, -1.28f, 1.96f, -2.48f, 1.96f)
            horizontalLineToRelative(-5.06f)
            curveToRelative(-1.2f, 0f, -2.23f, -0.81f, -2.48f, -1.96f)
            lineToRelative(-1.85f, -8.26f)
            curveToRelative(-0.24f, -1.08f, -0.15f, -2.2f, 0.27f, -3.23f)
            lineToRelative(1.21f, -2.98f)
            curveToRelative(0.39f, -0.96f, 1.31f, -1.58f, 2.36f, -1.58f)
            horizontalLineToRelative(6.07f)
            curveToRelative(1.05f, 0f, 1.98f, 0.62f, 2.36f, 1.58f)
            lineToRelative(1.21f, 2.98f)
            curveToRelative(0.42f, 1.03f, 0.51f, 2.15f, 0.26f, 3.23f)
            close()
            moveTo(16f, 10.0f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _CoffinCross = it }
