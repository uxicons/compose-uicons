package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JarAlt: ImageVector? = null

val Icons.Ss.JarAlt: ImageVector
    get() = _JarAlt ?: UXIcon(name = "JarAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 17f)
                lineTo(2f, 17f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(5f)
                close()
                moveTo(17f, 5f)
                lineTo(7f, 5f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(9f)
                lineTo(2f, 19f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(7f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(0.69f, 0f, 1.37f, 0.1f, 2f, 0.29f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(3.29f)
                curveToRelative(0.63f, -0.19f, 1.3f, -0.29f, 2f, -0.29f)
                close()
            }
        }.also { _JarAlt = it}
