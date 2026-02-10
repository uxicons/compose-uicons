package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interrogation: ImageVector? = null

val Icons.Ts.Interrogation: ImageVector
    get() = _Interrogation ?: UXIcon(name = "Interrogation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.89f, 8.06f)
                curveToRelative(0.41f, 1.78f, -0.38f, 3.57f, -1.97f, 4.44f)
                curveToRelative(-0.89f, 0.49f, -1.43f, 1.33f, -1.43f, 2.23f)
                verticalLineToRelative(0.27f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0f, -1.27f, 0.73f, -2.43f, 1.95f, -3.1f)
                curveToRelative(1.19f, -0.66f, 1.78f, -2.0f, 1.47f, -3.34f)
                curveToRelative(-0.24f, -1.07f, -1.13f, -1.96f, -2.21f, -2.21f)
                curveToRelative(-0.92f, -0.21f, -1.86f, -0.0f, -2.58f, 0.57f)
                curveToRelative(-0.72f, 0.57f, -1.13f, 1.43f, -1.13f, 2.35f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.22f, 0.55f, -2.37f, 1.51f, -3.13f)
                curveToRelative(0.96f, -0.77f, 2.21f, -1.04f, 3.43f, -0.77f)
                curveToRelative(1.46f, 0.33f, 2.62f, 1.5f, 2.96f, 2.96f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                close()
            }
        }.also { _Interrogation = it}
