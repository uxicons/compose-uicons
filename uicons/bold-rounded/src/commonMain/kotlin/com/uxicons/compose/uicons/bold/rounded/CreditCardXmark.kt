package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardXmark: ImageVector? = null

val Icons.Br.CreditCardXmark: ImageVector
    get() = _CreditCardXmark ?: UXIcon(name = "CreditCardXmark") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6.5f, 10f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(-18f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(3.05f, 5f)
            horizontalLineToRelative(17.9f)
            curveToRelative(-0.23f, -1.14f, -1.24f, -2f, -2.45f, -2f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
            close()
            moveTo(24f, 18f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            close()
            moveTo(19.41f, 18f)
            lineTo(20.71f, 16.71f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
            reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
            lineToRelative(-1.29f, 1.29f)
            lineToRelative(-1.29f, -1.29f)
            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
            reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
            lineToRelative(1.29f, 1.29f)
            lineToRelative(-1.29f, 1.29f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
            reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
            lineToRelative(1.29f, -1.29f)
            lineToRelative(1.29f, 1.29f)
            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
            reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
            close()
        }
    }.also { _CreditCardXmark = it }
