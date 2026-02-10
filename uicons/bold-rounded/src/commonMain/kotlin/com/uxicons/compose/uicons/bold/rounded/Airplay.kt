package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Airplay: ImageVector? = null

val Icons.Br.Airplay: ImageVector
    get() = _Airplay ?: UXIcon(name = "Airplay") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.69f, 13.26f)
            curveToRelative(-0.67f, -0.8f, -1.65f, -1.26f, -2.69f, -1.26f)
            horizontalLineToRelative(0f)
            curveToRelative(-1.04f, 0f, -2.02f, 0.46f, -2.7f, 1.27f)
            lineToRelative(-5.96f, 7.28f)
            curveToRelative(-0.37f, 0.45f, -0.44f, 1.07f, -0.2f, 1.59f)
            curveToRelative(0.25f, 0.52f, 0.78f, 0.86f, 1.35f, 0.86f)
            horizontalLineToRelative(15f)
            curveToRelative(0.58f, 0f, 1.11f, -0.33f, 1.35f, -0.86f)
            curveToRelative(0.25f, -0.52f, 0.17f, -1.14f, -0.2f, -1.59f)
            lineToRelative(-5.97f, -7.29f)
            close()
            moveTo(7.67f, 20f)
            lineToRelative(3.95f, -4.82f)
            curveToRelative(0.13f, -0.16f, 0.3f, -0.18f, 0.38f, -0.18f)
            reflectiveCurveToRelative(0.25f, 0.02f, 0.38f, 0.17f)
            lineToRelative(3.96f, 4.83f)
            lineTo(7.67f, 20f)
            close()
            moveTo(24f, 6.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.25f, -0.43f, 2.47f, -1.21f, 3.44f)
            curveToRelative(-0.52f, 0.65f, -1.46f, 0.75f, -2.11f, 0.23f)
            curveToRelative(-0.65f, -0.52f, -0.75f, -1.46f, -0.23f, -2.11f)
            curveToRelative(0.36f, -0.45f, 0.55f, -0.98f, 0.55f, -1.56f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 4.0f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.57f, 0.19f, 1.11f, 0.55f, 1.56f)
            curveToRelative(0.52f, 0.65f, 0.41f, 1.59f, -0.23f, 2.11f)
            curveToRelative(-0.28f, 0.22f, -0.61f, 0.33f, -0.94f, 0.33f)
            curveToRelative(-0.44f, 0f, -0.88f, -0.19f, -1.17f, -0.56f)
            curveToRelative(-0.78f, -0.97f, -1.21f, -2.19f, -1.21f, -3.44f)
            verticalLineToRelative(-7f)
            curveTo(0f, 3.47f, 2.47f, 1f, 5.5f, 1f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
        }
    }.also { _Airplay = it }
