package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mug: ImageVector? = null

val Icons.Sc.Mug: ImageVector
    get() = _Mug ?: UXIcon(name = "Mug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.43f, 8.18f)
                horizontalLineToRelative(-0.51f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0.58f, -0.07f, 1.1f, -0.47f, 1.27f, -1.07f)
                curveToRelative(0.23f, -0.8f, -0.23f, -1.63f, -1.02f, -1.86f)
                curveToRelative(-0.14f, -0.04f, -3.58f, -1.02f, -8.62f, -1.02f)
                curveToRelative(-5.17f, 0f, -8.38f, 0.99f, -8.52f, 1.03f)
                curveToRelative(-0.79f, 0.25f, -1.23f, 1.09f, -0.98f, 1.88f)
                curveToRelative(0.17f, 0.54f, 0.61f, 0.91f, 1.13f, 1.02f)
                verticalLineToRelative(1.88f)
                lineTo(12.99f, 8.48f)
                curveToRelative(0.55f, 0f, 0.99f, 0.44f, 0.99f, 0.99f)
                reflectiveCurveToRelative(-0.44f, 0.99f, -0.99f, 0.99f)
                lineTo(2.2f, 10.45f)
                verticalLineToRelative(6.58f)
                curveToRelative(0f, 1.81f, 1.16f, 3.4f, 2.89f, 3.95f)
                curveToRelative(0.74f, 0.24f, 3.11f, 0.35f, 5.48f, 0.35f)
                reflectiveCurveToRelative(4.74f, -0.12f, 5.48f, -0.35f)
                curveToRelative(1.73f, -0.55f, 2.89f, -2.14f, 2.89f, -3.95f)
                verticalLineToRelative(-0.15f)
                horizontalLineToRelative(0.51f)
                curveToRelative(1.97f, 0f, 3.57f, -1.61f, 3.57f, -3.58f)
                verticalLineToRelative(-1.54f)
                curveToRelative(0f, -1.98f, -1.6f, -3.58f, -3.57f, -3.58f)
                close()
                moveTo(20f, 13.3f)
                curveToRelative(0f, 0.32f, -0.26f, 0.58f, -0.57f, 0.58f)
                horizontalLineToRelative(-0.51f)
                verticalLineToRelative(-2.7f)
                horizontalLineToRelative(0.51f)
                curveToRelative(0.31f, 0f, 0.57f, 0.26f, 0.57f, 0.58f)
                verticalLineToRelative(1.54f)
                close()
            }
        }.also { _Mug = it}
