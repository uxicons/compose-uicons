package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferArrow: ImageVector? = null

val Icons.Ts.ReferArrow: ImageVector
    get() = _ReferArrow ?: UXIcon(name = "ReferArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(8f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(5.24f, 1f, 8f, 1f)
                close()
                moveTo(12f, 14f)
                curveToRelative(0.73f, 0f, 1.41f, 0.2f, 2.0f, 0.54f)
                curveToRelative(-0.26f, 0.23f, -0.49f, 0.48f, -0.71f, 0.76f)
                curveToRelative(-0.39f, -0.19f, -0.83f, -0.29f, -1.29f, -0.29f)
                lineTo(4f, 15f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                lineTo(0f, 24f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(8f)
                close()
                moveTo(23.56f, 16.56f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.6f, -3.6f)
                horizontalLineToRelative(-4.71f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(4.71f)
                lineToRelative(-3.6f, -3.6f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.54f, 0f, 2.12f)
                close()
            }
        }.also { _ReferArrow = it}
