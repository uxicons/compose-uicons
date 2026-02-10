package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightbulbSlash: ImageVector? = null

val Icons.Ss.LightbulbSlash: ImageVector
    get() = _LightbulbSlash ?: UXIcon(name = "LightbulbSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.57f, 16.15f)
                curveToRelative(0.12f, -0.13f, 0.23f, -0.28f, 0.36f, -0.39f)
                curveToRelative(1.95f, -1.71f, 3.07f, -4.17f, 3.07f, -6.76f)
                reflectiveCurveToRelative(-1.1f, -5.01f, -3.01f, -6.71f)
                curveTo(16.09f, 0.58f, 13.52f, -0.23f, 10.96f, 0.06f)
                curveToRelative(-2.38f, 0.27f, -4.57f, 1.53f, -6.05f, 3.43f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.45f)
                lineTo(22.54f, 23.95f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.38f, -6.38f)
                close()
                moveTo(7.87f, 19f)
                curveToRelative(-0.26f, -1.25f, -0.95f, -2.44f, -2.01f, -3.42f)
                curveToRelative(-2.15f, -2f, -3.17f, -4.83f, -2.79f, -7.76f)
                curveToRelative(0.02f, -0.15f, 0.05f, -0.29f, 0.08f, -0.43f)
                lineToRelative(11.61f, 11.61f)
                lineTo(7.87f, 19f)
                close()
                moveTo(16f, 21f)
                verticalLineToRelative(3f)
                lineTo(8f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _LightbulbSlash = it}
