package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Rc.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 19f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.69f)
                curveToRelative(0.3f, -1.3f, 0.69f, -3.45f, 0.69f, -6f)
                curveToRelative(0f, -3.2f, -1.06f, -5.36f, -1.1f, -5.45f)
                curveToRelative(-0.03f, -0.06f, -0.07f, -0.12f, -0.11f, -0.17f)
                curveToRelative(-3.47f, -4.38f, -4.39f, -4.38f, -4.79f, -4.38f)
                reflectiveCurveToRelative(-1.32f, 0f, -4.78f, 4.38f)
                curveToRelative(-0.04f, 0.05f, -0.08f, 0.11f, -0.11f, 0.17f)
                curveToRelative(-0.04f, 0.09f, -1.1f, 2.25f, -1.1f, 5.45f)
                curveToRelative(0f, 2.55f, 0.39f, 4.7f, 0.69f, 6f)
                horizontalLineToRelative(-0.69f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(13f, 17f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(2.33f)
                curveToRelative(0.27f, 0.73f, 0.67f, 2.15f, 0.67f, 4f)
                curveToRelative(0f, 2.69f, -0.48f, 4.93f, -0.76f, 6f)
                close()
                moveTo(12f, 3.1f)
                curveToRelative(0.41f, 0.31f, 1.12f, 1.05f, 1.86f, 1.9f)
                horizontalLineToRelative(-3.73f)
                curveToRelative(0.74f, -0.85f, 1.46f, -1.59f, 1.86f, -1.9f)
                close()
                moveTo(8f, 11f)
                curveToRelative(0f, -1.83f, 0.41f, -3.26f, 0.67f, -4f)
                horizontalLineToRelative(2.33f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-0.28f, -1.07f, -0.75f, -3.3f, -0.75f, -6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 21f)
                horizontalLineToRelative(-16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Monument = it}
