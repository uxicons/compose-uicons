package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Briefcase: ImageVector? = null

val Icons.Sc.Briefcase: ImageVector
    get() = _Briefcase ?: UXIcon(name = "Briefcase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.23f, 6.9f)
                curveToRelative(-0.11f, -0.32f, -0.38f, -0.56f, -0.7f, -0.64f)
                curveToRelative(-0.11f, -0.03f, -1.79f, -0.43f, -4.22f, -0.71f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0f, -2.37f, -1.93f, -4.3f, -4.3f, -4.3f)
                reflectiveCurveToRelative(-4.3f, 1.93f, -4.3f, 4.3f)
                verticalLineToRelative(0.25f)
                curveToRelative(-2.42f, 0.28f, -4.11f, 0.68f, -4.22f, 0.7f)
                curveToRelative(-0.33f, 0.08f, -0.6f, 0.32f, -0.71f, 0.64f)
                curveToRelative(-0.03f, 0.1f, -0.63f, 1.82f, -0.94f, 4.38f)
                curveToRelative(1.29f, 0.27f, 5.48f, 1.07f, 10.17f, 1.07f)
                reflectiveCurveToRelative(8.88f, -0.8f, 10.17f, -1.07f)
                curveToRelative(-0.31f, -2.58f, -0.91f, -4.29f, -0.94f, -4.38f)
                close()
                moveTo(10.7f, 5.33f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f)
                reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.43f, -0.02f, -0.86f, -0.03f, -1.3f, -0.03f)
                reflectiveCurveToRelative(-0.88f, 0.01f, -1.3f, 0.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.0f, 14.34f)
                verticalLineToRelative(1.18f)
                curveToRelative(0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-1.18f)
                curveToRelative(-4.24f, -0.09f, -7.86f, -0.74f, -9.34f, -1.05f)
                curveToRelative(-0.02f, 0.36f, -0.03f, 0.72f, -0.03f, 1.1f)
                curveToRelative(0f, 4.24f, 1.09f, 6.88f, 1.14f, 7.01f)
                curveToRelative(0.11f, 0.32f, 0.38f, 0.56f, 0.71f, 0.64f)
                curveToRelative(0.16f, 0.04f, 3.99f, 0.96f, 8.52f, 0.96f)
                reflectiveCurveToRelative(8.36f, -0.92f, 8.52f, -0.96f)
                curveToRelative(0.33f, -0.08f, 0.59f, -0.32f, 0.71f, -0.64f)
                curveToRelative(0.05f, -0.13f, 1.13f, -2.81f, 1.13f, -7.01f)
                curveToRelative(0f, -0.38f, -0.01f, -0.74f, -0.02f, -1.1f)
                curveToRelative(-1.48f, 0.3f, -5.11f, 0.95f, -9.34f, 1.05f)
                close()
            }
        }.also { _Briefcase = it}
