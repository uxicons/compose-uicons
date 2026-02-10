package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Airplay: ImageVector? = null

val Icons.Sr.Airplay: ImageVector
    get() = _Airplay ?: UXIcon(name = "Airplay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.61f, 23f)
                lineTo(5.39f, 23f)
                curveToRelative(-0.73f, 0f, -1.38f, -0.41f, -1.69f, -1.07f)
                reflectiveCurveToRelative(-0.22f, -1.42f, 0.24f, -1.98f)
                lineToRelative(5.55f, -6.78f)
                curveToRelative(0.62f, -0.75f, 1.53f, -1.18f, 2.5f, -1.18f)
                reflectiveCurveToRelative(1.88f, 0.43f, 2.5f, 1.17f)
                lineToRelative(5.55f, 6.78f)
                curveToRelative(0.46f, 0.56f, 0.56f, 1.32f, 0.24f, 1.98f)
                curveToRelative(-0.31f, 0.66f, -0.96f, 1.07f, -1.69f, 1.07f)
                close()
                moveTo(19f, 1f)
                lineTo(5f, 1f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.9f, 1.08f, 3.54f, 2.65f, 4.38f)
                lineToRelative(5.3f, -6.48f)
                curveToRelative(1.01f, -1.22f, 2.49f, -1.91f, 4.05f, -1.91f)
                reflectiveCurveToRelative(3.03f, 0.69f, 4.03f, 1.89f)
                lineToRelative(5.32f, 6.5f)
                curveToRelative(1.57f, -0.84f, 2.65f, -2.48f, 2.65f, -4.38f)
                lineTo(24.0f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _Airplay = it}
