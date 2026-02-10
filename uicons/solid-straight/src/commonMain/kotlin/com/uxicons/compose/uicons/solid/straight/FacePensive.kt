package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FacePensive: ImageVector? = null

val Icons.Ss.FacePensive: ImageVector
    get() = _FacePensive ?: UXIcon(name = "FacePensive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(7.67f, 4.95f)
                lineToRelative(1.66f, 1.11f)
                curveToRelative(-1.01f, 1.51f, -2.38f, 2.65f, -3.96f, 3.28f)
                lineToRelative(-0.74f, -1.86f)
                curveToRelative(1.19f, -0.47f, 2.27f, -1.37f, 3.04f, -2.53f)
                close()
                moveTo(4.87f, 13.76f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(0.66f, 0.65f, 2.07f, 1.19f, 3.26f, -0.02f)
                lineToRelative(1.42f, 1.41f)
                curveToRelative(-0.9f, 0.91f, -1.98f, 1.3f, -3.02f, 1.3f)
                curveToRelative(-1.16f, 0f, -2.28f, -0.48f, -3.07f, -1.26f)
                close()
                moveTo(15f, 19f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveTo(16.41f, 15f)
                curveToRelative(-0.09f, 0.01f, -0.18f, 0.01f, -0.27f, 0.01f)
                curveToRelative(-1.12f, 0f, -2.18f, -0.46f, -3.02f, -1.31f)
                lineToRelative(1.42f, -1.41f)
                curveToRelative(0.5f, 0.51f, 1.09f, 0.74f, 1.73f, 0.71f)
                curveToRelative(0.56f, -0.04f, 1.12f, -0.29f, 1.52f, -0.69f)
                lineToRelative(1.41f, 1.42f)
                curveToRelative(-0.74f, 0.73f, -1.76f, 1.19f, -2.8f, 1.26f)
                close()
                moveTo(18.63f, 9.33f)
                curveToRelative(-1.58f, -0.63f, -2.95f, -1.77f, -3.96f, -3.28f)
                lineToRelative(1.66f, -1.11f)
                curveToRelative(0.77f, 1.16f, 1.85f, 2.06f, 3.04f, 2.53f)
                lineToRelative(-0.74f, 1.86f)
                close()
            }
        }.also { _FacePensive = it}
