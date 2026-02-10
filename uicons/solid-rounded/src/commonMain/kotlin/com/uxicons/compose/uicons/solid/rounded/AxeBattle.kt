package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AxeBattle: ImageVector? = null

val Icons.Sr.AxeBattle: ImageVector
    get() = _AxeBattle ?: UXIcon(name = "AxeBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 3.91f)
                verticalLineToRelative(-0.91f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.33f, 0.05f, 0.66f, 0.08f, 1f, 0.08f)
                curveToRelative(0.33f, 0f, 0.67f, -0.04f, 1f, -0.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 16.09f)
                verticalLineToRelative(6.91f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6.92f)
                curveToRelative(-0.33f, -0.05f, -0.66f, -0.09f, -1f, -0.09f)
                curveToRelative(-0.34f, 0f, -0.67f, 0.04f, -1f, 0.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.56f, 2.14f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.42f, -0.6f, -1.04f, -0.99f, -1.77f, -1.1f)
                curveToRelative(-0.73f, -0.11f, -1.5f, 0.09f, -2.09f, 0.56f)
                curveToRelative(-1.7f, 1.34f, -3.22f, 2.08f, -4.7f, 2.31f)
                verticalLineToRelative(12.17f)
                curveToRelative(1.95f, 0.3f, 3.76f, 1.4f, 5.01f, 2.35f)
                curveToRelative(0.48f, 0.37f, 1.07f, 0.56f, 1.67f, 0.56f)
                curveToRelative(0.13f, 0f, 0.27f, -0.01f, 0.4f, -0.03f)
                curveToRelative(0.71f, -0.11f, 1.33f, -0.49f, 1.75f, -1.07f)
                curveToRelative(1.61f, -2.26f, 2.19f, -5.67f, 2.19f, -7.89f)
                curveToRelative(0f, -2.59f, -0.98f, -5.75f, -2.44f, -7.86f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.03f, 1.6f)
                curveToRelative(-0.59f, -0.47f, -1.36f, -0.67f, -2.09f, -0.56f)
                curveToRelative(-0.72f, 0.11f, -1.35f, 0.5f, -1.77f, 1.1f)
                curveTo(0.57f, 4.45f, 0f, 7.72f, 0f, 10.0f)
                curveToRelative(0f, 2.66f, 0.99f, 5.83f, 2.46f, 7.89f)
                curveToRelative(0.42f, 0.58f, 1.04f, 0.96f, 1.75f, 1.07f)
                curveToRelative(0.72f, 0.11f, 1.48f, -0.09f, 2.06f, -0.54f)
                curveToRelative(1.26f, -0.96f, 2.89f, -2.04f, 4.73f, -2.34f)
                verticalLineTo(3.92f)
                curveToRelative(-2.13f, -0.32f, -3.98f, -1.54f, -4.97f, -2.32f)
                close()
            }
        }.also { _AxeBattle = it}
