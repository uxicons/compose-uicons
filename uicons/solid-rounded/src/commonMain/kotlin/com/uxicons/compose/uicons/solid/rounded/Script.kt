package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Script: ImageVector? = null

val Icons.Sr.Script: ImageVector
    get() = _Script ?: UXIcon(name = "Script") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.27f, 6.48f)
                curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
                verticalLineToRelative(1.46f)
                horizontalLineToRelative(1.46f)
                curveToRelative(1.15f, 0f, 2.25f, -0.46f, 3.06f, -1.27f)
                lineToRelative(5.81f, -5.81f)
                curveToRelative(0.9f, -0.9f, 0.9f, -2.35f, 0f, -3.25f)
                curveToRelative(-0.9f, -0.9f, -2.35f, -0.9f, -3.25f, 0f)
                lineToRelative(-5.81f, 5.81f)
                close()
                moveTo(3f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-1f)
                curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(23.99f, 21.17f)
                curveToRelative(-0.01f, 0.16f, -0.03f, 0.28f, -0.05f, 0.33f)
                curveToRelative(-0.43f, 1.45f, -1.77f, 2.5f, -3.35f, 2.5f)
                horizontalLineToRelative(-9.35f)
                curveToRelative(0.48f, -0.72f, 0.76f, -1.58f, 0.76f, -2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.17f, 0f, 2.1f, 1.0f, 1.99f, 2.17f)
                close()
                moveTo(20f, 10.08f)
                verticalLineToRelative(6.92f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-2.49f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(-0.0f, 1.48f, -1.29f, 2.66f, -2.81f, 2.48f)
                curveToRelative(-1.28f, -0.15f, -2.19f, -1.33f, -2.19f, -2.62f)
                lineTo(5f, 1.5f)
                curveToRelative(0f, -0.54f, -0.12f, -1.04f, -0.34f, -1.5f)
                horizontalLineToRelative(11.34f)
                curveToRelative(0.57f, 0f, 1.1f, 0.12f, 1.59f, 0.33f)
                lineToRelative(-4.73f, 4.73f)
                curveToRelative(-1.2f, 1.2f, -1.85f, 2.79f, -1.85f, 4.48f)
                verticalLineToRelative(3.46f)
                horizontalLineToRelative(3.46f)
                curveToRelative(1.69f, 0f, 3.28f, -0.66f, 4.48f, -1.85f)
                lineToRelative(1.07f, -1.07f)
                close()
            }
        }.also { _Script = it}
