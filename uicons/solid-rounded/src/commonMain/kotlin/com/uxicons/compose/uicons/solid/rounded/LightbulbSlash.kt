package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightbulbSlash: ImageVector? = null

val Icons.Sr.LightbulbSlash: ImageVector
    get() = _LightbulbSlash ?: UXIcon(name = "LightbulbSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-6.14f, -6.14f)
                curveToRelative(0.12f, -0.13f, 0.23f, -0.27f, 0.36f, -0.38f)
                curveToRelative(1.95f, -1.71f, 3.07f, -4.17f, 3.07f, -6.76f)
                reflectiveCurveToRelative(-1.1f, -5.01f, -3.01f, -6.71f)
                curveTo(16.09f, 0.58f, 13.52f, -0.23f, 10.96f, 0.06f)
                curveToRelative(-2.38f, 0.27f, -4.57f, 1.53f, -6.05f, 3.43f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.31f, 0.29f, 1.7f)
                lineTo(22.29f, 23.7f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(13.77f, 18f)
                lineTo(7.56f, 18f)
                curveToRelative(-0.36f, -0.88f, -0.93f, -1.7f, -1.7f, -2.42f)
                curveToRelative(-2.15f, -2f, -3.17f, -4.83f, -2.79f, -7.76f)
                curveToRelative(0.02f, -0.15f, 0.05f, -0.29f, 0.08f, -0.44f)
                lineToRelative(10.61f, 10.61f)
                close()
                moveTo(16.01f, 20.24f)
                verticalLineToRelative(0.07f)
                curveToRelative(0f, 2.04f, -1.66f, 3.69f, -3.69f, 3.69f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-2.04f, 0f, -3.69f, -1.66f, -3.69f, -3.69f)
                verticalLineToRelative(-0.31f)
                horizontalLineToRelative(7.76f)
                lineToRelative(0.24f, 0.24f)
                close()
            }
        }.also { _LightbulbSlash = it}
