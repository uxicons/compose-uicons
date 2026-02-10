package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Podium: ImageVector? = null

val Icons.Rr.Podium: ImageVector
    get() = _Podium ?: UXIcon(name = "Podium") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 10f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-0.01f, 0f, -0.03f, 0f, -0.04f, 0f)
                lineTo(4f, 10f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.17f)
                curveToRelative(0.41f, 1.16f, 1.52f, 2f, 2.83f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3f)
                lineTo(1f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.15f)
                lineToRelative(1.3f, 7.82f)
                curveToRelative(0.4f, 2.42f, 2.48f, 4.18f, 4.93f, 4.18f)
                horizontalLineToRelative(7.22f)
                curveToRelative(2.46f, 0f, 4.53f, -1.76f, 4.93f, -4.18f)
                lineToRelative(1.3f, -7.82f)
                horizontalLineToRelative(1.15f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(10f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(18.57f, 19.49f)
                curveToRelative(-0.24f, 1.45f, -1.49f, 2.51f, -2.96f, 2.51f)
                horizontalLineToRelative(-7.22f)
                curveToRelative(-1.47f, 0f, -2.72f, -1.05f, -2.96f, -2.51f)
                lineToRelative(-1.25f, -7.49f)
                horizontalLineToRelative(15.64f)
                lineToRelative(-1.25f, 7.49f)
                close()
            }
        }.also { _Podium = it}
