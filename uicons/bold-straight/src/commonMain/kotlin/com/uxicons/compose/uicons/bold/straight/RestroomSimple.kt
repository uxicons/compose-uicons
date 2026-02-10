package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RestroomSimple: ImageVector? = null

val Icons.Bs.RestroomSimple: ImageVector
    get() = _RestroomSimple ?: UXIcon(name = "RestroomSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.94f)
                lineToRelative(1.43f, -11.95f)
                curveToRelative(0.21f, -1.74f, 1.67f, -3.05f, 3.4f, -3.05f)
                horizontalLineToRelative(0.23f)
                curveToRelative(1.73f, 0f, 3.19f, 1.31f, 3.4f, 3.05f)
                lineToRelative(1.43f, 11.95f)
                horizontalLineToRelative(-2.94f)
                close()
                moveTo(17.44f, 18f)
                horizontalLineToRelative(3.12f)
                lineToRelative(-1.03f, -8.59f)
                curveToRelative(-0.03f, -0.24f, -0.2f, -0.41f, -0.42f, -0.41f)
                horizontalLineToRelative(-0.23f)
                curveToRelative(-0.22f, 0f, -0.39f, 0.17f, -0.42f, 0.41f)
                lineToRelative(-1.03f, 8.59f)
                close()
                moveTo(4f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(5.38f, 0f, 4f, 0f)
                reflectiveCurveTo(1.5f, 1.12f, 1.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8f, 9.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                lineTo(2f, 24f)
                verticalLineToRelative(-6f)
                lineTo(0f, 18f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(3f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(3f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(24f)
                close()
            }
        }.also { _RestroomSimple = it}
