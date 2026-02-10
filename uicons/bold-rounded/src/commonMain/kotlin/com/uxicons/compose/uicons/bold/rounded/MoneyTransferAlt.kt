package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyTransferAlt: ImageVector? = null

val Icons.Br.MoneyTransferAlt: ImageVector
    get() = _MoneyTransferAlt ?: UXIcon(name = "MoneyTransferAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 7.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(19.5f, 15f)
            horizontalLineToRelative(-10f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            verticalLineToRelative(-6f)
            curveTo(5f, 2.02f, 7.02f, 0f, 9.5f, 0f)
            horizontalLineToRelative(10f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            close()
            moveTo(9.5f, 12f)
            horizontalLineToRelative(10f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-10f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(7.5f, 18f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(12.5f, 18f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(23.25f, 18.88f)
            lineToRelative(-2.76f, -2.76f)
            curveToRelative(-0.55f, -0.55f, -1.49f, -0.16f, -1.49f, 0.62f)
            verticalLineToRelative(1.26f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(1.26f)
            curveToRelative(0f, 0.78f, 0.94f, 1.17f, 1.49f, 0.62f)
            lineToRelative(2.76f, -2.76f)
            curveToRelative(0.34f, -0.34f, 0.34f, -0.89f, 0f, -1.23f)
            close()
        }
    }.also { _MoneyTransferAlt = it }
