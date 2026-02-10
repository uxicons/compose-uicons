package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressCard: ImageVector? = null

val Icons.Tr.AddressCard: ImageVector
    get() = _AddressCard ?: UXIcon(name = "AddressCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(18.07f, 14.39f)
                lineToRelative(-6.15f, 5.9f)
                curveToRelative(-0.43f, 0.46f, -1.01f, 0.71f, -1.61f, 0.71f)
                curveToRelative(-0.27f, 0f, -0.55f, -0.05f, -0.81f, -0.15f)
                curveToRelative(-0.91f, -0.36f, -1.5f, -1.25f, -1.5f, -2.27f)
                verticalLineToRelative(-2.57f)
                lineTo(2.5f, 16.0f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-2.57f)
                curveToRelative(0.01f, -1.03f, 0.6f, -1.92f, 1.51f, -2.28f)
                curveToRelative(0.86f, -0.33f, 1.79f, -0.11f, 2.44f, 0.58f)
                lineToRelative(6.11f, 5.86f)
                curveToRelative(1.25f, 1.34f, 1.25f, 3.48f, 0.02f, 4.8f)
                close()
                moveTo(17.34f, 10.29f)
                lineToRelative(-6.11f, -5.86f)
                curveToRelative(-0.38f, -0.41f, -0.88f, -0.53f, -1.36f, -0.35f)
                curveToRelative(-0.42f, 0.16f, -0.87f, 0.6f, -0.87f, 1.35f)
                verticalLineToRelative(3.07f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(2.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.07f)
                curveToRelative(0.0f, 0.74f, 0.45f, 1.18f, 0.87f, 1.35f)
                curveToRelative(0.48f, 0.19f, 0.98f, 0.06f, 1.34f, -0.33f)
                lineToRelative(6.15f, -5.9f)
                curveToRelative(0.86f, -0.92f, 0.86f, -2.46f, -0.02f, -3.4f)
                close()
            }
        }.also { _AddressCard = it}
