package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceMask: ImageVector? = null

val Icons.Ss.FaceMask: ImageVector
    get() = _FaceMask ?: UXIcon(name = "FaceMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.51f, 12f)
                horizontalLineToRelative(12.98f)
                lineToRelative(4.11f, -5.6f)
                curveTo(20.59f, 2.6f, 16.6f, 0f, 12f, 0f)
                reflectiveCurveTo(3.43f, 2.59f, 1.41f, 6.38f)
                lineToRelative(4.1f, 5.62f)
                close()
                moveTo(14.2f, 6.02f)
                curveToRelative(1.49f, 0.3f, 2.99f, 1.07f, 4.45f, 2.29f)
                lineToRelative(-1.29f, 1.53f)
                curveToRelative(-1.2f, -1.01f, -2.39f, -1.63f, -3.55f, -1.86f)
                lineToRelative(0.39f, -1.96f)
                close()
                moveTo(9.8f, 6.02f)
                lineToRelative(0.39f, 1.96f)
                curveToRelative(-1.16f, 0.23f, -2.36f, 0.86f, -3.55f, 1.86f)
                lineToRelative(-1.29f, -1.53f)
                curveToRelative(1.46f, -1.23f, 2.95f, -2.0f, 4.45f, -2.29f)
                close()
                moveTo(19.0f, 14f)
                verticalLineToRelative(5.08f)
                curveToRelative(0f, 0.94f, -0.42f, 1.8f, -1.16f, 2.37f)
                curveToRelative(-1.23f, 0.95f, -2.75f, 2.55f, -5.84f, 2.55f)
                reflectiveCurveToRelative(-4.61f, -1.6f, -5.84f, -2.55f)
                curveToRelative(-0.74f, -0.57f, -1.16f, -1.43f, -1.16f, -2.37f)
                verticalLineToRelative(-5.08f)
                horizontalLineToRelative(14f)
                close()
                moveTo(23.45f, 8.62f)
                curveToRelative(0.33f, 1.1f, 0.53f, 2.25f, 0.53f, 3.46f)
                curveToRelative(0f, 3.04f, -1.14f, 5.8f, -3f, 7.92f)
                lineTo(20.98f, 11.87f)
                lineToRelative(2.47f, -3.25f)
                close()
                moveTo(3f, 11.87f)
                verticalLineToRelative(8.13f)
                curveTo(1.14f, 17.89f, 0f, 15.12f, 0f, 12.08f)
                curveToRelative(0f, -1.21f, 0.2f, -2.36f, 0.53f, -3.46f)
                lineToRelative(2.47f, 3.25f)
                close()
            }
        }.also { _FaceMask = it}
