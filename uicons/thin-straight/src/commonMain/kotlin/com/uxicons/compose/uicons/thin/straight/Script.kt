package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Script: ImageVector? = null

val Icons.Ts.Script: ImageVector
    get() = _Script ?: UXIcon(name = "Script") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                horizontalLineToRelative(3.54f)
                lineToRelative(7.64f, -7.73f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.54f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.95f, -3.54f, 0.0f)
                lineToRelative(-7.64f, 7.73f)
                verticalLineToRelative(3.53f)
                close()
                moveTo(13f, 8.88f)
                lineToRelative(7.35f, -7.44f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.54f, -0.0f, 2.12f)
                lineToRelative(-7.35f, 7.44f)
                horizontalLineToRelative(-2.12f)
                verticalLineToRelative(-2.12f)
                close()
                moveTo(20f, 18f)
                verticalLineToRelative(-7.67f)
                lineToRelative(-1f, 1.01f)
                verticalLineToRelative(6.66f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                lineTo(6f, 3f)
                curveToRelative(0f, -0.77f, -0.3f, -1.47f, -0.78f, -2f)
                horizontalLineToRelative(11.35f)
                lineToRelative(0.94f, -0.95f)
                curveToRelative(-0.17f, -0.03f, -0.33f, -0.05f, -0.51f, -0.05f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(5f, 5f)
                lineTo(1f, 5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(23f, 21f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-10.77f)
                curveToRelative(0.48f, -0.53f, 0.77f, -1.23f, 0.77f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Script = it}
