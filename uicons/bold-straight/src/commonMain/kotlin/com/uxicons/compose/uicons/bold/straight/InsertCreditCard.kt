package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertCreditCard: ImageVector? = null

val Icons.Bs.InsertCreditCard: ImageVector
    get() = _InsertCreditCard ?: UXIcon(name = "InsertCreditCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 17.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(21f, 8.72f)
                verticalLineToRelative(15.28f)
                lineTo(3f, 24f)
                lineTo(3f, 8.72f)
                curveToRelative(-1.74f, -0.62f, -3f, -2.27f, -3f, -4.22f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.95f, -1.26f, 3.6f, -3f, 4.22f)
                close()
                moveTo(6f, 21f)
                horizontalLineToRelative(2f)
                lineTo(8f, 3f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 21f)
                close()
                moveTo(18f, 21f)
                lineTo(18f, 3f)
                horizontalLineToRelative(-7f)
                lineTo(11f, 21f)
                horizontalLineToRelative(7f)
                close()
            }
        }.also { _InsertCreditCard = it}
