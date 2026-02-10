package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSleeping: ImageVector? = null

val Icons.Bs.FaceSleeping: ImageVector
    get() = _FaceSleeping ?: UXIcon(name = "FaceSleeping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(5f, 11f)
                curveToRelative(0f, 1.63f, 1f, 4f, 3f, 4f)
                reflectiveCurveToRelative(3f, -2.37f, 3f, -4f)
                curveToRelative(0f, 0f, -2f, 1f, -3f, 1f)
                reflectiveCurveToRelative(-3f, -1f, -3f, -1f)
                close()
                moveTo(13f, 11f)
                curveToRelative(0f, 1.63f, 1f, 4f, 3f, 4f)
                reflectiveCurveToRelative(3f, -2.37f, 3f, -4f)
                curveToRelative(0f, 0f, -2f, 1f, -3f, 1f)
                reflectiveCurveToRelative(-3f, -1f, -3f, -1f)
                close()
                moveTo(20.05f, 8f)
                curveToRelative(0.6f, 1.21f, 0.95f, 2.56f, 0.95f, 4f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 16.96f, 3f, 12f)
                curveToRelative(0f, -4.27f, 3.0f, -7.86f, 7f, -8.77f)
                lineTo(10f, 0.18f)
                curveTo(4.33f, 1.14f, 0f, 6.07f, 0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -1.4f, -0.26f, -2.75f, -0.7f, -4f)
                horizontalLineToRelative(-3.25f)
                close()
                moveTo(24f, 0f)
                horizontalLineToRelative(-5f)
                lineTo(19f, 2f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-2.09f, 2.09f)
                verticalLineToRelative(1.91f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(2.09f, -2.09f)
                lineTo(24f, 0f)
                close()
                moveTo(17f, 6f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(2.09f, -2.09f)
                verticalLineToRelative(-1.91f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-2.09f, 2.09f)
                verticalLineToRelative(1.91f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _FaceSleeping = it}
