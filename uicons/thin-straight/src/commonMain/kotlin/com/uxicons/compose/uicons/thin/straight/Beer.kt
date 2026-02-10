package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beer: ImageVector? = null

val Icons.Ts.Beer: ImageVector
    get() = _Beer ?: UXIcon(name = "Beer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.55f, 2.0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.01f, 0f, -0.0f, 0f, 0f, 0f)
                close()
                moveTo(23f, 12.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(1f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, 1.44f, -3.5f, 3.54f, -3.5f)
                curveToRelative(0.01f, 0f, 0.0f, 0f, 0f, 0f)
                curveToRelative(0.71f, -1.23f, 2.03f, -2.0f, 3.45f, -2.0f)
                curveToRelative(1.55f, 0f, 2.93f, 0.89f, 3.59f, 2.27f)
                curveToRelative(0.46f, -0.18f, 0.93f, -0.27f, 1.41f, -0.27f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(3f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                curveToRelative(-0.49f, 0f, -0.97f, 0.13f, -1.44f, 0.39f)
                lineToRelative(-0.53f, 0.29f)
                lineToRelative(-0.18f, -0.58f)
                curveToRelative(-0.4f, -1.25f, -1.54f, -2.1f, -2.84f, -2.1f)
                curveToRelative(-1.16f, 0f, -2.22f, 0.69f, -2.71f, 1.74f)
                lineToRelative(-0.15f, 0.32f)
                reflectiveCurveToRelative(-0.58f, -0.07f, -0.63f, -0.07f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(18f, 7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                lineTo(2f, 7f)
                verticalLineToRelative(14.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(18f, 7f)
                close()
                moveTo(22f, 12.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }.also { _Beer = it}
