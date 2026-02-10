package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Life: ImageVector? = null

val Icons.Sr.Life: ImageVector
    get() = _Life ?: UXIcon(name = "Life") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 13.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22.18f, 12.73f)
                lineToRelative(-5.64f, 5.21f)
                curveToRelative(-0.17f, 0.15f, -0.35f, 0.29f, -0.54f, 0.41f)
                verticalLineToRelative(4.65f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4.65f)
                curveToRelative(-0.19f, -0.12f, -0.37f, -0.26f, -0.54f, -0.41f)
                lineTo(1.82f, 12.73f)
                curveToRelative(-0.41f, -0.38f, -0.43f, -1.01f, -0.06f, -1.41f)
                curveToRelative(0.37f, -0.41f, 1.01f, -0.43f, 1.41f, -0.06f)
                lineToRelative(5.64f, 5.21f)
                curveToRelative(0.37f, 0.34f, 0.85f, 0.53f, 1.36f, 0.53f)
                horizontalLineToRelative(3.65f)
                curveToRelative(0.5f, 0f, 0.99f, -0.19f, 1.36f, -0.53f)
                lineToRelative(5.64f, -5.2f)
                curveToRelative(0.41f, -0.37f, 1.04f, -0.35f, 1.41f, 0.06f)
                curveToRelative(0.38f, 0.41f, 0.35f, 1.04f, -0.06f, 1.41f)
                close()
                moveTo(14.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 2.19f, 2.83f, 5.17f, 4.23f, 6.24f)
                curveToRelative(0.46f, 0.35f, 1.09f, 0.35f, 1.54f, 0f)
                curveToRelative(1.4f, -1.07f, 4.23f, -4.05f, 4.23f, -6.24f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _Life = it}
