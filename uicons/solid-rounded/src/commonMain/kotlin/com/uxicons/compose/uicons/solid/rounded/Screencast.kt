package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screencast: ImageVector? = null

val Icons.Sr.Screencast: ImageVector
    get() = _Screencast ?: UXIcon(name = "Screencast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.5f, 19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(0f, 21.33f, 0f, 20.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8f, 21f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(13f, 21f)
                curveToRelative(0f, -6.62f, -5.36f, -12f, -11.95f, -12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(5.49f, 0f, 9.95f, 4.49f, 9.95f, 10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 17f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5.0f, -5f)
                lineToRelative(-14.13f, 0.02f)
                curveTo(2.6f, 2.02f, 0.61f, 3.55f, 0.03f, 5.75f)
                curveToRelative(-0.08f, 0.3f, 0.01f, 0.62f, 0.2f, 0.86f)
                curveToRelative(0.19f, 0.25f, 0.51f, 0.39f, 0.81f, 0.39f)
                curveToRelative(7.68f, 0f, 13.94f, 6.28f, 13.94f, 14f)
                curveToRelative(0f, 0.55f, 0.47f, 1f, 1.02f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _Screencast = it}
