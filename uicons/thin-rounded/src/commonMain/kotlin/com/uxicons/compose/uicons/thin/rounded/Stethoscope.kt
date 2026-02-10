package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stethoscope: ImageVector? = null

val Icons.Tr.Stethoscope: ImageVector
    get() = _Stethoscope ?: UXIcon(name = "Stethoscope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(5.05f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                verticalLineToRelative(-1.02f)
                curveToRelative(3.35f, -0.26f, 6f, -3.06f, 6f, -6.47f)
                lineTo(13f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveTo(1f, 11.53f, 1f, 8.5f)
                lineTo(1f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 3.42f, 2.65f, 6.22f, 6f, 6.47f)
                verticalLineToRelative(1.02f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-5.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                close()
                moveTo(21.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Stethoscope = it}
