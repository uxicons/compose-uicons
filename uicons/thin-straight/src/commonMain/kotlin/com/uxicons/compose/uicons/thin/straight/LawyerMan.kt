package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LawyerMan: ImageVector? = null

val Icons.Ts.LawyerMan: ImageVector
    get() = _LawyerMan ?: UXIcon(name = "LawyerMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(6.24f, 1f, 9f, 1f)
                close()
                moveTo(4.5f, 14f)
                horizontalLineToRelative(6.06f)
                curveToRelative(-0.18f, 0.31f, -0.32f, 0.64f, -0.41f, 1f)
                horizontalLineToRelative(-5.64f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(22.35f, 14.54f)
                lineToRelative(-4.35f, -0.48f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.94f)
                lineToRelative(-4.33f, -0.48f)
                lineToRelative(-1.67f, 4.54f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                lineToRelative(-1.25f, -3.41f)
                lineToRelative(3.25f, 0.36f)
                verticalLineToRelative(8.05f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.94f)
                lineToRelative(3.31f, 0.37f)
                lineToRelative(-1.31f, 3.57f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.1f, -1.65f, -4.46f, -1.65f, -4.46f)
                close()
                moveTo(13.97f, 18f)
                horizontalLineToRelative(-1.93f)
                lineToRelative(0.97f, -2.58f)
                lineToRelative(0.97f, 2.58f)
                close()
                moveTo(22.01f, 16.39f)
                curveToRelative(0.51f, 1.29f, 0.95f, 2.45f, 0.99f, 2.61f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(0.98f, -2.61f)
                close()
            }
        }.also { _LawyerMan = it}
