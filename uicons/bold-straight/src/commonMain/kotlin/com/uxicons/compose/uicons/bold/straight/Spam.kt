package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spam: ImageVector? = null

val Icons.Bs.Spam: ImageVector
    get() = _Spam ?: UXIcon(name = "Spam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 11.28f)
                curveToRelative(0f, 0.01f, 0.0f, 0.02f, 0.0f, 0.03f)
                verticalLineToRelative(12.69f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-12.69f)
                curveToRelative(0f, -1.18f, 0.49f, -2.33f, 1.35f, -3.15f)
                lineToRelative(1.65f, -1.59f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6.22f)
                curveToRelative(-0.93f, 0.81f, -1.66f, 1.84f, -2.13f, 3f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7.46f)
                lineToRelative(4.36f, 4.36f)
                curveToRelative(0.44f, 0.44f, 1.02f, 0.68f, 1.64f, 0.68f)
                reflectiveCurveToRelative(1.2f, -0.24f, 1.64f, -0.68f)
                lineToRelative(1.76f, -1.76f)
                curveToRelative(0.82f, 0.28f, 1.69f, 0.44f, 2.6f, 0.44f)
                curveToRelative(0.45f, 0f, 0.89f, -0.05f, 1.32f, -0.12f)
                lineToRelative(-3.56f, 3.56f)
                curveToRelative(-1.0f, 1.0f, -2.34f, 1.56f, -3.76f, 1.56f)
                reflectiveCurveToRelative(-2.76f, -0.55f, -3.76f, -1.56f)
                lineToRelative(-5.24f, -5.24f)
                verticalLineToRelative(8.8f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-7.59f)
                curveToRelative(1.16f, -0.47f, 2.18f, -1.21f, 3.0f, -2.13f)
                close()
                moveTo(12f, 6.01f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(16.59f, 6.01f)
                lineTo(14.47f, 8.13f)
                lineTo(15.88f, 9.55f)
                lineTo(18.0f, 7.43f)
                lineTo(20.12f, 9.55f)
                lineTo(21.54f, 8.13f)
                lineTo(19.41f, 6.01f)
                lineTo(21.54f, 3.89f)
                lineTo(20.12f, 2.48f)
                lineTo(18.0f, 4.6f)
                lineTo(15.88f, 2.48f)
                lineTo(14.47f, 3.89f)
                close()
            }
        }.also { _Spam = it}
