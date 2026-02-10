package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JarAlt: ImageVector? = null

val Icons.Rr.JarAlt: ImageVector
    get() = _JarAlt ?: UXIcon(name = "JarAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4.81f)
                verticalLineToRelative(-1.81f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1.81f)
                curveToRelative(-1.79f, 1.04f, -3f, 2.97f, -3f, 5.19f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -2.21f, -1.21f, -4.15f, -3f, -5.19f)
                close()
                moveTo(7f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.09f)
                curveToRelative(-0.33f, -0.06f, -0.66f, -0.09f, -1f, -0.09f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.34f, 0f, -0.67f, 0.04f, -1f, 0.09f)
                verticalLineToRelative(-1.09f)
                close()
                moveTo(4f, 11f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(6f)
                lineTo(4f, 17f)
                verticalLineToRelative(-6f)
                close()
                moveTo(20f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(7f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(4.14f, 9f)
                curveToRelative(0.45f, -1.72f, 2.0f, -3f, 3.86f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _JarAlt = it}
