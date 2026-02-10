package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Manhole: ImageVector? = null

val Icons.Ts.Manhole: ImageVector
    get() = _Manhole ?: UXIcon(name = "Manhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 22.95f)
                verticalLineToRelative(-0.95f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.95f)
                curveToRelative(-5.6f, -0.51f, -10f, -5.23f, -10f, -10.95f)
                reflectiveCurveTo(5.4f, 1.55f, 11f, 1.05f)
                verticalLineToRelative(0.95f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.95f)
                curveToRelative(5.6f, 0.51f, 10f, 5.23f, 10f, 10.95f)
                reflectiveCurveToRelative(-4.4f, 10.45f, -10f, 10.95f)
                close()
                moveTo(3.94f, 16f)
                horizontalLineToRelative(16.13f)
                curveToRelative(-0.17f, 0.35f, -0.37f, 0.68f, -0.58f, 1f)
                lineTo(4.52f, 17f)
                curveToRelative(-0.21f, -0.32f, -0.41f, -0.65f, -0.58f, -1f)
                close()
                moveTo(6.34f, 19f)
                horizontalLineToRelative(11.31f)
                curveToRelative(-0.47f, 0.38f, -0.98f, 0.72f, -1.53f, 1f)
                lineTo(7.87f, 20f)
                curveToRelative(-0.55f, -0.28f, -1.06f, -0.62f, -1.53f, -1f)
                close()
                moveTo(17.66f, 5f)
                lineTo(6.34f, 5f)
                curveToRelative(0.47f, -0.38f, 0.98f, -0.72f, 1.53f, -1f)
                horizontalLineToRelative(8.25f)
                curveToRelative(0.55f, 0.28f, 1.06f, 0.62f, 1.53f, 1f)
                close()
                moveTo(3.06f, 13f)
                horizontalLineToRelative(17.89f)
                curveToRelative(-0.04f, 0.34f, -0.09f, 0.67f, -0.17f, 1f)
                lineTo(3.22f, 14f)
                curveToRelative(-0.07f, -0.33f, -0.13f, -0.66f, -0.17f, -1f)
                close()
                moveTo(20.95f, 11f)
                lineTo(3.06f, 11f)
                curveToRelative(0.04f, -0.34f, 0.09f, -0.67f, 0.17f, -1f)
                horizontalLineToRelative(17.55f)
                curveToRelative(0.07f, 0.33f, 0.13f, 0.66f, 0.17f, 1f)
                close()
                moveTo(20.06f, 8f)
                lineTo(3.94f, 8f)
                curveToRelative(0.17f, -0.35f, 0.37f, -0.68f, 0.58f, -1f)
                horizontalLineToRelative(14.97f)
                curveToRelative(0.21f, 0.32f, 0.41f, 0.65f, 0.58f, 1f)
                close()
            }
        }.also { _Manhole = it}
