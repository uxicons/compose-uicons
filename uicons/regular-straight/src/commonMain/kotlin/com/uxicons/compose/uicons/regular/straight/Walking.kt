package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walking: ImageVector? = null

val Icons.Rs.Walking: ImageVector
    get() = _Walking ?: UXIcon(name = "Walking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(14.62f, 10.54f)
                lineToRelative(-1.41f, 5.3f)
                lineToRelative(2.79f, 1.58f)
                verticalLineToRelative(6.58f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.42f)
                lineToRelative(-4.48f, -2.55f)
                curveToRelative(-1.15f, -0.65f, -1.74f, -2.01f, -1.44f, -3.29f)
                lineToRelative(1.04f, -4.43f)
                lineToRelative(-3.12f, 1.56f)
                lineToRelative(-1.03f, 3.89f)
                lineToRelative(-1.93f, -0.51f)
                lineToRelative(1.26f, -4.76f)
                lineToRelative(4.97f, -2.48f)
                horizontalLineToRelative(3.24f)
                curveToRelative(0.86f, 0f, 1.69f, 0.37f, 2.26f, 1.02f)
                lineToRelative(2.35f, 3.71f)
                lineToRelative(3.75f, 1.88f)
                lineToRelative(-0.9f, 1.79f)
                lineToRelative(-4.25f, -2.12f)
                lineToRelative(-1.09f, -1.73f)
                close()
                moveTo(11.46f, 14.84f)
                lineToRelative(1.72f, -6.57f)
                curveToRelative(-0.18f, -0.17f, -0.42f, -0.26f, -0.68f, -0.26f)
                horizontalLineToRelative(-1.26f)
                lineToRelative(-1.22f, 5.2f)
                curveToRelative(-0.1f, 0.43f, 0.1f, 0.88f, 0.48f, 1.1f)
                lineToRelative(0.95f, 0.54f)
                close()
                moveTo(8.02f, 17.13f)
                lineToRelative(-0.46f, 2.0f)
                lineToRelative(-2.27f, 4.87f)
                horizontalLineToRelative(2.2f)
                lineToRelative(1.92f, -4.09f)
                lineToRelative(0.39f, -1.69f)
                lineToRelative(-1.03f, -0.58f)
                curveToRelative(-0.26f, -0.15f, -0.51f, -0.32f, -0.75f, -0.51f)
                close()
            }
        }.also { _Walking = it}
