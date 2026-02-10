package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyAlt: ImageVector? = null

val Icons.Ts.CandyAlt: ImageVector
    get() = _CandyAlt ?: UXIcon(name = "CandyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                horizontalLineToRelative(-0.5f)
                lineTo(14.5f, 0.01f)
                curveTo(9.77f, 0.27f, 6f, 4.21f, 6f, 9f)
                curveToRelative(0f, 2.3f, 0.87f, 4.4f, 2.3f, 6.0f)
                lineTo(0.04f, 23.25f)
                lineToRelative(0.71f, 0.71f)
                lineTo(9.0f, 15.7f)
                curveToRelative(1.59f, 1.43f, 3.69f, 2.3f, 6.0f, 2.3f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(19.96f, 0f, 15f, 0f)
                close()
                moveTo(15f, 17f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -4.32f, 3.45f, -7.86f, 7.74f, -8.0f)
                curveToRelative(3.42f, 0.12f, 6.26f, 2.93f, 6.26f, 6.25f)
                curveToRelative(0f, 3.39f, -2.47f, 5.75f, -6f, 5.75f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(0.94f, 0f, 2f, 0.85f, 2f, 2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                verticalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.6f, -1.4f, -3f, -3f, -3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(4.06f, 0f, 7f, -2.84f, 7f, -6.75f)
                curveToRelative(0f, -1.25f, -0.35f, -2.45f, -0.96f, -3.49f)
                curveToRelative(1.22f, 1.41f, 1.96f, 3.24f, 1.96f, 5.24f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                close()
            }
        }.also { _CandyAlt = it}
