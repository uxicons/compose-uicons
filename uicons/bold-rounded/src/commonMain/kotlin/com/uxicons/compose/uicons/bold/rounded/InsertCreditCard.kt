package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertCreditCard: ImageVector? = null

val Icons.Br.InsertCreditCard: ImageVector
    get() = _InsertCreditCard ?: UXIcon(name = "InsertCreditCard") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.93f, 3.68f)
            curveToRelative(-0.39f, -2.17f, -2.39f, -3.68f, -4.59f, -3.68f)
            lineTo(4.5f, 0f)
            curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
            curveToRelative(0f, 1.95f, 1.26f, 3.6f, 3f, 4.22f)
            verticalLineToRelative(9.78f)
            curveToRelative(0f, 3.04f, 2.46f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.04f, 0f, 5.5f, -2.46f, 5.5f, -5.5f)
            lineTo(21f, 8.72f)
            curveToRelative(1.98f, -0.71f, 3.34f, -2.74f, 2.93f, -5.04f)
            close()
            moveTo(8f, 20.95f)
            curveToRelative(-1.14f, -0.23f, -2f, -1.24f, -2f, -2.45f)
            lineTo(6f, 3f)
            horizontalLineToRelative(2f)
            lineTo(8f, 20.95f)
            close()
            moveTo(18f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4.5f)
            lineTo(11f, 3f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(15.5f)
            close()
            moveTo(13f, 17.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _InsertCreditCard = it }
