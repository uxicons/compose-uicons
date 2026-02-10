package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hr: ImageVector? = null

val Icons.Bs.Hr: ImageVector
    get() = _Hr ?: UXIcon(name = "Hr") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(8f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 19f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                curveTo(2.24f, 14f, 0f, 16.24f, 0f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                close()
                moveTo(20.4f, 16.5f)
                curveToRelative(0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, -0.4f, 0.9f, -0.9f)
                close()
                moveTo(21f, 12f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(16f, 22f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-3.21f)
                horizontalLineToRelative(-1.8f)
                verticalLineToRelative(3.21f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(3.19f)
                horizontalLineToRelative(1.8f)
                verticalLineToRelative(-3.19f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8f)
                close()
                moveTo(20.99f, 18.51f)
                curveToRelative(-0.02f, 0.01f, -0.02f, 0.01f, -0.04f, 0.03f)
                lineToRelative(1.05f, 3.46f)
                horizontalLineToRelative(-1.74f)
                lineToRelative(-0.87f, -3f)
                horizontalLineToRelative(-0.78f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.85f, -0.42f, 1.59f, -1.07f, 2.04f)
                curveToRelative(0.02f, -0.01f, 0.04f, -0.02f, 0.06f, -0.04f)
                close()
            }
        }.also { _Hr = it}
