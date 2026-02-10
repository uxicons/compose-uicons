package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareBolt: ImageVector? = null

val Icons.Rr.SquareBolt: ImageVector
    get() = _SquareBolt ?: UXIcon(name = "SquareBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.04f, -0.5f, -0.13f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.89f, -0.37f, -1.36f)
                lineToRelative(2.58f, -4.5f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                curveToRelative(-0.3f, -0.41f, -0.4f, -0.94f, -0.25f, -1.43f)
                curveToRelative(0.02f, -0.07f, 3.06f, -5.41f, 3.06f, -5.41f)
                curveToRelative(0.27f, -0.48f, 0.88f, -0.65f, 1.36f, -0.37f)
                curveToRelative(0.48f, 0.27f, 0.65f, 0.88f, 0.37f, 1.36f)
                lineToRelative(-2.57f, 4.5f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.84f)
                curveToRelative(0.28f, 0.52f, 0.25f, 1.15f, -0.08f, 1.64f)
                lineToRelative(-2.86f, 5.01f)
                curveToRelative(-0.18f, 0.32f, -0.52f, 0.5f, -0.87f, 0.5f)
                close()
                moveTo(19f, 24f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
                moveTo(5f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 2f)
                close()
            }
        }.also { _SquareBolt = it}
