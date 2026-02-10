package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookSection: ImageVector? = null

val Icons.Rr.BookSection: ImageVector
    get() = _BookSection ?: UXIcon(name = "BookSection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(11f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(20f, 5f)
                verticalLineToRelative(11f)
                lineTo(8f, 16f)
                lineTo(8f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6f, 2.17f)
                verticalLineToRelative(13.83f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.2f, -2f, 0.54f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.3f, 0.84f, -2.42f, 2f, -2.83f)
                close()
                moveTo(17f, 22f)
                lineTo(6f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(10f, 9f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.38f, -0.09f, -0.75f, -0.24f, -1.07f)
                curveToRelative(0.75f, -0.55f, 1.24f, -1.43f, 1.24f, -2.43f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.38f, 0.09f, 0.75f, 0.24f, 1.07f)
                curveToRelative(-0.75f, 0.55f, -1.24f, 1.43f, -1.24f, 2.43f)
                close()
                moveTo(16f, 9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _BookSection = it}
