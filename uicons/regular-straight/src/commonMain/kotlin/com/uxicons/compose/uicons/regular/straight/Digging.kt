package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Digging: ImageVector? = null

val Icons.Rs.Digging: ImageVector
    get() = _Digging ?: UXIcon(name = "Digging") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.05f, 24f)
                lineToRelative(-4.96f, -11.02f)
                lineToRelative(-3.47f, 4.96f)
                lineToRelative(-9.11f, -6.23f)
                lineToRelative(1.1f, -3.05f)
                curveToRelative(0.1f, -0.27f, 0.3f, -0.48f, 0.57f, -0.59f)
                curveToRelative(0.12f, -0.05f, 0.41f, -0.12f, 0.82f, 0.03f)
                lineToRelative(0.47f, 0.18f)
                curveToRelative(0.69f, 0.34f, 1.21f, 0.93f, 1.47f, 1.65f)
                lineToRelative(1.42f, 4.14f)
                lineToRelative(1.88f, -0.68f)
                lineToRelative(-1.43f, -4.14f)
                curveToRelative(-0.44f, -1.21f, -1.31f, -2.19f, -2.46f, -2.76f)
                lineToRelative(-0.47f, -0.18f)
                curveToRelative(-0.77f, -0.38f, -1.66f, -0.42f, -2.46f, -0.1f)
                curveToRelative(-0.8f, 0.32f, -1.42f, 0.96f, -1.71f, 1.77f)
                lineToRelative(-0.92f, 2.56f)
                lineToRelative(-2.74f, -1.87f)
                lineToRelative(-1.13f, 1.65f)
                lineToRelative(13.53f, 9.26f)
                lineToRelative(-3.09f, 4.42f)
                horizontalLineToRelative(12.67f)
                close()
                moveTo(20.95f, 22f)
                horizontalLineToRelative(-5.73f)
                lineToRelative(3.49f, -4.99f)
                lineToRelative(2.24f, 4.99f)
                close()
                moveTo(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(3.25f, 14.94f)
                lineToRelative(1.73f, 1.18f)
                lineToRelative(-2.83f, 7.88f)
                lineTo(0f, 24f)
                lineToRelative(3.25f, -9.06f)
                close()
                moveTo(8f, 18.19f)
                lineToRelative(2f, 1.37f)
                verticalLineToRelative(4.44f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.81f)
                close()
            }
        }.also { _Digging = it}
