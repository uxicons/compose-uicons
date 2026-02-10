package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LawyerMan: ImageVector? = null

val Icons.Ss.LawyerMan: ImageVector
    get() = _LawyerMan ?: UXIcon(name = "LawyerMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18.66f)
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
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.11f, 1.03f, -0.98f, 1.83f, -2.04f, 1.83f)
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
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(10f, 17.95f)
                verticalLineToRelative(-0.64f)
                lineToRelative(1.04f, -3.31f)
                horizontalLineToRelative(-6.04f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2.58f)
                curveToRelative(-1.19f, -0.71f, -2f, -1.99f, -2f, -3.48f)
                close()
            }
        }.also { _LawyerMan = it}
