package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonWalkingWithCane: ImageVector? = null

val Icons.Ts.PersonWalkingWithCane: ImageVector
    get() = _PersonWalkingWithCane ?: UXIcon(name = "PersonWalkingWithCane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.51f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.51f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(17.93f, 13.26f)
                lineToRelative(-4.07f, -3.11f)
                lineToRelative(-1.97f, -3.02f)
                curveToRelative(-0.46f, -0.71f, -1.25f, -1.13f, -2.09f, -1.13f)
                horizontalLineToRelative(-3.14f)
                curveToRelative(-0.86f, 0f, -1.65f, 0.44f, -2.11f, 1.17f)
                lineTo(0.08f, 14.23f)
                lineToRelative(0.85f, 0.53f)
                lineTo(5.38f, 7.7f)
                curveToRelative(0.15f, -0.24f, 0.37f, -0.43f, 0.62f, -0.55f)
                verticalLineToRelative(7.39f)
                lineToRelative(5.11f, 3.32f)
                lineToRelative(3.29f, 6.16f)
                lineToRelative(0.88f, -0.47f)
                lineToRelative(-3.42f, -6.38f)
                lineToRelative(-0.87f, -0.56f)
                lineTo(10.99f, 7.61f)
                reflectiveCurveToRelative(0.03f, 0.05f, 0.05f, 0.07f)
                lineToRelative(2.02f, 3.09f)
                lineToRelative(4.03f, 3.06f)
                lineToRelative(5.61f, 10.18f)
                lineToRelative(0.88f, -0.48f)
                lineToRelative(-5.66f, -10.27f)
                close()
                moveTo(7f, 13.99f)
                lineTo(7f, 7f)
                horizontalLineToRelative(2.79f)
                curveToRelative(0.07f, 0f, 0.14f, 0f, 0.21f, 0.01f)
                lineTo(10f, 15.94f)
                lineToRelative(-3f, -1.95f)
                close()
                moveTo(5.77f, 16.64f)
                curveToRelative(0.05f, 0.04f, 0.92f, 0.59f, 0.92f, 0.59f)
                lineToRelative(-1.41f, 6.74f)
                horizontalLineToRelative(-1.03f)
                lineToRelative(1.51f, -7.33f)
                close()
            }
        }.also { _PersonWalkingWithCane = it}
