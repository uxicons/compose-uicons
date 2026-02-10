package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Museum: ImageVector? = null

val Icons.Rr.Museum: ImageVector
    get() = _Museum ?: UXIcon(name = "Museum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11.01f)
                curveToRelative(1.66f, -0.03f, 3f, -1.39f, 3f, -3.05f)
                curveToRelative(0f, -1.12f, -0.61f, -2.15f, -1.59f, -2.68f)
                lineToRelative(-8.97f, -4.89f)
                curveToRelative(-0.9f, -0.49f, -1.97f, -0.49f, -2.87f, 0f)
                lineToRelative(-8.97f, 4.89f)
                curveToRelative(-0.98f, 0.54f, -1.59f, 1.56f, -1.59f, 2.68f)
                curveToRelative(0f, 1.67f, 1.34f, 3.02f, 3f, 3.05f)
                verticalLineToRelative(11.01f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(14f, 11.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(16f, 11.0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(2f, 7.94f)
                curveToRelative(0f, -0.39f, 0.21f, -0.74f, 0.55f, -0.93f)
                lineToRelative(8.97f, -4.89f)
                curveToRelative(0.15f, -0.08f, 0.31f, -0.12f, 0.48f, -0.12f)
                reflectiveCurveToRelative(0.33f, 0.04f, 0.48f, 0.12f)
                lineToRelative(8.97f, 4.89f)
                curveToRelative(0.34f, 0.19f, 0.55f, 0.54f, 0.55f, 0.93f)
                curveToRelative(0f, 0.58f, -0.47f, 1.06f, -1.06f, 1.06f)
                horizontalLineToRelative(-17.89f)
                curveToRelative(-0.58f, 0f, -1.06f, -0.47f, -1.06f, -1.06f)
                close()
                moveTo(5f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(10.5f, 6f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Museum = it}
