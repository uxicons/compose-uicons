package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertCreditCard: ImageVector? = null

val Icons.Ss.InsertCreditCard: ImageVector
    get() = _InsertCreditCard ?: UXIcon(name = "InsertCreditCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                curveToRelative(0f, 1.47f, 0.81f, 2.75f, 2f, 3.44f)
                verticalLineToRelative(-3.44f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                lineTo(4f, 24f)
                horizontalLineToRelative(4f)
                lineTo(8f, 2f)
                horizontalLineToRelative(2f)
                lineTo(10f, 24f)
                horizontalLineToRelative(10f)
                lineTo(20f, 2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3.44f)
                curveToRelative(1.19f, -0.69f, 2f, -1.97f, 2f, -3.44f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(15.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _InsertCreditCard = it}
