package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LawyerMan: ImageVector? = null

val Icons.Rs.LawyerMan: ImageVector
    get() = _LawyerMan ?: UXIcon(name = "LawyerMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(6.04f)
                lineToRelative(-0.63f, 2f)
                horizontalLineToRelative(-5.41f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(24f, 18.66f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-0.34f)
                lineToRelative(0.85f, -2.42f)
                lineToRelative(-1.85f, -0.35f)
                verticalLineToRelative(6.11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.48f)
                lineToRelative(-1.75f, -0.33f)
                lineToRelative(0.86f, 2.41f)
                verticalLineToRelative(0.57f)
                curveToRelative(-0.11f, 1.03f, -1.0f, 1.83f, -2.05f, 1.83f)
                curveToRelative(-1.14f, 0f, -2.05f, -0.92f, -2.05f, -2.05f)
                verticalLineToRelative(-0.33f)
                lineToRelative(1.5f, -4.78f)
                lineToRelative(3.5f, 0.65f)
                verticalLineToRelative(-1.48f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.85f)
                lineToRelative(3.5f, 0.65f)
                lineToRelative(1.5f, 4.16f)
                close()
            }
        }.also { _LawyerMan = it}
