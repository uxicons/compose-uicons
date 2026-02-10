package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleB: ImageVector? = null

val Icons.Tr.CircleB: ImageVector
    get() = _CircleB ?: UXIcon(name = "CircleB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(15.1f, 11.07f)
                curveToRelative(0.56f, -0.56f, 0.9f, -1.34f, 0.9f, -2.2f)
                curveToRelative(0f, -1.72f, -1.4f, -3.12f, -3.12f, -3.12f)
                horizontalLineToRelative(-2.88f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4.38f)
                curveToRelative(2.0f, 0f, 3.62f, -1.63f, 3.62f, -3.62f)
                curveToRelative(0f, -1.75f, -1.25f, -3.22f, -2.9f, -3.55f)
                close()
                moveTo(8f, 8.75f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2.88f)
                curveToRelative(1.17f, 0f, 2.12f, 0.95f, 2.12f, 2.12f)
                reflectiveCurveToRelative(-0.95f, 2.12f, -2.12f, 2.12f)
                horizontalLineToRelative(-4.88f)
                verticalLineToRelative(-2.25f)
                close()
                moveTo(14.38f, 17.25f)
                horizontalLineToRelative(-4.38f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(6.38f)
                curveToRelative(1.45f, 0f, 2.62f, 1.18f, 2.62f, 2.62f)
                reflectiveCurveToRelative(-1.18f, 2.62f, -2.62f, 2.62f)
                close()
            }
        }.also { _CircleB = it}
