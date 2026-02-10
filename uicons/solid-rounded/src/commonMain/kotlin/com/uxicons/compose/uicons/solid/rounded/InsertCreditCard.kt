package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertCreditCard: ImageVector? = null

val Icons.Sr.InsertCreditCard: ImageVector
    get() = _InsertCreditCard ?: UXIcon(name = "InsertCreditCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.84f, 0f)
                curveToRelative(-3.81f, 0f, -11.87f, 0f, -15.68f, 0f)
                curveTo(2.18f, 0f, 0.38f, 1.38f, 0.06f, 3.33f)
                curveToRelative(-0.29f, 1.75f, 0.58f, 3.31f, 1.95f, 4.11f)
                verticalLineToRelative(-3.44f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                lineTo(4f, 20f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(0f)
                lineTo(8f, 2f)
                horizontalLineToRelative(2f)
                lineTo(10f, 24f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(20f, 2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3.44f)
                curveToRelative(1.37f, -0.8f, 2.23f, -2.36f, 1.95f, -4.11f)
                curveTo(23.62f, 1.38f, 21.82f, 0f, 19.84f, 0f)
                close()
                moveTo(15.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _InsertCreditCard = it}
