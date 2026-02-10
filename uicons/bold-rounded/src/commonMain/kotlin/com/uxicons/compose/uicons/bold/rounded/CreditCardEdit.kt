package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardEdit: ImageVector? = null

val Icons.Br.CreditCardEdit: ImageVector
    get() = _CreditCardEdit ?: UXIcon(name = "CreditCardEdit") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6.5f, 16f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(23.83f, 10.13f)
            curveToRelative(-0.21f, -0.8f, -1.02f, -1.29f, -1.83f, -1.08f)
            curveToRelative(-0.87f, 0.22f, -1.29f, 1.11f, -1.06f, 1.95f)
            horizontalLineToRelative(-1.44f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-6.45f)
            curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.46f, -0.06f, -0.93f, -0.17f, -1.37f)
            close()
            moveTo(13.53f, 11f)
            horizontalLineToRelative(0.95f)
            curveToRelative(1.15f, 0f, 2.25f, -0.46f, 3.06f, -1.27f)
            lineToRelative(5.71f, -5.71f)
            curveToRelative(0.85f, -0.85f, 1.01f, -2.24f, 0.25f, -3.17f)
            curveToRelative(-0.88f, -1.07f, -2.46f, -1.13f, -3.41f, -0.18f)
            lineToRelative(-5.81f, 5.81f)
            curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
            verticalLineToRelative(0.95f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            close()
        }
    }.also { _CreditCardEdit = it }
