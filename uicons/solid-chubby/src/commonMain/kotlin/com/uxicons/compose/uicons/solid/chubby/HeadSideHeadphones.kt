package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideHeadphones: ImageVector? = null

val Icons.Sc.HeadSideHeadphones: ImageVector
    get() = _HeadSideHeadphones ?: UXIcon(name = "HeadSideHeadphones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 9f)
                curveToRelative(1.59f, 0f, 2f, 0.41f, 2f, 2f)
                reflectiveCurveToRelative(-0.41f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.41f, -2f, -2f)
                reflectiveCurveToRelative(0.41f, -2f, 2f, -2f)
                close()
                moveTo(22.97f, 13.27f)
                curveToRelative(-0.7f, -2.98f, -1.88f, -5.55f, -3.81f, -8.31f)
                curveToRelative(-1.77f, -2.54f, -3.8f, -3.67f, -7.17f, -3.91f)
                verticalLineToRelative(6.02f)
                curveToRelative(2.01f, 0.3f, 3f, 1.59f, 3f, 3.93f)
                curveToRelative(0f, 2.69f, -1.31f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.31f, -4f, -4f)
                curveToRelative(0f, -2.33f, 0.99f, -3.62f, 3f, -3.93f)
                verticalLineToRelative(-6.06f)
                curveToRelative(-6.29f, 0.14f, -9f, 3f, -9f, 9.49f)
                curveToRelative(0f, 3.3f, 0.76f, 4.89f, 2.16f, 6.67f)
                curveToRelative(0.54f, 0.69f, 0.84f, 1.56f, 0.84f, 2.45f)
                verticalLineToRelative(1.38f)
                curveToRelative(0f, 0.35f, 0.18f, 0.68f, 0.48f, 0.86f)
                curveToRelative(0.08f, 0.05f, 1.95f, 1.14f, 5.51f, 1.14f)
                reflectiveCurveToRelative(5.44f, -1.1f, 5.51f, -1.14f)
                curveToRelative(0.3f, -0.18f, 0.48f, -0.51f, 0.48f, -0.86f)
                verticalLineToRelative(-1.06f)
                curveToRelative(2.04f, -0.18f, 3.26f, -0.58f, 3.32f, -0.6f)
                curveToRelative(0.34f, -0.11f, 0.59f, -0.4f, 0.66f, -0.74f)
                curveToRelative(0.02f, -0.09f, 0.4f, -1.92f, 0.57f, -3.83f)
                curveToRelative(1.04f, -0.14f, 1.66f, -0.29f, 1.69f, -0.29f)
                curveToRelative(0.53f, -0.13f, 0.86f, -0.67f, 0.74f, -1.2f)
                close()
            }
        }.also { _HeadSideHeadphones = it}
