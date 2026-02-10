package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudExclamation: ImageVector? = null

val Icons.Ts.CloudExclamation: ImageVector
    get() = _CloudExclamation ?: UXIcon(name = "CloudExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 19f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(11f)
                close()
                moveTo(11.5f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(17.0f, 7.02f)
                curveToRelative(-1.13f, -3.02f, -4.0f, -5.02f, -7.25f, -5.02f)
                curveToRelative(-4.27f, 0f, -7.75f, 3.48f, -7.75f, 7.75f)
                curveToRelative(0f, 0.76f, 0.12f, 1.52f, 0.34f, 2.27f)
                curveToRelative(-1.48f, 1.03f, -2.35f, 2.68f, -2.35f, 4.48f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -1.58f, 0.82f, -3.02f, 2.2f, -3.85f)
                lineToRelative(0.35f, -0.21f)
                lineToRelative(-0.14f, -0.39f)
                curveToRelative(-0.27f, -0.75f, -0.41f, -1.53f, -0.41f, -2.3f)
                curveToRelative(0f, -3.72f, 3.03f, -6.75f, 6.75f, -6.75f)
                curveToRelative(2.93f, 0f, 5.51f, 1.87f, 6.42f, 4.66f)
                lineToRelative(0.11f, 0.34f)
                lineToRelative(0.35f, 0.01f)
                curveToRelative(3.51f, 0.07f, 6.37f, 2.98f, 6.37f, 6.49f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                curveToRelative(0f, -3.93f, -3.11f, -7.22f, -7.0f, -7.48f)
                close()
            }
        }.also { _CloudExclamation = it}
