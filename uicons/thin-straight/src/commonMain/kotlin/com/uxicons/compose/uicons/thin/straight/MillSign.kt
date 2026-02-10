package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MillSign: ImageVector? = null

val Icons.Ts.MillSign: ImageVector
    get() = _MillSign ?: UXIcon(name = "MillSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.25f, 3f)
                curveToRelative(-0.18f, 0f, -0.36f, 0f, -0.54f, 0.03f)
                lineToRelative(1.1f, -3.03f)
                horizontalLineToRelative(-1.09f)
                lineToRelative(-1.19f, 3.26f)
                curveToRelative(-1.58f, 0.49f, -2.87f, 1.65f, -3.54f, 3.15f)
                curveToRelative(-0.9f, -2.01f, -2.91f, -3.41f, -5.25f, -3.41f)
                curveToRelative(-1.97f, 0f, -3.71f, 1f, -4.75f, 2.51f)
                lineTo(1.99f, 3f)
                lineTo(1f, 3f)
                lineTo(1f, 21f)
                horizontalLineToRelative(1f)
                lineTo(2f, 8.75f)
                curveToRelative(0f, -2.62f, 2.13f, -4.75f, 4.75f, -4.75f)
                reflectiveCurveToRelative(4.75f, 2.13f, 4.75f, 4.75f)
                verticalLineToRelative(5.62f)
                lineToRelative(-3.5f, 9.63f)
                horizontalLineToRelative(1.09f)
                lineToRelative(2.41f, -6.64f)
                verticalLineToRelative(3.64f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6.39f)
                lineToRelative(3.83f, -10.52f)
                curveToRelative(0.3f, -0.06f, 0.61f, -0.09f, 0.92f, -0.09f)
                curveToRelative(2.62f, 0f, 4.75f, 2.13f, 4.75f, 4.75f)
                verticalLineToRelative(12.25f)
                horizontalLineToRelative(1f)
                lineTo(23f, 8.75f)
                curveToRelative(0f, -3.17f, -2.58f, -5.75f, -5.75f, -5.75f)
                close()
                moveTo(12.5f, 11.62f)
                verticalLineToRelative(-2.87f)
                curveToRelative(0f, -1.84f, 1.05f, -3.44f, 2.58f, -4.23f)
                lineToRelative(-2.58f, 7.1f)
                close()
            }
        }.also { _MillSign = it}
