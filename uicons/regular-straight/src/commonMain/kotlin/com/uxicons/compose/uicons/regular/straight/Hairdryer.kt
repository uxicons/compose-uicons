package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hairdryer: ImageVector? = null

val Icons.Rs.Hairdryer: ImageVector
    get() = _Hairdryer ?: UXIcon(name = "Hairdryer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.9f, 2.5f)
                curveToRelative(-3.0f, -1.18f, -6.99f, -2.5f, -9.9f, -2.5f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7.0f)
                curveToRelative(0f, 2.68f, 1.51f, 5.01f, 3.73f, 6.18f)
                lineToRelative(3.54f, 8.66f)
                curveToRelative(0.69f, 1.75f, 2.85f, 2.64f, 4.58f, 1.89f)
                curveToRelative(1.75f, -0.69f, 2.65f, -2.85f, 1.89f, -4.58f)
                lineToRelative(-2.45f, -5.88f)
                curveToRelative(1.66f, -0.47f, 3.53f, -1.16f, 5.61f, -1.99f)
                lineToRelative(7.11f, 2.05f)
                verticalLineToRelative(-12.61f)
                lineToRelative(-7.1f, 1.77f)
                close()
                moveTo(11.88f, 19.92f)
                curveToRelative(0.33f, 0.74f, -0.06f, 1.67f, -0.81f, 1.96f)
                curveToRelative(-0.73f, 0.33f, -1.67f, -0.06f, -1.96f, -0.8f)
                lineToRelative(-2.92f, -7.13f)
                curveToRelative(0.26f, 0.03f, 0.53f, 0.05f, 0.8f, 0.05f)
                curveToRelative(0.71f, 0f, 1.48f, -0.09f, 2.31f, -0.25f)
                lineToRelative(2.57f, 6.17f)
                close()
                moveTo(16f, 9.49f)
                curveToRelative(-3.37f, 1.33f, -6.72f, 2.51f, -9f, 2.51f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5f, -5.0f)
                curveToRelative(2.06f, 0f, 5.16f, 0.79f, 9f, 2.29f)
                close()
                moveTo(22f, 10.67f)
                lineTo(18f, 9.52f)
                verticalLineToRelative(-5.24f)
                lineToRelative(4f, -1f)
                close()
            }
        }.also { _Hairdryer = it}
