package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeUp: ImageVector? = null

val Icons.Rc.MarsStrokeUp: ImageVector
    get() = _MarsStrokeUp ?: UXIcon(name = "MarsStrokeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11.06f)
                verticalLineToRelative(-2.06f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0.43f, 0.44f, 0.83f, 0.89f, 1.2f, 1.38f)
                curveToRelative(0.33f, 0.45f, 0.96f, 0.53f, 1.4f, 0.2f)
                curveToRelative(0.44f, -0.33f, 0.53f, -0.96f, 0.2f, -1.4f)
                curveToRelative(-0.91f, -1.21f, -1.98f, -2.29f, -3.2f, -3.2f)
                curveToRelative(-0.35f, -0.27f, -0.85f, -0.27f, -1.2f, 0f)
                curveToRelative(-1.22f, 0.91f, -2.29f, 1.99f, -3.2f, 3.2f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                reflectiveCurveToRelative(1.07f, 0.24f, 1.4f, -0.2f)
                curveToRelative(0.37f, -0.49f, 0.77f, -0.94f, 1.2f, -1.38f)
                verticalLineToRelative(2.78f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.06f)
                curveToRelative(-3.43f, 0.29f, -5f, 2.15f, -5f, 5.94f)
                curveToRelative(0f, 4.15f, 1.85f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -1.85f, 6f, -6f)
                curveToRelative(0f, -3.79f, -1.57f, -5.64f, -5f, -5.94f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-3.03f, 0f, -4f, -0.97f, -4f, -4f)
                reflectiveCurveToRelative(0.97f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 0.97f, 4f, 4f)
                reflectiveCurveToRelative(-0.97f, 4f, -4f, 4f)
                close()
            }
        }.also { _MarsStrokeUp = it}
