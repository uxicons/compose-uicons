package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClearAlt: ImageVector? = null

val Icons.Sc.ClearAlt: ImageVector
    get() = _ClearAlt ?: UXIcon(name = "ClearAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 1f)
                curveToRelative(-4.15f, 0f, -6f, 1.85f, -6f, 6f)
                reflectiveCurveToRelative(1.85f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -1.85f, 6f, -6f)
                reflectiveCurveToRelative(-1.85f, -6f, -6f, -6f)
                close()
                moveTo(19.71f, 8.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.29f, 1.29f)
                close()
                moveTo(15.85f, 14.95f)
                curveToRelative(-0.28f, 0.23f, -0.56f, 0.45f, -0.85f, 0.67f)
                verticalLineToRelative(6.38f)
                curveToRelative(0.02f, 0.66f, -0.7f, 1.18f, -1.32f, 0.95f)
                curveToRelative(-1.87f, -0.62f, -3.47f, -1.83f, -4.52f, -3.39f)
                curveToRelative(-0.11f, -0.16f, -0.17f, -0.36f, -0.17f, -0.56f)
                verticalLineToRelative(-3.38f)
                curveToRelative(-3.1f, -2.33f, -5.13f, -4.72f, -6.54f, -7.69f)
                curveToRelative(-0.4f, -0.83f, -0.46f, -2.9f, -0.46f, -2.92f)
                curveToRelative(-0.0f, -0.42f, -0.0f, -0.75f, -0.0f, -1.01f)
                curveToRelative(-0.47f, 0f, -0.88f, -0.33f, -0.98f, -0.8f)
                curveToRelative(-0.11f, -0.54f, 0.24f, -1.07f, 0.78f, -1.18f)
                curveToRelative(0.2f, -0.04f, 4.55f, -0.9f, 9.26f, -1.01f)
                curveToRelative(-1.36f, 1.35f, -2.07f, 3.35f, -2.07f, 5.99f)
                curveToRelative(0f, 4.83f, 2.37f, 7.56f, 6.85f, 7.95f)
                close()
            }
        }.also { _ClearAlt = it}
