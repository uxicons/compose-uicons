package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JarAlt: ImageVector? = null

val Icons.Rs.JarAlt: ImageVector
    get() = _JarAlt ?: UXIcon(name = "JarAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4.42f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(4.42f)
                curveToRelative(-1.76f, 0.77f, -3f, 2.54f, -3f, 4.58f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -2.05f, -1.24f, -3.81f, -3f, -4.58f)
                close()
                moveTo(7f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                lineTo(7f, 4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4f, 11f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(6f)
                lineTo(4f, 17f)
                verticalLineToRelative(-6f)
                close()
                moveTo(20f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-10f)
                lineTo(4f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _JarAlt = it}
