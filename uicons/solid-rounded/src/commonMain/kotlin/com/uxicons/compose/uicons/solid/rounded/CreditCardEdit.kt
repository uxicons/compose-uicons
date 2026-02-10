package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardEdit: ImageVector? = null

val Icons.Sr.CreditCardEdit: ImageVector
    get() = _CreditCardEdit ?: UXIcon(name = "CreditCardEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.27f, 6.48f)
                curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
                verticalLineToRelative(0.95f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.95f)
                curveToRelative(1.15f, 0f, 2.25f, -0.46f, 3.06f, -1.27f)
                lineToRelative(5.71f, -5.71f)
                curveToRelative(0.85f, -0.85f, 1.01f, -2.24f, 0.25f, -3.17f)
                curveToRelative(-0.88f, -1.07f, -2.46f, -1.13f, -3.41f, -0.18f)
                close()
                moveTo(0f, 20f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-24f)
                close()
                moveTo(5.5f, 17f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.05f, 11f)
                horizontalLineToRelative(-11.05f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(8.09f)
                curveToRelative(-0.7f, 1.04f, -1.08f, 2.26f, -1.08f, 3.54f)
                verticalLineToRelative(0.95f)
                curveToRelative(0f, 0.17f, 0.02f, 0.34f, 0.05f, 0.5f)
                close()
                moveTo(22.86f, 7.21f)
                curveToRelative(0.7f, 0.72f, 1.14f, 1.7f, 1.14f, 2.79f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.92f)
                close()
            }
        }.also { _CreditCardEdit = it}
