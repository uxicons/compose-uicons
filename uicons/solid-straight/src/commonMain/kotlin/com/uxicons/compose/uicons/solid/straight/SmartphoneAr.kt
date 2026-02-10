package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartphoneAr: ImageVector? = null

val Icons.Ss.SmartphoneAr: ImageVector
    get() = _SmartphoneAr ?: UXIcon(name = "SmartphoneAr") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.51f, 5.34f)
                lineToRelative(0.99f, -0.58f)
                verticalLineToRelative(1.86f)
                lineToRelative(-1.51f, 0.88f)
                lineToRelative(-1.49f, -0.88f)
                verticalLineToRelative(-1.86f)
                lineToRelative(0.99f, 0.58f)
                curveToRelative(0.32f, 0.19f, 0.71f, 0.19f, 1.03f, 0f)
                close()
                moveTo(24f, 6.41f)
                verticalLineToRelative(1.26f)
                lineToRelative(-4f, 2.47f)
                verticalLineToRelative(-2.35f)
                lineToRelative(-7.97f, 4.92f)
                lineToRelative(-8.03f, -4.96f)
                verticalLineToRelative(2.35f)
                lineToRelative(-4f, -2.47f)
                verticalLineToRelative(-1.1f)
                lineToRelative(4f, -2.57f)
                verticalLineToRelative(-3.97f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3.94f)
                close()
                moveTo(15.5f, 3.73f)
                lineTo(13.02f, 2.28f)
                curveToRelative(-0.63f, -0.37f, -1.41f, -0.37f, -2.04f, 0f)
                lineToRelative(-2.48f, 1.46f)
                verticalLineToRelative(4.04f)
                lineToRelative(2.48f, 1.46f)
                curveToRelative(0.31f, 0.18f, 0.67f, 0.28f, 1.02f, 0.28f)
                reflectiveCurveToRelative(0.71f, -0.09f, 1.02f, -0.28f)
                lineToRelative(2.48f, -1.46f)
                close()
                moveTo(4f, 18f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(10f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(4f, 10.11f)
                verticalLineToRelative(5.89f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-5.86f)
                lineToRelative(-7.97f, 4.92f)
                close()
            }
        }.also { _SmartphoneAr = it}
