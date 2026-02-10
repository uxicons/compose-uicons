package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceMask: ImageVector? = null

val Icons.Bs.FaceMask: ImageVector
    get() = _FaceMask ?: UXIcon(name = "FaceMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12.0f)
                reflectiveCurveToRelative(0f, 0.0f, 0f, 0.01f)
                curveToRelative(0f, 0f, 0f, -0.0f, 0f, -0.01f)
                close()
                moveTo(21f, 19.86f)
                verticalLineToRelative(-4.62f)
                lineToRelative(-2f, 2.01f)
                verticalLineToRelative(3.87f)
                lineToRelative(-0.44f, 0.44f)
                curveToRelative(-0.1f, 0.1f, -2.49f, 2.44f, -6.56f, 2.44f)
                reflectiveCurveToRelative(-6.46f, -2.34f, -6.56f, -2.44f)
                lineToRelative(-0.44f, -0.44f)
                verticalLineToRelative(-3.87f)
                lineToRelative(-2f, -2.04f)
                verticalLineToRelative(4.64f)
                curveTo(1.15f, 17.76f, 0.01f, 15.01f, 0f, 12f)
                curveTo(0.04f, 5.42f, 5.41f, 0f, 12f, 0f)
                reflectiveCurveToRelative(11.96f, 5.42f, 12f, 12f)
                curveToRelative(-0.01f, 3.01f, -1.15f, 5.76f, -3f, 7.86f)
                close()
                moveTo(16f, 16f)
                lineTo(8f, 16f)
                verticalLineToRelative(3.79f)
                curveToRelative(0.66f, 0.46f, 2.03f, 1.21f, 4f, 1.21f)
                reflectiveCurveToRelative(3.34f, -0.75f, 4f, -1.21f)
                verticalLineToRelative(-3.79f)
                close()
                moveTo(20.95f, 11.04f)
                curveToRelative(-0.48f, -4.51f, -4.31f, -8.04f, -8.95f, -8.04f)
                reflectiveCurveTo(3.56f, 6.5f, 3.06f, 10.99f)
                lineToRelative(1.97f, 2.01f)
                horizontalLineToRelative(13.97f)
                lineToRelative(1.95f, -1.96f)
                close()
                moveTo(17.91f, 7.41f)
                curveToRelative(-1.66f, -1.12f, -3.81f, 0.28f, -4.73f, 1.63f)
                curveToRelative(0f, 0f, 2.22f, 0.29f, 3.04f, 0.85f)
                curveToRelative(0.83f, 0.56f, 1.92f, 2.51f, 1.92f, 2.51f)
                curveToRelative(0.92f, -1.35f, 1.42f, -3.87f, -0.24f, -4.99f)
                close()
                moveTo(24f, 12.01f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.01f)
                curveToRelative(0f, 0.0f, 0f, 0.0f, 0f, 0.01f)
                close()
                moveTo(6.09f, 7.41f)
                curveToRelative(-1.66f, 1.12f, -1.16f, 3.64f, -0.24f, 4.99f)
                curveToRelative(0f, 0f, 1.09f, -1.95f, 1.92f, -2.51f)
                curveToRelative(0.83f, -0.56f, 3.04f, -0.85f, 3.04f, -0.85f)
                curveToRelative(-0.92f, -1.35f, -3.07f, -2.75f, -4.73f, -1.63f)
                close()
            }
        }.also { _FaceMask = it}
