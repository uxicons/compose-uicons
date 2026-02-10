package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullMarket: ImageVector? = null

val Icons.Bs.BullMarket: ImageVector
    get() = _BullMarket ?: UXIcon(name = "BullMarket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(19f, 17f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, -3.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.79f, 3.71f)
                close()
                moveTo(8.34f, 18f)
                lineTo(5.0f, 9.23f)
                curveToRelative(0f, -0.08f, 0.0f, -0.15f, 0.01f, -0.23f)
                curveToRelative(0.33f, 0f, 0.75f, -0.01f, 1.07f, 0.05f)
                curveToRelative(-0.04f, 0.14f, -0.08f, 0.29f, -0.08f, 0.45f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.46f, 0f, 0.86f, -0.21f, 1.14f, -0.53f)
                curveToRelative(0.84f, 0.89f, 1.37f, 2.04f, 1.37f, 3.02f)
                curveToRelative(1.43f, -2.67f, 4.25f, -4.49f, 7.5f, -4.49f)
                curveToRelative(0.87f, 0f, 1.71f, 0.13f, 2.5f, 0.38f)
                curveToRelative(0f, -0.99f, -0.03f, -2.3f, -0.6f, -3.51f)
                curveToRelative(1.49f, -0.4f, 2.6f, -1.75f, 2.6f, -3.37f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-15f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.62f, 1.11f, 2.97f, 2.6f, 3.37f)
                curveToRelative(-0.65f, 1.4f, -0.6f, 2.74f, -0.6f, 3.91f)
                lineToRelative(4.04f, 10.6f)
                curveToRelative(0.18f, 0.92f, 0.99f, 1.62f, 1.96f, 1.62f)
                horizontalLineToRelative(2.3f)
                curveToRelative(-0.73f, -1.17f, -1.18f, -2.54f, -1.26f, -4f)
                close()
                moveTo(10.5f, 8.35f)
                curveToRelative(-0.98f, -1.18f, -2.37f, -2.0f, -3.95f, -2.26f)
                curveToRelative(0.07f, -0.03f, 0.15f, -0.06f, 0.23f, -0.09f)
                horizontalLineToRelative(8.44f)
                curveToRelative(0.01f, 0.0f, 0.02f, 0.01f, 0.03f, 0.01f)
                curveToRelative(-1.91f, 0.07f, -3.61f, 0.96f, -4.75f, 2.34f)
                close()
            }
        }.also { _BullMarket = it}
