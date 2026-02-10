package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressCard: ImageVector? = null

val Icons.Br.AddressCard: ImageVector
    get() = _AddressCard ?: UXIcon(name = "AddressCard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 4.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(21f, 4.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            close()
            moveTo(17.84f, 14.8f)
            lineToRelative(-5.29f, 5.27f)
            curveToRelative(-0.6f, 0.6f, -1.42f, 0.92f, -2.26f, 0.92f)
            curveToRelative(-0.43f, 0f, -0.87f, -0.08f, -1.29f, -0.26f)
            curveToRelative(-1.22f, -0.5f, -1.99f, -1.61f, -1.99f, -2.88f)
            verticalLineToRelative(-0.86f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(-0.86f)
            curveToRelative(0.01f, -1.28f, 0.77f, -2.38f, 1.99f, -2.88f)
            curveToRelative(1.24f, -0.51f, 2.64f, -0.25f, 3.56f, 0.67f)
            lineToRelative(5.29f, 5.27f)
            reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
            curveToRelative(1.54f, 1.54f, 1.54f, 4.06f, 0f, 5.61f)
            close()
            moveTo(15.72f, 11.32f)
            lineToRelative(-5.29f, -5.27f)
            curveToRelative(-0.08f, -0.08f, -0.23f, -0.04f, -0.29f, -0.02f)
            curveToRelative(-0.0f, 0f, -0.13f, 0.06f, -0.13f, 0.12f)
            verticalLineToRelative(2.35f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(3.5f, 10.0f)
            curveToRelative(-0.27f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.36f)
            curveToRelative(0f, 0.06f, 0.13f, 0.11f, 0.13f, 0.11f)
            curveToRelative(0.07f, 0.03f, 0.22f, 0.06f, 0.29f, -0.01f)
            lineToRelative(5.29f, -5.27f)
            curveToRelative(0.37f, -0.37f, 0.38f, -0.99f, 0f, -1.36f)
            close()
        }
    }.also { _AddressCard = it }
