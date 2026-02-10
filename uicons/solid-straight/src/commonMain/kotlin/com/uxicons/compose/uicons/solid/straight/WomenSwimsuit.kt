package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WomenSwimsuit: ImageVector? = null

val Icons.Ss.WomenSwimsuit: ImageVector
    get() = _WomenSwimsuit ?: UXIcon(name = "WomenSwimsuit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.63f, 13.79f)
                curveToRelative(-0.37f, -0.7f, -0.63f, -1.21f, -0.63f, -1.79f)
                curveToRelative(0f, -1.05f, 0.33f, -2.34f, 0.6f, -3.38f)
                curveToRelative(0.27f, -1.05f, 0.43f, -1.66f, 0.4f, -2.42f)
                curveToRelative(-0.23f, -0.42f, -0.91f, -1.2f, -1.0f, -3.2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.61f, -0.14f, 1.21f, -0.4f, 1.74f)
                curveToRelative(-0.55f, 1.09f, -2.08f, 2.27f, -3.6f, 2.27f)
                reflectiveCurveToRelative(-3.05f, -1.18f, -3.6f, -2.27f)
                curveToRelative(-0.26f, -0.52f, -0.4f, -1.12f, -0.4f, -1.73f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                curveToRelative(-0.09f, 2.01f, -0.76f, 2.77f, -1f, 3.2f)
                curveToRelative(-0.03f, 0.76f, 0.14f, 1.37f, 0.4f, 2.42f)
                curveToRelative(0.19f, 0.73f, 0.4f, 1.58f, 0.51f, 2.38f)
                horizontalLineToRelative(10.09f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10.24f)
                curveToRelative(-0.11f, 0.24f, -0.23f, 0.5f, -0.39f, 0.79f)
                curveToRelative(-0.62f, 1.05f, -1.5f, 3.19f, -1.37f, 5.66f)
                lineToRelative(5.12f, 4.55f)
                horizontalLineToRelative(5.76f)
                lineToRelative(5.12f, -4.55f)
                curveToRelative(0.13f, -2.47f, -0.75f, -4.6f, -1.37f, -5.66f)
                close()
            }
        }.also { _WomenSwimsuit = it}
