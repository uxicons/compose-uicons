package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Registered: ImageVector? = null

val Icons.Tr.Registered: ImageVector
    get() = _Registered ?: UXIcon(name = "Registered") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3.17f)
                curveToRelative(-1.56f, 0f, -2.83f, 1.27f, -2.83f, 2.83f)
                verticalLineToRelative(10.67f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(4.71f)
                lineToRelative(3.35f, 5.75f)
                curveToRelative(0.09f, 0.16f, 0.26f, 0.25f, 0.43f, 0.25f)
                curveToRelative(0.09f, 0f, 0.17f, -0.02f, 0.25f, -0.07f)
                curveToRelative(0.24f, -0.14f, 0.32f, -0.45f, 0.18f, -0.68f)
                lineToRelative(-3.11f, -5.33f)
                curveToRelative(1.81f, -0.38f, 3.18f, -1.99f, 3.18f, -3.91f)
                close()
                moveTo(13f, 12f)
                horizontalLineToRelative(-5f)
                lineTo(8f, 7.83f)
                curveToRelative(0f, -1.01f, 0.82f, -1.83f, 1.83f, -1.83f)
                horizontalLineToRelative(3.17f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(12f, 0f)
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
            }
        }.also { _Registered = it}
