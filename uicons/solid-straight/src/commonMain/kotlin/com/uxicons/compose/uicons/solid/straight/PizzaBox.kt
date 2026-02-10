package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaBox: ImageVector? = null

val Icons.Ss.PizzaBox: ImageVector
    get() = _PizzaBox ?: UXIcon(name = "PizzaBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.42f, 13.01f)
                curveToRelative(1.0f, -0.5f, 2.23f, -0.84f, 3.58f, -0.96f)
                verticalLineToRelative(2.45f)
                lineToRelative(-3.58f, -1.49f)
                close()
                moveTo(11f, 17.5f)
                lineTo(7.42f, 18.99f)
                curveToRelative(1.0f, 0.5f, 2.23f, 0.84f, 3.58f, 0.96f)
                verticalLineToRelative(-2.45f)
                close()
                moveTo(13f, 12.05f)
                verticalLineToRelative(2.45f)
                lineToRelative(3.58f, -1.49f)
                curveToRelative(-1.0f, -0.5f, -2.23f, -0.84f, -3.58f, -0.96f)
                close()
                moveTo(5.6f, 14.41f)
                curveToRelative(-0.38f, 0.49f, -0.6f, 1.02f, -0.6f, 1.58f)
                reflectiveCurveToRelative(0.22f, 1.09f, 0.6f, 1.58f)
                lineToRelative(3.8f, -1.58f)
                close()
                moveTo(0f, 0f)
                verticalLineToRelative(2f)
                lineToRelative(1.7f, 4f)
                horizontalLineToRelative(20.61f)
                lineToRelative(1.7f, -4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(13f, 17.5f)
                verticalLineToRelative(2.45f)
                curveToRelative(1.35f, -0.12f, 2.58f, -0.46f, 3.58f, -0.96f)
                lineToRelative(-3.58f, -1.49f)
                close()
                moveTo(21.68f, 8f)
                lineTo(24f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-3f)
                lineToRelative(2.32f, -13f)
                close()
                moveTo(21f, 16f)
                curveToRelative(0f, -1.3f, -0.6f, -2.49f, -1.61f, -3.46f)
                curveToRelative(-0.02f, -0.02f, -0.04f, -0.04f, -0.07f, -0.06f)
                curveToRelative(-1.62f, -1.51f, -4.27f, -2.48f, -7.32f, -2.48f)
                reflectiveCurveToRelative(-5.7f, 0.97f, -7.32f, 2.48f)
                curveToRelative(-0.02f, 0.02f, -0.04f, 0.04f, -0.06f, 0.06f)
                curveToRelative(-1.02f, 0.97f, -1.61f, 2.16f, -1.61f, 3.46f)
                curveToRelative(0f, 3.36f, 3.95f, 6f, 9f, 6f)
                reflectiveCurveToRelative(9f, -2.64f, 9f, -6f)
                close()
                moveTo(18.4f, 14.42f)
                lineTo(14.6f, 16f)
                lineTo(18.4f, 17.58f)
                curveToRelative(0.38f, -0.49f, 0.6f, -1.02f, 0.6f, -1.58f)
                reflectiveCurveToRelative(-0.22f, -1.09f, -0.6f, -1.58f)
                close()
            }
        }.also { _PizzaBox = it}
