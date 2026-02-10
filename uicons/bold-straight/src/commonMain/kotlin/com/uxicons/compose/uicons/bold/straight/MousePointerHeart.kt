package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerHeart: ImageVector? = null

val Icons.Bs.MousePointerHeart: ImageVector
    get() = _MousePointerHeart ?: UXIcon(name = "MousePointerHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.07f, 17.4f)
                lineToRelative(1.2f, 3.49f)
                lineToRelative(-0.77f, 0.55f)
                curveTo(7.42f, 18.97f, -0.62f, 11.09f, 0f, 6.5f)
                curveTo(0f, 2.92f, 2.92f, 0f, 6.5f, 0f)
                curveToRelative(1.99f, 0f, 3.8f, 1.02f, 5f, 2.58f)
                curveToRelative(1.2f, -1.57f, 3.02f, -2.58f, 5f, -2.58f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                curveToRelative(0f, 1.96f, -0.84f, 3.95f, -2.04f, 5.79f)
                lineToRelative(-2.93f, -1.0f)
                curveToRelative(1.18f, -1.63f, 1.98f, -3.29f, 1.98f, -4.79f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.86f, 0f, -3.5f, 1.87f, -3.5f, 4f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -2.13f, -1.64f, -4f, -3.5f, -4f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(-0.38f, 2.85f, 4.95f, 8.71f, 8.07f, 10.9f)
                close()
                moveTo(15.45f, 24f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(24.0f, 15.45f)
                lineToRelative(-13f, -4.45f)
                lineToRelative(4.45f, 13.0f)
                lineToRelative(2.06f, -4.37f)
                lineToRelative(4.29f, 4.29f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-4.29f, -4.29f)
                lineToRelative(4.37f, -2.06f)
                close()
            }
        }.also { _MousePointerHeart = it}
