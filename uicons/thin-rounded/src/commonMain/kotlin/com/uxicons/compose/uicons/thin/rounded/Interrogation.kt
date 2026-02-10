package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interrogation: ImageVector? = null

val Icons.Tr.Interrogation: ImageVector
    get() = _Interrogation ?: UXIcon(name = "Interrogation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(12.94f, 5.11f)
                curveToRelative(-1.22f, -0.28f, -2.47f, 0f, -3.43f, 0.77f)
                curveToRelative(-0.96f, 0.76f, -1.51f, 1.9f, -1.51f, 3.13f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.92f, 0.41f, -1.77f, 1.13f, -2.35f)
                curveToRelative(0.72f, -0.57f, 1.66f, -0.78f, 2.58f, -0.57f)
                curveToRelative(1.07f, 0.24f, 1.96f, 1.13f, 2.21f, 2.21f)
                curveToRelative(0.31f, 1.34f, -0.28f, 2.69f, -1.47f, 3.34f)
                curveToRelative(-1.22f, 0.67f, -1.95f, 1.83f, -1.95f, 3.1f)
                verticalLineToRelative(0.27f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0f, -0.9f, 0.53f, -1.73f, 1.43f, -2.23f)
                curveToRelative(1.58f, -0.87f, 2.37f, -2.66f, 1.97f, -4.44f)
                curveToRelative(-0.33f, -1.46f, -1.5f, -2.62f, -2.96f, -2.96f)
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
