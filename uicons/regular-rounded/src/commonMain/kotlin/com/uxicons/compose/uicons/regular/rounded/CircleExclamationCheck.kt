package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleExclamationCheck: ImageVector? = null

val Icons.Rr.CircleExclamationCheck: ImageVector
    get() = _CircleExclamationCheck ?: UXIcon(name = "CircleExclamationCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(8.5f, 15.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(17.38f, 17.25f)
                curveToRelative(-0.41f, -0.37f, -1.04f, -0.33f, -1.41f, 0.08f)
                curveToRelative(-1.51f, 1.69f, -3.68f, 2.66f, -5.95f, 2.67f)
                curveToRelative(-4.41f, -0.01f, -7.99f, -3.59f, -7.99f, -8f)
                reflectiveCurveToRelative(3.58f, -7.99f, 7.99f, -8f)
                curveToRelative(3.38f, 0.01f, 6.41f, 2.15f, 7.53f, 5.33f)
                curveToRelative(0.18f, 0.52f, 0.76f, 0.8f, 1.27f, 0.61f)
                curveToRelative(0.52f, -0.18f, 0.79f, -0.76f, 0.61f, -1.27f)
                curveToRelative(-1.41f, -3.98f, -5.18f, -6.65f, -9.4f, -6.67f)
                horizontalLineToRelative(-0.04f)
                curveTo(4.49f, 2.02f, 0.02f, 6.5f, 0.02f, 12f)
                reflectiveCurveToRelative(4.47f, 9.98f, 9.97f, 10f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.01f, 0f, 0.02f, 0f, 0.02f, 0f)
                horizontalLineToRelative(0.01f)
                curveToRelative(2.83f, -0.01f, 5.53f, -1.22f, 7.42f, -3.33f)
                curveToRelative(0.37f, -0.41f, 0.33f, -1.04f, -0.08f, -1.41f)
                close()
                moveTo(23.72f, 9.3f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.02f)
                lineToRelative(-3.5f, 3.39f)
                curveToRelative(-0.44f, 0.44f, -1.16f, 0.44f, -1.63f, -0.03f)
                lineToRelative(-1.49f, -1.38f)
                curveToRelative(-0.41f, -0.37f, -1.04f, -0.35f, -1.41f, 0.06f)
                curveToRelative(-0.37f, 0.41f, -0.35f, 1.04f, 0.06f, 1.41f)
                lineToRelative(1.46f, 1.35f)
                curveToRelative(0.61f, 0.61f, 1.42f, 0.92f, 2.22f, 0.92f)
                reflectiveCurveToRelative(1.6f, -0.3f, 2.2f, -0.91f)
                lineToRelative(3.49f, -3.38f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.02f, -1.41f)
                close()
            }
        }.also { _CircleExclamationCheck = it}
