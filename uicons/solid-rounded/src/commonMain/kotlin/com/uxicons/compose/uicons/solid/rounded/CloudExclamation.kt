package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudExclamation: ImageVector? = null

val Icons.Sr.CloudExclamation: ImageVector
    get() = _CloudExclamation ?: UXIcon(name = "CloudExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.97f, 7.17f)
                curveToRelative(-0.33f, -0.07f, -0.6f, -0.27f, -0.74f, -0.57f)
                curveToRelative(-1.55f, -3.27f, -5.14f, -5.1f, -8.73f, -4.44f)
                curveToRelative(-3.27f, 0.6f, -5.84f, 3.21f, -6.38f, 6.5f)
                curveToRelative(-0.16f, 0.97f, -0.15f, 1.94f, 0.03f, 2.89f)
                curveToRelative(0.06f, 0.31f, -0.07f, 0.65f, -0.35f, 0.9f)
                curveToRelative(-1.16f, 1.06f, -1.8f, 2.49f, -1.8f, 4.04f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.03f, 0f, 0.05f, 0f, 0.08f, -0.0f)
                curveToRelative(3.87f, -0.29f, 6.91f, -3.58f, 6.92f, -7.48f)
                curveToRelative(-0.01f, -3.56f, -2.54f, -6.65f, -6.03f, -7.34f)
                close()
                moveTo(11f, 8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _CloudExclamation = it}
