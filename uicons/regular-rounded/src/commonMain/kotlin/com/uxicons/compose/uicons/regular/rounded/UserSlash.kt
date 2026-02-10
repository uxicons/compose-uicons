package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Rr.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.97f, 15.0f)
                curveToRelative(0.14f, 0.54f, -0.18f, 1.08f, -0.72f, 1.22f)
                curveToRelative(-3.09f, 0.8f, -5.25f, 3.58f, -5.25f, 6.78f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.11f, 2.78f, -7.69f, 6.75f, -8.72f)
                curveToRelative(0.54f, -0.14f, 1.08f, 0.18f, 1.22f, 0.72f)
                close()
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineTo(6.14f, 4.72f)
                curveTo(6.73f, 2.03f, 9.13f, 0f, 12f, 0f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.87f, -2.03f, 5.27f, -4.72f, 5.86f)
                lineToRelative(10.43f, 10.43f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(8.06f, 6.65f)
                lineToRelative(3.28f, 3.28f)
                curveToRelative(0.21f, 0.04f, 0.43f, 0.07f, 0.65f, 0.07f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.22f, 0.03f, 0.44f, 0.07f, 0.65f)
                close()
            }
        }.also { _UserSlash = it}
