package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMusic: ImageVector? = null

val Icons.Sc.UserMusic: ImageVector
    get() = _UserMusic ?: UXIcon(name = "UserMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.0f, 6.5f)
                curveToRelative(0f, -3.75f, 1.75f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 1.75f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-1.75f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -1.75f, -5.5f, -5.5f)
                close()
                moveTo(22.16f, 11.66f)
                curveToRelative(-0.14f, -0.07f, -1.35f, -0.66f, -2.67f, -0.66f)
                curveToRelative(-3.1f, 0f, -4.82f, 1.78f, -5.34f, 2.83f)
                curveToRelative(-0.1f, 0.21f, -0.16f, 0.44f, -0.16f, 0.67f)
                verticalLineToRelative(3.53f)
                curveToRelative(-1.42f, 0.13f, -2f, 0.87f, -2f, 2.47f)
                curveToRelative(0f, 1.79f, 0.71f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -0.71f, 2.5f, -2.5f)
                verticalLineToRelative(-5.54f)
                curveToRelative(0.31f, -0.35f, 1.04f, -0.96f, 2.5f, -0.96f)
                curveToRelative(0.16f, 0f, 0.33f, 0.02f, 0.5f, 0.06f)
                verticalLineToRelative(2.97f)
                curveToRelative(-1.42f, 0.13f, -2f, 0.87f, -2f, 2.47f)
                curveToRelative(0f, 1.79f, 0.71f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -0.71f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.57f, -0.32f, -1.09f, -0.83f, -1.34f)
                close()
                moveTo(11.99f, 16.56f)
                verticalLineToRelative(-2.06f)
                curveToRelative(0f, -0.1f, 0.03f, -0.2f, 0.04f, -0.3f)
                curveToRelative(-0.77f, -0.13f, -1.6f, -0.2f, -2.53f, -0.2f)
                curveToRelative(-5.73f, 0f, -8.35f, 2.46f, -8.49f, 7.97f)
                curveToRelative(-0.01f, 0.27f, 0.1f, 0.53f, 0.28f, 0.72f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.72f, 0.3f)
                horizontalLineToRelative(8.55f)
                curveToRelative(-0.36f, -0.68f, -0.56f, -1.51f, -0.56f, -2.5f)
                curveToRelative(0f, -1.91f, 0.7f, -3.24f, 2f, -3.94f)
                close()
            }
        }.also { _UserMusic = it}
