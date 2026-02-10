package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookSection: ImageVector? = null

val Icons.Sr.BookSection: ImageVector
    get() = _BookSection ?: UXIcon(name = "BookSection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 18f)
                lineTo(22f, 18f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(5f, 16f)
                horizontalLineToRelative(1f)
                lineTo(6f, 0.1f)
                curveTo(3.67f, 0.58f, 2f, 2.62f, 2f, 5f)
                verticalLineToRelative(12.02f)
                curveToRelative(0.7f, -0.53f, 1.53f, -0.86f, 2.4f, -0.96f)
                curveToRelative(0.2f, -0.04f, 0.4f, -0.06f, 0.6f, -0.06f)
                close()
                moveTo(16f, 9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(11f)
                lineTo(8f, 16f)
                lineTo(8f, 0f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(19f, 8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.39f, 0.09f, 0.75f, 0.25f, 1.07f)
                curveToRelative(-0.75f, 0.55f, -1.25f, 1.43f, -1.25f, 2.43f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.39f, -0.09f, -0.75f, -0.25f, -1.07f)
                curveToRelative(0.75f, -0.55f, 1.25f, -1.43f, 1.25f, -2.43f)
                close()
            }
        }.also { _BookSection = it}
