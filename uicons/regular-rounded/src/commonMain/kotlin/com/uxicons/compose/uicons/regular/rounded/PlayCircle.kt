package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayCircle: ImageVector? = null

val Icons.Rr.PlayCircle: ImageVector
    get() = _PlayCircle ?: UXIcon(name = "PlayCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.39f, 10.12f)
                lineToRelative(-5.19f, -2.84f)
                curveToRelative(-0.67f, -0.38f, -1.47f, -0.37f, -2.14f, 0.02f)
                curveToRelative(-0.67f, 0.39f, -1.06f, 1.08f, -1.06f, 1.85f)
                verticalLineToRelative(5.7f)
                curveToRelative(0f, 0.77f, 0.4f, 1.47f, 1.06f, 1.85f)
                curveToRelative(0.34f, 0.2f, 0.71f, 0.3f, 1.09f, 0.3f)
                curveToRelative(0.36f, 0f, 0.72f, -0.09f, 1.04f, -0.27f)
                lineToRelative(5.21f, -2.85f)
                curveToRelative(0.69f, -0.39f, 1.1f, -1.09f, 1.1f, -1.87f)
                reflectiveCurveToRelative(-0.41f, -1.49f, -1.1f, -1.88f)
                close()
                moveTo(15.43f, 12.12f)
                lineToRelative(-5.21f, 2.85f)
                curveToRelative(-0.02f, 0.01f, -0.08f, 0.04f, -0.15f, -0.0f)
                curveToRelative(-0.07f, -0.04f, -0.07f, -0.11f, -0.07f, -0.13f)
                verticalLineToRelative(-5.7f)
                curveToRelative(0f, -0.02f, 0f, -0.09f, 0.07f, -0.13f)
                curveToRelative(0.03f, -0.02f, 0.05f, -0.02f, 0.07f, -0.02f)
                curveToRelative(0.04f, 0f, 0.07f, 0.02f, 0.08f, 0.03f)
                lineToRelative(5.19f, 2.84f)
                curveToRelative(0.02f, 0.01f, 0.08f, 0.04f, 0.08f, 0.13f)
                reflectiveCurveToRelative(-0.06f, 0.12f, -0.07f, 0.12f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _PlayCircle = it}
