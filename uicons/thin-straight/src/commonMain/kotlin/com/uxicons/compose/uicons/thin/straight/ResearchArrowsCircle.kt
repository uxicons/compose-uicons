package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResearchArrowsCircle: ImageVector? = null

val Icons.Ts.ResearchArrowsCircle: ImageVector
    get() = _ResearchArrowsCircle ?: UXIcon(name = "ResearchArrowsCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                curveToRelative(-3.71f, 0f, -7.17f, 1.91f, -9.19f, 5f)
                lineTo(7f, 6f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 1f)
                horizontalLineToRelative(1f)
                lineTo(2f, 5.41f)
                curveTo(4.21f, 2.07f, 7.97f, 0f, 12f, 0f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(21.5f, 17f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.19f)
                curveToRelative(-2.02f, 3.09f, -5.48f, 5f, -9.19f, 5f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                lineTo(0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                curveToRelative(4.03f, 0f, 7.79f, -2.07f, 10f, -5.41f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(11.56f, 4.22f)
                lineToRelative(-3.51f, 6.84f)
                curveToRelative(-0.1f, 0.34f, -0.04f, 0.7f, 0.17f, 0.99f)
                curveToRelative(0.21f, 0.29f, 0.54f, 0.45f, 0.9f, 0.45f)
                horizontalLineToRelative(5.78f)
                curveToRelative(0.04f, 0f, 0.07f, 0.02f, 0.09f, 0.05f)
                curveToRelative(0.02f, 0.04f, 0.02f, 0.07f, -0.03f, 0.15f)
                lineToRelative(-3.4f, 6.52f)
                lineToRelative(0.89f, 0.46f)
                lineToRelative(3.37f, -6.48f)
                curveToRelative(0.23f, -0.34f, 0.24f, -0.77f, 0.05f, -1.13f)
                curveToRelative(-0.19f, -0.36f, -0.56f, -0.58f, -0.97f, -0.58f)
                horizontalLineToRelative(-5.78f)
                curveToRelative(-0.05f, 0f, -0.08f, -0.03f, -0.09f, -0.05f)
                curveToRelative(-0.02f, -0.02f, -0.03f, -0.06f, -0.05f, -0.02f)
                lineToRelative(3.47f, -6.76f)
                lineToRelative(-0.89f, -0.46f)
                close()
            }
        }.also { _ResearchArrowsCircle = it}
