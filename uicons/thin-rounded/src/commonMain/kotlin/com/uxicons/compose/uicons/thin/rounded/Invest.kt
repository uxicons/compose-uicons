package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Tr.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.71f, 6.8f)
                curveToRelative(-0.25f, -0.12f, -0.55f, -0.0f, -0.66f, 0.25f)
                reflectiveCurveToRelative(-0.0f, 0.55f, 0.25f, 0.66f)
                curveToRelative(2.86f, 1.29f, 4.71f, 4.16f, 4.71f, 7.29f)
                curveToRelative(0f, 2.03f, -0.76f, 3.88f, -2.0f, 5.29f)
                lineToRelative(-5.06f, -5.06f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.67f, -0.44f, -1.06f)
                verticalLineTo(1.29f)
                lineToRelative(2.65f, 2.57f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.14f, 0.35f, 0.14f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.36f, -0.15f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.52f, -0.01f, -0.71f)
                lineTo(13.06f, 0.44f)
                curveTo(12.77f, 0.15f, 12.38f, 0.0f, 12.0f, 0f)
                curveToRelative(0f, 0f, -0.0f, 0f, -0.0f, 0f)
                curveToRelative(0f, 0f, -0.0f, 0f, -0.0f, 0f)
                curveToRelative(-0.38f, 0f, -0.76f, 0.14f, -1.05f, 0.43f)
                lineToRelative(-2.79f, 2.71f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.71f, 0.01f)
                lineToRelative(2.65f, -2.57f)
                verticalLineToRelative(4.73f)
                curveToRelative(-4.73f, 0.26f, -8.5f, 4.19f, -8.5f, 8.99f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -3.53f, -2.08f, -6.75f, -5.29f, -8.2f)
                close()
                moveTo(4f, 15f)
                curveToRelative(0f, -4.24f, 3.32f, -7.72f, 7.5f, -7.98f)
                verticalLineToRelative(7.16f)
                curveToRelative(0f, 0.67f, 0.26f, 1.29f, 0.73f, 1.77f)
                lineToRelative(5.06f, 5.06f)
                curveToRelative(-1.41f, 1.25f, -3.26f, 2.0f, -5.29f, 2.0f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                close()
            }
        }.also { _Invest = it}
