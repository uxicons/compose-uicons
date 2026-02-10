package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeRight: ImageVector? = null

val Icons.Rc.MarsStrokeRight: ImageVector
    get() = _MarsStrokeRight ?: UXIcon(name = "MarsStrokeRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.8f, 11.4f)
                curveToRelative(-0.91f, -1.21f, -1.98f, -2.29f, -3.2f, -3.2f)
                curveToRelative(-0.44f, -0.33f, -1.07f, -0.24f, -1.4f, 0.2f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                curveToRelative(0.49f, 0.37f, 0.95f, 0.77f, 1.38f, 1.2f)
                horizontalLineToRelative(-2.78f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-0.29f, -3.43f, -2.15f, -5f, -5.94f, -5f)
                curveToRelative(-4.15f, 0f, -6f, 1.85f, -6f, 6f)
                reflectiveCurveToRelative(1.85f, 6f, 6f, 6f)
                curveToRelative(3.79f, 0f, 5.64f, -1.57f, 5.94f, -5f)
                horizontalLineToRelative(2.06f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.78f)
                curveToRelative(-0.44f, 0.43f, -0.89f, 0.83f, -1.38f, 1.2f)
                curveToRelative(-0.44f, 0.33f, -0.53f, 0.96f, -0.2f, 1.4f)
                curveToRelative(0.33f, 0.44f, 0.96f, 0.53f, 1.4f, 0.2f)
                curveToRelative(1.22f, -0.91f, 2.29f, -1.99f, 3.2f, -3.2f)
                curveToRelative(0.27f, -0.35f, 0.27f, -0.84f, 0f, -1.2f)
                close()
                moveTo(7f, 16f)
                curveToRelative(-3.03f, 0f, -4f, -0.97f, -4f, -4f)
                reflectiveCurveToRelative(0.97f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 0.97f, 4f, 4f)
                reflectiveCurveToRelative(-0.97f, 4f, -4f, 4f)
                close()
            }
        }.also { _MarsStrokeRight = it}
