package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MartiniGlassCitrus: ImageVector? = null

val Icons.Bs.MartiniGlassCitrus: ImageVector
    get() = _MartiniGlassCitrus ?: UXIcon(name = "MartiniGlassCitrus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0f)
                curveToRelative(-2.13f, 0f, -3.96f, 1.22f, -4.88f, 3f)
                horizontalLineTo(0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.5f, 0.64f, 2.95f, 1.74f, 3.96f)
                lineToRelative(7.26f, 6.96f)
                verticalLineToRelative(5.57f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5.58f)
                lineToRelative(4.87f, -4.67f)
                curveToRelative(0.52f, 0.16f, 1.06f, 0.25f, 1.63f, 0.25f)
                curveToRelative(3.04f, 0f, 5.5f, -2.46f, 5.5f, -5.5f)
                reflectiveCurveTo(21.54f, 0f, 18.5f, 0f)
                close()
                moveTo(3.78f, 6.26f)
                curveToRelative(-0.09f, -0.08f, -0.17f, -0.17f, -0.24f, -0.26f)
                horizontalLineToRelative(13.93f)
                curveToRelative(-0.08f, 0.1f, -0.17f, 0.2f, -0.27f, 0.28f)
                lineToRelative(-6.69f, 6.42f)
                lineTo(3.81f, 6.29f)
                lineToRelative(-0.03f, -0.03f)
                close()
            }
        }.also { _MartiniGlassCitrus = it}
