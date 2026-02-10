package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gun: ImageVector? = null

val Icons.Sr.Gun: ImageVector
    get() = _Gun ?: UXIcon(name = "Gun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                verticalLineToRelative(0.0f)
                curveToRelative(0f, 1.1f, -0.89f, 2.0f, -2.0f, 2.0f)
                lineTo(1.65f, 9f)
                curveToRelative(-0.99f, 0.01f, -1.72f, -0.85f, -1.65f, -1.81f)
                verticalLineToRelative(-2.19f)
                curveToRelative(0f, -0.53f, 0.43f, -1.02f, 0.96f, -1.0f)
                curveToRelative(0.58f, 0.02f, 1.06f, -0.46f, 1.04f, -1.04f)
                curveToRelative(-0.02f, -0.53f, 0.47f, -0.96f, 1.0f, -0.96f)
                lineTo(19f, 2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(1.08f, 0f, 1.96f, 0.87f, 2.0f, 1.95f)
                curveToRelative(0.0f, 0.03f, 0.0f, 0.05f, 0.0f, 0.05f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(14.06f, 12.86f)
                curveToRelative(-0.38f, 1.28f, -1.54f, 2.14f, -2.87f, 2.14f)
                horizontalLineToRelative(-2.48f)
                lineToRelative(0.66f, -2f)
                horizontalLineToRelative(1.63f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(2.53f, 11f)
                curveToRelative(-0.03f, 0.21f, -0.08f, 0.47f, -0.18f, 0.81f)
                lineTo(0.17f, 18.0f)
                curveToRelative(-0.72f, 1.87f, 0.82f, 4.05f, 2.83f, 4.0f)
                horizontalLineToRelative(0.76f)
                curveToRelative(1.57f, 0f, 2.96f, -1.0f, 3.45f, -2.49f)
                lineToRelative(0.84f, -2.53f)
                curveToRelative(0.04f, 0.01f, 0.07f, 0.02f, 0.11f, 0.02f)
                horizontalLineToRelative(3.02f)
                curveToRelative(2.23f, 0f, 4.15f, -1.43f, 4.79f, -3.56f)
                lineToRelative(0.73f, -2.44f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(-0.56f, 1.86f)
                close()
            }
        }.also { _Gun = it}
