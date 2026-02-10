package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PolishBottle: ImageVector? = null

val Icons.Rr.PolishBottle: ImageVector
    get() = _PolishBottle ?: UXIcon(name = "PolishBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.75f, 10.67f)
                curveToRelative(-0.95f, -1.06f, -2.31f, -1.67f, -3.73f, -1.67f)
                horizontalLineToRelative(-0.01f)
                lineTo(15f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.43f, 0f, -2.79f, 0.61f, -3.73f, 1.67f)
                curveToRelative(-0.95f, 1.06f, -1.4f, 2.48f, -1.23f, 3.9f)
                lineToRelative(0.68f, 5.88f)
                curveToRelative(0.23f, 2.02f, 1.94f, 3.54f, 3.97f, 3.54f)
                horizontalLineToRelative(6.65f)
                curveToRelative(2.03f, 0f, 3.74f, -1.52f, 3.97f, -3.54f)
                lineToRelative(0.68f, -5.88f)
                curveToRelative(0.16f, -1.42f, -0.29f, -2.84f, -1.23f, -3.9f)
                close()
                moveTo(11f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 3f)
                close()
                moveTo(17.99f, 14.34f)
                lineToRelative(-0.68f, 5.88f)
                curveToRelative(-0.12f, 1.01f, -0.97f, 1.77f, -1.99f, 1.77f)
                horizontalLineToRelative(-6.65f)
                curveToRelative(-1.02f, 0f, -1.87f, -0.76f, -1.99f, -1.77f)
                lineToRelative(-0.68f, -5.88f)
                curveToRelative(-0.24f, -1.73f, 1.24f, -3.38f, 2.98f, -3.34f)
                horizontalLineToRelative(6.02f)
                curveToRelative(1.74f, -0.04f, 3.22f, 1.62f, 2.98f, 3.34f)
                close()
                moveTo(14f, 13f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(14f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _PolishBottle = it}
