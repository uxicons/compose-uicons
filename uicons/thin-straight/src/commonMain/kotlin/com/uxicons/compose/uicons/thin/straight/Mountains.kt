package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Ts.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(20f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(17.5f, 12.01f)
                curveToRelative(-0.83f, 0f, -1.56f, 0.47f, -1.9f, 1.22f)
                lineToRelative(-4.55f, 10.02f)
                lineToRelative(-0.04f, 0.76f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-0.55f)
                lineToRelative(-4.6f, -10.22f)
                curveToRelative(-0.35f, -0.75f, -1.07f, -1.22f, -1.9f, -1.22f)
                close()
                moveTo(12.25f, 23f)
                lineToRelative(4.25f, -9.36f)
                curveToRelative(0.18f, -0.4f, 0.56f, -0.64f, 0.99f, -0.64f)
                reflectiveCurveToRelative(0.81f, 0.24f, 0.99f, 0.64f)
                lineToRelative(4.25f, 9.36f)
                horizontalLineToRelative(-10.49f)
                close()
                moveTo(11.0f, 6.64f)
                curveToRelative(-0.19f, -0.4f, -0.56f, -0.64f, -1.0f, -0.64f)
                reflectiveCurveToRelative(-0.81f, 0.24f, -0.99f, 0.64f)
                lineTo(1.27f, 23f)
                horizontalLineToRelative(7.73f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                lineToRelative(0.05f, -0.76f)
                lineTo(8.1f, 6.21f)
                curveToRelative(0.34f, -0.75f, 1.07f, -1.21f, 1.9f, -1.21f)
                reflectiveCurveToRelative(1.56f, 0.47f, 1.9f, 1.22f)
                lineToRelative(2.48f, 5.24f)
                curveToRelative(-0.24f, 0.28f, -0.44f, 0.6f, -0.6f, 0.94f)
                lineToRelative(-0.03f, 0.06f)
                lineToRelative(-2.75f, -5.82f)
                close()
            }
        }.also { _Mountains = it}
