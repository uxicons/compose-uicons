package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaBox: ImageVector? = null

val Icons.Sr.PizzaBox: ImageVector
    get() = _PizzaBox ?: UXIcon(name = "PizzaBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.42f, 13.01f)
                curveToRelative(1.0f, -0.5f, 2.23f, -0.84f, 3.58f, -0.96f)
                verticalLineToRelative(2.45f)
                lineToRelative(-3.58f, -1.49f)
                close()
                moveTo(5.6f, 14.41f)
                curveToRelative(-0.38f, 0.49f, -0.6f, 1.02f, -0.6f, 1.58f)
                reflectiveCurveToRelative(0.22f, 1.09f, 0.6f, 1.58f)
                lineToRelative(3.8f, -1.58f)
                close()
                moveTo(11f, 19.95f)
                verticalLineToRelative(-2.45f)
                lineToRelative(-3.58f, 1.49f)
                curveToRelative(1.0f, 0.5f, 2.23f, 0.84f, 3.58f, 0.96f)
                close()
                moveTo(13f, 12.05f)
                verticalLineToRelative(2.45f)
                lineToRelative(3.58f, -1.49f)
                curveToRelative(-1.0f, -0.5f, -2.23f, -0.84f, -3.58f, -0.96f)
                close()
                moveTo(22.91f, 22.45f)
                curveToRelative(-0.84f, 0.98f, -2.07f, 1.55f, -3.37f, 1.55f)
                horizontalLineToRelative(-15.09f)
                curveToRelative(-1.3f, 0f, -2.52f, -0.56f, -3.37f, -1.55f)
                curveToRelative(-0.84f, -0.98f, -1.21f, -2.28f, -1.01f, -3.55f)
                lineToRelative(1.61f, -10.89f)
                horizontalLineToRelative(20.2f)
                lineToRelative(2.03f, 10.87f)
                curveToRelative(0.2f, 1.3f, -0.16f, 2.6f, -1.0f, 3.58f)
                close()
                moveTo(21f, 16.0f)
                curveToRelative(-0.34f, -4.21f, -4.64f, -5.89f, -9f, -6f)
                curveToRelative(-4.36f, 0.11f, -8.66f, 1.79f, -9f, 6f)
                curveToRelative(0f, 3.36f, 3.95f, 6f, 9f, 6f)
                reflectiveCurveToRelative(9f, -2.64f, 9f, -6f)
                close()
                moveTo(14.6f, 16.0f)
                lineTo(18.4f, 17.58f)
                curveToRelative(0.38f, -0.49f, 0.6f, -1.02f, 0.6f, -1.58f)
                reflectiveCurveToRelative(-0.22f, -1.09f, -0.6f, -1.58f)
                close()
                moveTo(13f, 19.95f)
                curveToRelative(1.35f, -0.12f, 2.58f, -0.46f, 3.58f, -0.96f)
                lineToRelative(-3.58f, -1.49f)
                verticalLineToRelative(2.45f)
                close()
                moveTo(1.98f, 6f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.12f, 0.01f, 1.36f, -1.77f, 1.44f, -1.82f)
                curveToRelative(1.31f, -1.71f, 0.09f, -4.18f, -2.06f, -4.18f)
                horizontalLineToRelative(-18.75f)
                curveToRelative(-2.16f, 0f, -3.38f, 2.47f, -2.06f, 4.18f)
                curveToRelative(0f, 0f, 1.41f, 1.8f, 1.44f, 1.82f)
                close()
            }
        }.also { _PizzaBox = it}
