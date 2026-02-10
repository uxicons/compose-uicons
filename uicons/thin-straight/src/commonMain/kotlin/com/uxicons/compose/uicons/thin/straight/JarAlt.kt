package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JarAlt: ImageVector? = null

val Icons.Ts.JarAlt: ImageVector
    get() = _JarAlt ?: UXIcon(name = "JarAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4.26f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(4.26f)
                curveToRelative(-1.75f, 0.62f, -3f, 2.29f, -3f, 4.24f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.96f, -1.25f, -3.62f, -3f, -4.24f)
                close()
                moveTo(6f, 1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3.03f)
                curveToRelative(-0.16f, -0.02f, -0.33f, -0.03f, -0.5f, -0.03f)
                lineTo(6.5f, 4f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.01f, -0.5f, 0.03f)
                lineTo(6f, 1f)
                close()
                moveTo(3f, 11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(7f)
                lineTo(3f, 18f)
                verticalLineToRelative(-7f)
                close()
                moveTo(21f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-9f)
                lineTo(3f, 10f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _JarAlt = it}
