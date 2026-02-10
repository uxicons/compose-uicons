package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceMask: ImageVector? = null

val Icons.Rs.FaceMask: ImageVector
    get() = _FaceMask ?: UXIcon(name = "FaceMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.8f, 6.02f)
                lineToRelative(0.39f, 1.96f)
                curveToRelative(-1.16f, 0.23f, -2.36f, 0.86f, -3.55f, 1.86f)
                lineToRelative(-1.29f, -1.53f)
                curveToRelative(1.46f, -1.23f, 2.95f, -2.0f, 4.45f, -2.29f)
                close()
                moveTo(13.8f, 7.98f)
                curveToRelative(1.16f, 0.23f, 2.36f, 0.86f, 3.55f, 1.86f)
                lineToRelative(1.29f, -1.53f)
                curveToRelative(-1.46f, -1.23f, -2.95f, -2.0f, -4.45f, -2.29f)
                lineToRelative(-0.39f, 1.96f)
                close()
                moveTo(22f, 18.62f)
                verticalLineToRelative(-6.62f)
                curveToRelative(0f, -0.43f, -0.03f, -0.86f, -0.08f, -1.28f)
                lineToRelative(-1.92f, 2.61f)
                verticalLineToRelative(5.75f)
                curveToRelative(0f, 0.94f, -0.42f, 1.8f, -1.16f, 2.37f)
                curveToRelative(-1.23f, 0.95f, -3.75f, 2.55f, -6.84f, 2.55f)
                reflectiveCurveToRelative(-5.61f, -1.6f, -6.84f, -2.55f)
                curveToRelative(-0.74f, -0.57f, -1.16f, -1.43f, -1.16f, -2.37f)
                verticalLineToRelative(-5.75f)
                lineToRelative(-1.92f, -2.63f)
                curveToRelative(-0.06f, 0.43f, -0.09f, 0.86f, -0.09f, 1.3f)
                verticalLineToRelative(6.62f)
                curveToRelative(-1.26f, -1.9f, -2f, -4.17f, -2f, -6.62f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 2.45f, -0.74f, 4.72f, -2f, 6.62f)
                close()
                moveTo(18f, 14f)
                lineTo(6f, 14f)
                verticalLineToRelative(5.08f)
                curveToRelative(0f, 0.31f, 0.14f, 0.6f, 0.38f, 0.79f)
                curveToRelative(1.03f, 0.8f, 3.12f, 2.13f, 5.62f, 2.13f)
                reflectiveCurveToRelative(4.59f, -1.33f, 5.62f, -2.13f)
                curveToRelative(0.24f, -0.19f, 0.39f, -0.48f, 0.39f, -0.79f)
                verticalLineToRelative(-5.08f)
                close()
                moveTo(21.26f, 8.23f)
                curveToRelative(-1.49f, -3.65f, -5.08f, -6.23f, -9.26f, -6.23f)
                reflectiveCurveTo(4.24f, 4.57f, 2.75f, 8.21f)
                lineToRelative(2.76f, 3.79f)
                horizontalLineToRelative(12.99f)
                lineToRelative(2.77f, -3.77f)
                close()
            }
        }.also { _FaceMask = it}
