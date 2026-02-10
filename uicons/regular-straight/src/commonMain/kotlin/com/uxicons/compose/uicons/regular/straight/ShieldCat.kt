package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCat: ImageVector? = null

val Icons.Rs.ShieldCat: ImageVector
    get() = _ShieldCat ?: UXIcon(name = "ShieldCat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.95f, 2.6f)
                lineTo(12f, -0.04f)
                lineToRelative(-7.95f, 2.63f)
                curveToRelative(-1.23f, 0.41f, -2.06f, 1.55f, -2.06f, 2.84f)
                verticalLineToRelative(6.53f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.81f, 0.4f)
                lineToRelative(0.84f, -0.34f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-6.53f)
                curveToRelative(0f, -1.29f, -0.82f, -2.44f, -2.06f, -2.84f)
                close()
                moveTo(20f, 11.96f)
                curveToRelative(0f, 6.18f, -6.09f, 9.11f, -7.95f, 9.86f)
                curveToRelative(-1.89f, -0.94f, -8.05f, -4.45f, -8.05f, -9.86f)
                verticalLineToRelative(-6.53f)
                curveToRelative(0f, -0.43f, 0.27f, -0.81f, 0.68f, -0.94f)
                lineToRelative(7.32f, -2.43f)
                lineToRelative(7.32f, 2.42f)
                curveToRelative(0.41f, 0.14f, 0.68f, 0.52f, 0.68f, 0.94f)
                verticalLineToRelative(6.53f)
                close()
                moveTo(17f, 7.5f)
                lineToRelative(-0.01f, -1.69f)
                lineToRelative(-2.96f, 1.64f)
                curveToRelative(-1.29f, -0.59f, -2.78f, -0.59f, -4.07f, 0f)
                lineToRelative(-2.96f, -1.64f)
                lineToRelative(-0.01f, 1.69f)
                curveToRelative(-0.01f, 2.48f, 0f, 4.5f, 0f, 4.5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                curveToRelative(0f, 0f, 0.01f, -2.04f, 0f, -4.5f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                curveToRelative(0f, 0f, -0.01f, -2.05f, -0.01f, -2.8f)
                lineToRelative(0.97f, 0.54f)
                lineToRelative(0.5f, -0.3f)
                curveToRelative(0.97f, -0.58f, 2.1f, -0.58f, 3.07f, 0f)
                lineToRelative(0.5f, 0.3f)
                lineToRelative(0.97f, -0.54f)
                curveToRelative(0.0f, 0.74f, -0.0f, 2.8f, -0.0f, 2.8f)
                close()
                moveTo(11f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                lineToRelative(-1f, 0.5f)
                lineToRelative(-1f, -0.5f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _ShieldCat = it}
