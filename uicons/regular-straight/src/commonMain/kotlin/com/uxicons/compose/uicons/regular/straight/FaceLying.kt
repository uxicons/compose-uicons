package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceLying: ImageVector? = null

val Icons.Rs.FaceLying: ImageVector
    get() = _FaceLying ?: UXIcon(name = "FaceLying") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(19.98f, 18f)
                curveToRelative(-1.83f, 2.42f, -4.72f, 4f, -7.98f, 4f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                curveToRelative(4.1f, 0f, 7.62f, 2.48f, 9.17f, 6.02f)
                curveToRelative(0.86f, 0.03f, 1.66f, 0.28f, 2.36f, 0.69f)
                curveTo(22.1f, 3.69f, 17.48f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(4.54f, 0f, 8.5f, -2.54f, 10.54f, -6.27f)
                curveToRelative(-0.49f, 0.16f, -1.0f, 0.27f, -1.54f, 0.27f)
                horizontalLineToRelative(-1.02f)
                close()
                moveTo(7.66f, 17.75f)
                curveToRelative(0.02f, -0.02f, 2.0f, -1.75f, 4.34f, -1.75f)
                verticalLineToRelative(-2f)
                curveToRelative(-3.11f, 0f, -5.56f, 2.16f, -5.67f, 2.25f)
                lineToRelative(1.33f, 1.49f)
                close()
                moveTo(14f, 7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(10f, 7.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _FaceLying = it}
